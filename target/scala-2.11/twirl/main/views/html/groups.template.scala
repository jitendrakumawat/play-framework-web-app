
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object groups_Scope0 {
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

class groups extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="""),_display_(/*8.34*/routes/*8.40*/.Assets.versioned("stylesheets/common/view.css")),format.raw/*8.88*/(""">
    <link rel="stylesheet" href="""),_display_(/*9.34*/routes/*9.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.81*/(""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>
    <title>sI2chip Groups</title>
</head>
<body ng-app="groups" ng-controller="groupsCtrl">
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <img src="""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("images/l46.png")),format.raw/*20.64*/(""" """),format.raw/*20.65*/("""class="logo">
        </div>
        <ul class="nav navbar-nav navbar-right">
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
                            <button type="button" class="close" data-dismdiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            """),format.raw/*39.29*/("""{"""),format.raw/*39.30*/("""{"""),format.raw/*39.31*/("""conerror"""),format.raw/*39.39*/("""}"""),format.raw/*39.40*/("""}"""),format.raw/*39.41*/("""
                        """),format.raw/*40.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 col-md-offset-6">
            <div class="text-right">
                <span class="who">"""),format.raw/*49.35*/("""{"""),format.raw/*49.36*/("""{"""),format.raw/*49.37*/("""loggedInUser()"""),format.raw/*49.51*/("""}"""),format.raw/*49.52*/("""}"""),format.raw/*49.53*/("""</span>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-3">
           
        </div>
        <div class="col-md-6">
         <div class="well well-lg">
                <table class="table">
                    <thead>
                    <tr>
                        <th>
                            <div class="text-center">
                                <h4 id="groupmdgmttitle">Manage Groups</h4>
                            </div>
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            <div class="text-center """),format.raw/*72.53*/("""{"""),format.raw/*72.54*/("""{"""),format.raw/*72.55*/("""setActive(1)"""),format.raw/*72.67*/("""}"""),format.raw/*72.68*/("""}"""),format.raw/*72.69*/("""">
                                <a href="#"  ng-click="toggleAddGroupEditor($event)"> Add group </a>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="text-center """),format.raw/*79.53*/("""{"""),format.raw/*79.54*/("""{"""),format.raw/*79.55*/("""setActive(2)"""),format.raw/*79.67*/("""}"""),format.raw/*79.68*/("""}"""),format.raw/*79.69*/("""">
                                <a href="#" ng-click="toggleGroupEditor($event)"> Modify group </a>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="text-center """),format.raw/*86.53*/("""{"""),format.raw/*86.54*/("""{"""),format.raw/*86.55*/("""setActive(3)"""),format.raw/*86.67*/("""}"""),format.raw/*86.68*/("""}"""),format.raw/*86.69*/("""">
                                <a href="#" ng-click="toggleDelGroupEditor($event)"> Delete group </a>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
            <div class="well well-lg" ng-show="!angular.isUndefined(nEditor) && nEditor == 1">
                <form role="form" name="agf">
                    <div class="form-group">
                        <input type="text" class="form-control" maxlength="255" ng-model="nGroupId" placeholder="Enter group id here" required name="groupId">
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-default btn-md" ng-click="addGroup($event)">Add Group</button>
                    </div>
                </form>
                <span ng-show="agf.groupId.$touched && agf.groupId.$error.required" class="editmsgs">Group id required</span><br>
                <span ng-if="!agf.groupId.$dirty" ng-bind="adderror" class="error"></span>
                <span ng-if="!agf.groupId.$touched && addSuccess" class="success">Group added successfully</span>
            </div>
            <div class="well well-lg" ng-show="!angular.isUndefined(nEditor) && nEditor == 2">
                <form role="form" name="mgf">
                    <div class="form-group">
                        <a href="#" ng-click="refreshMGroups($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-refresh"></span> Refresh group list
                        </a>
                    </div>
                    <div class="form-group">
                        <select class="form-control" name="groupId"  ng-change="resetModifyGroupUsersEditor()" ng-model="mGroupId" required>
                            <option value="">Select group</option>
                            <option ng-repeat="grp in allMUserGroups track by grp.groupId">"""),format.raw/*117.92*/("""{"""),format.raw/*117.93*/("""{"""),format.raw/*117.94*/("""grp.groupId"""),format.raw/*117.105*/("""}"""),format.raw/*117.106*/("""}"""),format.raw/*117.107*/("""</option>
                        </select>
                    </div>
                </form>
                <div class="well well-lg" ng-show="!mgf.groupId.$error.required">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>
                                <div class="text-center">
                                    <h5 id="groupusersmgmttitle">Manage users</h5>
                                </div>
                            </th>
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
                                            <a href="#" ng-click="refreshMAUsers($event)" class="btn btn-info btn-xs">
                                                <span class="glyphicon glyphicon-refresh"></span> Refresh user list
                                            </a>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control" name="userId" ng-model="nUserId" required>
                                                <option value="">Select User</option>
                                                <option ng-repeat="usr in allMAUsers track by usr.userId">"""),format.raw/*149.107*/("""{"""),format.raw/*149.108*/("""{"""),format.raw/*149.109*/("""usr.userId"""),format.raw/*149.119*/("""}"""),format.raw/*149.120*/("""}"""),format.raw/*149.121*/("""</option>
                                            </select>
                                        </div>
                                        <div class="text-center">
                                            <button type="submit" class="btn btn-default btn-md" ng-click="addUser($event)">Add</button>
                                        </div>
                                    </form>
                                    <span ng-show="auf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                                    <span ng-show="allMAUsers.length != 0 && auf.userId.$touched && auf.userId.$error.required" class="editmsgs">UserId required. Select an email id</span><br>
                                    <span ng-if="!auf.userId.$dirty" ng-bind="addusererror" class="error"></span>
                                    <span ng-if="!auf.userId.$touched && addUserSuccess" class="success">User added successfully</span>
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
                                            <a href="#" ng-click="refreshMDUsers($event)" class="btn btn-info btn-xs">
                                                <span class="glyphicon glyphicon-refresh"></span> Refresh group user list
                                            </a>
                                        </div>
                                        <div class="form-group">
                                            <select class="form-control" name="userId" ng-model="dUserId" required>
                                                <option value="">Select User</option>
                                                <option ng-repeat="usr in allMDUsers track by usr.userId">"""),format.raw/*179.107*/("""{"""),format.raw/*179.108*/("""{"""),format.raw/*179.109*/("""usr.userId"""),format.raw/*179.119*/("""}"""),format.raw/*179.120*/("""}"""),format.raw/*179.121*/("""</option>
                                            </select>
                                        </div>
                                        <div class="text-center">
                                            <button type="submit" class="btn btn-default btn-md" ng-click="deleteUser($event)">Delete</button>
                                        </div>
                                    </form>
                                    <span ng-show="allMDUsers.length != 0 && duf.userId.$touched && duf.userId.$error.required" class="editmsgs">UserId required. Select an email id</span><br>
                                    <span ng-if="!duf.userId.$dirty" ng-bind="delusererror" class="error"></span>
                                    <span ng-if="!duf.userId.$touched && delUserSuccess" class="success">User deleted successfully</span>
                                </div>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
             </div>
            <div class="well well-lg" ng-show="!angular.isUndefined(nEditor) && nEditor == 3">
                <form role="form" name="dgf">
                    <div class="form-group">
                        <a href="#" ng-click="refreshDGroups($event)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-refresh"></span> Refresh group list
                        </a>
                    </div>
                    <div class="form-group">
                        <select class="form-control" name="groupId" ng-model="dGroupId" required>
                            <option value="">Select group</option>
                            <option ng-repeat="grp in allDUserGroups track by grp.groupId">"""),format.raw/*206.92*/("""{"""),format.raw/*206.93*/("""{"""),format.raw/*206.94*/("""grp.groupId"""),format.raw/*206.105*/("""}"""),format.raw/*206.106*/("""}"""),format.raw/*206.107*/("""</option>
                        </select>
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-default btn-md" ng-click="deleteGroup($event)">Delete Group</button>
                    </div>
                </form>
                <span ng-show="allDUserGroups.length != 0 && dgf.groupId.$touched && dgf.groupId.$error.required" class="editmsgs">GroupId required. Select a group id</span><br>
                <span ng-if="!dgf.groupId.$dirty" ng-bind="delerror" class="error"></span>
                <span ng-if="!dgf.groupId.$touched && delSuccess" class="success">Group deleted successfully</span>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
        var app = angular.module('groups',  ["ngCookies"]);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*222.80*/("""{"""),format.raw/*222.81*/("""
            """),format.raw/*223.13*/("""$locationProvider.html5Mode("""),format.raw/*223.41*/("""{"""),format.raw/*223.42*/("""enabled: true, requireBase: false"""),format.raw/*223.75*/("""}"""),format.raw/*223.76*/(""").hashPrefix('*');
        """),format.raw/*224.9*/("""}"""),format.raw/*224.10*/("""]);

        app.service("GroupSvc", function ($http, $q) """),format.raw/*226.54*/("""{"""),format.raw/*226.55*/("""
            """),format.raw/*227.13*/("""var deferred;
            this.getGroups = function () """),format.raw/*228.42*/("""{"""),format.raw/*228.43*/("""
                """),format.raw/*229.17*/("""deferred = $q.defer();
                return $http("""),format.raw/*230.30*/("""{"""),format.raw/*230.31*/("""
                        """),format.raw/*231.25*/("""method : "GET",
                        url : """"),_display_(/*232.33*/routes/*232.39*/.GroupController.getOwnedGroups),format.raw/*232.70*/("""",
                        headers : """),format.raw/*233.35*/("""{"""),format.raw/*233.36*/("""
                        """),format.raw/*234.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*235.25*/("""}"""),format.raw/*235.26*/("""
                    """),format.raw/*236.21*/("""}"""),format.raw/*236.22*/(""")
                    .then(function (response) """),format.raw/*237.47*/("""{"""),format.raw/*237.48*/("""
                        """),format.raw/*238.25*/("""deferred.resolve(response);
                        return deferred.promise;
                    """),format.raw/*240.21*/("""}"""),format.raw/*240.22*/(""", function (response) """),format.raw/*240.44*/("""{"""),format.raw/*240.45*/("""
                        """),format.raw/*241.25*/("""deferred.reject(response);
                        return deferred.promise;
                    """),format.raw/*243.21*/("""}"""),format.raw/*243.22*/(""");
            """),format.raw/*244.13*/("""}"""),format.raw/*244.14*/(""";
        """),format.raw/*245.9*/("""}"""),format.raw/*245.10*/(""");

        app.controller('groupsCtrl', function($scope, $http, $location, $window, $cookies, GroupSvc) """),format.raw/*247.102*/("""{"""),format.raw/*247.103*/("""
            """),format.raw/*248.13*/("""// initialize the view
            $scope.adderror="";
            $scope.delerror="";
            $scope.conerror = "";
            $scope.addSuccess = false;
            $scope.delSuccess = false;
            $scope.allDUserGroups = [];
            $scope.allMUserGroups = [];
            $scope.nEditor = 0; // no editor

            $scope.loggedInUser = function() """),format.raw/*258.46*/("""{"""),format.raw/*258.47*/("""
                """),format.raw/*259.17*/("""return $cookies.get("userId");
            """),format.raw/*260.13*/("""}"""),format.raw/*260.14*/(""";

            $scope.loggedInUserGroup = function() """),format.raw/*262.51*/("""{"""),format.raw/*262.52*/("""
                """),format.raw/*263.17*/("""return $cookies.get("groupId");
            """),format.raw/*264.13*/("""}"""),format.raw/*264.14*/(""";

            // shows the forbidden page
            $scope.showForbiddenPage = function() """),format.raw/*267.51*/("""{"""),format.raw/*267.52*/("""
                """),format.raw/*268.17*/("""$cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*271.34*/routes/*271.40*/.HomeController.showForbiddenPage),format.raw/*271.73*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*273.13*/("""}"""),format.raw/*273.14*/(""";

            // goto posts page
            $scope.showPosts = function(event) """),format.raw/*276.48*/("""{"""),format.raw/*276.49*/("""
                """),format.raw/*277.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*278.34*/routes/*278.40*/.PostController.getPosts),format.raw/*278.64*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*280.13*/("""}"""),format.raw/*280.14*/(""";

            // logout and goto home page
            $scope.signOut = function(event) """),format.raw/*283.46*/("""{"""),format.raw/*283.47*/("""
                """),format.raw/*284.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*288.34*/routes/*288.40*/.HomeController.logout),format.raw/*288.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*290.13*/("""}"""),format.raw/*290.14*/(""";

            // highlight the selected group action
            $scope.setActive = function(nE) """),format.raw/*293.45*/("""{"""),format.raw/*293.46*/("""
                """),format.raw/*294.17*/("""if (nE == $scope.nEditor)
                    return "selectedaction"; // css class to highlight the selected action
                else
                    return "";
            """),format.raw/*298.13*/("""}"""),format.raw/*298.14*/(""";


            // adds a group
            $scope.addGroup  = function(event) """),format.raw/*302.48*/("""{"""),format.raw/*302.49*/("""
                """),format.raw/*303.17*/("""event.preventDefault();

                // validate the add group form
                if ($scope.agf.groupId.$error.required || !$scope.agf.groupId.$dirty) """),format.raw/*306.87*/("""{"""),format.raw/*306.88*/("""
                    """),format.raw/*307.21*/("""$scope.agf.groupId.$touched = true;
                    return;
                """),format.raw/*309.17*/("""}"""),format.raw/*309.18*/("""

                """),format.raw/*311.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                $http("""),format.raw/*314.23*/("""{"""),format.raw/*314.24*/("""
                        """),format.raw/*315.25*/("""method : "POST",
                        url : """"),_display_(/*316.33*/routes/*316.39*/.GroupController.addGroup),format.raw/*316.64*/("""",
                        data : """),format.raw/*317.32*/("""{"""),format.raw/*317.33*/(""""groupId" : $scope.nGroupId"""),format.raw/*317.60*/("""}"""),format.raw/*317.61*/(""",
                        headers : """),format.raw/*318.35*/("""{"""),format.raw/*318.36*/("""
                            """),format.raw/*319.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*320.25*/("""}"""),format.raw/*320.26*/("""
                    """),format.raw/*321.21*/("""}"""),format.raw/*321.22*/(""").then(function successCallback(response) """),format.raw/*321.64*/("""{"""),format.raw/*321.65*/("""
                        """),format.raw/*322.25*/("""$scope.nGroupId = "";
                        $scope.agf.groupId.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*325.21*/("""}"""),format.raw/*325.22*/(""", function errorCallback(response) """),format.raw/*325.57*/("""{"""),format.raw/*325.58*/("""
                        """),format.raw/*326.25*/("""if (response.status == 400) """),format.raw/*326.53*/("""{"""),format.raw/*326.54*/("""
                            """),format.raw/*327.29*/("""$scope.adderror = response.data.error;
                            $scope.agf.$setPristine();
                        """),format.raw/*329.25*/("""}"""),format.raw/*329.26*/(""" """),format.raw/*329.27*/("""else """),format.raw/*329.32*/("""{"""),format.raw/*329.33*/("""
                            """),format.raw/*330.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*332.34*/("""{"""),format.raw/*332.35*/("""
                                """),format.raw/*333.33*/("""$scope.conerror = "Error trying to add the group. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*335.29*/("""}"""),format.raw/*335.30*/("""
                        """),format.raw/*336.25*/("""}"""),format.raw/*336.26*/("""
                    """),format.raw/*337.21*/("""}"""),format.raw/*337.22*/(""");
            """),format.raw/*338.13*/("""}"""),format.raw/*338.14*/(""";

            // toggles the add group editor
            $scope.toggleAddGroupEditor = function(event) """),format.raw/*341.59*/("""{"""),format.raw/*341.60*/("""
                """),format.raw/*342.17*/("""event.preventDefault();
                if($scope.nEditor != 1)
                    $scope.nEditor = 1;
                else
                    $scope.nEditor = 0;
            """),format.raw/*347.13*/("""}"""),format.raw/*347.14*/(""";

            // refreshes the groups to delete
            $scope.refreshDGroups = function(event)"""),format.raw/*350.52*/("""{"""),format.raw/*350.53*/("""
                """),format.raw/*351.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadAllUserGroups(2);
                $scope.dGroupId = "";
                $scope.delerror = "";
                $scope.dgf.groupId.$touched = false;
                $scope.delSuccess = false;
            """),format.raw/*358.13*/("""}"""),format.raw/*358.14*/(""";

             // toggles the delete group editor
            $scope.toggleDelGroupEditor = function(event) """),format.raw/*361.59*/("""{"""),format.raw/*361.60*/("""
                """),format.raw/*362.17*/("""event.preventDefault();
                if($scope.nEditor != 3) """),format.raw/*363.41*/("""{"""),format.raw/*363.42*/("""
                    """),format.raw/*364.21*/("""$scope.nEditor = 3;
                    if (angular.isUndefined($scope.dGroupId))"""),format.raw/*365.62*/("""{"""),format.raw/*365.63*/("""
                        """),format.raw/*366.25*/("""$scope.dGroupId = "";
                        $scope.loadAllUserGroups(2);
                    """),format.raw/*368.21*/("""}"""),format.raw/*368.22*/("""
                """),format.raw/*369.17*/("""}"""),format.raw/*369.18*/("""
                """),format.raw/*370.17*/("""else
                    $scope.nEditor = 0;
            """),format.raw/*372.13*/("""}"""),format.raw/*372.14*/(""";

            // deletes a group
            $scope.deleteGroup  = function(event) """),format.raw/*375.51*/("""{"""),format.raw/*375.52*/("""
                """),format.raw/*376.17*/("""event.preventDefault();

                // validate the delete group form
                if ($scope.dgf.groupId.$error.required || !$scope.dgf.groupId.$dirty) """),format.raw/*379.87*/("""{"""),format.raw/*379.88*/("""
                    """),format.raw/*380.21*/("""$scope.dgf.groupId.$touched = true;
                    return;
                """),format.raw/*382.17*/("""}"""),format.raw/*382.18*/("""

                """),format.raw/*384.17*/("""$scope.conerror = "";
                $scope.delerror = "";
                $scope.delSuccess = false;
                $http("""),format.raw/*387.23*/("""{"""),format.raw/*387.24*/("""
                        """),format.raw/*388.25*/("""method : "DELETE",
                        url : "/group/" + $scope.dGroupId,
                        headers : """),format.raw/*390.35*/("""{"""),format.raw/*390.36*/("""
                            """),format.raw/*391.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*392.25*/("""}"""),format.raw/*392.26*/("""
                    """),format.raw/*393.21*/("""}"""),format.raw/*393.22*/(""").then(function successCallback(response) """),format.raw/*393.64*/("""{"""),format.raw/*393.65*/("""
                        """),format.raw/*394.25*/("""$scope.dGroupId = "";
                        $scope.dgf.groupId.$touched = false;
                        $scope.delSuccess = true;
                        $scope.loadAllUserGroups(2);
                    """),format.raw/*398.21*/("""}"""),format.raw/*398.22*/(""", function errorCallback(response) """),format.raw/*398.57*/("""{"""),format.raw/*398.58*/("""
                        """),format.raw/*399.25*/("""if (response.status == 400) """),format.raw/*399.53*/("""{"""),format.raw/*399.54*/("""
                            """),format.raw/*400.29*/("""$scope.delerror = response.data.error;
                            $scope.dgf.$setPristine();
                        """),format.raw/*402.25*/("""}"""),format.raw/*402.26*/(""" """),format.raw/*402.27*/("""else """),format.raw/*402.32*/("""{"""),format.raw/*402.33*/("""
                            """),format.raw/*403.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*405.34*/("""{"""),format.raw/*405.35*/("""
                                """),format.raw/*406.33*/("""$scope.conerror = "Error trying to delete the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*408.29*/("""}"""),format.raw/*408.30*/("""
                        """),format.raw/*409.25*/("""}"""),format.raw/*409.26*/("""
                    """),format.raw/*410.21*/("""}"""),format.raw/*410.22*/(""");
            """),format.raw/*411.13*/("""}"""),format.raw/*411.14*/(""";

            // loads all the groups which is created by this user
            $scope.loadAllUserGroups = function(dorm) """),format.raw/*414.55*/("""{"""),format.raw/*414.56*/("""
                """),format.raw/*415.17*/("""$scope.conerror = "";
                if (dorm == 1)
                    $scope.allMUserGroups = [];
                else
                    $scope.allDUserGroups = [];

                GroupSvc.getGroups().then(function successCallback(response) """),format.raw/*421.78*/("""{"""),format.raw/*421.79*/("""
                        """),format.raw/*422.25*/("""if (dorm == 1)
                            $scope.allMUserGroups = response.data;
                        else
                            $scope.allDUserGroups = response.data;
                    """),format.raw/*426.21*/("""}"""),format.raw/*426.22*/(""", function errorCallback(response) """),format.raw/*426.57*/("""{"""),format.raw/*426.58*/("""
                        """),format.raw/*427.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*429.30*/("""{"""),format.raw/*429.31*/("""
                            """),format.raw/*430.29*/("""$scope.conerror = "Error refreshing the list of owned groups. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*432.25*/("""}"""),format.raw/*432.26*/("""
                    """),format.raw/*433.21*/("""}"""),format.raw/*433.22*/("""
                """),format.raw/*434.17*/(""");
            """),format.raw/*435.13*/("""}"""),format.raw/*435.14*/(""";

            // adds the user to the modified group
            $scope.addUser  = function(event) """),format.raw/*438.47*/("""{"""),format.raw/*438.48*/("""
                """),format.raw/*439.17*/("""event.preventDefault();

                // validate the add user form
                if ($scope.auf.userId.$error.required || $scope.auf.userId.$error.email || !$scope.auf.userId.$dirty) """),format.raw/*442.119*/("""{"""),format.raw/*442.120*/("""
                    """),format.raw/*443.21*/("""$scope.auf.userId.$touched = true;
                    return;
                """),format.raw/*445.17*/("""}"""),format.raw/*445.18*/("""

                """),format.raw/*447.17*/("""$scope.conerror = "";
                $scope.addusererror = "";
                $scope.addUserSuccess = false;
                $http("""),format.raw/*450.23*/("""{"""),format.raw/*450.24*/("""
                        """),format.raw/*451.25*/("""method : "POST",
                        url : """"),_display_(/*452.33*/routes/*452.39*/.GroupController.addUserToGroup),format.raw/*452.70*/("""",
                        data : """),format.raw/*453.32*/("""{"""),format.raw/*453.33*/(""""userId" : $scope.nUserId, "groupId" : $scope.mGroupId"""),format.raw/*453.87*/("""}"""),format.raw/*453.88*/(""",
                        headers : """),format.raw/*454.35*/("""{"""),format.raw/*454.36*/("""
                            """),format.raw/*455.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*456.25*/("""}"""),format.raw/*456.26*/("""
                    """),format.raw/*457.21*/("""}"""),format.raw/*457.22*/(""").then(function successCallback(response) """),format.raw/*457.64*/("""{"""),format.raw/*457.65*/("""
                        """),format.raw/*458.25*/("""$scope.nUserId = "";
                        $scope.auf.userId.$touched = false;
                        $scope.addUserSuccess = true;
                    """),format.raw/*461.21*/("""}"""),format.raw/*461.22*/(""", function errorCallback(response) """),format.raw/*461.57*/("""{"""),format.raw/*461.58*/("""
                        """),format.raw/*462.25*/("""if (response.status == 400) """),format.raw/*462.53*/("""{"""),format.raw/*462.54*/("""
                            """),format.raw/*463.29*/("""$scope.addusererror = response.data.error;
                            $scope.auf.$setPristine();
                        """),format.raw/*465.25*/("""}"""),format.raw/*465.26*/(""" """),format.raw/*465.27*/("""else """),format.raw/*465.32*/("""{"""),format.raw/*465.33*/("""
                            """),format.raw/*466.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*468.34*/("""{"""),format.raw/*468.35*/("""
                                """),format.raw/*469.33*/("""$scope.conerror = "Error trying to add the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*471.29*/("""}"""),format.raw/*471.30*/("""
                        """),format.raw/*472.25*/("""}"""),format.raw/*472.26*/("""
                    """),format.raw/*473.21*/("""}"""),format.raw/*473.22*/(""");
            """),format.raw/*474.13*/("""}"""),format.raw/*474.14*/(""";

            $scope.loadAllUsers = function() """),format.raw/*476.46*/("""{"""),format.raw/*476.47*/("""
                """),format.raw/*477.17*/("""$scope.conerror = "";
                $scope.allMAUsers = [];
                $http("""),format.raw/*479.23*/("""{"""),format.raw/*479.24*/("""
                        """),format.raw/*480.25*/("""method : "GET",
                        url : """"),_display_(/*481.33*/routes/*481.39*/.GroupController.getUsers),format.raw/*481.64*/("""",
                        headers : """),format.raw/*482.35*/("""{"""),format.raw/*482.36*/("""
                        """),format.raw/*483.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*484.25*/("""}"""),format.raw/*484.26*/("""
                    """),format.raw/*485.21*/("""}"""),format.raw/*485.22*/(""").then(function successCallback(response) """),format.raw/*485.64*/("""{"""),format.raw/*485.65*/("""
                            """),format.raw/*486.29*/("""$scope.allMAUsers = response.data;
                    """),format.raw/*487.21*/("""}"""),format.raw/*487.22*/(""", function errorCallback(response) """),format.raw/*487.57*/("""{"""),format.raw/*487.58*/("""
                        """),format.raw/*488.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*490.30*/("""{"""),format.raw/*490.31*/("""
                            """),format.raw/*491.29*/("""$scope.conerror = "Error refreshing the list of all users. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*493.25*/("""}"""),format.raw/*493.26*/("""
                    """),format.raw/*494.21*/("""}"""),format.raw/*494.22*/("""
                """),format.raw/*495.17*/(""");
            """),format.raw/*496.13*/("""}"""),format.raw/*496.14*/(""";

            $scope.refreshMAUsers = function(event) """),format.raw/*498.53*/("""{"""),format.raw/*498.54*/("""
                """),format.raw/*499.17*/("""if (event != null)
                    event.preventDefault();
                if (!angular.isUndefined($scope.mGroupId) && $scope.mGroupId != "")
                    $scope.loadAllUsers();
                else
                    $scope.allMAUsers = [];
                $scope.nUserId = "";
                $scope.addusererror = "";
                $scope.auf.userId.$touched = false;
                $scope.addUserSuccess = false;
            """),format.raw/*509.13*/("""}"""),format.raw/*509.14*/(""";

            $scope.toggleAddUserEditor = function(event) """),format.raw/*511.58*/("""{"""),format.raw/*511.59*/("""
                """),format.raw/*512.17*/("""event.preventDefault();
                $scope.bShowAUE = !$scope.bShowAUE;
            """),format.raw/*514.13*/("""}"""),format.raw/*514.14*/(""";

            $scope.hideAddUserEditor = function() """),format.raw/*516.51*/("""{"""),format.raw/*516.52*/("""
                """),format.raw/*517.17*/("""$scope.bShowAUE = false;
                $scope.refreshMAUsers();
            """),format.raw/*519.13*/("""}"""),format.raw/*519.14*/(""";

            $scope.deleteUser  = function(event) """),format.raw/*521.50*/("""{"""),format.raw/*521.51*/("""
                """),format.raw/*522.17*/("""event.preventDefault();

                // validate the delete user form
                if ($scope.duf.userId.$error.required || !$scope.duf.userId.$dirty) """),format.raw/*525.85*/("""{"""),format.raw/*525.86*/("""
                    """),format.raw/*526.21*/("""$scope.duf.userId.$touched = true;
                    return;
                """),format.raw/*528.17*/("""}"""),format.raw/*528.18*/("""

                """),format.raw/*530.17*/("""$scope.conerror = "";
                $scope.delusererror = "";
                $scope.delUserSuccess = false;
                $http("""),format.raw/*533.23*/("""{"""),format.raw/*533.24*/("""
                        """),format.raw/*534.25*/("""method : "DELETE",
                        url : "groupuser/" + $scope.mGroupId + "/" + $scope.dUserId,
                        headers : """),format.raw/*536.35*/("""{"""),format.raw/*536.36*/("""
                            """),format.raw/*537.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*538.25*/("""}"""),format.raw/*538.26*/("""
                    """),format.raw/*539.21*/("""}"""),format.raw/*539.22*/(""").then(function successCallback(response) """),format.raw/*539.64*/("""{"""),format.raw/*539.65*/("""
                        """),format.raw/*540.25*/("""$scope.dUserId = "";
                        $scope.duf.userId.$touched = false;
                        $scope.delUserSuccess = true;
                        $scope.loadAllGroupUsers();
                    """),format.raw/*544.21*/("""}"""),format.raw/*544.22*/(""", function errorCallback(response) """),format.raw/*544.57*/("""{"""),format.raw/*544.58*/("""
                        """),format.raw/*545.25*/("""if (response.status == 400) """),format.raw/*545.53*/("""{"""),format.raw/*545.54*/("""
                            """),format.raw/*546.29*/("""$scope.delusererror = response.data.error;
                            $scope.duf.$setPristine();
                        """),format.raw/*548.25*/("""}"""),format.raw/*548.26*/(""" """),format.raw/*548.27*/("""else """),format.raw/*548.32*/("""{"""),format.raw/*548.33*/("""
                            """),format.raw/*549.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*551.34*/("""{"""),format.raw/*551.35*/("""
                                """),format.raw/*552.33*/("""$scope.conerror = "Error trying to delete the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*554.29*/("""}"""),format.raw/*554.30*/("""
                        """),format.raw/*555.25*/("""}"""),format.raw/*555.26*/("""
                    """),format.raw/*556.21*/("""}"""),format.raw/*556.22*/(""");
            """),format.raw/*557.13*/("""}"""),format.raw/*557.14*/(""";

            $scope.loadAllGroupUsers = function() """),format.raw/*559.51*/("""{"""),format.raw/*559.52*/("""
                """),format.raw/*560.17*/("""$scope.conerror = "";
                $scope.allMDUsers = [];
                $http("""),format.raw/*562.23*/("""{"""),format.raw/*562.24*/("""
                        """),format.raw/*563.25*/("""method : "GET",
                        url : "/groupusers" + "/" + $scope.mGroupId,
                        headers : """),format.raw/*565.35*/("""{"""),format.raw/*565.36*/("""
                        """),format.raw/*566.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*567.25*/("""}"""),format.raw/*567.26*/("""
                    """),format.raw/*568.21*/("""}"""),format.raw/*568.22*/(""").then(function successCallback(response) """),format.raw/*568.64*/("""{"""),format.raw/*568.65*/("""
                            """),format.raw/*569.29*/("""$scope.allMDUsers = response.data;
                    """),format.raw/*570.21*/("""}"""),format.raw/*570.22*/(""", function errorCallback(response) """),format.raw/*570.57*/("""{"""),format.raw/*570.58*/("""
                        """),format.raw/*571.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*573.30*/("""{"""),format.raw/*573.31*/("""
                            """),format.raw/*574.29*/("""if (response.status == 400)
                                $scope.conerror = response.data.error;
                            else
                                $scope.conerror = "Error refreshing the list of all group users. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*579.25*/("""}"""),format.raw/*579.26*/("""
                    """),format.raw/*580.21*/("""}"""),format.raw/*580.22*/("""
                """),format.raw/*581.17*/(""");
            """),format.raw/*582.13*/("""}"""),format.raw/*582.14*/(""";

            $scope.refreshMDUsers = function(event) """),format.raw/*584.53*/("""{"""),format.raw/*584.54*/("""
                """),format.raw/*585.17*/("""if (event != null)
                    event.preventDefault();
                if (!angular.isUndefined($scope.mGroupId) && $scope.mGroupId != "")
                    $scope.loadAllGroupUsers();
                else
                    $scope.allMDUsers = [];
                $scope.dUserId = "";
                $scope.delusererror = "";
                $scope.duf.userId.$touched = false;
                $scope.delUserSuccess = false;
            """),format.raw/*595.13*/("""}"""),format.raw/*595.14*/(""";

            $scope.toggleDelUserEditor = function(event) """),format.raw/*597.58*/("""{"""),format.raw/*597.59*/("""
                """),format.raw/*598.17*/("""event.preventDefault();
                $scope.bShowDUE = !$scope.bShowDUE;
            """),format.raw/*600.13*/("""}"""),format.raw/*600.14*/(""";

            $scope.hideDelUserEditor = function() """),format.raw/*602.51*/("""{"""),format.raw/*602.52*/("""
                """),format.raw/*603.17*/("""$scope.bShowDUE = false;
                $scope.refreshMDUsers(null);
            """),format.raw/*605.13*/("""}"""),format.raw/*605.14*/(""";

            // resets the group user modification editor
            $scope.resetModifyGroupUsersEditor = function() """),format.raw/*608.61*/("""{"""),format.raw/*608.62*/("""
                """),format.raw/*609.17*/("""$scope.hideAddUserEditor();
                $scope.hideDelUserEditor();
            """),format.raw/*611.13*/("""}"""),format.raw/*611.14*/(""";

            // refreshes the groups to modify
            $scope.refreshMGroups = function(event)"""),format.raw/*614.52*/("""{"""),format.raw/*614.53*/("""
                """),format.raw/*615.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadAllUserGroups(1);
                $scope.mGroupId = "";
                $scope.mgf.groupId.$touched = false;
            """),format.raw/*620.13*/("""}"""),format.raw/*620.14*/(""";

            // toggles the delete group editor
            $scope.toggleGroupEditor = function(event) """),format.raw/*623.56*/("""{"""),format.raw/*623.57*/("""
                """),format.raw/*624.17*/("""event.preventDefault();
                if($scope.nEditor != 2) """),format.raw/*625.41*/("""{"""),format.raw/*625.42*/("""
                    """),format.raw/*626.21*/("""$scope.nEditor = 2;
                    if(angular.isUndefined($scope.mGroupId)) """),format.raw/*627.62*/("""{"""),format.raw/*627.63*/("""
                        """),format.raw/*628.25*/("""$scope.mGroupId = "";
                        $scope.loadAllUserGroups(1);
                  """),format.raw/*630.19*/("""}"""),format.raw/*630.20*/("""
                """),format.raw/*631.17*/("""}"""),format.raw/*631.18*/("""
                """),format.raw/*632.17*/("""else
                    $scope.nEditor = 0;
            """),format.raw/*634.13*/("""}"""),format.raw/*634.14*/(""";

        """),format.raw/*636.9*/("""}"""),format.raw/*636.10*/(""");
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
object groups extends groups_Scope0.groups
              /*
                  -- GENERATED --
                  DATE: Tue Sep 27 11:19:17 IST 2016
                  SOURCE: /home/si2chip/temp/si2chip2/si2chip/app/views/groups.scala.html
                  HASH: e5eab6b15e8146ac625f019aa56db78ec1a60e1d
                  MATRIX: 829->1|1132->278|1146->284|1214->332|1275->367|1289->373|1350->414|1988->1025|2003->1031|2059->1066|2088->1067|3022->1973|3051->1974|3080->1975|3116->1983|3145->1984|3174->1985|3227->2010|3497->2252|3526->2253|3555->2254|3597->2268|3626->2269|3655->2270|4387->2974|4416->2975|4445->2976|4485->2988|4514->2989|4543->2990|4872->3291|4901->3292|4930->3293|4970->3305|4999->3306|5028->3307|5356->3607|5385->3608|5414->3609|5454->3621|5483->3622|5512->3623|7540->5622|7570->5623|7600->5624|7641->5635|7672->5636|7703->5637|9803->7707|9834->7708|9865->7709|9905->7719|9936->7720|9967->7721|12535->10259|12566->10260|12597->10261|12637->10271|12668->10272|12699->10273|14530->12075|14560->12076|14590->12077|14631->12088|14662->12089|14693->12090|15628->12996|15658->12997|15700->13010|15757->13038|15787->13039|15849->13072|15879->13073|15934->13100|15964->13101|16051->13159|16081->13160|16123->13173|16207->13228|16237->13229|16283->13246|16364->13298|16394->13299|16448->13324|16524->13372|16540->13378|16593->13409|16659->13446|16689->13447|16743->13472|16832->13532|16862->13533|16912->13554|16942->13555|17019->13603|17049->13604|17103->13629|17229->13726|17259->13727|17310->13749|17340->13750|17394->13775|17519->13871|17549->13872|17593->13887|17623->13888|17661->13898|17691->13899|17826->14004|17857->14005|17899->14018|18298->14388|18328->14389|18374->14406|18446->14449|18476->14450|18558->14503|18588->14504|18634->14521|18707->14565|18737->14566|18859->14659|18889->14660|18935->14677|19112->14826|19128->14832|19183->14865|19298->14951|19328->14952|19438->15033|19468->15034|19514->15051|19599->15108|19615->15114|19661->15138|19776->15224|19806->15225|19924->15314|19954->15315|20000->15332|20217->15521|20233->15527|20277->15549|20392->15635|20422->15636|20549->15734|20579->15735|20625->15752|20835->15933|20865->15934|20973->16013|21003->16014|21049->16031|21236->16189|21266->16190|21316->16211|21425->16291|21455->16292|21502->16310|21656->16435|21686->16436|21740->16461|21817->16510|21833->16516|21880->16541|21943->16575|21973->16576|22029->16603|22059->16604|22124->16640|22154->16641|22212->16670|22301->16730|22331->16731|22381->16752|22411->16753|22482->16795|22512->16796|22566->16821|22748->16974|22778->16975|22842->17010|22872->17011|22926->17036|22983->17064|23013->17065|23071->17094|23218->17212|23248->17213|23278->17214|23312->17219|23342->17220|23400->17249|23550->17370|23580->17371|23642->17404|23820->17553|23850->17554|23904->17579|23934->17580|23984->17601|24014->17602|24058->17617|24088->17618|24222->17723|24252->17724|24298->17741|24504->17918|24534->17919|24663->18019|24693->18020|24739->18037|25060->18329|25090->18330|25228->18439|25258->18440|25304->18457|25397->18521|25427->18522|25477->18543|25587->18624|25617->18625|25671->18650|25795->18745|25825->18746|25871->18763|25901->18764|25947->18781|26033->18838|26063->18839|26176->18923|26206->18924|26252->18941|26442->19102|26472->19103|26522->19124|26631->19204|26661->19205|26708->19223|26862->19348|26892->19349|26946->19374|27087->19486|27117->19487|27175->19516|27264->19576|27294->19577|27344->19598|27374->19599|27445->19641|27475->19642|27529->19667|27764->19873|27794->19874|27858->19909|27888->19910|27942->19935|27999->19963|28029->19964|28087->19993|28234->20111|28264->20112|28294->20113|28328->20118|28358->20119|28416->20148|28566->20269|28596->20270|28658->20303|28838->20454|28868->20455|28922->20480|28952->20481|29002->20502|29032->20503|29076->20518|29106->20519|29258->20642|29288->20643|29334->20660|29611->20908|29641->20909|29695->20934|29922->21132|29952->21133|30016->21168|30046->21169|30100->21194|30242->21307|30272->21308|30330->21337|30512->21490|30542->21491|30592->21512|30622->21513|30668->21530|30712->21545|30742->21546|30871->21646|30901->21647|30947->21664|31166->21853|31197->21854|31247->21875|31355->21954|31385->21955|31432->21973|31594->22106|31624->22107|31678->22132|31755->22181|31771->22187|31824->22218|31887->22252|31917->22253|32000->22307|32030->22308|32095->22344|32125->22345|32183->22374|32272->22434|32302->22435|32352->22456|32382->22457|32453->22499|32483->22500|32537->22525|32721->22680|32751->22681|32815->22716|32845->22717|32899->22742|32956->22770|32986->22771|33044->22800|33195->22922|33225->22923|33255->22924|33289->22929|33319->22930|33377->22959|33527->23080|33557->23081|33619->23114|33796->23262|33826->23263|33880->23288|33910->23289|33960->23310|33990->23311|34034->23326|34064->23327|34141->23375|34171->23376|34217->23393|34330->23477|34360->23478|34414->23503|34490->23551|34506->23557|34553->23582|34619->23619|34649->23620|34703->23645|34792->23705|34822->23706|34872->23727|34902->23728|34973->23770|35003->23771|35061->23800|35145->23855|35175->23856|35239->23891|35269->23892|35323->23917|35465->24030|35495->24031|35553->24060|35732->24210|35762->24211|35812->24232|35842->24233|35888->24250|35932->24265|35962->24266|36046->24321|36076->24322|36122->24339|36596->24784|36626->24785|36715->24845|36745->24846|36791->24863|36908->24951|36938->24952|37020->25005|37050->25006|37096->25023|37203->25101|37233->25102|37314->25154|37344->25155|37390->25172|37577->25330|37607->25331|37657->25352|37765->25431|37795->25432|37842->25450|38004->25583|38034->25584|38088->25609|38255->25747|38285->25748|38343->25777|38432->25837|38462->25838|38512->25859|38542->25860|38613->25902|38643->25903|38697->25928|38933->26135|38963->26136|39027->26171|39057->26172|39111->26197|39168->26225|39198->26226|39256->26255|39407->26377|39437->26378|39467->26379|39501->26384|39531->26385|39589->26414|39739->26535|39769->26536|39831->26569|40011->26720|40041->26721|40095->26746|40125->26747|40175->26768|40205->26769|40249->26784|40279->26785|40361->26838|40391->26839|40437->26856|40550->26940|40580->26941|40634->26966|40782->27085|40812->27086|40866->27111|40955->27171|40985->27172|41035->27193|41065->27194|41136->27236|41166->27237|41224->27266|41308->27321|41338->27322|41402->27357|41432->27358|41486->27383|41628->27496|41658->27497|41716->27526|42065->27846|42095->27847|42145->27868|42175->27869|42221->27886|42265->27901|42295->27902|42379->27957|42409->27958|42455->27975|42934->28425|42964->28426|43053->28486|43083->28487|43129->28504|43246->28592|43276->28593|43358->28646|43388->28647|43434->28664|43545->28746|43575->28747|43724->28867|43754->28868|43800->28885|43913->28969|43943->28970|44072->29070|44102->29071|44148->29088|44388->29299|44418->29300|44552->29405|44582->29406|44628->29423|44721->29487|44751->29488|44801->29509|44911->29590|44941->29591|44995->29616|45117->29709|45147->29710|45193->29727|45223->29728|45269->29745|45355->29802|45385->29803|45424->29814|45454->29815
                  LINES: 32->2|38->8|38->8|38->8|39->9|39->9|39->9|50->20|50->20|50->20|50->20|69->39|69->39|69->39|69->39|69->39|69->39|70->40|79->49|79->49|79->49|79->49|79->49|79->49|102->72|102->72|102->72|102->72|102->72|102->72|109->79|109->79|109->79|109->79|109->79|109->79|116->86|116->86|116->86|116->86|116->86|116->86|147->117|147->117|147->117|147->117|147->117|147->117|179->149|179->149|179->149|179->149|179->149|179->149|209->179|209->179|209->179|209->179|209->179|209->179|236->206|236->206|236->206|236->206|236->206|236->206|252->222|252->222|253->223|253->223|253->223|253->223|253->223|254->224|254->224|256->226|256->226|257->227|258->228|258->228|259->229|260->230|260->230|261->231|262->232|262->232|262->232|263->233|263->233|264->234|265->235|265->235|266->236|266->236|267->237|267->237|268->238|270->240|270->240|270->240|270->240|271->241|273->243|273->243|274->244|274->244|275->245|275->245|277->247|277->247|278->248|288->258|288->258|289->259|290->260|290->260|292->262|292->262|293->263|294->264|294->264|297->267|297->267|298->268|301->271|301->271|301->271|303->273|303->273|306->276|306->276|307->277|308->278|308->278|308->278|310->280|310->280|313->283|313->283|314->284|318->288|318->288|318->288|320->290|320->290|323->293|323->293|324->294|328->298|328->298|332->302|332->302|333->303|336->306|336->306|337->307|339->309|339->309|341->311|344->314|344->314|345->315|346->316|346->316|346->316|347->317|347->317|347->317|347->317|348->318|348->318|349->319|350->320|350->320|351->321|351->321|351->321|351->321|352->322|355->325|355->325|355->325|355->325|356->326|356->326|356->326|357->327|359->329|359->329|359->329|359->329|359->329|360->330|362->332|362->332|363->333|365->335|365->335|366->336|366->336|367->337|367->337|368->338|368->338|371->341|371->341|372->342|377->347|377->347|380->350|380->350|381->351|388->358|388->358|391->361|391->361|392->362|393->363|393->363|394->364|395->365|395->365|396->366|398->368|398->368|399->369|399->369|400->370|402->372|402->372|405->375|405->375|406->376|409->379|409->379|410->380|412->382|412->382|414->384|417->387|417->387|418->388|420->390|420->390|421->391|422->392|422->392|423->393|423->393|423->393|423->393|424->394|428->398|428->398|428->398|428->398|429->399|429->399|429->399|430->400|432->402|432->402|432->402|432->402|432->402|433->403|435->405|435->405|436->406|438->408|438->408|439->409|439->409|440->410|440->410|441->411|441->411|444->414|444->414|445->415|451->421|451->421|452->422|456->426|456->426|456->426|456->426|457->427|459->429|459->429|460->430|462->432|462->432|463->433|463->433|464->434|465->435|465->435|468->438|468->438|469->439|472->442|472->442|473->443|475->445|475->445|477->447|480->450|480->450|481->451|482->452|482->452|482->452|483->453|483->453|483->453|483->453|484->454|484->454|485->455|486->456|486->456|487->457|487->457|487->457|487->457|488->458|491->461|491->461|491->461|491->461|492->462|492->462|492->462|493->463|495->465|495->465|495->465|495->465|495->465|496->466|498->468|498->468|499->469|501->471|501->471|502->472|502->472|503->473|503->473|504->474|504->474|506->476|506->476|507->477|509->479|509->479|510->480|511->481|511->481|511->481|512->482|512->482|513->483|514->484|514->484|515->485|515->485|515->485|515->485|516->486|517->487|517->487|517->487|517->487|518->488|520->490|520->490|521->491|523->493|523->493|524->494|524->494|525->495|526->496|526->496|528->498|528->498|529->499|539->509|539->509|541->511|541->511|542->512|544->514|544->514|546->516|546->516|547->517|549->519|549->519|551->521|551->521|552->522|555->525|555->525|556->526|558->528|558->528|560->530|563->533|563->533|564->534|566->536|566->536|567->537|568->538|568->538|569->539|569->539|569->539|569->539|570->540|574->544|574->544|574->544|574->544|575->545|575->545|575->545|576->546|578->548|578->548|578->548|578->548|578->548|579->549|581->551|581->551|582->552|584->554|584->554|585->555|585->555|586->556|586->556|587->557|587->557|589->559|589->559|590->560|592->562|592->562|593->563|595->565|595->565|596->566|597->567|597->567|598->568|598->568|598->568|598->568|599->569|600->570|600->570|600->570|600->570|601->571|603->573|603->573|604->574|609->579|609->579|610->580|610->580|611->581|612->582|612->582|614->584|614->584|615->585|625->595|625->595|627->597|627->597|628->598|630->600|630->600|632->602|632->602|633->603|635->605|635->605|638->608|638->608|639->609|641->611|641->611|644->614|644->614|645->615|650->620|650->620|653->623|653->623|654->624|655->625|655->625|656->626|657->627|657->627|658->628|660->630|660->630|661->631|661->631|662->632|664->634|664->634|666->636|666->636
                  -- GENERATED --
              */
          