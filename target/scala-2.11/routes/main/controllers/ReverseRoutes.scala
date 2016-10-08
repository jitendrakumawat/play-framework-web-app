
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/si2chip/test/si2chip1/si2chip/conf/routes
// @DATE:Fri Oct 07 12:57:05 IST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:71
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:40
  class ReverseAdminController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def addUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:40
    def showAdminPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:45
    def addAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:41
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "users")
    }
  
    // @LINE:46
    def modifyAdmin(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:49
    def showForbiddenPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noadminaccess")
    }
  
    // @LINE:47
    def getAdminUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admins")
    }
  
    // @LINE:43
    def modifyUser(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:44
    def deleteUser(userId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "user/" + implicitly[PathBindable[String]].unbind("userId", dynamicString(userId)))
    }
  
    // @LINE:50
    def newUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "newuser")
    }
  
    // @LINE:48
    def showSetupPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "setup")
    }
  
  }

  // @LINE:52
  class ReversePasswordResetController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:52
    def changeRequest(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "forgotpassword")
    }
  
    // @LINE:53
    def resetPasswd(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "resetLink")
    }
  
    // @LINE:54
    def resetUserPassword(): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "reset")
    }
  
  }

  // @LINE:66
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:66
    def count(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:13
  class ReverseGroupController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def addGroup(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "group")
    }
  
    // @LINE:16
    def addUserToGroup(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "groupuser")
    }
  
    // @LINE:21
    def getUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "allusers")
    }
  
    // @LINE:20
    def getGroupUsers(groupId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "groupusers/" + implicitly[PathBindable[String]].unbind("groupId", dynamicString(groupId)))
    }
  
    // @LINE:14
    def deleteGroup(groupId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "group/" + implicitly[PathBindable[String]].unbind("groupId", dynamicString(groupId)))
    }
  
    // @LINE:19
    def showGroupsPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "groups")
    }
  
    // @LINE:18
    def getOwnedGroups(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ownedgroups")
    }
  
    // @LINE:17
    def getMyGroups(userId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mygroups/" + implicitly[PathBindable[String]].unbind("userId", dynamicString(userId)))
    }
  
    // @LINE:15
    def deleteGroupUser(groupId:String, userId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "groupuser/" + implicitly[PathBindable[String]].unbind("groupId", dynamicString(groupId)) + "/" + implicitly[PathBindable[String]].unbind("userId", dynamicString(userId)))
    }
  
  }

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def getUserSummary(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "summary")
    }
  
    // @LINE:10
    def changeGroup(groupId:String): Call = {
      import ReverseRouteContext.empty
      Call("PUT", _prefix + { _defaultPrefix } + "usergroup/" + implicitly[PathBindable[String]].unbind("groupId", dynamicString(groupId)))
    }
  
    // @LINE:8
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:6
    def showForbiddenPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "noaccess")
    }
  
    // @LINE:5
    def showHomePage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:7
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:68
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:68
    def message(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:23
  class ReversePostController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:38
    def refreshPageUserBroadcast(endId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/userbposts/refresh/" + implicitly[PathBindable[String]].unbind("endId", dynamicString(endId)))
    }
  
    // @LINE:23
    def getPosts(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts")
    }
  
    // @LINE:34
    def refreshPageUser(endId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/user/refresh/" + implicitly[PathBindable[String]].unbind("endId", dynamicString(endId)))
    }
  
    // @LINE:32
    def getNextPageUser(lastId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/user/after/" + implicitly[PathBindable[String]].unbind("lastId", dynamicString(lastId)))
    }
  
    // @LINE:24
    def addPost(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "post")
    }
  
    // @LINE:29
    def getFirstPage(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/first")
    }
  
    // @LINE:28
    def getNextPage(lastId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/after/" + implicitly[PathBindable[String]].unbind("lastId", dynamicString(lastId)))
    }
  
    // @LINE:31
    def getPreviousPageUser(firstId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/user/before/" + implicitly[PathBindable[String]].unbind("firstId", dynamicString(firstId)))
    }
  
    // @LINE:36
    def getNextPageUserBroadcast(lastId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/userbposts/after/" + implicitly[PathBindable[String]].unbind("lastId", dynamicString(lastId)))
    }
  
    // @LINE:30
    def refreshPage(endId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/refresh/" + implicitly[PathBindable[String]].unbind("endId", dynamicString(endId)))
    }
  
    // @LINE:35
    def getPreviousPageUserBroadcast(firstId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/userbposts/before/" + implicitly[PathBindable[String]].unbind("firstId", dynamicString(firstId)))
    }
  
    // @LINE:26
    def deletePost(postId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "post/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)))
    }
  
    // @LINE:33
    def getFirstPageUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/user/first")
    }
  
    // @LINE:27
    def getPreviousPage(firstId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/before/" + implicitly[PathBindable[String]].unbind("firstId", dynamicString(firstId)))
    }
  
    // @LINE:25
    def addPostAndBroadcast(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "postnotify")
    }
  
    // @LINE:37
    def getFirstPageUserBroadcast(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "posts/userbposts/first")
    }
  
  }

  // @LINE:57
  class ReverseCommentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:62
    def getLastPage(postId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/last/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)))
    }
  
    // @LINE:61
    def getFirstPage(postId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/first/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)))
    }
  
    // @LINE:57
    def addComment(postId:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "comment/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)))
    }
  
    // @LINE:58
    def deleteComment(postId:String, commentId:String): Call = {
      import ReverseRouteContext.empty
      Call("DELETE", _prefix + { _defaultPrefix } + "comment/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)) + "/" + implicitly[PathBindable[String]].unbind("commentId", dynamicString(commentId)))
    }
  
    // @LINE:59
    def getPreviousPage(postId:String, firstId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/before/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)) + "/" + implicitly[PathBindable[String]].unbind("firstId", dynamicString(firstId)))
    }
  
    // @LINE:63
    def refreshPage(postId:String, beginId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/refresh/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)) + "/" + implicitly[PathBindable[String]].unbind("beginId", dynamicString(beginId)))
    }
  
    // @LINE:60
    def getNextPage(postId:String, lastId:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "comments/after/" + implicitly[PathBindable[String]].unbind("postId", dynamicString(postId)) + "/" + implicitly[PathBindable[String]].unbind("lastId", dynamicString(lastId)))
    }
  
  }


}
