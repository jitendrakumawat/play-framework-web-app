
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="""),_display_(/*7.34*/routes/*7.40*/.Assets.versioned("stylesheets/common/view.css")),format.raw/*7.88*/(""">
    <link rel="stylesheet" href="""),_display_(/*8.34*/routes/*8.40*/.Assets.versioned("stylesheets/admin.css")),format.raw/*8.82*/(""">
    <link rel="stylesheet" href="""),_display_(/*9.34*/routes/*9.40*/.Assets.versioned("stylesheets/posts.css")),format.raw/*9.82*/(""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>
    <title>SI2Chip Admin</title>
</head>
<body ng-app="admin" ng-controller="adminCtrl">
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src="""),_display_(/*20.27*/routes/*20.33*/.Assets.versioned("images/l46.png")),format.raw/*20.68*/(""" """),format.raw/*20.69*/("""class="logo">
            </div>
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="#"> Admin </a></li>
                <li><a href="#" ng-click="showPosts($event)"> Home </a></li>
                <li><a href="#" ng-click="signOut($event)"><span class="glyphicon glyphicon-log-out"></span> Sign out </a></li>
            </ul>
        </div>
    </nav>

    <div class="container">
        <div class="row">
            <div class="col-md-6 col-md-offset-3">
                <div class="modal fade" id="conError" role="dialog">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <span>An error occurred transacting with the server.</span>
                                <button type="button" class="close" data-dimdiss="modal">&times;</button>
                            </div>
                            <div class="modal-body">
                                """),format.raw/*41.33*/("""{"""),format.raw/*41.34*/("""{"""),format.raw/*41.35*/("""conerror"""),format.raw/*41.43*/("""}"""),format.raw/*41.44*/("""}"""),format.raw/*41.45*/("""
                            """),format.raw/*42.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-3">
                <div class="well well-lg">
                    <table class="table">
                        <thead>
                            <tr>
                                <div class="text-center">
                                    <h4 id="adminmgmttitle">User management</h4>
                                </div>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>
                                    <div class="text-center">
                                        <a href="#" ng-click="toggleAddUserEditor($event)">Add user<span ng-show="!angular.isUndefined(bShowAUE)&& bShowAUE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowAUE) || !bShowAUE" class="glyphicon glyphicon-menu-down"></span>
                                        </a>
                                    </div>
                                    <div class="well well-md" ng-show="!angular.isUndefined(bShowAUE) && bShowAUE">
                                        <form role="form" name="auf">
                                            <div class="form-group">
                                                <input type="email" class="form-control" maxlength="255" ng-model="nUserId" placeholder="Enter email id here" required name="userId">
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control" ng-model="nPassword" placeholder="Enter password here" required name="password">
                                            </div>
                                            <div class="text-center">
                                                <button type="submit" class="btn btn-default btn-md" ng-click="addUser($event)">Add</button>
                                            </div>
                                        </form>
                                        <span ng-show="auf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                                        <span ng-show="auf.userId.$touched && auf.userId.$error.required" class="editmsgs">UserId required. Enter a valid email id</span><br>
                                        <span ng-if="!(auf.userId.$dirty || auf.password.$dirty)" ng-bind="adderror" class="error"></span>
                                        <span ng-if="!(auf.userId.$touched || auf.password.$touched) && addSuccess" class="success">User added successfully</span>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="text-center">
                                        <a href="#" ng-click="toggleDelUserEditor($event)">Delete user<span ng-show="!angular.isUndefined(bShowDUE)&& bShowDUE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowDUE) || !bShowDUE" class="glyphicon glyphicon-menu-down"></span>
                                        </a>
                                    </div>
                                    <div class="well well-md" ng-show="!angular.isUndefined(bShowDUE) && bShowDUE">
                                        <form role="form" name="duf">
                                            <div class="form-group">
                                                <a href="#" ng-click="refreshDUsers($event)" class="btn btn-info btn-xs">
                                                    <span class="glyphicon glyphicon-refresh"></span> Refresh user list
                                                </a>
                                            </div>
                                            <div class="form-group">
                                                <select class="form-control" name="userId" ng-model="dUserId" required>
                                                    <option value="">Select User</option>
                                                    <option ng-repeat="usr in allDUsers track by usr.userId">"""),format.raw/*102.110*/("""{"""),format.raw/*102.111*/("""{"""),format.raw/*102.112*/("""usr.userId"""),format.raw/*102.122*/("""}"""),format.raw/*102.123*/("""}"""),format.raw/*102.124*/("""</option>
                                                </select>
                                            </div>
                                            <div class="text-center">
                                                <button type="submit" class="btn btn-default btn-md" ng-click="deleteUser($event)">Delete</button>
                                            </div>
                                        </form>
                                        <span ng-show="allDUsers.length != 0 && duf.userId.$touched && duf.userId.$error.required" class="editmsgs">UserId required. Select a email id</span><br>
                                        <span ng-if="!duf.userId.$dirty" ng-bind="delerror" class="error"></span>
                                        <span ng-if="!duf.userId.$touched && delSuccess" class="success">User deleted successfully</span>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div class="text-center">
                                        <a href="#" ng-click="toggleUserEditor($event)">Reset password<span ng-show="!angular.isUndefined(bShowRPE)&& bShowRPE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowRPE) || !bShowRPE" class="glyphicon glyphicon-menu-down"></span>
                                        </a>
                                    </div>
                                    <div class="well well-md" ng-show="!angular.isUndefined(bShowRPE) && bShowRPE">
                                        <form role="form" name="rpf">
                                            <div class="form-group">
                                                <a href="#" ng-click="refreshMUsers($event)" class="btn btn-info btn-xs">
                                                    <span class="glyphicon glyphicon-refresh"></span> Refresh user list
                                                </a>
                                            </div>
                                            <div class="form-group">
                                                <select class="form-control" name="userId" ng-model="mUserId" required>
                                                    <option value="">Select User</option>
                                                    <option ng-repeat="usr in allMUsers track by usr.userId">"""),format.raw/*131.110*/("""{"""),format.raw/*131.111*/("""{"""),format.raw/*131.112*/("""usr.userId"""),format.raw/*131.122*/("""}"""),format.raw/*131.123*/("""}"""),format.raw/*131.124*/("""</option>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <input type="password" class="form-control" ng-model="mPassword" placeholder="Enter password here" name="password">
                                            </div>
                                            <div class="text-center">
                                                <button type="submit" class="btn btn-default btn-md" ng-click="modifyUser($event)">Reset</button>
                                            </div>
                                        </form>
                                        <span ng-show="allMUsers.length != 0 && rpf.userId.$touched && rpf.userId.$error.required" class="editmsgs">UserId required. Select a email id</span><br>
                                        <span ng-if="!rpf.userId.$dirty" ng-bind="moderror" class="error"></span>
                                        <span ng-if="!(rpf.userId.$touched || rpf.password.$touched) && modSuccess" class="success">Password changed</span>
                                    </div>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="col-md-4">
                <div class="well well-lg">
                    <div class="text-center">
                        <h4 id="adminmgmttitle">Broadcast post</h4>
                    </div>
                    <div class="text-center">
                        <a href="#" ng-click="togglePostsEditor($event)">My posts<span ng-show="!angular.isUndefined(bShowPosts) && bShowPosts" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowPosts) || !bShowPosts" class="glyphicon glyphicon-menu-down"></span>
                        </a>
                    </div>
                </div>
                <div class="well well-lg" ng-show="!angular.isUndefined(bShowPosts) && bShowPosts">
                    <h4 id="poststitle">Posts <span class="badge">"""),format.raw/*162.67*/("""{"""),format.raw/*162.68*/("""{"""),format.raw/*162.69*/("""postpage.numPosts"""),format.raw/*162.86*/("""}"""),format.raw/*162.87*/("""}"""),format.raw/*162.88*/("""</span></h4>
                    <form name="apf" role="form">
                        <div class="form-group">
                            <textarea name="post" ng-model="post" name="post" class="form-control" maxlength="500" required placeholder="Enter your post here"></textarea>
                        </div>
                        <div class="text-right">
                            <button type="submit" ng-click="addPost($event)" class="btn btn-primary btn-xs">Broadcast Post</button>
                        </div>
                    </form>
                    <div id="addError"></div>
                    <div ng-if="!apf.post.$touched && !angular.isUndefined(pbroadcaststatus)" ng-bind="pbroadcaststatus"></div>
                    <div class="text-center">
                        <a href="#" ng-click="loadNextPage($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-circle-arrow-up"></span>
                        </a>
                        <a href="#" ng-if="postpage.endId != '-1'" ng-click="refreshCurrentPage($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-refresh"></span>
                        </a>
                        <a href="#" ng-if="!postpage.bLastPage" ng-click="loadPreviousPage($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-circle-arrow-down"></span>
                        </a>
                    </div>
                    <div class="well well-lg" ng-repeat="pst in postpage.arr track by pst.id">
                        <div class="text-right">
                            <h6 class="postedby"><span class="user">"""),format.raw/*186.69*/("""{"""),format.raw/*186.70*/("""{"""),format.raw/*186.71*/("""pst.userId"""),format.raw/*186.81*/("""}"""),format.raw/*186.82*/("""}"""),format.raw/*186.83*/("""</span> on """),format.raw/*186.94*/("""{"""),format.raw/*186.95*/("""{"""),format.raw/*186.96*/("""pst.postedOn"""),format.raw/*186.108*/("""}"""),format.raw/*186.109*/("""}"""),format.raw/*186.110*/("""</h6>
                        </div>
                        <div class="postmsg"><span>"""),format.raw/*188.52*/("""{"""),format.raw/*188.53*/("""{"""),format.raw/*188.54*/("""pst.post"""),format.raw/*188.62*/("""}"""),format.raw/*188.63*/("""}"""),format.raw/*188.64*/("""</span></div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript">
        var app = angular.module('admin',  ["ngCookies"]);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*196.80*/("""{"""),format.raw/*196.81*/("""
            """),format.raw/*197.13*/("""$locationProvider.html5Mode("""),format.raw/*197.41*/("""{"""),format.raw/*197.42*/("""enabled: true, requireBase: false"""),format.raw/*197.75*/("""}"""),format.raw/*197.76*/(""").hashPrefix('*');
        """),format.raw/*198.9*/("""}"""),format.raw/*198.10*/("""]);

        app.controller('adminCtrl', function($scope, $http, $location, $window, $cookies) """),format.raw/*200.91*/("""{"""),format.raw/*200.92*/("""
            """),format.raw/*201.13*/("""// Initialize the view
            $scope.conerror = "";
            $scope.adderror= "";
            $scope.delerror = "";
            $scope.moderror = "";
            $scope.addSuccess = false;
            $scope.delSuccess = false;
            $scope.modSuccess = false;
            $scope.users=[];
            $scope.allMUsers=[];
            $scope.allDUsers=[];

            $scope.loggedInUser = function() """),format.raw/*213.46*/("""{"""),format.raw/*213.47*/("""
                """),format.raw/*214.17*/("""return $cookies.get("userId");
            """),format.raw/*215.13*/("""}"""),format.raw/*215.14*/(""";

            $scope.loggedInUserGroup = function() """),format.raw/*217.51*/("""{"""),format.raw/*217.52*/("""
                """),format.raw/*218.17*/("""return $cookies.get("groupId");
            """),format.raw/*219.13*/("""}"""),format.raw/*219.14*/(""";

            $scope.showPosts = function(event) """),format.raw/*221.48*/("""{"""),format.raw/*221.49*/("""
                """),format.raw/*222.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*223.34*/routes/*223.40*/.PostController.getPosts),format.raw/*223.64*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*225.13*/("""}"""),format.raw/*225.14*/(""";

            // logout and goto home page
            $scope.signOut = function(event) """),format.raw/*228.46*/("""{"""),format.raw/*228.47*/("""
                """),format.raw/*229.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*233.34*/routes/*233.40*/.HomeController.logout),format.raw/*233.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*235.13*/("""}"""),format.raw/*235.14*/(""";

            // add post event handler
            $scope.addPost = function(event) """),format.raw/*238.46*/("""{"""),format.raw/*238.47*/("""
                """),format.raw/*239.17*/("""event.preventDefault();

                $scope.pbroadcaststatus = "";
                $scope.apf.post.$touched = false;
                // validate the posts form
                if ($scope.apf.post.$error.required) """),format.raw/*244.54*/("""{"""),format.raw/*244.55*/("""
                    """),format.raw/*245.21*/("""return;
                """),format.raw/*246.17*/("""}"""),format.raw/*246.18*/("""

                """),format.raw/*248.17*/("""// post the message
                $scope.conerror = "";
                $scope.padderror = "";
                $scope.pbroadcaststatus = "Posting and broadcasting...";
                $("#addError").html("");
                $http("""),format.raw/*253.23*/("""{"""),format.raw/*253.24*/("""
                        """),format.raw/*254.25*/("""method : "POST",
                        url : """"),_display_(/*255.33*/routes/*255.39*/.PostController.addPostAndBroadcast),format.raw/*255.74*/("""",
                        data : """),format.raw/*256.32*/("""{"""),format.raw/*256.33*/(""""post" : $scope.post"""),format.raw/*256.53*/("""}"""),format.raw/*256.54*/(""",
                        headers : """),format.raw/*257.35*/("""{"""),format.raw/*257.36*/("""
                            """),format.raw/*258.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*259.25*/("""}"""),format.raw/*259.26*/("""
                    """),format.raw/*260.21*/("""}"""),format.raw/*260.22*/(""").then(function successCallback(response) """),format.raw/*260.64*/("""{"""),format.raw/*260.65*/("""
                        """),format.raw/*261.25*/("""$scope.pbroadcaststatus = "Done";
                        $scope.post = "";
                        $scope.loadFirstPage();
                    """),format.raw/*264.21*/("""}"""),format.raw/*264.22*/(""", function errorCallback(response) """),format.raw/*264.57*/("""{"""),format.raw/*264.58*/("""
                        """),format.raw/*265.25*/("""$scope.pbroadcaststatus = "Error occured while posting and broadcasting.";
                        if (response.status == 400) """),format.raw/*266.53*/("""{"""),format.raw/*266.54*/("""
                            """),format.raw/*267.29*/("""$scope.padderror = response.data.error;
                            $("#addError").html("<div id='aErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.padderror + "</div>");
                        """),format.raw/*269.25*/("""}"""),format.raw/*269.26*/(""" """),format.raw/*269.27*/("""else """),format.raw/*269.32*/("""{"""),format.raw/*269.33*/("""
                            """),format.raw/*270.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*272.34*/("""{"""),format.raw/*272.35*/("""
                                """),format.raw/*273.33*/("""$scope.conerror = "Error posting the message. Retry";
                                $('#conError').modal('show');
                            """),format.raw/*275.29*/("""}"""),format.raw/*275.30*/("""
                        """),format.raw/*276.25*/("""}"""),format.raw/*276.26*/("""
                    """),format.raw/*277.21*/("""}"""),format.raw/*277.22*/(""");
            """),format.raw/*278.13*/("""}"""),format.raw/*278.14*/(""";

            // post page loader
            $scope.loadPage = function(url) """),format.raw/*281.45*/("""{"""),format.raw/*281.46*/("""
                """),format.raw/*282.17*/("""$scope.conerror = "";
                $http("""),format.raw/*283.23*/("""{"""),format.raw/*283.24*/("""
                        """),format.raw/*284.25*/("""method : "GET",
                        url : url,
                        headers : """),format.raw/*286.35*/("""{"""),format.raw/*286.36*/("""
                            """),format.raw/*287.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*288.25*/("""}"""),format.raw/*288.26*/("""
                    """),format.raw/*289.21*/("""}"""),format.raw/*289.22*/(""").then(function successCallback(response) """),format.raw/*289.64*/("""{"""),format.raw/*289.65*/("""
                        """),format.raw/*290.25*/("""$scope.postpage = response.data;
                    """),format.raw/*291.21*/("""}"""),format.raw/*291.22*/(""", function errorCallback(response) """),format.raw/*291.57*/("""{"""),format.raw/*291.58*/("""
                         """),format.raw/*292.26*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                         else """),format.raw/*294.31*/("""{"""),format.raw/*294.32*/("""
                            """),format.raw/*295.29*/("""$scope.conerror = "Error retrieving the post page from the server. Retry.";
                            $('#conError').modal('show');
                         """),format.raw/*297.26*/("""}"""),format.raw/*297.27*/("""
                    """),format.raw/*298.21*/("""}"""),format.raw/*298.22*/(""");
            """),format.raw/*299.13*/("""}"""),format.raw/*299.14*/(""";

            // refreshes the current page
            $scope.refreshCurrentPage = function(event) """),format.raw/*302.57*/("""{"""),format.raw/*302.58*/("""
                """),format.raw/*303.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadPage("/posts/userbposts/refresh/" + $scope.postpage.endId);
            """),format.raw/*306.13*/("""}"""),format.raw/*306.14*/(""";

            // next page event handler
            $scope.loadNextPage = function(event) """),format.raw/*309.51*/("""{"""),format.raw/*309.52*/("""
                """),format.raw/*310.17*/("""event.preventDefault();
                $scope.loadPage("/posts/userbposts/after/" + $scope.postpage.beginId);
            """),format.raw/*312.13*/("""}"""),format.raw/*312.14*/(""";

            // previous page event handler
            $scope.loadPreviousPage = function(event) """),format.raw/*315.55*/("""{"""),format.raw/*315.56*/("""
                """),format.raw/*316.17*/("""event.preventDefault();
                $scope.loadPage("/posts/userbposts/before/" + $scope.postpage.endId);
            """),format.raw/*318.13*/("""}"""),format.raw/*318.14*/(""";

            // loads the first page
            $scope.loadFirstPage = function() """),format.raw/*321.47*/("""{"""),format.raw/*321.48*/("""
                """),format.raw/*322.17*/("""$scope.postpage.numPosts = "0";
                $scope.postpage.bLastPage = false;
                $scope.postpage.arr = [];
                $scope.postpage.beginId = "-1";
                $scope.postpage.endId = "-1";
                $scope.loadPage("/posts/userbposts/first");
            """),format.raw/*328.13*/("""}"""),format.raw/*328.14*/(""";

            // toggles the comment editor for a post
            $scope.togglePostsEditor = function(event) """),format.raw/*331.56*/("""{"""),format.raw/*331.57*/("""
                """),format.raw/*332.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowPosts)) """),format.raw/*333.60*/("""{"""),format.raw/*333.61*/("""
                    """),format.raw/*334.21*/("""$scope.bShowPosts = true;
                    $scope.padderror = "";
                    $scope.postpage = new Object();
                    $scope.loadFirstPage();
                """),format.raw/*338.17*/("""}"""),format.raw/*338.18*/(""" """),format.raw/*338.19*/("""else """),format.raw/*338.24*/("""{"""),format.raw/*338.25*/("""
                    """),format.raw/*339.21*/("""$scope.bShowPosts = !$scope.bShowPosts;
                """),format.raw/*340.17*/("""}"""),format.raw/*340.18*/("""
            """),format.raw/*341.13*/("""}"""),format.raw/*341.14*/(""";

            $scope.showForbiddenPage = function() """),format.raw/*343.51*/("""{"""),format.raw/*343.52*/("""
                """),format.raw/*344.17*/("""$cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*347.34*/routes/*347.40*/.AdminController.showForbiddenPage),format.raw/*347.74*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*349.13*/("""}"""),format.raw/*349.14*/(""";

           $scope.refreshMUsers = function(event)"""),format.raw/*351.50*/("""{"""),format.raw/*351.51*/("""
                """),format.raw/*352.17*/("""$scope.loadAllUsers(0, event);
                $scope.mUserId = "";
                $scope.moderror = "";
                $scope.rpf.userId.$touched = false;
                $scope.rpf.password.$touched = false;
                $scope.modSuccess = false;
            """),format.raw/*358.13*/("""}"""),format.raw/*358.14*/(""";

            $scope.modifyUser  = function(event) """),format.raw/*360.50*/("""{"""),format.raw/*360.51*/("""
                """),format.raw/*361.17*/("""event.preventDefault();

                // validate the modify user form
                if ($scope.rpf.userId.$error.required || !$scope.rpf.userId.$dirty) """),format.raw/*364.85*/("""{"""),format.raw/*364.86*/("""
                    """),format.raw/*365.21*/("""$scope.rpf.userId.$touched = true;
                    return;
                """),format.raw/*367.17*/("""}"""),format.raw/*367.18*/("""

                """),format.raw/*369.17*/("""$scope.conerror = "";
                $scope.moderror = "";
                $scope.modSuccess = false;
                $http("""),format.raw/*372.23*/("""{"""),format.raw/*372.24*/("""
                        """),format.raw/*373.25*/("""method : "PUT",
                        url : """"),_display_(/*374.33*/routes/*374.39*/.PasswordResetController.resetUserPassword),format.raw/*374.81*/("""",
                        data : """),format.raw/*375.32*/("""{"""),format.raw/*375.33*/(""""userId" : $scope.mUserId, "password" : $scope.mPassword"""),format.raw/*375.89*/("""}"""),format.raw/*375.90*/(""",
                        headers : """),format.raw/*376.35*/("""{"""),format.raw/*376.36*/("""
                            """),format.raw/*377.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*378.25*/("""}"""),format.raw/*378.26*/("""
                    """),format.raw/*379.21*/("""}"""),format.raw/*379.22*/(""").then(function successCallback(response) """),format.raw/*379.64*/("""{"""),format.raw/*379.65*/("""
                        """),format.raw/*380.25*/("""$scope.mUserId = null;
                        $scope.mPassword = "";
                        $scope.rpf.userId.$touched = false;
                        $scope.rpf.password.$touched = false;
                        $scope.modSuccess = true;
                    """),format.raw/*385.21*/("""}"""),format.raw/*385.22*/(""", function errorCallback(response) """),format.raw/*385.57*/("""{"""),format.raw/*385.58*/("""
                        """),format.raw/*386.25*/("""if (response.status == 400) """),format.raw/*386.53*/("""{"""),format.raw/*386.54*/("""
                            """),format.raw/*387.29*/("""$scope.moderror = response.data.error;
                            $scope.rpf.$setPristine();
                        """),format.raw/*389.25*/("""}"""),format.raw/*389.26*/(""" """),format.raw/*389.27*/("""else """),format.raw/*389.32*/("""{"""),format.raw/*389.33*/("""
                            """),format.raw/*390.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*392.34*/("""{"""),format.raw/*392.35*/("""
                                """),format.raw/*393.33*/("""$scope.conerror = "Error trying to reset the password. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*395.29*/("""}"""),format.raw/*395.30*/("""
                        """),format.raw/*396.25*/("""}"""),format.raw/*396.26*/("""
                    """),format.raw/*397.21*/("""}"""),format.raw/*397.22*/(""");
            """),format.raw/*398.13*/("""}"""),format.raw/*398.14*/(""";

            $scope.toggleUserEditor = function(event) """),format.raw/*400.55*/("""{"""),format.raw/*400.56*/("""
                """),format.raw/*401.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowRPE)) """),format.raw/*402.58*/("""{"""),format.raw/*402.59*/("""
                    """),format.raw/*403.21*/("""$scope.bShowRPE = true;
                    $scope.loadAllUsers(0, null);
                """),format.raw/*405.17*/("""}"""),format.raw/*405.18*/(""" """),format.raw/*405.19*/("""else """),format.raw/*405.24*/("""{"""),format.raw/*405.25*/("""
                    """),format.raw/*406.21*/("""$scope.bShowRPE = !$scope.bShowRPE;
                """),format.raw/*407.17*/("""}"""),format.raw/*407.18*/("""
            """),format.raw/*408.13*/("""}"""),format.raw/*408.14*/(""";

            $scope.loadAllUsers = function(dorm, event) """),format.raw/*410.57*/("""{"""),format.raw/*410.58*/(""" """),format.raw/*410.59*/("""// todo: serialize calls
                if (event != null)
                    event.preventDefault();
                $scope.conerror = "";

                if(dorm == 0)
                    $scope.allMUsers = [];
                else
                    $scope.allDUsers = [];
                $http("""),format.raw/*419.23*/("""{"""),format.raw/*419.24*/("""
                        """),format.raw/*420.25*/("""method : "GET",
                        url : """"),_display_(/*421.33*/routes/*421.39*/.AdminController.getUsers),format.raw/*421.64*/("""",
                        headers : """),format.raw/*422.35*/("""{"""),format.raw/*422.36*/("""
                        """),format.raw/*423.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*424.25*/("""}"""),format.raw/*424.26*/("""
                    """),format.raw/*425.21*/("""}"""),format.raw/*425.22*/(""").then(function successCallback(response) """),format.raw/*425.64*/("""{"""),format.raw/*425.65*/("""
                        """),format.raw/*426.25*/("""if(dorm == 0)
                            $scope.allMUsers = response.data;
                        else
                            $scope.allDUsers = response.data;
                    """),format.raw/*430.21*/("""}"""),format.raw/*430.22*/(""", function errorCallback(response) """),format.raw/*430.57*/("""{"""),format.raw/*430.58*/("""
                        """),format.raw/*431.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*433.30*/("""{"""),format.raw/*433.31*/("""
                            """),format.raw/*434.29*/("""$scope.conerror = "Error refreshing the list of all users. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*436.25*/("""}"""),format.raw/*436.26*/("""
                    """),format.raw/*437.21*/("""}"""),format.raw/*437.22*/("""
                """),format.raw/*438.17*/(""");
            """),format.raw/*439.13*/("""}"""),format.raw/*439.14*/(""";

            $scope.refreshDUsers = function(event)"""),format.raw/*441.51*/("""{"""),format.raw/*441.52*/("""
                """),format.raw/*442.17*/("""$scope.loadAllUsers(1,event);
                $scope.dUserId = "";
                $scope.delerror = "";
                $scope.duf.userId.$touched = false;
                $scope.delSuccess = false;
            """),format.raw/*447.13*/("""}"""),format.raw/*447.14*/(""";

            $scope.deleteUser  = function(event) """),format.raw/*449.50*/("""{"""),format.raw/*449.51*/("""
                """),format.raw/*450.17*/("""event.preventDefault();

                // validate the delete user form
                if ($scope.duf.userId.$error.required || !$scope.duf.userId.$dirty) """),format.raw/*453.85*/("""{"""),format.raw/*453.86*/("""
                    """),format.raw/*454.21*/("""$scope.duf.userId.$touched = true;
                    return;
                """),format.raw/*456.17*/("""}"""),format.raw/*456.18*/("""

                """),format.raw/*458.17*/("""$scope.conerror = "";
                $scope.delerror = "";
                $scope.delSuccess = false;
                $http("""),format.raw/*461.23*/("""{"""),format.raw/*461.24*/("""
                        """),format.raw/*462.25*/("""method : "DELETE",
                        url : "user/" + $scope.dUserId,
                        headers : """),format.raw/*464.35*/("""{"""),format.raw/*464.36*/("""
                            """),format.raw/*465.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*466.25*/("""}"""),format.raw/*466.26*/("""
                    """),format.raw/*467.21*/("""}"""),format.raw/*467.22*/(""").then(function successCallback(response) """),format.raw/*467.64*/("""{"""),format.raw/*467.65*/("""
                        """),format.raw/*468.25*/("""$scope.dUserId = "";
                        $scope.duf.userId.$touched = false;
                        $scope.delSuccess = true;
                        $scope.loadAllUsers(1,null);
                    """),format.raw/*472.21*/("""}"""),format.raw/*472.22*/(""", function errorCallback(response) """),format.raw/*472.57*/("""{"""),format.raw/*472.58*/("""
                        """),format.raw/*473.25*/("""if (response.status == 400) """),format.raw/*473.53*/("""{"""),format.raw/*473.54*/("""
                            """),format.raw/*474.29*/("""$scope.delerror = response.data.error;
                            $scope.duf.$setPristine();
                        """),format.raw/*476.25*/("""}"""),format.raw/*476.26*/(""" """),format.raw/*476.27*/("""else """),format.raw/*476.32*/("""{"""),format.raw/*476.33*/("""
                            """),format.raw/*477.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*479.34*/("""{"""),format.raw/*479.35*/("""
                                """),format.raw/*480.33*/("""$scope.conerror = "Error trying to delete the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*482.29*/("""}"""),format.raw/*482.30*/("""
                        """),format.raw/*483.25*/("""}"""),format.raw/*483.26*/("""
                    """),format.raw/*484.21*/("""}"""),format.raw/*484.22*/(""");
            """),format.raw/*485.13*/("""}"""),format.raw/*485.14*/(""";

            $scope.toggleDelUserEditor = function(event) """),format.raw/*487.58*/("""{"""),format.raw/*487.59*/("""
                """),format.raw/*488.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowDUE)) """),format.raw/*489.58*/("""{"""),format.raw/*489.59*/("""
                    """),format.raw/*490.21*/("""$scope.bShowDUE = true;
                    $scope.loadAllUsers(1,null);
                """),format.raw/*492.17*/("""}"""),format.raw/*492.18*/(""" """),format.raw/*492.19*/("""else """),format.raw/*492.24*/("""{"""),format.raw/*492.25*/("""
                    """),format.raw/*493.21*/("""$scope.bShowDUE = !$scope.bShowDUE;
                """),format.raw/*494.17*/("""}"""),format.raw/*494.18*/("""
            """),format.raw/*495.13*/("""}"""),format.raw/*495.14*/(""";

            $scope.addUser  = function(event) """),format.raw/*497.47*/("""{"""),format.raw/*497.48*/("""
                """),format.raw/*498.17*/("""event.preventDefault();

                // validate the add user form
                if ($scope.auf.userId.$error.required || $scope.auf.userId.$error.email || !($scope.auf.userId.$dirty || $scope.auf.password.$dirty)) """),format.raw/*501.151*/("""{"""),format.raw/*501.152*/("""
                    """),format.raw/*502.21*/("""$scope.auf.userId.$touched = true;
                    return;
                """),format.raw/*504.17*/("""}"""),format.raw/*504.18*/("""

                """),format.raw/*506.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                $http("""),format.raw/*509.23*/("""{"""),format.raw/*509.24*/("""
                        """),format.raw/*510.25*/("""method : "POST",
                        url : """"),_display_(/*511.33*/routes/*511.39*/.AdminController.addUser),format.raw/*511.63*/("""",
                        data : """),format.raw/*512.32*/("""{"""),format.raw/*512.33*/(""""userId" : $scope.nUserId, "password" : $scope.nPassword"""),format.raw/*512.89*/("""}"""),format.raw/*512.90*/(""",
                        headers : """),format.raw/*513.35*/("""{"""),format.raw/*513.36*/("""
                            """),format.raw/*514.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*515.25*/("""}"""),format.raw/*515.26*/("""
                    """),format.raw/*516.21*/("""}"""),format.raw/*516.22*/(""").then(function successCallback(response) """),format.raw/*516.64*/("""{"""),format.raw/*516.65*/("""
                        """),format.raw/*517.25*/("""$scope.nUserId = "";
                        $scope.nPassword = "";
                        $scope.auf.userId.$touched = false;
                        $scope.auf.password.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*522.21*/("""}"""),format.raw/*522.22*/(""", function errorCallback(response) """),format.raw/*522.57*/("""{"""),format.raw/*522.58*/("""
                        """),format.raw/*523.25*/("""if (response.status == 400) """),format.raw/*523.53*/("""{"""),format.raw/*523.54*/("""
                            """),format.raw/*524.29*/("""$scope.adderror = response.data.error;
                            $scope.auf.$setPristine();
                        """),format.raw/*526.25*/("""}"""),format.raw/*526.26*/(""" """),format.raw/*526.27*/("""else """),format.raw/*526.32*/("""{"""),format.raw/*526.33*/("""
                            """),format.raw/*527.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*529.34*/("""{"""),format.raw/*529.35*/("""
                                """),format.raw/*530.33*/("""$scope.conerror = "Error trying to add the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*532.29*/("""}"""),format.raw/*532.30*/("""
                        """),format.raw/*533.25*/("""}"""),format.raw/*533.26*/("""
                    """),format.raw/*534.21*/("""}"""),format.raw/*534.22*/(""");
            """),format.raw/*535.13*/("""}"""),format.raw/*535.14*/(""";

            $scope.toggleAddUserEditor = function(event) """),format.raw/*537.58*/("""{"""),format.raw/*537.59*/("""
                """),format.raw/*538.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowAUE)) """),format.raw/*539.58*/("""{"""),format.raw/*539.59*/("""
                    """),format.raw/*540.21*/("""$scope.bShowAUE = true;
                    $scope.nUserId = "";
                    $scope.nPassword = "";
                """),format.raw/*543.17*/("""}"""),format.raw/*543.18*/(""" """),format.raw/*543.19*/("""else """),format.raw/*543.24*/("""{"""),format.raw/*543.25*/("""
                    """),format.raw/*544.21*/("""$scope.bShowAUE = !$scope.bShowAUE;
                """),format.raw/*545.17*/("""}"""),format.raw/*545.18*/("""
            """),format.raw/*546.13*/("""}"""),format.raw/*546.14*/(""";


        """),format.raw/*549.9*/("""}"""),format.raw/*549.10*/(""");
    </script>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object admin extends admin_Scope0.admin
              /*
                  -- GENERATED --
                  DATE: Tue Sep 27 11:19:18 IST 2016
                  SOURCE: /home/si2chip/temp/si2chip2/si2chip/app/views/admin.scala.html
                  HASH: 3b2a0172f4b9cd80267037686f1a129ae0fd3b37
                  MATRIX: 827->0|1130->277|1144->283|1212->331|1273->366|1287->372|1349->414|1410->449|1424->455|1486->497|2137->1121|2152->1127|2208->1162|2237->1163|3311->2209|3340->2210|3369->2211|3405->2219|3434->2220|3463->2221|3520->2250|8060->6760|8091->6761|8122->6762|8162->6772|8193->6773|8224->6774|10767->9287|10798->9288|10829->9289|10869->9299|10900->9300|10931->9301|13167->11508|13197->11509|13227->11510|13273->11527|13303->11528|13333->11529|15074->13241|15104->13242|15134->13243|15173->13253|15203->13254|15233->13255|15273->13266|15303->13267|15333->13268|15375->13280|15406->13281|15437->13282|15554->13370|15584->13371|15614->13372|15651->13380|15681->13381|15711->13382|16023->13665|16053->13666|16095->13679|16152->13707|16182->13708|16244->13741|16274->13742|16329->13769|16359->13770|16483->13865|16513->13866|16555->13879|17000->14295|17030->14296|17076->14313|17148->14356|17178->14357|17260->14410|17290->14411|17336->14428|17409->14472|17439->14473|17518->14523|17548->14524|17594->14541|17679->14598|17695->14604|17741->14628|17856->14714|17886->14715|18004->14804|18034->14805|18080->14822|18297->15011|18313->15017|18357->15039|18472->15125|18502->15126|18617->15212|18647->15213|18693->15230|18939->15447|18969->15448|19019->15469|19072->15493|19102->15494|19149->15512|19411->15745|19441->15746|19495->15771|19572->15820|19588->15826|19645->15861|19708->15895|19738->15896|19787->15916|19817->15917|19882->15953|19912->15954|19970->15983|20059->16043|20089->16044|20139->16065|20169->16066|20240->16108|20270->16109|20324->16134|20497->16278|20527->16279|20591->16314|20621->16315|20675->16340|20831->16467|20861->16468|20919->16497|21186->16735|21216->16736|21246->16737|21280->16742|21310->16743|21368->16772|21518->16893|21548->16894|21610->16927|21783->17071|21813->17072|21867->17097|21897->17098|21947->17119|21977->17120|22021->17135|22051->17136|22159->17215|22189->17216|22235->17233|22308->17277|22338->17278|22392->17303|22506->17388|22536->17389|22594->17418|22683->17478|22713->17479|22763->17500|22793->17501|22864->17543|22894->17544|22948->17569|23030->17622|23060->17623|23124->17658|23154->17659|23209->17685|23352->17799|23382->17800|23440->17829|23628->17988|23658->17989|23708->18010|23738->18011|23782->18026|23812->18027|23942->18128|23972->18129|24018->18146|24209->18308|24239->18309|24360->18401|24390->18402|24436->18419|24588->18542|24618->18543|24747->18643|24777->18644|24823->18661|24974->18783|25004->18784|25118->18869|25148->18870|25194->18887|25514->19178|25544->19179|25684->19290|25714->19291|25760->19308|25872->19391|25902->19392|25952->19413|26162->19594|26192->19595|26222->19596|26256->19601|26286->19602|26336->19623|26421->19679|26451->19680|26493->19693|26523->19694|26605->19747|26635->19748|26681->19765|26858->19914|26874->19920|26930->19954|27045->20040|27075->20041|27156->20093|27186->20094|27232->20111|27528->20378|27558->20379|27639->20431|27669->20432|27715->20449|27902->20607|27932->20608|27982->20629|28090->20708|28120->20709|28167->20727|28321->20852|28351->20853|28405->20878|28481->20926|28497->20932|28561->20974|28624->21008|28654->21009|28739->21065|28769->21066|28834->21102|28864->21103|28922->21132|29011->21192|29041->21193|29091->21214|29121->21215|29192->21257|29222->21258|29276->21283|29567->21545|29597->21546|29661->21581|29691->21582|29745->21607|29802->21635|29832->21636|29890->21665|30037->21783|30067->21784|30097->21785|30131->21790|30161->21791|30219->21820|30369->21941|30399->21942|30461->21975|30644->22129|30674->22130|30728->22155|30758->22156|30808->22177|30838->22178|30882->22193|30912->22194|30998->22251|31028->22252|31074->22269|31184->22350|31214->22351|31264->22372|31383->22462|31413->22463|31443->22464|31477->22469|31507->22470|31557->22491|31638->22543|31668->22544|31710->22557|31740->22558|31828->22617|31858->22618|31888->22619|32219->22921|32249->22922|32303->22947|32379->22995|32395->23001|32442->23026|32508->23063|32538->23064|32592->23089|32681->23149|32711->23150|32761->23171|32791->23172|32862->23214|32892->23215|32946->23240|33162->23427|33192->23428|33256->23463|33286->23464|33340->23489|33482->23602|33512->23603|33570->23632|33749->23782|33779->23783|33829->23804|33859->23805|33905->23822|33949->23837|33979->23838|34061->23891|34091->23892|34137->23909|34378->24121|34408->24122|34489->24174|34519->24175|34565->24192|34752->24350|34782->24351|34832->24372|34940->24451|34970->24452|35017->24470|35171->24595|35201->24596|35255->24621|35393->24730|35423->24731|35481->24760|35570->24820|35600->24821|35650->24842|35680->24843|35751->24885|35781->24886|35835->24911|36068->25115|36098->25116|36162->25151|36192->25152|36246->25177|36303->25205|36333->25206|36391->25235|36538->25353|36568->25354|36598->25355|36632->25360|36662->25361|36720->25390|36870->25511|36900->25512|36962->25545|37142->25696|37172->25697|37226->25722|37256->25723|37306->25744|37336->25745|37380->25760|37410->25761|37499->25821|37529->25822|37575->25839|37685->25920|37715->25921|37765->25942|37883->26031|37913->26032|37943->26033|37977->26038|38007->26039|38057->26060|38138->26112|38168->26113|38210->26126|38240->26127|38318->26176|38348->26177|38394->26194|38645->26415|38676->26416|38726->26437|38834->26516|38864->26517|38911->26535|39065->26660|39095->26661|39149->26686|39226->26735|39242->26741|39288->26765|39351->26799|39381->26800|39466->26856|39496->26857|39561->26893|39591->26894|39649->26923|39738->26983|39768->26984|39818->27005|39848->27006|39919->27048|39949->27049|40003->27074|40292->27334|40322->27335|40386->27370|40416->27371|40470->27396|40527->27424|40557->27425|40615->27454|40762->27572|40792->27573|40822->27574|40856->27579|40886->27580|40944->27609|41094->27730|41124->27731|41186->27764|41363->27912|41393->27913|41447->27938|41477->27939|41527->27960|41557->27961|41601->27976|41631->27977|41720->28037|41750->28038|41796->28055|41906->28136|41936->28137|41986->28158|42139->28282|42169->28283|42199->28284|42233->28289|42263->28290|42313->28311|42394->28363|42424->28364|42466->28377|42496->28378|42536->28390|42566->28391
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|51->20|51->20|51->20|51->20|72->41|72->41|72->41|72->41|72->41|72->41|73->42|133->102|133->102|133->102|133->102|133->102|133->102|162->131|162->131|162->131|162->131|162->131|162->131|193->162|193->162|193->162|193->162|193->162|193->162|217->186|217->186|217->186|217->186|217->186|217->186|217->186|217->186|217->186|217->186|217->186|217->186|219->188|219->188|219->188|219->188|219->188|219->188|227->196|227->196|228->197|228->197|228->197|228->197|228->197|229->198|229->198|231->200|231->200|232->201|244->213|244->213|245->214|246->215|246->215|248->217|248->217|249->218|250->219|250->219|252->221|252->221|253->222|254->223|254->223|254->223|256->225|256->225|259->228|259->228|260->229|264->233|264->233|264->233|266->235|266->235|269->238|269->238|270->239|275->244|275->244|276->245|277->246|277->246|279->248|284->253|284->253|285->254|286->255|286->255|286->255|287->256|287->256|287->256|287->256|288->257|288->257|289->258|290->259|290->259|291->260|291->260|291->260|291->260|292->261|295->264|295->264|295->264|295->264|296->265|297->266|297->266|298->267|300->269|300->269|300->269|300->269|300->269|301->270|303->272|303->272|304->273|306->275|306->275|307->276|307->276|308->277|308->277|309->278|309->278|312->281|312->281|313->282|314->283|314->283|315->284|317->286|317->286|318->287|319->288|319->288|320->289|320->289|320->289|320->289|321->290|322->291|322->291|322->291|322->291|323->292|325->294|325->294|326->295|328->297|328->297|329->298|329->298|330->299|330->299|333->302|333->302|334->303|337->306|337->306|340->309|340->309|341->310|343->312|343->312|346->315|346->315|347->316|349->318|349->318|352->321|352->321|353->322|359->328|359->328|362->331|362->331|363->332|364->333|364->333|365->334|369->338|369->338|369->338|369->338|369->338|370->339|371->340|371->340|372->341|372->341|374->343|374->343|375->344|378->347|378->347|378->347|380->349|380->349|382->351|382->351|383->352|389->358|389->358|391->360|391->360|392->361|395->364|395->364|396->365|398->367|398->367|400->369|403->372|403->372|404->373|405->374|405->374|405->374|406->375|406->375|406->375|406->375|407->376|407->376|408->377|409->378|409->378|410->379|410->379|410->379|410->379|411->380|416->385|416->385|416->385|416->385|417->386|417->386|417->386|418->387|420->389|420->389|420->389|420->389|420->389|421->390|423->392|423->392|424->393|426->395|426->395|427->396|427->396|428->397|428->397|429->398|429->398|431->400|431->400|432->401|433->402|433->402|434->403|436->405|436->405|436->405|436->405|436->405|437->406|438->407|438->407|439->408|439->408|441->410|441->410|441->410|450->419|450->419|451->420|452->421|452->421|452->421|453->422|453->422|454->423|455->424|455->424|456->425|456->425|456->425|456->425|457->426|461->430|461->430|461->430|461->430|462->431|464->433|464->433|465->434|467->436|467->436|468->437|468->437|469->438|470->439|470->439|472->441|472->441|473->442|478->447|478->447|480->449|480->449|481->450|484->453|484->453|485->454|487->456|487->456|489->458|492->461|492->461|493->462|495->464|495->464|496->465|497->466|497->466|498->467|498->467|498->467|498->467|499->468|503->472|503->472|503->472|503->472|504->473|504->473|504->473|505->474|507->476|507->476|507->476|507->476|507->476|508->477|510->479|510->479|511->480|513->482|513->482|514->483|514->483|515->484|515->484|516->485|516->485|518->487|518->487|519->488|520->489|520->489|521->490|523->492|523->492|523->492|523->492|523->492|524->493|525->494|525->494|526->495|526->495|528->497|528->497|529->498|532->501|532->501|533->502|535->504|535->504|537->506|540->509|540->509|541->510|542->511|542->511|542->511|543->512|543->512|543->512|543->512|544->513|544->513|545->514|546->515|546->515|547->516|547->516|547->516|547->516|548->517|553->522|553->522|553->522|553->522|554->523|554->523|554->523|555->524|557->526|557->526|557->526|557->526|557->526|558->527|560->529|560->529|561->530|563->532|563->532|564->533|564->533|565->534|565->534|566->535|566->535|568->537|568->537|569->538|570->539|570->539|571->540|574->543|574->543|574->543|574->543|574->543|575->544|576->545|576->545|577->546|577->546|580->549|580->549
                  -- GENERATED --
              */
          