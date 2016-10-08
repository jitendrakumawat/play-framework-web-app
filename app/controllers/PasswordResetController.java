package controllers;



import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import helpers.IMailer;
import helpers.IUserCache;
import helpers.SessionUser;
import helpers.Util;
import play.libs.mailer.Email;


import models.PasswordLinks;
import models.Usr;
import play.mvc.*;

import views.html.*;

import java.util.List;
import java.util.UUID;


/**
 * Created by si2chip on 23/9/16.
 */
public class PasswordResetController extends  Controller {

    private final static Object MU = new Object();

    @Inject
    private IUserCache uC;

    @Inject
    private IMailer iM;

//    final String BASEPATH = "http://si2chip.herokuapp.com/resetLink";
      final String BASEPATH = "http://localhost:9000/resetLink";

    //Expected request format {"userId":"..."}
    @BodyParser.Of(BodyParser.Json.class)
    public Result changeRequest() {
        JsonNode json = request().body().asJson();
        String userId = json.findPath("userId").asText();

        if (userId != null && userId.trim().length() > 0) {
            userId = userId.toLowerCase();
            List<Usr> user = Usr.find.where().eq("userId", userId).findList();
            if (user != null && !user.isEmpty()) {

                final String randomString = UUID.randomUUID().toString();
                final PasswordLinks passwordLinks = new PasswordLinks();
                passwordLinks.setId(user.get(0).userId);
                final String resetLink = BASEPATH + "?q="+randomString;

                passwordLinks.setPasswdLink(randomString);
                List<PasswordLinks> links = PasswordLinks.find.where().eq("id", user.get(0).userId).findList();
                if(links!=null &&  !links.isEmpty()){
                        links.get(0).delete();
//                   return badRequest(Util.getJSONObj(String.format("An email with reset link is already sent please use that link.", userId)));
                }
                passwordLinks.save();
                iM.sendEmail("kumawat.jitendra05@gmail.com", userId, "password reset link", resetLink);
                return ok(Util.getJSONObj("A password reset link has been sent to your mail id. Please click on that link to reset your password."));
            } else {
                return badRequest(Util.getJSONObj(String.format("Invalid user. UserId [%s] does not exists.", userId)));
            }
        }
        return badRequest(Util.getJSONObj(String.format("Invalid user. User can not be empty.", userId)));
    }


    public Result resetPasswd(){

        if(request().queryString().get("q")==null){
            return badRequest(Util.getJSONObj(String.format("Invalid request.")));
        }
        String randomStrig = request().queryString().get("q")[0];
        List<PasswordLinks> links = PasswordLinks.find.where().eq("passwdLink",randomStrig).findList();
        if(links!=null && !links.isEmpty()){
            links.get(0).delete();
            return showresetPage();
        }else{
            return badRequest(Util.getJSONObj(String.format("Not a valid request.Reset link is incorrect")));
        }
    }


    public Result resetUserPassword() {
        System.out.println("modify user called reset");
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

    private Result showresetPage() {
        return ok(reset.render());
    }
}



















