
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
            <img src="""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("images/l46.png")),format.raw/*20.64*/(""" """),format.raw/*20.65*/("""class="logo">
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
                            """),format.raw/*41.29*/("""{"""),format.raw/*41.30*/("""{"""),format.raw/*41.31*/("""conerror"""),format.raw/*41.39*/("""}"""),format.raw/*41.40*/("""}"""),format.raw/*41.41*/("""
                        """),format.raw/*42.25*/("""</div>
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
                                        <input type="text" class="form-control" maxlength="25" ng-model="nUserName" placeholder="Enter name" required name="name">
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control" maxlength="255" ng-model="nUserId" placeholder="Enter email id here" required name="userId">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" ng-model="nPassword" placeholder="Enter password here" name="password">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control" maxlength="25" ng-model="nuserDesignation" placeholder="Designation" required name="userDesignation">
                                    </div>
                                    <div class="text-center">
                                        <div class="form-group">
                                            <input type="date" class="form-control" maxlength="255" ng-model="nuserbirth" placeholder="dd/MM/yyyy" required name="userbirth">
                                        </div>
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
                                            <option ng-repeat="usr in allDUsers track by usr.userId">"""),format.raw/*111.102*/("""{"""),format.raw/*111.103*/("""{"""),format.raw/*111.104*/("""usr.userId"""),format.raw/*111.114*/("""}"""),format.raw/*111.115*/("""}"""),format.raw/*111.116*/("""</option>
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
                                            <option ng-repeat="usr in allMUsers track by usr.userId">"""),format.raw/*140.102*/("""{"""),format.raw/*140.103*/("""{"""),format.raw/*140.104*/("""usr.userId"""),format.raw/*140.114*/("""}"""),format.raw/*140.115*/("""}"""),format.raw/*140.116*/("""</option>
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
                <h4 id="poststitle">Posts <span class="badge">"""),format.raw/*171.63*/("""{"""),format.raw/*171.64*/("""{"""),format.raw/*171.65*/("""postpage.numPosts"""),format.raw/*171.82*/("""}"""),format.raw/*171.83*/("""}"""),format.raw/*171.84*/("""</span></h4>
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
                        <h6 class="postedby"><span class="user">"""),format.raw/*195.65*/("""{"""),format.raw/*195.66*/("""{"""),format.raw/*195.67*/("""pst.userId"""),format.raw/*195.77*/("""}"""),format.raw/*195.78*/("""}"""),format.raw/*195.79*/("""</span> on """),format.raw/*195.90*/("""{"""),format.raw/*195.91*/("""{"""),format.raw/*195.92*/("""pst.postedOn"""),format.raw/*195.104*/("""}"""),format.raw/*195.105*/("""}"""),format.raw/*195.106*/("""</h6>
                    </div>
                    <div class="postmsg"><span>"""),format.raw/*197.48*/("""{"""),format.raw/*197.49*/("""{"""),format.raw/*197.50*/("""pst.post"""),format.raw/*197.58*/("""}"""),format.raw/*197.59*/("""}"""),format.raw/*197.60*/("""</span></div>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
        var app = angular.module('admin',  ["ngCookies"]);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*205.80*/("""{"""),format.raw/*205.81*/("""
            """),format.raw/*206.13*/("""$locationProvider.html5Mode("""),format.raw/*206.41*/("""{"""),format.raw/*206.42*/("""enabled: true, requireBase: false"""),format.raw/*206.75*/("""}"""),format.raw/*206.76*/(""").hashPrefix('*');
        """),format.raw/*207.9*/("""}"""),format.raw/*207.10*/("""]);

        app.controller('adminCtrl', function($scope, $http, $location, $window, $cookies) """),format.raw/*209.91*/("""{"""),format.raw/*209.92*/("""
            """),format.raw/*210.13*/("""// Initialize the view
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

            $scope.loggedInUser = function() """),format.raw/*222.46*/("""{"""),format.raw/*222.47*/("""
                """),format.raw/*223.17*/("""return $cookies.get("userId");
            """),format.raw/*224.13*/("""}"""),format.raw/*224.14*/(""";

            $scope.loggedInUserGroup = function() """),format.raw/*226.51*/("""{"""),format.raw/*226.52*/("""
                """),format.raw/*227.17*/("""return $cookies.get("groupId");
            """),format.raw/*228.13*/("""}"""),format.raw/*228.14*/(""";

            $scope.showPosts = function(event) """),format.raw/*230.48*/("""{"""),format.raw/*230.49*/("""
                """),format.raw/*231.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*232.34*/routes/*232.40*/.PostController.getPosts),format.raw/*232.64*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*234.13*/("""}"""),format.raw/*234.14*/(""";

            // logout and goto home page
            $scope.signOut = function(event) """),format.raw/*237.46*/("""{"""),format.raw/*237.47*/("""
                """),format.raw/*238.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*242.34*/routes/*242.40*/.HomeController.logout),format.raw/*242.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*244.13*/("""}"""),format.raw/*244.14*/(""";

            // add post event handler
            $scope.addPost = function(event) """),format.raw/*247.46*/("""{"""),format.raw/*247.47*/("""
                """),format.raw/*248.17*/("""event.preventDefault();

                $scope.pbroadcaststatus = "";
                $scope.apf.post.$touched = false;
                // validate the posts form
                if ($scope.apf.post.$error.required) """),format.raw/*253.54*/("""{"""),format.raw/*253.55*/("""
                    """),format.raw/*254.21*/("""return;
                """),format.raw/*255.17*/("""}"""),format.raw/*255.18*/("""

                """),format.raw/*257.17*/("""// post the message
                $scope.conerror = "";
                $scope.padderror = "";
                $scope.pbroadcaststatus = "Posting and broadcasting...";
                $("#addError").html("");
                $http("""),format.raw/*262.23*/("""{"""),format.raw/*262.24*/("""
                        """),format.raw/*263.25*/("""method : "POST",
                        url : """"),_display_(/*264.33*/routes/*264.39*/.PostController.addPostAndBroadcast),format.raw/*264.74*/("""",
                        data : """),format.raw/*265.32*/("""{"""),format.raw/*265.33*/(""""post" : $scope.post"""),format.raw/*265.53*/("""}"""),format.raw/*265.54*/(""",
                        headers : """),format.raw/*266.35*/("""{"""),format.raw/*266.36*/("""
                            """),format.raw/*267.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*268.25*/("""}"""),format.raw/*268.26*/("""
                    """),format.raw/*269.21*/("""}"""),format.raw/*269.22*/(""").then(function successCallback(response) """),format.raw/*269.64*/("""{"""),format.raw/*269.65*/("""
                        """),format.raw/*270.25*/("""$scope.pbroadcaststatus = "Done";
                        $scope.post = "";
                        $scope.loadFirstPage();
                    """),format.raw/*273.21*/("""}"""),format.raw/*273.22*/(""", function errorCallback(response) """),format.raw/*273.57*/("""{"""),format.raw/*273.58*/("""
                        """),format.raw/*274.25*/("""$scope.pbroadcaststatus = "Error occured while posting and broadcasting.";
                        if (response.status == 400) """),format.raw/*275.53*/("""{"""),format.raw/*275.54*/("""
                            """),format.raw/*276.29*/("""$scope.padderror = response.data.error;
                            $("#addError").html("<div id='aErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.padderror + "</div>");
                        """),format.raw/*278.25*/("""}"""),format.raw/*278.26*/(""" """),format.raw/*278.27*/("""else """),format.raw/*278.32*/("""{"""),format.raw/*278.33*/("""
                            """),format.raw/*279.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*281.34*/("""{"""),format.raw/*281.35*/("""
                                """),format.raw/*282.33*/("""$scope.conerror = "Error posting the message. Retry";
                                $('#conError').modal('show');
                            """),format.raw/*284.29*/("""}"""),format.raw/*284.30*/("""
                        """),format.raw/*285.25*/("""}"""),format.raw/*285.26*/("""
                    """),format.raw/*286.21*/("""}"""),format.raw/*286.22*/(""");
            """),format.raw/*287.13*/("""}"""),format.raw/*287.14*/(""";

            // post page loader
            $scope.loadPage = function(url) """),format.raw/*290.45*/("""{"""),format.raw/*290.46*/("""
                """),format.raw/*291.17*/("""$scope.conerror = "";
                $http("""),format.raw/*292.23*/("""{"""),format.raw/*292.24*/("""
                        """),format.raw/*293.25*/("""method : "GET",
                        url : url,
                        headers : """),format.raw/*295.35*/("""{"""),format.raw/*295.36*/("""
                            """),format.raw/*296.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*297.25*/("""}"""),format.raw/*297.26*/("""
                    """),format.raw/*298.21*/("""}"""),format.raw/*298.22*/(""").then(function successCallback(response) """),format.raw/*298.64*/("""{"""),format.raw/*298.65*/("""
                        """),format.raw/*299.25*/("""$scope.postpage = response.data;
                    """),format.raw/*300.21*/("""}"""),format.raw/*300.22*/(""", function errorCallback(response) """),format.raw/*300.57*/("""{"""),format.raw/*300.58*/("""
                         """),format.raw/*301.26*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                         else """),format.raw/*303.31*/("""{"""),format.raw/*303.32*/("""
                            """),format.raw/*304.29*/("""$scope.conerror = "Error retrieving the post page from the server. Retry.";
                            $('#conError').modal('show');
                         """),format.raw/*306.26*/("""}"""),format.raw/*306.27*/("""
                    """),format.raw/*307.21*/("""}"""),format.raw/*307.22*/(""");
            """),format.raw/*308.13*/("""}"""),format.raw/*308.14*/(""";

            // refreshes the current page
            $scope.refreshCurrentPage = function(event) """),format.raw/*311.57*/("""{"""),format.raw/*311.58*/("""
                """),format.raw/*312.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadPage("/posts/userbposts/refresh/" + $scope.postpage.endId);
            """),format.raw/*315.13*/("""}"""),format.raw/*315.14*/(""";

            // next page event handler
            $scope.loadNextPage = function(event) """),format.raw/*318.51*/("""{"""),format.raw/*318.52*/("""
                """),format.raw/*319.17*/("""event.preventDefault();
                $scope.loadPage("/posts/userbposts/after/" + $scope.postpage.beginId);
            """),format.raw/*321.13*/("""}"""),format.raw/*321.14*/(""";

            // previous page event handler
            $scope.loadPreviousPage = function(event) """),format.raw/*324.55*/("""{"""),format.raw/*324.56*/("""
                """),format.raw/*325.17*/("""event.preventDefault();
                $scope.loadPage("/posts/userbposts/before/" + $scope.postpage.endId);
            """),format.raw/*327.13*/("""}"""),format.raw/*327.14*/(""";

            // loads the first page
            $scope.loadFirstPage = function() """),format.raw/*330.47*/("""{"""),format.raw/*330.48*/("""
                """),format.raw/*331.17*/("""$scope.postpage.numPosts = "0";
                $scope.postpage.bLastPage = false;
                $scope.postpage.arr = [];
                $scope.postpage.beginId = "-1";
                $scope.postpage.endId = "-1";
                $scope.loadPage("/posts/userbposts/first");
            """),format.raw/*337.13*/("""}"""),format.raw/*337.14*/(""";

            // toggles the comment editor for a post
            $scope.togglePostsEditor = function(event) """),format.raw/*340.56*/("""{"""),format.raw/*340.57*/("""
                """),format.raw/*341.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowPosts)) """),format.raw/*342.60*/("""{"""),format.raw/*342.61*/("""
                    """),format.raw/*343.21*/("""$scope.bShowPosts = true;
                    $scope.padderror = "";
                    $scope.postpage = new Object();
                    $scope.loadFirstPage();
                """),format.raw/*347.17*/("""}"""),format.raw/*347.18*/(""" """),format.raw/*347.19*/("""else """),format.raw/*347.24*/("""{"""),format.raw/*347.25*/("""
                    """),format.raw/*348.21*/("""$scope.bShowPosts = !$scope.bShowPosts;
                """),format.raw/*349.17*/("""}"""),format.raw/*349.18*/("""
            """),format.raw/*350.13*/("""}"""),format.raw/*350.14*/(""";

            $scope.showForbiddenPage = function() """),format.raw/*352.51*/("""{"""),format.raw/*352.52*/("""
                """),format.raw/*353.17*/("""$cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*356.34*/routes/*356.40*/.AdminController.showForbiddenPage),format.raw/*356.74*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*358.13*/("""}"""),format.raw/*358.14*/(""";

           $scope.refreshMUsers = function(event)"""),format.raw/*360.50*/("""{"""),format.raw/*360.51*/("""
                """),format.raw/*361.17*/("""$scope.loadAllUsers(0, event);
                $scope.mUserId = "";
                $scope.moderror = "";
                $scope.rpf.userId.$touched = false;
                $scope.rpf.password.$touched = false;
                $scope.modSuccess = false;
            """),format.raw/*367.13*/("""}"""),format.raw/*367.14*/(""";

            $scope.modifyUser  = function(event) """),format.raw/*369.50*/("""{"""),format.raw/*369.51*/("""
                """),format.raw/*370.17*/("""event.preventDefault();

                // validate the modify user form
                if ($scope.rpf.userId.$error.required || !$scope.rpf.userId.$dirty) """),format.raw/*373.85*/("""{"""),format.raw/*373.86*/("""
                    """),format.raw/*374.21*/("""$scope.rpf.userId.$touched = true;
                    return;
                """),format.raw/*376.17*/("""}"""),format.raw/*376.18*/("""

                """),format.raw/*378.17*/("""$scope.conerror = "";
                $scope.moderror = "";
                $scope.modSuccess = false;
                $http("""),format.raw/*381.23*/("""{"""),format.raw/*381.24*/("""
                        """),format.raw/*382.25*/("""method : "PUT",
                        url : """"),_display_(/*383.33*/routes/*383.39*/.PasswordResetController.resetUserPassword),format.raw/*383.81*/("""",
                        data : """),format.raw/*384.32*/("""{"""),format.raw/*384.33*/(""""userId" : $scope.mUserId, "password" : $scope.mPassword"""),format.raw/*384.89*/("""}"""),format.raw/*384.90*/(""",
                        headers : """),format.raw/*385.35*/("""{"""),format.raw/*385.36*/("""
                            """),format.raw/*386.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*387.25*/("""}"""),format.raw/*387.26*/("""
                    """),format.raw/*388.21*/("""}"""),format.raw/*388.22*/(""").then(function successCallback(response) """),format.raw/*388.64*/("""{"""),format.raw/*388.65*/("""
                        """),format.raw/*389.25*/("""$scope.mUserId = null;
                        $scope.mPassword = "";
                        $scope.rpf.userId.$touched = false;
                        $scope.rpf.password.$touched = false;
                        $scope.modSuccess = true;
                    """),format.raw/*394.21*/("""}"""),format.raw/*394.22*/(""", function errorCallback(response) """),format.raw/*394.57*/("""{"""),format.raw/*394.58*/("""
                        """),format.raw/*395.25*/("""if (response.status == 400) """),format.raw/*395.53*/("""{"""),format.raw/*395.54*/("""
                            """),format.raw/*396.29*/("""$scope.moderror = response.data.error;
                            $scope.rpf.$setPristine();
                        """),format.raw/*398.25*/("""}"""),format.raw/*398.26*/(""" """),format.raw/*398.27*/("""else """),format.raw/*398.32*/("""{"""),format.raw/*398.33*/("""
                            """),format.raw/*399.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*401.34*/("""{"""),format.raw/*401.35*/("""
                                """),format.raw/*402.33*/("""$scope.conerror = "Error trying to reset the password. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*404.29*/("""}"""),format.raw/*404.30*/("""
                        """),format.raw/*405.25*/("""}"""),format.raw/*405.26*/("""
                    """),format.raw/*406.21*/("""}"""),format.raw/*406.22*/(""");
            """),format.raw/*407.13*/("""}"""),format.raw/*407.14*/(""";

            $scope.toggleUserEditor = function(event) """),format.raw/*409.55*/("""{"""),format.raw/*409.56*/("""
                """),format.raw/*410.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowRPE)) """),format.raw/*411.58*/("""{"""),format.raw/*411.59*/("""
                    """),format.raw/*412.21*/("""$scope.bShowRPE = true;
                    $scope.loadAllUsers(0, null);
                """),format.raw/*414.17*/("""}"""),format.raw/*414.18*/(""" """),format.raw/*414.19*/("""else """),format.raw/*414.24*/("""{"""),format.raw/*414.25*/("""
                    """),format.raw/*415.21*/("""$scope.bShowRPE = !$scope.bShowRPE;
                """),format.raw/*416.17*/("""}"""),format.raw/*416.18*/("""
            """),format.raw/*417.13*/("""}"""),format.raw/*417.14*/(""";

            $scope.loadAllUsers = function(dorm, event) """),format.raw/*419.57*/("""{"""),format.raw/*419.58*/(""" """),format.raw/*419.59*/("""// todo: serialize calls
                if (event != null)
                    event.preventDefault();
                $scope.conerror = "";

                if(dorm == 0)
                    $scope.allMUsers = [];
                else
                    $scope.allDUsers = [];
                $http("""),format.raw/*428.23*/("""{"""),format.raw/*428.24*/("""
                        """),format.raw/*429.25*/("""method : "GET",
                        url : """"),_display_(/*430.33*/routes/*430.39*/.AdminController.getUsers),format.raw/*430.64*/("""",
                        headers : """),format.raw/*431.35*/("""{"""),format.raw/*431.36*/("""
                        """),format.raw/*432.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*433.25*/("""}"""),format.raw/*433.26*/("""
                    """),format.raw/*434.21*/("""}"""),format.raw/*434.22*/(""").then(function successCallback(response) """),format.raw/*434.64*/("""{"""),format.raw/*434.65*/("""
                        """),format.raw/*435.25*/("""if(dorm == 0)
                            $scope.allMUsers = response.data;
                        else
                            $scope.allDUsers = response.data;
                    """),format.raw/*439.21*/("""}"""),format.raw/*439.22*/(""", function errorCallback(response) """),format.raw/*439.57*/("""{"""),format.raw/*439.58*/("""
                        """),format.raw/*440.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*442.30*/("""{"""),format.raw/*442.31*/("""
                            """),format.raw/*443.29*/("""$scope.conerror = "Error refreshing the list of all users. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*445.25*/("""}"""),format.raw/*445.26*/("""
                    """),format.raw/*446.21*/("""}"""),format.raw/*446.22*/("""
                """),format.raw/*447.17*/(""");
            """),format.raw/*448.13*/("""}"""),format.raw/*448.14*/(""";

            $scope.refreshDUsers = function(event)"""),format.raw/*450.51*/("""{"""),format.raw/*450.52*/("""
                """),format.raw/*451.17*/("""$scope.loadAllUsers(1,event);
                $scope.dUserId = "";
                $scope.delerror = "";
                $scope.duf.userId.$touched = false;
                $scope.delSuccess = false;
            """),format.raw/*456.13*/("""}"""),format.raw/*456.14*/(""";

            $scope.deleteUser  = function(event) """),format.raw/*458.50*/("""{"""),format.raw/*458.51*/("""
                """),format.raw/*459.17*/("""event.preventDefault();

                // validate the delete user form
                if ($scope.duf.userId.$error.required || !$scope.duf.userId.$dirty) """),format.raw/*462.85*/("""{"""),format.raw/*462.86*/("""
                    """),format.raw/*463.21*/("""$scope.duf.userId.$touched = true;
                    return;
                """),format.raw/*465.17*/("""}"""),format.raw/*465.18*/("""

                """),format.raw/*467.17*/("""$scope.conerror = "";
                $scope.delerror = "";
                $scope.delSuccess = false;
                $http("""),format.raw/*470.23*/("""{"""),format.raw/*470.24*/("""
                        """),format.raw/*471.25*/("""method : "DELETE",
                        url : "user/" + $scope.dUserId,
                        headers : """),format.raw/*473.35*/("""{"""),format.raw/*473.36*/("""
                            """),format.raw/*474.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*475.25*/("""}"""),format.raw/*475.26*/("""
                    """),format.raw/*476.21*/("""}"""),format.raw/*476.22*/(""").then(function successCallback(response) """),format.raw/*476.64*/("""{"""),format.raw/*476.65*/("""
                        """),format.raw/*477.25*/("""$scope.dUserId = "";
                        $scope.duf.userId.$touched = false;
                        $scope.delSuccess = true;
                        $scope.loadAllUsers(1,null);
                    """),format.raw/*481.21*/("""}"""),format.raw/*481.22*/(""", function errorCallback(response) """),format.raw/*481.57*/("""{"""),format.raw/*481.58*/("""
                        """),format.raw/*482.25*/("""if (response.status == 400) """),format.raw/*482.53*/("""{"""),format.raw/*482.54*/("""
                            """),format.raw/*483.29*/("""$scope.delerror = response.data.error;
                            $scope.duf.$setPristine();
                        """),format.raw/*485.25*/("""}"""),format.raw/*485.26*/(""" """),format.raw/*485.27*/("""else """),format.raw/*485.32*/("""{"""),format.raw/*485.33*/("""
                            """),format.raw/*486.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*488.34*/("""{"""),format.raw/*488.35*/("""
                                """),format.raw/*489.33*/("""$scope.conerror = "Error trying to delete the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*491.29*/("""}"""),format.raw/*491.30*/("""
                        """),format.raw/*492.25*/("""}"""),format.raw/*492.26*/("""
                    """),format.raw/*493.21*/("""}"""),format.raw/*493.22*/(""");
            """),format.raw/*494.13*/("""}"""),format.raw/*494.14*/(""";

            $scope.toggleDelUserEditor = function(event) """),format.raw/*496.58*/("""{"""),format.raw/*496.59*/("""
                """),format.raw/*497.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowDUE)) """),format.raw/*498.58*/("""{"""),format.raw/*498.59*/("""
                    """),format.raw/*499.21*/("""$scope.bShowDUE = true;
                    $scope.loadAllUsers(1,null);
                """),format.raw/*501.17*/("""}"""),format.raw/*501.18*/(""" """),format.raw/*501.19*/("""else """),format.raw/*501.24*/("""{"""),format.raw/*501.25*/("""
                    """),format.raw/*502.21*/("""$scope.bShowDUE = !$scope.bShowDUE;
                """),format.raw/*503.17*/("""}"""),format.raw/*503.18*/("""
            """),format.raw/*504.13*/("""}"""),format.raw/*504.14*/(""";

            $scope.addUser  = function(event) """),format.raw/*506.47*/("""{"""),format.raw/*506.48*/("""
                """),format.raw/*507.17*/("""event.preventDefault();

                // validate the add user form
                if ($scope.auf.userId.$error.required || $scope.auf.userId.$error.email || !($scope.auf.userId.$dirty || $scope.auf.password.$dirty)) """),format.raw/*510.151*/("""{"""),format.raw/*510.152*/("""
                    """),format.raw/*511.21*/("""$scope.auf.userId.$touched = true;
                    return;
                """),format.raw/*513.17*/("""}"""),format.raw/*513.18*/("""

                """),format.raw/*515.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                $http("""),format.raw/*518.23*/("""{"""),format.raw/*518.24*/("""
                       """),format.raw/*519.24*/("""method : "POST",
                        url : """"),_display_(/*520.33*/routes/*520.39*/.AdminController.addUser),format.raw/*520.63*/("""",
                        data : """),format.raw/*521.32*/("""{"""),format.raw/*521.33*/(""""name" : $scope.nUserName, "userId" : $scope.nUserId, "password" : $scope.nPassword, "userDesignation" : $scope.nuserDesignation, "userbirth" : $scope.nuserbirth"""),format.raw/*521.194*/("""}"""),format.raw/*521.195*/(""",
                        headers : """),format.raw/*522.35*/("""{"""),format.raw/*522.36*/("""
                            """),format.raw/*523.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*524.25*/("""}"""),format.raw/*524.26*/("""
                    """),format.raw/*525.21*/("""}"""),format.raw/*525.22*/(""").then(function successCallback(response) """),format.raw/*525.64*/("""{"""),format.raw/*525.65*/("""
                        """),format.raw/*526.25*/("""$scope.nUserId = "";
                        $scope.nPassword = "";
                        $scope.auf.userId.$touched = false;
                        $scope.auf.password.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*531.21*/("""}"""),format.raw/*531.22*/(""", function errorCallback(response) """),format.raw/*531.57*/("""{"""),format.raw/*531.58*/("""
                        """),format.raw/*532.25*/("""if (response.status == 400) """),format.raw/*532.53*/("""{"""),format.raw/*532.54*/("""
                            """),format.raw/*533.29*/("""$scope.adderror = response.data.error;
                            $scope.auf.$setPristine();
                        """),format.raw/*535.25*/("""}"""),format.raw/*535.26*/(""" """),format.raw/*535.27*/("""else """),format.raw/*535.32*/("""{"""),format.raw/*535.33*/("""
                            """),format.raw/*536.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*538.34*/("""{"""),format.raw/*538.35*/("""
                                """),format.raw/*539.33*/("""$scope.conerror = "Error trying to add the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*541.29*/("""}"""),format.raw/*541.30*/("""
                        """),format.raw/*542.25*/("""}"""),format.raw/*542.26*/("""
                    """),format.raw/*543.21*/("""}"""),format.raw/*543.22*/(""");
            """),format.raw/*544.13*/("""}"""),format.raw/*544.14*/(""";

            $scope.toggleAddUserEditor = function(event) """),format.raw/*546.58*/("""{"""),format.raw/*546.59*/("""
                """),format.raw/*547.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowAUE)) """),format.raw/*548.58*/("""{"""),format.raw/*548.59*/("""
                    """),format.raw/*549.21*/("""$scope.bShowAUE = true;
                    $scope.nUserId = "";
                    $scope.nPassword = "";
                """),format.raw/*552.17*/("""}"""),format.raw/*552.18*/(""" """),format.raw/*552.19*/("""else """),format.raw/*552.24*/("""{"""),format.raw/*552.25*/("""
                    """),format.raw/*553.21*/("""$scope.bShowAUE = !$scope.bShowAUE;
                """),format.raw/*554.17*/("""}"""),format.raw/*554.18*/("""
            """),format.raw/*555.13*/("""}"""),format.raw/*555.14*/(""";


        """),format.raw/*558.9*/("""}"""),format.raw/*558.10*/(""");
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
                  DATE: Sat Oct 15 13:32:01 IST 2016
                  SOURCE: /home/si2chip/si2chip/app/views/admin.scala.html
                  HASH: 97036d93aa1aa70309e1c1b8d03892a678bdc441
                  MATRIX: 827->0|1130->277|1144->283|1212->331|1273->366|1287->372|1349->414|1410->449|1424->455|1486->497|2121->1105|2136->1111|2192->1146|2221->1147|3215->2113|3244->2114|3273->2115|3309->2123|3338->2124|3367->2125|3420->2150|8362->7062|8393->7063|8424->7064|8464->7074|8495->7075|8526->7076|10837->9357|10868->9358|10899->9359|10939->9369|10970->9370|11001->9371|13053->11394|13083->11395|13113->11396|13159->11413|13189->11414|13219->11415|14864->13031|14894->13032|14924->13033|14963->13043|14993->13044|15023->13045|15063->13056|15093->13057|15123->13058|15165->13070|15196->13071|15227->13072|15336->13152|15366->13153|15396->13154|15433->13162|15463->13163|15493->13164|15781->13423|15811->13424|15853->13437|15910->13465|15940->13466|16002->13499|16032->13500|16087->13527|16117->13528|16241->13623|16271->13624|16313->13637|16758->14053|16788->14054|16834->14071|16906->14114|16936->14115|17018->14168|17048->14169|17094->14186|17167->14230|17197->14231|17276->14281|17306->14282|17352->14299|17437->14356|17453->14362|17499->14386|17614->14472|17644->14473|17762->14562|17792->14563|17838->14580|18055->14769|18071->14775|18115->14797|18230->14883|18260->14884|18375->14970|18405->14971|18451->14988|18697->15205|18727->15206|18777->15227|18830->15251|18860->15252|18907->15270|19169->15503|19199->15504|19253->15529|19330->15578|19346->15584|19403->15619|19466->15653|19496->15654|19545->15674|19575->15675|19640->15711|19670->15712|19728->15741|19817->15801|19847->15802|19897->15823|19927->15824|19998->15866|20028->15867|20082->15892|20255->16036|20285->16037|20349->16072|20379->16073|20433->16098|20589->16225|20619->16226|20677->16255|20944->16493|20974->16494|21004->16495|21038->16500|21068->16501|21126->16530|21276->16651|21306->16652|21368->16685|21541->16829|21571->16830|21625->16855|21655->16856|21705->16877|21735->16878|21779->16893|21809->16894|21917->16973|21947->16974|21993->16991|22066->17035|22096->17036|22150->17061|22264->17146|22294->17147|22352->17176|22441->17236|22471->17237|22521->17258|22551->17259|22622->17301|22652->17302|22706->17327|22788->17380|22818->17381|22882->17416|22912->17417|22967->17443|23110->17557|23140->17558|23198->17587|23386->17746|23416->17747|23466->17768|23496->17769|23540->17784|23570->17785|23700->17886|23730->17887|23776->17904|23967->18066|23997->18067|24118->18159|24148->18160|24194->18177|24346->18300|24376->18301|24505->18401|24535->18402|24581->18419|24732->18541|24762->18542|24876->18627|24906->18628|24952->18645|25272->18936|25302->18937|25442->19048|25472->19049|25518->19066|25630->19149|25660->19150|25710->19171|25920->19352|25950->19353|25980->19354|26014->19359|26044->19360|26094->19381|26179->19437|26209->19438|26251->19451|26281->19452|26363->19505|26393->19506|26439->19523|26616->19672|26632->19678|26688->19712|26803->19798|26833->19799|26914->19851|26944->19852|26990->19869|27286->20136|27316->20137|27397->20189|27427->20190|27473->20207|27660->20365|27690->20366|27740->20387|27848->20466|27878->20467|27925->20485|28079->20610|28109->20611|28163->20636|28239->20684|28255->20690|28319->20732|28382->20766|28412->20767|28497->20823|28527->20824|28592->20860|28622->20861|28680->20890|28769->20950|28799->20951|28849->20972|28879->20973|28950->21015|28980->21016|29034->21041|29325->21303|29355->21304|29419->21339|29449->21340|29503->21365|29560->21393|29590->21394|29648->21423|29795->21541|29825->21542|29855->21543|29889->21548|29919->21549|29977->21578|30127->21699|30157->21700|30219->21733|30402->21887|30432->21888|30486->21913|30516->21914|30566->21935|30596->21936|30640->21951|30670->21952|30756->22009|30786->22010|30832->22027|30942->22108|30972->22109|31022->22130|31141->22220|31171->22221|31201->22222|31235->22227|31265->22228|31315->22249|31396->22301|31426->22302|31468->22315|31498->22316|31586->22375|31616->22376|31646->22377|31977->22679|32007->22680|32061->22705|32137->22753|32153->22759|32200->22784|32266->22821|32296->22822|32350->22847|32439->22907|32469->22908|32519->22929|32549->22930|32620->22972|32650->22973|32704->22998|32920->23185|32950->23186|33014->23221|33044->23222|33098->23247|33240->23360|33270->23361|33328->23390|33507->23540|33537->23541|33587->23562|33617->23563|33663->23580|33707->23595|33737->23596|33819->23649|33849->23650|33895->23667|34136->23879|34166->23880|34247->23932|34277->23933|34323->23950|34510->24108|34540->24109|34590->24130|34698->24209|34728->24210|34775->24228|34929->24353|34959->24354|35013->24379|35151->24488|35181->24489|35239->24518|35328->24578|35358->24579|35408->24600|35438->24601|35509->24643|35539->24644|35593->24669|35826->24873|35856->24874|35920->24909|35950->24910|36004->24935|36061->24963|36091->24964|36149->24993|36296->25111|36326->25112|36356->25113|36390->25118|36420->25119|36478->25148|36628->25269|36658->25270|36720->25303|36900->25454|36930->25455|36984->25480|37014->25481|37064->25502|37094->25503|37138->25518|37168->25519|37257->25579|37287->25580|37333->25597|37443->25678|37473->25679|37523->25700|37641->25789|37671->25790|37701->25791|37735->25796|37765->25797|37815->25818|37896->25870|37926->25871|37968->25884|37998->25885|38076->25934|38106->25935|38152->25952|38403->26173|38434->26174|38484->26195|38592->26274|38622->26275|38669->26293|38823->26418|38853->26419|38906->26443|38983->26492|38999->26498|39045->26522|39108->26556|39138->26557|39329->26718|39360->26719|39425->26755|39455->26756|39513->26785|39602->26845|39632->26846|39682->26867|39712->26868|39783->26910|39813->26911|39867->26936|40156->27196|40186->27197|40250->27232|40280->27233|40334->27258|40391->27286|40421->27287|40479->27316|40626->27434|40656->27435|40686->27436|40720->27441|40750->27442|40808->27471|40958->27592|40988->27593|41050->27626|41227->27774|41257->27775|41311->27800|41341->27801|41391->27822|41421->27823|41465->27838|41495->27839|41584->27899|41614->27900|41660->27917|41770->27998|41800->27999|41850->28020|42003->28144|42033->28145|42063->28146|42097->28151|42127->28152|42177->28173|42258->28225|42288->28226|42330->28239|42360->28240|42400->28252|42430->28253
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|51->20|51->20|51->20|51->20|72->41|72->41|72->41|72->41|72->41|72->41|73->42|142->111|142->111|142->111|142->111|142->111|142->111|171->140|171->140|171->140|171->140|171->140|171->140|202->171|202->171|202->171|202->171|202->171|202->171|226->195|226->195|226->195|226->195|226->195|226->195|226->195|226->195|226->195|226->195|226->195|226->195|228->197|228->197|228->197|228->197|228->197|228->197|236->205|236->205|237->206|237->206|237->206|237->206|237->206|238->207|238->207|240->209|240->209|241->210|253->222|253->222|254->223|255->224|255->224|257->226|257->226|258->227|259->228|259->228|261->230|261->230|262->231|263->232|263->232|263->232|265->234|265->234|268->237|268->237|269->238|273->242|273->242|273->242|275->244|275->244|278->247|278->247|279->248|284->253|284->253|285->254|286->255|286->255|288->257|293->262|293->262|294->263|295->264|295->264|295->264|296->265|296->265|296->265|296->265|297->266|297->266|298->267|299->268|299->268|300->269|300->269|300->269|300->269|301->270|304->273|304->273|304->273|304->273|305->274|306->275|306->275|307->276|309->278|309->278|309->278|309->278|309->278|310->279|312->281|312->281|313->282|315->284|315->284|316->285|316->285|317->286|317->286|318->287|318->287|321->290|321->290|322->291|323->292|323->292|324->293|326->295|326->295|327->296|328->297|328->297|329->298|329->298|329->298|329->298|330->299|331->300|331->300|331->300|331->300|332->301|334->303|334->303|335->304|337->306|337->306|338->307|338->307|339->308|339->308|342->311|342->311|343->312|346->315|346->315|349->318|349->318|350->319|352->321|352->321|355->324|355->324|356->325|358->327|358->327|361->330|361->330|362->331|368->337|368->337|371->340|371->340|372->341|373->342|373->342|374->343|378->347|378->347|378->347|378->347|378->347|379->348|380->349|380->349|381->350|381->350|383->352|383->352|384->353|387->356|387->356|387->356|389->358|389->358|391->360|391->360|392->361|398->367|398->367|400->369|400->369|401->370|404->373|404->373|405->374|407->376|407->376|409->378|412->381|412->381|413->382|414->383|414->383|414->383|415->384|415->384|415->384|415->384|416->385|416->385|417->386|418->387|418->387|419->388|419->388|419->388|419->388|420->389|425->394|425->394|425->394|425->394|426->395|426->395|426->395|427->396|429->398|429->398|429->398|429->398|429->398|430->399|432->401|432->401|433->402|435->404|435->404|436->405|436->405|437->406|437->406|438->407|438->407|440->409|440->409|441->410|442->411|442->411|443->412|445->414|445->414|445->414|445->414|445->414|446->415|447->416|447->416|448->417|448->417|450->419|450->419|450->419|459->428|459->428|460->429|461->430|461->430|461->430|462->431|462->431|463->432|464->433|464->433|465->434|465->434|465->434|465->434|466->435|470->439|470->439|470->439|470->439|471->440|473->442|473->442|474->443|476->445|476->445|477->446|477->446|478->447|479->448|479->448|481->450|481->450|482->451|487->456|487->456|489->458|489->458|490->459|493->462|493->462|494->463|496->465|496->465|498->467|501->470|501->470|502->471|504->473|504->473|505->474|506->475|506->475|507->476|507->476|507->476|507->476|508->477|512->481|512->481|512->481|512->481|513->482|513->482|513->482|514->483|516->485|516->485|516->485|516->485|516->485|517->486|519->488|519->488|520->489|522->491|522->491|523->492|523->492|524->493|524->493|525->494|525->494|527->496|527->496|528->497|529->498|529->498|530->499|532->501|532->501|532->501|532->501|532->501|533->502|534->503|534->503|535->504|535->504|537->506|537->506|538->507|541->510|541->510|542->511|544->513|544->513|546->515|549->518|549->518|550->519|551->520|551->520|551->520|552->521|552->521|552->521|552->521|553->522|553->522|554->523|555->524|555->524|556->525|556->525|556->525|556->525|557->526|562->531|562->531|562->531|562->531|563->532|563->532|563->532|564->533|566->535|566->535|566->535|566->535|566->535|567->536|569->538|569->538|570->539|572->541|572->541|573->542|573->542|574->543|574->543|575->544|575->544|577->546|577->546|578->547|579->548|579->548|580->549|583->552|583->552|583->552|583->552|583->552|584->553|585->554|585->554|586->555|586->555|589->558|589->558
                  -- GENERATED --
              */
          