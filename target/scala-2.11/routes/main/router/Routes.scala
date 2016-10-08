
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/si2chip/test/si2chip1/si2chip/conf/routes
// @DATE:Fri Oct 07 12:57:05 IST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HomeController_2: controllers.HomeController,
  // @LINE:13
  GroupController_8: controllers.GroupController,
  // @LINE:23
  PostController_6: controllers.PostController,
  // @LINE:40
  AdminController_0: controllers.AdminController,
  // @LINE:52
  PasswordResetController_3: controllers.PasswordResetController,
  // @LINE:57
  CommentController_5: controllers.CommentController,
  // @LINE:66
  CountController_1: controllers.CountController,
  // @LINE:68
  AsyncController_4: controllers.AsyncController,
  // @LINE:71
  Assets_7: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_2: controllers.HomeController,
    // @LINE:13
    GroupController_8: controllers.GroupController,
    // @LINE:23
    PostController_6: controllers.PostController,
    // @LINE:40
    AdminController_0: controllers.AdminController,
    // @LINE:52
    PasswordResetController_3: controllers.PasswordResetController,
    // @LINE:57
    CommentController_5: controllers.CommentController,
    // @LINE:66
    CountController_1: controllers.CountController,
    // @LINE:68
    AsyncController_4: controllers.AsyncController,
    // @LINE:71
    Assets_7: controllers.Assets
  ) = this(errorHandler, HomeController_2, GroupController_8, PostController_6, AdminController_0, PasswordResetController_3, CommentController_5, CountController_1, AsyncController_4, Assets_7, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, GroupController_8, PostController_6, AdminController_0, PasswordResetController_3, CommentController_5, CountController_1, AsyncController_4, Assets_7, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.showHomePage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noaccess""", """controllers.HomeController.showForbiddenPage"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """summary""", """controllers.HomeController.getUserSummary"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usergroup/""" + "$" + """groupId<[^/]+>""", """controllers.HomeController.changeGroup(groupId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """group""", """controllers.GroupController.addGroup"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """group/""" + "$" + """groupId<[^/]+>""", """controllers.GroupController.deleteGroup(groupId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """groupuser/""" + "$" + """groupId<[^/]+>/""" + "$" + """userId<[^/]+>""", """controllers.GroupController.deleteGroupUser(groupId:String, userId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """groupuser""", """controllers.GroupController.addUserToGroup"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mygroups/""" + "$" + """userId<[^/]+>""", """controllers.GroupController.getMyGroups(userId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ownedgroups""", """controllers.GroupController.getOwnedGroups"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """groups""", """controllers.GroupController.showGroupsPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """groupusers/""" + "$" + """groupId<[^/]+>""", """controllers.GroupController.getGroupUsers(groupId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """allusers""", """controllers.GroupController.getUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts""", """controllers.PostController.getPosts"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post""", """controllers.PostController.addPost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """postnotify""", """controllers.PostController.addPostAndBroadcast"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post/""" + "$" + """postId<[^/]+>""", """controllers.PostController.deletePost(postId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/before/""" + "$" + """firstId<[^/]+>""", """controllers.PostController.getPreviousPage(firstId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/after/""" + "$" + """lastId<[^/]+>""", """controllers.PostController.getNextPage(lastId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/first""", """controllers.PostController.getFirstPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/refresh/""" + "$" + """endId<[^/]+>""", """controllers.PostController.refreshPage(endId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/user/before/""" + "$" + """firstId<[^/]+>""", """controllers.PostController.getPreviousPageUser(firstId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/user/after/""" + "$" + """lastId<[^/]+>""", """controllers.PostController.getNextPageUser(lastId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/user/first""", """controllers.PostController.getFirstPageUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/user/refresh/""" + "$" + """endId<[^/]+>""", """controllers.PostController.refreshPageUser(endId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/userbposts/before/""" + "$" + """firstId<[^/]+>""", """controllers.PostController.getPreviousPageUserBroadcast(firstId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/userbposts/after/""" + "$" + """lastId<[^/]+>""", """controllers.PostController.getNextPageUserBroadcast(lastId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/userbposts/first""", """controllers.PostController.getFirstPageUserBroadcast"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts/userbposts/refresh/""" + "$" + """endId<[^/]+>""", """controllers.PostController.refreshPageUserBroadcast(endId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminController.showAdminPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.AdminController.getUsers"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.AdminController.addUser"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.AdminController.modifyUser"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """userId<[^/]+>""", """controllers.AdminController.deleteUser(userId:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminController.addAdmin"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminController.modifyAdmin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admins""", """controllers.AdminController.getAdminUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """setup""", """controllers.AdminController.showSetupPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """noadminaccess""", """controllers.AdminController.showForbiddenPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newuser""", """controllers.AdminController.newUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """forgotpassword""", """controllers.PasswordResetController.changeRequest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetLink""", """controllers.PasswordResetController.resetPasswd"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset""", """controllers.PasswordResetController.resetUserPassword"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """postId<[^/]+>""", """controllers.CommentController.addComment(postId:String)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """postId<[^/]+>/""" + "$" + """commentId<[^/]+>""", """controllers.CommentController.deleteComment(postId:String, commentId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comments/before/""" + "$" + """postId<[^/]+>/""" + "$" + """firstId<[^/]+>""", """controllers.CommentController.getPreviousPage(postId:String, firstId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comments/after/""" + "$" + """postId<[^/]+>/""" + "$" + """lastId<[^/]+>""", """controllers.CommentController.getNextPage(postId:String, lastId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comments/first/""" + "$" + """postId<[^/]+>""", """controllers.CommentController.getFirstPage(postId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comments/last/""" + "$" + """postId<[^/]+>""", """controllers.CommentController.getLastPage(postId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comments/refresh/""" + "$" + """postId<[^/]+>/""" + "$" + """beginId<[^/]+>""", """controllers.CommentController.refreshPage(postId:String, beginId:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HomeController_showHomePage0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_showHomePage0_invoker = createInvoker(
    HomeController_2.showHomePage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "showHomePage",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HomeController_showForbiddenPage1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noaccess")))
  )
  private[this] lazy val controllers_HomeController_showForbiddenPage1_invoker = createInvoker(
    HomeController_2.showForbiddenPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "showForbiddenPage",
      Nil,
      "GET",
      """""",
      this.prefix + """noaccess"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_login2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login2_invoker = createInvoker(
    HomeController_2.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout3_invoker = createInvoker(
    HomeController_2.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_getUserSummary4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("summary")))
  )
  private[this] lazy val controllers_HomeController_getUserSummary4_invoker = createInvoker(
    HomeController_2.getUserSummary,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "getUserSummary",
      Nil,
      "GET",
      """""",
      this.prefix + """summary"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_changeGroup5_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usergroup/"), DynamicPart("groupId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_changeGroup5_invoker = createInvoker(
    HomeController_2.changeGroup(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "changeGroup",
      Seq(classOf[String]),
      "PUT",
      """""",
      this.prefix + """usergroup/""" + "$" + """groupId<[^/]+>"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_GroupController_addGroup6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("group")))
  )
  private[this] lazy val controllers_GroupController_addGroup6_invoker = createInvoker(
    GroupController_8.addGroup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupController",
      "addGroup",
      Nil,
      "POST",
      """""",
      this.prefix + """group"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_GroupController_deleteGroup7_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("group/"), DynamicPart("groupId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GroupController_deleteGroup7_invoker = createInvoker(
    GroupController_8.deleteGroup(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupController",
      "deleteGroup",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """group/""" + "$" + """groupId<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_GroupController_deleteGroupUser8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("groupuser/"), DynamicPart("groupId", """[^/]+""",true), StaticPart("/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GroupController_deleteGroupUser8_invoker = createInvoker(
    GroupController_8.deleteGroupUser(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupController",
      "deleteGroupUser",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      """""",
      this.prefix + """groupuser/""" + "$" + """groupId<[^/]+>/""" + "$" + """userId<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_GroupController_addUserToGroup9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("groupuser")))
  )
  private[this] lazy val controllers_GroupController_addUserToGroup9_invoker = createInvoker(
    GroupController_8.addUserToGroup,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupController",
      "addUserToGroup",
      Nil,
      "POST",
      """""",
      this.prefix + """groupuser"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_GroupController_getMyGroups10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mygroups/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GroupController_getMyGroups10_invoker = createInvoker(
    GroupController_8.getMyGroups(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupController",
      "getMyGroups",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """mygroups/""" + "$" + """userId<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_GroupController_getOwnedGroups11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ownedgroups")))
  )
  private[this] lazy val controllers_GroupController_getOwnedGroups11_invoker = createInvoker(
    GroupController_8.getOwnedGroups,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupController",
      "getOwnedGroups",
      Nil,
      "GET",
      """""",
      this.prefix + """ownedgroups"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_GroupController_showGroupsPage12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("groups")))
  )
  private[this] lazy val controllers_GroupController_showGroupsPage12_invoker = createInvoker(
    GroupController_8.showGroupsPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupController",
      "showGroupsPage",
      Nil,
      "GET",
      """""",
      this.prefix + """groups"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_GroupController_getGroupUsers13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("groupusers/"), DynamicPart("groupId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_GroupController_getGroupUsers13_invoker = createInvoker(
    GroupController_8.getGroupUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupController",
      "getGroupUsers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """groupusers/""" + "$" + """groupId<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_GroupController_getUsers14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("allusers")))
  )
  private[this] lazy val controllers_GroupController_getUsers14_invoker = createInvoker(
    GroupController_8.getUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GroupController",
      "getUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """allusers"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_PostController_getPosts15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts")))
  )
  private[this] lazy val controllers_PostController_getPosts15_invoker = createInvoker(
    PostController_6.getPosts,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getPosts",
      Nil,
      "GET",
      """""",
      this.prefix + """posts"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_PostController_addPost16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post")))
  )
  private[this] lazy val controllers_PostController_addPost16_invoker = createInvoker(
    PostController_6.addPost,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "addPost",
      Nil,
      "POST",
      """""",
      this.prefix + """post"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_PostController_addPostAndBroadcast17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("postnotify")))
  )
  private[this] lazy val controllers_PostController_addPostAndBroadcast17_invoker = createInvoker(
    PostController_6.addPostAndBroadcast,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "addPostAndBroadcast",
      Nil,
      "POST",
      """""",
      this.prefix + """postnotify"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_PostController_deletePost18_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_deletePost18_invoker = createInvoker(
    PostController_6.deletePost(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "deletePost",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """post/""" + "$" + """postId<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_PostController_getPreviousPage19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/before/"), DynamicPart("firstId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getPreviousPage19_invoker = createInvoker(
    PostController_6.getPreviousPage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getPreviousPage",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/before/""" + "$" + """firstId<[^/]+>"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_PostController_getNextPage20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/after/"), DynamicPart("lastId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getNextPage20_invoker = createInvoker(
    PostController_6.getNextPage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getNextPage",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/after/""" + "$" + """lastId<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_PostController_getFirstPage21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/first")))
  )
  private[this] lazy val controllers_PostController_getFirstPage21_invoker = createInvoker(
    PostController_6.getFirstPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getFirstPage",
      Nil,
      "GET",
      """""",
      this.prefix + """posts/first"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_PostController_refreshPage22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/refresh/"), DynamicPart("endId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_refreshPage22_invoker = createInvoker(
    PostController_6.refreshPage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "refreshPage",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/refresh/""" + "$" + """endId<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_PostController_getPreviousPageUser23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/user/before/"), DynamicPart("firstId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getPreviousPageUser23_invoker = createInvoker(
    PostController_6.getPreviousPageUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getPreviousPageUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/user/before/""" + "$" + """firstId<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_PostController_getNextPageUser24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/user/after/"), DynamicPart("lastId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getNextPageUser24_invoker = createInvoker(
    PostController_6.getNextPageUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getNextPageUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/user/after/""" + "$" + """lastId<[^/]+>"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_PostController_getFirstPageUser25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/user/first")))
  )
  private[this] lazy val controllers_PostController_getFirstPageUser25_invoker = createInvoker(
    PostController_6.getFirstPageUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getFirstPageUser",
      Nil,
      "GET",
      """""",
      this.prefix + """posts/user/first"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_PostController_refreshPageUser26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/user/refresh/"), DynamicPart("endId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_refreshPageUser26_invoker = createInvoker(
    PostController_6.refreshPageUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "refreshPageUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/user/refresh/""" + "$" + """endId<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_PostController_getPreviousPageUserBroadcast27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/userbposts/before/"), DynamicPart("firstId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getPreviousPageUserBroadcast27_invoker = createInvoker(
    PostController_6.getPreviousPageUserBroadcast(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getPreviousPageUserBroadcast",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/userbposts/before/""" + "$" + """firstId<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_PostController_getNextPageUserBroadcast28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/userbposts/after/"), DynamicPart("lastId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_getNextPageUserBroadcast28_invoker = createInvoker(
    PostController_6.getNextPageUserBroadcast(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getNextPageUserBroadcast",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/userbposts/after/""" + "$" + """lastId<[^/]+>"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_PostController_getFirstPageUserBroadcast29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/userbposts/first")))
  )
  private[this] lazy val controllers_PostController_getFirstPageUserBroadcast29_invoker = createInvoker(
    PostController_6.getFirstPageUserBroadcast,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getFirstPageUserBroadcast",
      Nil,
      "GET",
      """""",
      this.prefix + """posts/userbposts/first"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_PostController_refreshPageUserBroadcast30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts/userbposts/refresh/"), DynamicPart("endId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PostController_refreshPageUserBroadcast30_invoker = createInvoker(
    PostController_6.refreshPageUserBroadcast(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "refreshPageUserBroadcast",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """posts/userbposts/refresh/""" + "$" + """endId<[^/]+>"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_AdminController_showAdminPage31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminController_showAdminPage31_invoker = createInvoker(
    AdminController_0.showAdminPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "showAdminPage",
      Nil,
      "GET",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_AdminController_getUsers32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_AdminController_getUsers32_invoker = createInvoker(
    AdminController_0.getUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_AdminController_addUser33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_AdminController_addUser33_invoker = createInvoker(
    AdminController_0.addUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_AdminController_modifyUser34_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_AdminController_modifyUser34_invoker = createInvoker(
    AdminController_0.modifyUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "modifyUser",
      Nil,
      "PUT",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_AdminController_deleteUser35_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("userId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteUser35_invoker = createInvoker(
    AdminController_0.deleteUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteUser",
      Seq(classOf[String]),
      "DELETE",
      """""",
      this.prefix + """user/""" + "$" + """userId<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_AdminController_addAdmin36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminController_addAdmin36_invoker = createInvoker(
    AdminController_0.addAdmin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addAdmin",
      Nil,
      "POST",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_AdminController_modifyAdmin37_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminController_modifyAdmin37_invoker = createInvoker(
    AdminController_0.modifyAdmin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "modifyAdmin",
      Nil,
      "PUT",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_AdminController_getAdminUsers38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admins")))
  )
  private[this] lazy val controllers_AdminController_getAdminUsers38_invoker = createInvoker(
    AdminController_0.getAdminUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "getAdminUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """admins"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_AdminController_showSetupPage39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("setup")))
  )
  private[this] lazy val controllers_AdminController_showSetupPage39_invoker = createInvoker(
    AdminController_0.showSetupPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "showSetupPage",
      Nil,
      "GET",
      """""",
      this.prefix + """setup"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_AdminController_showForbiddenPage40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("noadminaccess")))
  )
  private[this] lazy val controllers_AdminController_showForbiddenPage40_invoker = createInvoker(
    AdminController_0.showForbiddenPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "showForbiddenPage",
      Nil,
      "GET",
      """""",
      this.prefix + """noadminaccess"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_AdminController_newUser41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newuser")))
  )
  private[this] lazy val controllers_AdminController_newUser41_invoker = createInvoker(
    AdminController_0.newUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "newUser",
      Nil,
      "GET",
      """""",
      this.prefix + """newuser"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_PasswordResetController_changeRequest42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("forgotpassword")))
  )
  private[this] lazy val controllers_PasswordResetController_changeRequest42_invoker = createInvoker(
    PasswordResetController_3.changeRequest,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PasswordResetController",
      "changeRequest",
      Nil,
      "POST",
      """""",
      this.prefix + """forgotpassword"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_PasswordResetController_resetPasswd43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetLink")))
  )
  private[this] lazy val controllers_PasswordResetController_resetPasswd43_invoker = createInvoker(
    PasswordResetController_3.resetPasswd,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PasswordResetController",
      "resetPasswd",
      Nil,
      "GET",
      """""",
      this.prefix + """resetLink"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_PasswordResetController_resetUserPassword44_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset")))
  )
  private[this] lazy val controllers_PasswordResetController_resetUserPassword44_invoker = createInvoker(
    PasswordResetController_3.resetUserPassword,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PasswordResetController",
      "resetUserPassword",
      Nil,
      "PUT",
      """""",
      this.prefix + """reset"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_CommentController_addComment45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_addComment45_invoker = createInvoker(
    CommentController_5.addComment(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "addComment",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """comment/""" + "$" + """postId<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_CommentController_deleteComment46_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("postId", """[^/]+""",true), StaticPart("/"), DynamicPart("commentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_deleteComment46_invoker = createInvoker(
    CommentController_5.deleteComment(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "deleteComment",
      Seq(classOf[String], classOf[String]),
      "DELETE",
      """""",
      this.prefix + """comment/""" + "$" + """postId<[^/]+>/""" + "$" + """commentId<[^/]+>"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_CommentController_getPreviousPage47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments/before/"), DynamicPart("postId", """[^/]+""",true), StaticPart("/"), DynamicPart("firstId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_getPreviousPage47_invoker = createInvoker(
    CommentController_5.getPreviousPage(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "getPreviousPage",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """comments/before/""" + "$" + """postId<[^/]+>/""" + "$" + """firstId<[^/]+>"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_CommentController_getNextPage48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments/after/"), DynamicPart("postId", """[^/]+""",true), StaticPart("/"), DynamicPart("lastId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_getNextPage48_invoker = createInvoker(
    CommentController_5.getNextPage(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "getNextPage",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """comments/after/""" + "$" + """postId<[^/]+>/""" + "$" + """lastId<[^/]+>"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_CommentController_getFirstPage49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments/first/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_getFirstPage49_invoker = createInvoker(
    CommentController_5.getFirstPage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "getFirstPage",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """comments/first/""" + "$" + """postId<[^/]+>"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_CommentController_getLastPage50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments/last/"), DynamicPart("postId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_getLastPage50_invoker = createInvoker(
    CommentController_5.getLastPage(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "getLastPage",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """comments/last/""" + "$" + """postId<[^/]+>"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_CommentController_refreshPage51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments/refresh/"), DynamicPart("postId", """[^/]+""",true), StaticPart("/"), DynamicPart("beginId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CommentController_refreshPage51_invoker = createInvoker(
    CommentController_5.refreshPage(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CommentController",
      "refreshPage",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """comments/refresh/""" + "$" + """postId<[^/]+>/""" + "$" + """beginId<[^/]+>"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_CountController_count52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count52_invoker = createInvoker(
    CountController_1.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:68
  private[this] lazy val controllers_AsyncController_message53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message53_invoker = createInvoker(
    AsyncController_4.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_Assets_versioned54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned54_invoker = createInvoker(
    Assets_7.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HomeController_showHomePage0_route(params) =>
      call { 
        controllers_HomeController_showHomePage0_invoker.call(HomeController_2.showHomePage)
      }
  
    // @LINE:6
    case controllers_HomeController_showForbiddenPage1_route(params) =>
      call { 
        controllers_HomeController_showForbiddenPage1_invoker.call(HomeController_2.showForbiddenPage)
      }
  
    // @LINE:7
    case controllers_HomeController_login2_route(params) =>
      call { 
        controllers_HomeController_login2_invoker.call(HomeController_2.login)
      }
  
    // @LINE:8
    case controllers_HomeController_logout3_route(params) =>
      call { 
        controllers_HomeController_logout3_invoker.call(HomeController_2.logout)
      }
  
    // @LINE:9
    case controllers_HomeController_getUserSummary4_route(params) =>
      call { 
        controllers_HomeController_getUserSummary4_invoker.call(HomeController_2.getUserSummary)
      }
  
    // @LINE:10
    case controllers_HomeController_changeGroup5_route(params) =>
      call(params.fromPath[String]("groupId", None)) { (groupId) =>
        controllers_HomeController_changeGroup5_invoker.call(HomeController_2.changeGroup(groupId))
      }
  
    // @LINE:13
    case controllers_GroupController_addGroup6_route(params) =>
      call { 
        controllers_GroupController_addGroup6_invoker.call(GroupController_8.addGroup)
      }
  
    // @LINE:14
    case controllers_GroupController_deleteGroup7_route(params) =>
      call(params.fromPath[String]("groupId", None)) { (groupId) =>
        controllers_GroupController_deleteGroup7_invoker.call(GroupController_8.deleteGroup(groupId))
      }
  
    // @LINE:15
    case controllers_GroupController_deleteGroupUser8_route(params) =>
      call(params.fromPath[String]("groupId", None), params.fromPath[String]("userId", None)) { (groupId, userId) =>
        controllers_GroupController_deleteGroupUser8_invoker.call(GroupController_8.deleteGroupUser(groupId, userId))
      }
  
    // @LINE:16
    case controllers_GroupController_addUserToGroup9_route(params) =>
      call { 
        controllers_GroupController_addUserToGroup9_invoker.call(GroupController_8.addUserToGroup)
      }
  
    // @LINE:17
    case controllers_GroupController_getMyGroups10_route(params) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_GroupController_getMyGroups10_invoker.call(GroupController_8.getMyGroups(userId))
      }
  
    // @LINE:18
    case controllers_GroupController_getOwnedGroups11_route(params) =>
      call { 
        controllers_GroupController_getOwnedGroups11_invoker.call(GroupController_8.getOwnedGroups)
      }
  
    // @LINE:19
    case controllers_GroupController_showGroupsPage12_route(params) =>
      call { 
        controllers_GroupController_showGroupsPage12_invoker.call(GroupController_8.showGroupsPage)
      }
  
    // @LINE:20
    case controllers_GroupController_getGroupUsers13_route(params) =>
      call(params.fromPath[String]("groupId", None)) { (groupId) =>
        controllers_GroupController_getGroupUsers13_invoker.call(GroupController_8.getGroupUsers(groupId))
      }
  
    // @LINE:21
    case controllers_GroupController_getUsers14_route(params) =>
      call { 
        controllers_GroupController_getUsers14_invoker.call(GroupController_8.getUsers)
      }
  
    // @LINE:23
    case controllers_PostController_getPosts15_route(params) =>
      call { 
        controllers_PostController_getPosts15_invoker.call(PostController_6.getPosts)
      }
  
    // @LINE:24
    case controllers_PostController_addPost16_route(params) =>
      call { 
        controllers_PostController_addPost16_invoker.call(PostController_6.addPost)
      }
  
    // @LINE:25
    case controllers_PostController_addPostAndBroadcast17_route(params) =>
      call { 
        controllers_PostController_addPostAndBroadcast17_invoker.call(PostController_6.addPostAndBroadcast)
      }
  
    // @LINE:26
    case controllers_PostController_deletePost18_route(params) =>
      call(params.fromPath[String]("postId", None)) { (postId) =>
        controllers_PostController_deletePost18_invoker.call(PostController_6.deletePost(postId))
      }
  
    // @LINE:27
    case controllers_PostController_getPreviousPage19_route(params) =>
      call(params.fromPath[String]("firstId", None)) { (firstId) =>
        controllers_PostController_getPreviousPage19_invoker.call(PostController_6.getPreviousPage(firstId))
      }
  
    // @LINE:28
    case controllers_PostController_getNextPage20_route(params) =>
      call(params.fromPath[String]("lastId", None)) { (lastId) =>
        controllers_PostController_getNextPage20_invoker.call(PostController_6.getNextPage(lastId))
      }
  
    // @LINE:29
    case controllers_PostController_getFirstPage21_route(params) =>
      call { 
        controllers_PostController_getFirstPage21_invoker.call(PostController_6.getFirstPage)
      }
  
    // @LINE:30
    case controllers_PostController_refreshPage22_route(params) =>
      call(params.fromPath[String]("endId", None)) { (endId) =>
        controllers_PostController_refreshPage22_invoker.call(PostController_6.refreshPage(endId))
      }
  
    // @LINE:31
    case controllers_PostController_getPreviousPageUser23_route(params) =>
      call(params.fromPath[String]("firstId", None)) { (firstId) =>
        controllers_PostController_getPreviousPageUser23_invoker.call(PostController_6.getPreviousPageUser(firstId))
      }
  
    // @LINE:32
    case controllers_PostController_getNextPageUser24_route(params) =>
      call(params.fromPath[String]("lastId", None)) { (lastId) =>
        controllers_PostController_getNextPageUser24_invoker.call(PostController_6.getNextPageUser(lastId))
      }
  
    // @LINE:33
    case controllers_PostController_getFirstPageUser25_route(params) =>
      call { 
        controllers_PostController_getFirstPageUser25_invoker.call(PostController_6.getFirstPageUser)
      }
  
    // @LINE:34
    case controllers_PostController_refreshPageUser26_route(params) =>
      call(params.fromPath[String]("endId", None)) { (endId) =>
        controllers_PostController_refreshPageUser26_invoker.call(PostController_6.refreshPageUser(endId))
      }
  
    // @LINE:35
    case controllers_PostController_getPreviousPageUserBroadcast27_route(params) =>
      call(params.fromPath[String]("firstId", None)) { (firstId) =>
        controllers_PostController_getPreviousPageUserBroadcast27_invoker.call(PostController_6.getPreviousPageUserBroadcast(firstId))
      }
  
    // @LINE:36
    case controllers_PostController_getNextPageUserBroadcast28_route(params) =>
      call(params.fromPath[String]("lastId", None)) { (lastId) =>
        controllers_PostController_getNextPageUserBroadcast28_invoker.call(PostController_6.getNextPageUserBroadcast(lastId))
      }
  
    // @LINE:37
    case controllers_PostController_getFirstPageUserBroadcast29_route(params) =>
      call { 
        controllers_PostController_getFirstPageUserBroadcast29_invoker.call(PostController_6.getFirstPageUserBroadcast)
      }
  
    // @LINE:38
    case controllers_PostController_refreshPageUserBroadcast30_route(params) =>
      call(params.fromPath[String]("endId", None)) { (endId) =>
        controllers_PostController_refreshPageUserBroadcast30_invoker.call(PostController_6.refreshPageUserBroadcast(endId))
      }
  
    // @LINE:40
    case controllers_AdminController_showAdminPage31_route(params) =>
      call { 
        controllers_AdminController_showAdminPage31_invoker.call(AdminController_0.showAdminPage)
      }
  
    // @LINE:41
    case controllers_AdminController_getUsers32_route(params) =>
      call { 
        controllers_AdminController_getUsers32_invoker.call(AdminController_0.getUsers)
      }
  
    // @LINE:42
    case controllers_AdminController_addUser33_route(params) =>
      call { 
        controllers_AdminController_addUser33_invoker.call(AdminController_0.addUser)
      }
  
    // @LINE:43
    case controllers_AdminController_modifyUser34_route(params) =>
      call { 
        controllers_AdminController_modifyUser34_invoker.call(AdminController_0.modifyUser)
      }
  
    // @LINE:44
    case controllers_AdminController_deleteUser35_route(params) =>
      call(params.fromPath[String]("userId", None)) { (userId) =>
        controllers_AdminController_deleteUser35_invoker.call(AdminController_0.deleteUser(userId))
      }
  
    // @LINE:45
    case controllers_AdminController_addAdmin36_route(params) =>
      call { 
        controllers_AdminController_addAdmin36_invoker.call(AdminController_0.addAdmin)
      }
  
    // @LINE:46
    case controllers_AdminController_modifyAdmin37_route(params) =>
      call { 
        controllers_AdminController_modifyAdmin37_invoker.call(AdminController_0.modifyAdmin)
      }
  
    // @LINE:47
    case controllers_AdminController_getAdminUsers38_route(params) =>
      call { 
        controllers_AdminController_getAdminUsers38_invoker.call(AdminController_0.getAdminUsers)
      }
  
    // @LINE:48
    case controllers_AdminController_showSetupPage39_route(params) =>
      call { 
        controllers_AdminController_showSetupPage39_invoker.call(AdminController_0.showSetupPage)
      }
  
    // @LINE:49
    case controllers_AdminController_showForbiddenPage40_route(params) =>
      call { 
        controllers_AdminController_showForbiddenPage40_invoker.call(AdminController_0.showForbiddenPage)
      }
  
    // @LINE:50
    case controllers_AdminController_newUser41_route(params) =>
      call { 
        controllers_AdminController_newUser41_invoker.call(AdminController_0.newUser)
      }
  
    // @LINE:52
    case controllers_PasswordResetController_changeRequest42_route(params) =>
      call { 
        controllers_PasswordResetController_changeRequest42_invoker.call(PasswordResetController_3.changeRequest)
      }
  
    // @LINE:53
    case controllers_PasswordResetController_resetPasswd43_route(params) =>
      call { 
        controllers_PasswordResetController_resetPasswd43_invoker.call(PasswordResetController_3.resetPasswd)
      }
  
    // @LINE:54
    case controllers_PasswordResetController_resetUserPassword44_route(params) =>
      call { 
        controllers_PasswordResetController_resetUserPassword44_invoker.call(PasswordResetController_3.resetUserPassword)
      }
  
    // @LINE:57
    case controllers_CommentController_addComment45_route(params) =>
      call(params.fromPath[String]("postId", None)) { (postId) =>
        controllers_CommentController_addComment45_invoker.call(CommentController_5.addComment(postId))
      }
  
    // @LINE:58
    case controllers_CommentController_deleteComment46_route(params) =>
      call(params.fromPath[String]("postId", None), params.fromPath[String]("commentId", None)) { (postId, commentId) =>
        controllers_CommentController_deleteComment46_invoker.call(CommentController_5.deleteComment(postId, commentId))
      }
  
    // @LINE:59
    case controllers_CommentController_getPreviousPage47_route(params) =>
      call(params.fromPath[String]("postId", None), params.fromPath[String]("firstId", None)) { (postId, firstId) =>
        controllers_CommentController_getPreviousPage47_invoker.call(CommentController_5.getPreviousPage(postId, firstId))
      }
  
    // @LINE:60
    case controllers_CommentController_getNextPage48_route(params) =>
      call(params.fromPath[String]("postId", None), params.fromPath[String]("lastId", None)) { (postId, lastId) =>
        controllers_CommentController_getNextPage48_invoker.call(CommentController_5.getNextPage(postId, lastId))
      }
  
    // @LINE:61
    case controllers_CommentController_getFirstPage49_route(params) =>
      call(params.fromPath[String]("postId", None)) { (postId) =>
        controllers_CommentController_getFirstPage49_invoker.call(CommentController_5.getFirstPage(postId))
      }
  
    // @LINE:62
    case controllers_CommentController_getLastPage50_route(params) =>
      call(params.fromPath[String]("postId", None)) { (postId) =>
        controllers_CommentController_getLastPage50_invoker.call(CommentController_5.getLastPage(postId))
      }
  
    // @LINE:63
    case controllers_CommentController_refreshPage51_route(params) =>
      call(params.fromPath[String]("postId", None), params.fromPath[String]("beginId", None)) { (postId, beginId) =>
        controllers_CommentController_refreshPage51_invoker.call(CommentController_5.refreshPage(postId, beginId))
      }
  
    // @LINE:66
    case controllers_CountController_count52_route(params) =>
      call { 
        controllers_CountController_count52_invoker.call(CountController_1.count)
      }
  
    // @LINE:68
    case controllers_AsyncController_message53_route(params) =>
      call { 
        controllers_AsyncController_message53_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:71
    case controllers_Assets_versioned54_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned54_invoker.call(Assets_7.versioned(path, file))
      }
  }
}
