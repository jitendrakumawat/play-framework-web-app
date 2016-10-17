
package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import helpers.IUserCache;
import helpers.Util;
import models.Usr;
import com.google.inject.Inject;

import helpers.SessionUser;
import helpers.Util;


import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by admin on 5/18/2016.
 */
public class AdminController extends Controller {
    @Inject
    private IUserCache aC;

    private final static Object MU = new Object();
    Date userbirth = new Date();
    public final static String forbiddenMessage =   "You are not logged in or your account has been deleted " +
                                                    "or your logged in group has been deleted or you are not " +
                                  "a member of the logged in group anymore or not an admin user.";
   private static int count=0;
    
    @Security.Authenticated(SecuredAdmin.class)
    public Result showAdminPage() {
        return ok(admin.render());
    }


    public   Result showSetupPage() {
       if(this.count<=1) {
           return ok(setup.render());
       }
        else{
           return ok(setupvalidate.render());
       }
    }


    public  Result showSetup(){
        JsonNode json = request().body().asJson();
        String userId = json.findPath("userId").asText();
        String password = json.findPath("password").asText();
        String groupId = json.findPath("groupId").asText();

        try {
            SessionUser sU = new SessionUser(userId, password, groupId, session("userId"));

            if (session("userId") == null)
                aC.setUserInCache(sU.getUId());
            session().clear();
            session("userId", sU.getUId());
            session("groupId", groupId);
            return ok(setup.render());
        } catch(Exception e) {
            return badRequest(Util.getJSONObj(e.getMessage()));
        }
    }






    // public Result newuser() {
    //    return ok(newuser.render());
   // }

    public Result showForbiddenPage() {return ok(forbidden.render(forbiddenMessage));}

    @Security.Authenticated(SecuredAdmin.class)
    @BodyParser.Of(BodyParser.Json.class)
    public Result addUser() {
        synchronized (MU) {
            
            JsonNode json = request().body().asJson();
            String name = json.findPath("name").asText();
            String userId = json.findPath("userId").asText();
            String password = json.findPath("password").asText();
            String userDesignation = json.findPath("userDesignation").asText();

            try {
                //All your parse Operations
                    String userbirth1= json.findPath("userbirth").asText();
                    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
                    
                    userbirth = sdf1.parse(userbirth1);
            } catch (ParseException e) {
               //Handle exception here, most of the time you will just log it.
               e.printStackTrace();
              }


            if (userId != null && password != null) {
                userId = userId.toLowerCase();
                List<Usr> user = Usr.find.where().eq("userId", userId).findList();
                if (user.size() != 0)
                    return badRequest(Util.getJSONObj(userId + " already exists"));
                try {
                    Usr u = new Usr();
                    u.name = name;
                    u.userId = userId;
                    u.password = password;
                    u.userDesignation = userDesignation;
                    u.userbirth = userbirth;
                    u.isAdmin = false;
                    u.save();
                    return ok();
                } catch (Exception e) {
                    return badRequest(Util.getJSONObj("A technical error occurred while adding the user"));
                }
            }
            return badRequest(Util.getJSONObj("Invalid User name or Password"));
        }
    }

    @Security.Authenticated(SecuredAdmin.class)
    public Result deleteUser(String userId) {
        synchronized (MU) {
            if (userId != null) {
                userId = userId.toLowerCase();
                List<Usr> user = Usr.find.where().eq("userId", userId).findList();

                if (user.size() == 0)
                    return badRequest(Util.getJSONObj(userId + " does not exist"));
                try {
                    user.get(0).delete();
                    return ok();
                } catch (Exception e) {
                    return badRequest(Util.getJSONObj("A technical error occurred while deleting the user"));
                }
            }
            return badRequest(Util.getJSONObj("Invalid User name"));
        }
    }

    @Security.Authenticated(SecuredAdmin.class)
    @BodyParser.Of(BodyParser.Json.class)
    public Result modifyUser() {
        synchronized (MU) {
            JsonNode json = request().body().asJson();
            String userId = json.findPath("userId").asText();
            String password = json.findPath("password").asText();
            if (userId != null && password != null ) {
                userId = userId.toLowerCase();
                List<Usr> user = Usr.find.where().eq("userId", userId).findList();
                if (user.size() == 0)
                    return badRequest(Util.getJSONObj(userId + " does not exist"));
                try {
                    user.get(0).password = password;
                    user.get(0).save();
                    return ok();
                } catch (Exception e) {

                   return badRequest(Util.getJSONObj("A technical error occurred while saving the user"));
                }
            }
            return badRequest(Util.getJSONObj("Invalid User name or Password"));
        }
    }

    private ArrayNode getJsonUsers(boolean bAdmin) {
        List<Usr> users = Usr.find.where().eq("isAdmin", new Boolean(bAdmin)).findList();
        ArrayNode res = Json.newArray();
        if(users != null) {
            Iterator<Usr> itUsers = users.iterator();
            while (itUsers.hasNext()) {
                ObjectNode e = res.addObject();
                e.put("userId", itUsers.next().userId);
            }
        }
        return res;
    }

    @Security.Authenticated(SecuredAdmin.class)
    public Result getUsers() {
        synchronized (MU) {
            try {
                ArrayNode res = getJsonUsers(false);
                return ok(res);
            } catch (Exception e) {
                return badRequest(Util.getJSONObj("A technical error occurred while getting all the users"));
            }
        }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result addAdmin() {
        synchronized (MU) {
            this.count=count+2;
             
            JsonNode json = request().body().asJson();
            String name = json.findPath("name").asText();
            String userId = json.findPath("userId").asText();
            String password = json.findPath("password").asText();
            String userDesignation = json.findPath("userDesignation").asText();


            try {
                //All your parse Operations
                    String userbirth1= json.findPath("userbirth").asText();
                    SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
                    userbirth = sdf1.parse(userbirth1);
            } catch (ParseException e) {
               //Handle exception here, most of the time you will just log it.
               e.printStackTrace();
              }
            if (userId != null && password != null) {
                userId = userId.toLowerCase();
                System.out.println("method2");
                List<Usr> user = Usr.find.where().eq("userId", userId).findList();
                if (user.size() != 0)
                    return badRequest(Util.getJSONObj(userId + " already exists"));
                try {
                    Usr u = new Usr();
                    u.name = name;
                    u.userId = userId;
                    u.password = password;
                    u.userDesignation = userDesignation;
                    u.userbirth = userbirth;
                    u.isAdmin = true;
                    u.save();
                    return ok();
                } catch (Exception e) {
                    return badRequest(Util.getJSONObj("A technical error occurred while adding the admin user"));
                }
            }
            return badRequest(Util.getJSONObj("Invalid User name or Password"));
        }
    }

    @BodyParser.Of(BodyParser.Json.class)
    public Result modifyAdmin() {
        synchronized (MU) {
            JsonNode json = request().body().asJson();
            String userId = json.findPath("userId").asText();
            String password = json.findPath("password").asText();
            if (userId != null && password != null ) {
                userId = userId.toLowerCase();
                List<Usr> user = Usr.find.where().eq("userId", userId).findList();
                if (user.size() == 0)
                    return badRequest(Util.getJSONObj(userId + " does not exist"));
                try {
                    user.get(0).password = password;
                    user.get(0).save();
                    return ok();
                } catch (Exception e) {
                    return badRequest(Util.getJSONObj("A technical error occurred while saving the admin changes"));
                }
            }
            return badRequest(Util.getJSONObj("Invalid User name or Password"));
        }
    }

    public Result getAdminUsers() {
        synchronized (MU) {
            try {
                ArrayNode res = getJsonUsers(true);
                return ok(res);
            } catch (Exception e) {
                return badRequest(Util.getJSONObj("A technical error occurred while getting all the users"));
            }
        }
    }
}
