
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object posts_Scope0 {
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

class posts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.lang.Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isAdmin : java.lang.Boolean):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="""),_display_(/*9.34*/routes/*9.40*/.Assets.versioned("stylesheets/common/view.css")),format.raw/*9.88*/(""">
    <link rel="stylesheet" href="""),_display_(/*10.34*/routes/*10.40*/.Assets.versioned("stylesheets/posts.css")),format.raw/*10.82*/(""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>
    <title>SI2chip Posts</title>
</head>

<body ng-app="posts" ng-controller="postsCtrl">
    <nav class="fixed-nav-bar ">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src="""),_display_(/*22.27*/routes/*22.33*/.Assets.versioned("images/l46.png")),format.raw/*22.68*/(""" """),format.raw/*22.69*/("""class="logo">
            </div>

            <ul class="nav navbar-nav navbar-right">
                """),_display_(/*26.18*/if(isAdmin)/*26.29*/ {_display_(Seq[Any](format.raw/*26.31*/("""
                    """),format.raw/*27.21*/("""<li><a href="#" ng-click="showAdminPage($event)"><span class="glyphicon glyphicon-bishop"></span> Admin </a></li>
                """)))}),format.raw/*28.18*/("""
                """),format.raw/*29.17*/("""<li><a href="#" ng-click="showGroupsPage($event)">Groups</a></li>
                <li><a href="#" ng-click="signOut($event)"><span class="glyphicon glyphicon-log-out"></span>Sign out </a></li>
            </ul>
        </div>
    </nav>
    <div class="container">
        <div class="row">
            <div class="modal fade" id="conError" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <span>An error occurred transacting with the server.</span>
                            <button type="button" class="close" data-dimdiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            """),format.raw/*44.29*/("""{"""),format.raw/*44.30*/("""{"""),format.raw/*44.31*/("""conerror"""),format.raw/*44.39*/("""}"""),format.raw/*44.40*/("""}"""),format.raw/*44.41*/("""
                        """),format.raw/*45.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-7">
                <div class="text-right">
                    <span class="who">"""),format.raw/*55.39*/("""{"""),format.raw/*55.40*/("""{"""),format.raw/*55.41*/("""loggedInUser()"""),format.raw/*55.55*/("""}"""),format.raw/*55.56*/("""}"""),format.raw/*55.57*/("""</span><span></span>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-2 sidenav">
                <div class="text-center">
                    <h4 id="summarytitle">My groups </h4>
                    <ul class="list-group">
                        <li><a href="#" ng-click="changeGroup('None')" class="list-group-item list-group-item-success" data-toggle="tooltip" data-placement="right">None</a></li>
                        <li ng-repeat="grp in allUserGroups track by grp.groupId"  class="list-group-item list-group-item-success" data-toggle="tooltip" data-placement="right"><a href="#" ng-click="changeGroup(grp.groupId)">"""),format.raw/*67.225*/("""{"""),format.raw/*67.226*/("""{"""),format.raw/*67.227*/("""grp.groupId"""),format.raw/*67.238*/("""}"""),format.raw/*67.239*/("""}"""),format.raw/*67.240*/("""</a></li>
                    </ul>
                </div>
            </div>
            <div class="col-md-7 ">
                    <div class="well well-lg">
                        <div id="changegroupError"></div>
                        <h4 id="poststitle">Posts <span class="badge">"""),format.raw/*74.71*/("""{"""),format.raw/*74.72*/("""{"""),format.raw/*74.73*/("""postpage.numPosts"""),format.raw/*74.90*/("""}"""),format.raw/*74.91*/("""}"""),format.raw/*74.92*/("""</span></h4>
                        <form name="apf" role="form">
                            <div class="form-group">
                                <textarea name="post" ng-model="post" class="form-control" maxlength="5000" required placeholder="Enter your post here"></textarea>
                            </div>
                            <div class="text-right">
                                <button type="submit" ng-click="addPost($event)" class="btn btn-primary btn-xs">Post</button>
                            </div>
                        </form>
                        <div id="addError"></div>
                </div>

                    <div class="well well-lg">
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
                        <div id="delError"></div>
                        <div class="well well-lg" ng-repeat="pst in postpage.arr track by pst.id">
                            <div class="text-right">
                                <h6 class="postedby"><span class="user">"""),format.raw/*101.73*/("""{"""),format.raw/*101.74*/("""{"""),format.raw/*101.75*/("""pst.userId"""),format.raw/*101.85*/("""}"""),format.raw/*101.86*/("""}"""),format.raw/*101.87*/("""</span> on """),format.raw/*101.98*/("""{"""),format.raw/*101.99*/("""{"""),format.raw/*101.100*/("""pst.postedOn"""),format.raw/*101.112*/("""}"""),format.raw/*101.113*/("""}"""),format.raw/*101.114*/("""</h6>
                                <a href="#" ng-click="deletePost($event,pst.id)" class="btn btn-info btn-xs">
                                    <span class="glyphicon glyphicon-remove"></span>
                                </a>
                            </div>
                            <div class="postmsg"><span>"""),format.raw/*106.56*/("""{"""),format.raw/*106.57*/("""{"""),format.raw/*106.58*/("""pst.post"""),format.raw/*106.66*/("""}"""),format.raw/*106.67*/("""}"""),format.raw/*106.68*/("""</span></div>
                            <div class="text-right">
                                <a href="#" ng-click="toggleCommentsEditor($event, $index)">Comments<span ng-show="!angular.isUndefined(postpage.arr[$index].bShow) && postpage.arr[$index].bShow" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(postpage.arr[$index].bShow) || !postpage.arr[$index].bShow" class="glyphicon glyphicon-menu-down"></span>
                                </a>
                            </div>
                            <div class="well well-md" ng-show="!angular.isUndefined(postpage.arr[$index].bShow) && postpage.arr[$index].bShow">
                                <div class="modal fade" id=""""),format.raw/*112.61*/("""{"""),format.raw/*112.62*/("""{"""),format.raw/*112.63*/("""postpage.arr[$index].id"""),format.raw/*112.86*/("""}"""),format.raw/*112.87*/("""}"""),format.raw/*112.88*/("""" role="dialog">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <span>An error occurred transacting with the server.</span>
                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            </div>
                                            <div class="modal-body">
                                                """),format.raw/*120.49*/("""{"""),format.raw/*120.50*/("""{"""),format.raw/*120.51*/("""postpage.arr[$index].cconerror"""),format.raw/*120.81*/("""}"""),format.raw/*120.82*/("""}"""),format.raw/*120.83*/("""
                                            """),format.raw/*121.45*/("""</div>
                                        </div>
                                    </div>
                                </div>

                                <div id="delError"""),format.raw/*126.50*/("""{"""),format.raw/*126.51*/("""{"""),format.raw/*126.52*/("""postpage.arr[$index].id"""),format.raw/*126.75*/("""}"""),format.raw/*126.76*/("""}"""),format.raw/*126.77*/(""""></div>
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <div class="text-center">
                                            <h4 id="commentstitle">Comments <span class="badge">"""),format.raw/*131.97*/("""{"""),format.raw/*131.98*/("""{"""),format.raw/*131.99*/("""postpage.arr[$index].commentpage.numComments"""),format.raw/*131.143*/("""}"""),format.raw/*131.144*/("""}"""),format.raw/*131.145*/("""</span></h4>
                                            <a href="#" ng-click="loadCommentNextPage($event, $index)" class="btn btn-success btn-xs">
                                                <span class="glyphicon glyphicon-circle-arrow-down"></span>
                                            </a>
                                            <a href="#" ng-if="postpage.arr[$index].commentpage.beginId != '-1'" ng-click="refreshCommentCurrentPage($event, $index)" class="btn btn-success btn-xs">
                                                <span class="glyphicon glyphicon-refresh"></span>
                                            </a>
                                            <a href="#" ng-if="!postpage.arr[$index].commentpage.bLastPage" ng-click="loadCommentPreviousPage($event, $index)" class="btn btn-success btn-xs">
                                                <span class="glyphicon glyphicon-circle-arrow-up"></span>
                                            </a>
                                        </div>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr ng-repeat="comment in postpage.arr[$index].commentpage.arr track by comment.id">
                                        <td>
                                            <div class="text-right">
                                                <h6 class="commentedby"><span class="user">"""),format.raw/*148.92*/("""{"""),format.raw/*148.93*/("""{"""),format.raw/*148.94*/("""comment.userId"""),format.raw/*148.108*/("""}"""),format.raw/*148.109*/("""}"""),format.raw/*148.110*/("""</span> on """),format.raw/*148.121*/("""{"""),format.raw/*148.122*/("""{"""),format.raw/*148.123*/("""comment.commentedOn"""),format.raw/*148.142*/("""}"""),format.raw/*148.143*/("""}"""),format.raw/*148.144*/("""</h6>
                                                <a href="#" ng-click="deleteComment($event,$parent.$index,comment.id)" class="btn btn-success btn-xs">
                                                    <span class="glyphicon glyphicon-remove"></span>
                                                </a>
                                            </div>
                                            <div class="commentmsg">"""),format.raw/*153.69*/("""{"""),format.raw/*153.70*/("""{"""),format.raw/*153.71*/("""comment.comment"""),format.raw/*153.86*/("""}"""),format.raw/*153.87*/("""}"""),format.raw/*153.88*/("""</div>
                                        <td>
                                    </tr>
                                    </tbody>
                                </table>
                                <form role="form">
                                    <div class="form-group">
                                        <textarea id="comment"""),format.raw/*160.62*/("""{"""),format.raw/*160.63*/("""{"""),format.raw/*160.64*/("""postpage.arr[$index].id"""),format.raw/*160.87*/("""}"""),format.raw/*160.88*/("""}"""),format.raw/*160.89*/("""" ng-model="postpage.arr[$index].comment" maxlength="2000" class="form-control" required placeholder="Enter your comment here"></textarea>
                                    </div>
                                    <div class="text-right">
                                        <button type="submit" ng-click="addComment($event, $index)" class="btn btn-success btn-xs">Comment</button>
                                    </div>
                                </form>
                                <div id="addError"""),format.raw/*166.50*/("""{"""),format.raw/*166.51*/("""{"""),format.raw/*166.52*/("""postpage.arr[$index].id"""),format.raw/*166.75*/("""}"""),format.raw/*166.76*/("""}"""),format.raw/*166.77*/(""""></div>
                            </div>
                        </div>
                   </div>

           </div>
            <div class="col-md-3 sidenav ">

                <div class="text-center">
                    <h4 id="summarytitle">Active users <span class="badge">"""),format.raw/*175.76*/("""{"""),format.raw/*175.77*/("""{"""),format.raw/*175.78*/("""users.length"""),format.raw/*175.90*/("""}"""),format.raw/*175.91*/("""}"""),format.raw/*175.92*/("""</span></h4>
                    <a href="#" ng-click="loadUserSummary()" class="btn btn-info btn-xs">
                        <span class="glyphicon glyphicon-refresh"></span>
                    </a>
                </div>
                <ul class="list-group">
                    <li ng-repeat="x in users" class="list-group-item list-group-item-success" data-toggle="tooltip" data-placement="right" title=""""),format.raw/*181.148*/("""{"""),format.raw/*181.149*/("""{"""),format.raw/*181.150*/("""x.userId"""),format.raw/*181.158*/("""}"""),format.raw/*181.159*/("""}"""),format.raw/*181.160*/("""">
                        """),format.raw/*182.25*/("""{"""),format.raw/*182.26*/("""{"""),format.raw/*182.27*/("""x.userId"""),format.raw/*182.35*/("""}"""),format.raw/*182.36*/("""}"""),format.raw/*182.37*/("""<span class="badge">"""),format.raw/*182.57*/("""{"""),format.raw/*182.58*/("""{"""),format.raw/*182.59*/("""x.nSessions"""),format.raw/*182.70*/("""}"""),format.raw/*182.71*/("""}"""),format.raw/*182.72*/("""</span>
                    </li>
                </ul>

            </div>
        </div>
    </div>
</body>
<script type="text/javascript">
        //todo: progress indicator
        //todo: error message timing

        var app = angular.module('posts',  ["ngCookies"]);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*195.80*/("""{"""),format.raw/*195.81*/("""
            """),format.raw/*196.13*/("""$locationProvider.html5Mode("""),format.raw/*196.41*/("""{"""),format.raw/*196.42*/("""enabled: true, requireBase: false"""),format.raw/*196.75*/("""}"""),format.raw/*196.76*/(""").hashPrefix('*');
        """),format.raw/*197.9*/("""}"""),format.raw/*197.10*/("""]);

         app.service("GroupSvc", function ($http, $q) """),format.raw/*199.55*/("""{"""),format.raw/*199.56*/("""
            """),format.raw/*200.13*/("""var deferred;
            this.getMyGroups = function (uId) """),format.raw/*201.47*/("""{"""),format.raw/*201.48*/("""
                """),format.raw/*202.17*/("""deferred = $q.defer();
                return $http("""),format.raw/*203.30*/("""{"""),format.raw/*203.31*/("""
                        """),format.raw/*204.25*/("""method : "GET",
                        url : "/mygroups/" + uId,
                        headers : """),format.raw/*206.35*/("""{"""),format.raw/*206.36*/("""
                        """),format.raw/*207.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*208.25*/("""}"""),format.raw/*208.26*/("""
                    """),format.raw/*209.21*/("""}"""),format.raw/*209.22*/(""")
                    .then(function (response) """),format.raw/*210.47*/("""{"""),format.raw/*210.48*/("""
                        """),format.raw/*211.25*/("""deferred.resolve(response);
                        return deferred.promise;
                    """),format.raw/*213.21*/("""}"""),format.raw/*213.22*/(""", function (response) """),format.raw/*213.44*/("""{"""),format.raw/*213.45*/("""
                        """),format.raw/*214.25*/("""deferred.reject(response);
                        return deferred.promise;
                    """),format.raw/*216.21*/("""}"""),format.raw/*216.22*/(""");
            """),format.raw/*217.13*/("""}"""),format.raw/*217.14*/(""";
        """),format.raw/*218.9*/("""}"""),format.raw/*218.10*/(""");

        app.controller('postsCtrl', function($scope, $http, $location, $cookies, $window,GroupSvc) """),format.raw/*220.100*/("""{"""),format.raw/*220.101*/("""


            """),format.raw/*223.13*/("""$scope.loggedInUser = function() """),format.raw/*223.46*/("""{"""),format.raw/*223.47*/("""
                """),format.raw/*224.17*/("""return $cookies.get("userId");
            """),format.raw/*225.13*/("""}"""),format.raw/*225.14*/(""";

            $scope.showForbiddenPage = function() """),format.raw/*227.51*/("""{"""),format.raw/*227.52*/("""
                """),format.raw/*228.17*/("""$cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*231.34*/routes/*231.40*/.HomeController.showForbiddenPage),format.raw/*231.73*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*233.13*/("""}"""),format.raw/*233.14*/(""";

            $scope.signOut = function(event) """),format.raw/*235.46*/("""{"""),format.raw/*235.47*/("""
                """),format.raw/*236.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*240.34*/routes/*240.40*/.HomeController.logout),format.raw/*240.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*242.13*/("""}"""),format.raw/*242.14*/(""";

            $scope.showAdminPage = function(event) """),format.raw/*244.52*/("""{"""),format.raw/*244.53*/("""
                """),format.raw/*245.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*246.34*/routes/*246.40*/.AdminController.showAdminPage),format.raw/*246.70*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*248.13*/("""}"""),format.raw/*248.14*/(""";

            $scope.showGroupsPage = function(event) """),format.raw/*250.53*/("""{"""),format.raw/*250.54*/("""
                """),format.raw/*251.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*252.34*/routes/*252.40*/.GroupController.showGroupsPage),format.raw/*252.71*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*254.13*/("""}"""),format.raw/*254.14*/(""";

            $scope.changeGroup= function(gId) """),format.raw/*256.47*/("""{"""),format.raw/*256.48*/("""
                """),format.raw/*257.17*/("""// change the group
                $scope.conerror = "";
                $scope.changegrouperror = "";
                $("#changegroupError").html("");
                $http("""),format.raw/*261.23*/("""{"""),format.raw/*261.24*/("""
                        """),format.raw/*262.25*/("""method : "PUT",
                        url : "/usergroup" + '/' + gId,
                        headers : """),format.raw/*264.35*/("""{"""),format.raw/*264.36*/("""
                            """),format.raw/*265.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*266.25*/("""}"""),format.raw/*266.26*/("""
                    """),format.raw/*267.21*/("""}"""),format.raw/*267.22*/(""").then(function successCallback(response) """),format.raw/*267.64*/("""{"""),format.raw/*267.65*/("""
                        """),format.raw/*268.25*/("""$scope.InitPostView();
                    """),format.raw/*269.21*/("""}"""),format.raw/*269.22*/(""", function errorCallback(response) """),format.raw/*269.57*/("""{"""),format.raw/*269.58*/("""
                        """),format.raw/*270.25*/("""if (response.status == 400) """),format.raw/*270.53*/("""{"""),format.raw/*270.54*/("""
                            """),format.raw/*271.29*/("""$scope.changegrouperror = response.data.error;
                            $("#changegroupError").html("<div id='cgErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.changegrouperror + "</div>");
                        """),format.raw/*273.25*/("""}"""),format.raw/*273.26*/(""" """),format.raw/*273.27*/("""else """),format.raw/*273.32*/("""{"""),format.raw/*273.33*/("""
                            """),format.raw/*274.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*276.34*/("""{"""),format.raw/*276.35*/("""
                                """),format.raw/*277.33*/("""$scope.conerror = "Error changing the group. Retry";
                                $('#conError').modal('show');
                            """),format.raw/*279.29*/("""}"""),format.raw/*279.30*/("""
                        """),format.raw/*280.25*/("""}"""),format.raw/*280.26*/("""
                    """),format.raw/*281.21*/("""}"""),format.raw/*281.22*/(""");
             """),format.raw/*282.14*/("""}"""),format.raw/*282.15*/("""

             """),format.raw/*284.14*/("""// loads all the groups in which this user is a member
            $scope.loadUserGroups = function(event) """),format.raw/*285.53*/("""{"""),format.raw/*285.54*/("""
                """),format.raw/*286.17*/("""//if (lf.userId.$error.required || lf.userId.$error.email)
                   // return;

                $scope.conerror = "";
                $scope.allUserGroups = [];
                GroupSvc.getMyGroups($scope.loggedInUser()).then(function successCallback(response) """),format.raw/*291.101*/("""{"""),format.raw/*291.102*/("""
                        """),format.raw/*292.25*/("""$scope.allUserGroups = response.data;
                    """),format.raw/*293.21*/("""}"""),format.raw/*293.22*/(""", function errorCallback(response) """),format.raw/*293.57*/("""{"""),format.raw/*293.58*/("""
                        """),format.raw/*294.25*/("""if (response.status == 400) """),format.raw/*294.53*/("""{"""),format.raw/*294.54*/("""
                            """),format.raw/*295.29*/("""//do nothing
                        """),format.raw/*296.25*/("""}"""),format.raw/*296.26*/(""" """),format.raw/*296.27*/("""else if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*298.30*/("""{"""),format.raw/*298.31*/("""
                            """),format.raw/*299.29*/("""$scope.conerror = "Error refreshing the list of groups in which the user is a member. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*301.25*/("""}"""),format.raw/*301.26*/("""
                    """),format.raw/*302.21*/("""}"""),format.raw/*302.22*/("""
                """),format.raw/*303.17*/(""");
            """),format.raw/*304.13*/("""}"""),format.raw/*304.14*/(""";

            // add post event handler
            $scope.addPost = function(event) """),format.raw/*307.46*/("""{"""),format.raw/*307.47*/("""
                """),format.raw/*308.17*/("""event.preventDefault();

                // validate the posts form
                if ($scope.apf.post.$error.required) """),format.raw/*311.54*/("""{"""),format.raw/*311.55*/("""
                    """),format.raw/*312.21*/("""return;
                """),format.raw/*313.17*/("""}"""),format.raw/*313.18*/("""

                """),format.raw/*315.17*/("""// post the message
                $scope.conerror = "";
                $scope.adderror = "";
                $("#addError").html("");
                $http("""),format.raw/*319.23*/("""{"""),format.raw/*319.24*/("""
                        """),format.raw/*320.25*/("""method : "POST",
                        url : """"),_display_(/*321.33*/routes/*321.39*/.PostController.addPost),format.raw/*321.62*/("""",
                        data : """),format.raw/*322.32*/("""{"""),format.raw/*322.33*/(""""post" : $scope.post"""),format.raw/*322.53*/("""}"""),format.raw/*322.54*/(""",
                        headers : """),format.raw/*323.35*/("""{"""),format.raw/*323.36*/("""
                            """),format.raw/*324.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*325.25*/("""}"""),format.raw/*325.26*/("""
                    """),format.raw/*326.21*/("""}"""),format.raw/*326.22*/(""").then(function successCallback(response) """),format.raw/*326.64*/("""{"""),format.raw/*326.65*/("""
                        """),format.raw/*327.25*/("""$scope.post = "";
                        $scope.loadFirstPage();
                    """),format.raw/*329.21*/("""}"""),format.raw/*329.22*/(""", function errorCallback(response) """),format.raw/*329.57*/("""{"""),format.raw/*329.58*/("""
                        """),format.raw/*330.25*/("""if (response.status == 400) """),format.raw/*330.53*/("""{"""),format.raw/*330.54*/("""
                            """),format.raw/*331.29*/("""$scope.adderror = response.data.error;
                            $("#addError").html("<div id='aErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.adderror + "</div>");
                        """),format.raw/*333.25*/("""}"""),format.raw/*333.26*/(""" """),format.raw/*333.27*/("""else """),format.raw/*333.32*/("""{"""),format.raw/*333.33*/("""
                            """),format.raw/*334.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*336.34*/("""{"""),format.raw/*336.35*/("""
                                """),format.raw/*337.33*/("""$scope.conerror = "Error posting the message. Retry";
                                $('#conError').modal('show');
                            """),format.raw/*339.29*/("""}"""),format.raw/*339.30*/("""
                        """),format.raw/*340.25*/("""}"""),format.raw/*340.26*/("""
                    """),format.raw/*341.21*/("""}"""),format.raw/*341.22*/(""");
            """),format.raw/*342.13*/("""}"""),format.raw/*342.14*/(""";

            // delete post event handler
            $scope.deletePost = function(event, postId) """),format.raw/*345.57*/("""{"""),format.raw/*345.58*/("""
                """),format.raw/*346.17*/("""event.preventDefault();

                // delete the post
                $scope.conerror = "";
                $scope.delerror = "";
                $("#delError").html("");
                $http("""),format.raw/*352.23*/("""{"""),format.raw/*352.24*/("""
                        """),format.raw/*353.25*/("""method : "DELETE",
                        url : "/post/" + postId,
                        headers : """),format.raw/*355.35*/("""{"""),format.raw/*355.36*/("""
                            """),format.raw/*356.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*357.25*/("""}"""),format.raw/*357.26*/("""
                    """),format.raw/*358.21*/("""}"""),format.raw/*358.22*/(""").then(function successCallback(response) """),format.raw/*358.64*/("""{"""),format.raw/*358.65*/("""
                        """),format.raw/*359.25*/("""$scope.refreshCurrentPage(null);
                    """),format.raw/*360.21*/("""}"""),format.raw/*360.22*/(""", function errorCallback(response) """),format.raw/*360.57*/("""{"""),format.raw/*360.58*/("""
                        """),format.raw/*361.25*/("""if (response.status == 400) """),format.raw/*361.53*/("""{"""),format.raw/*361.54*/("""
                            """),format.raw/*362.29*/("""$scope.delerror = response.data.error + ". Refresh the current page if post does not exist.";
                            $("#delError").html("<div id='dErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.delerror + "</div>");
                        """),format.raw/*364.25*/("""}"""),format.raw/*364.26*/(""" """),format.raw/*364.27*/("""else """),format.raw/*364.32*/("""{"""),format.raw/*364.33*/("""
                            """),format.raw/*365.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*367.34*/("""{"""),format.raw/*367.35*/("""
                                """),format.raw/*368.33*/("""$scope.conerror = "Error deleting the message. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*370.29*/("""}"""),format.raw/*370.30*/("""
                        """),format.raw/*371.25*/("""}"""),format.raw/*371.26*/("""
                    """),format.raw/*372.21*/("""}"""),format.raw/*372.22*/(""");
            """),format.raw/*373.13*/("""}"""),format.raw/*373.14*/(""";

            // page loader
            $scope.loadPage = function(url) """),format.raw/*376.45*/("""{"""),format.raw/*376.46*/("""
                """),format.raw/*377.17*/("""$scope.delerror = "";
                $("#delError").html("");
                $scope.conerror = "";
                $http("""),format.raw/*380.23*/("""{"""),format.raw/*380.24*/("""
                        """),format.raw/*381.25*/("""method : "GET",
                        url : url,
                        headers : """),format.raw/*383.35*/("""{"""),format.raw/*383.36*/("""
                            """),format.raw/*384.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*385.25*/("""}"""),format.raw/*385.26*/("""
                    """),format.raw/*386.21*/("""}"""),format.raw/*386.22*/(""").then(function successCallback(response) """),format.raw/*386.64*/("""{"""),format.raw/*386.65*/("""
                        """),format.raw/*387.25*/("""$scope.postpage = response.data;
                    """),format.raw/*388.21*/("""}"""),format.raw/*388.22*/(""", function errorCallback(response) """),format.raw/*388.57*/("""{"""),format.raw/*388.58*/("""
                         """),format.raw/*389.26*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                         else """),format.raw/*391.31*/("""{"""),format.raw/*391.32*/("""
                            """),format.raw/*392.29*/("""$scope.conerror = "Error retrieving the page from the server. Retry.";
                            $('#conError').modal('show');
                         """),format.raw/*394.26*/("""}"""),format.raw/*394.27*/("""
                    """),format.raw/*395.21*/("""}"""),format.raw/*395.22*/(""");
            """),format.raw/*396.13*/("""}"""),format.raw/*396.14*/(""";

            // refreshes the current page
            $scope.refreshCurrentPage = function(event) """),format.raw/*399.57*/("""{"""),format.raw/*399.58*/("""
                """),format.raw/*400.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadPage("/posts/refresh/" + $scope.postpage.endId);
            """),format.raw/*403.13*/("""}"""),format.raw/*403.14*/(""";

            // next page event handler
            $scope.loadNextPage = function(event) """),format.raw/*406.51*/("""{"""),format.raw/*406.52*/("""
                """),format.raw/*407.17*/("""event.preventDefault();
                $scope.loadPage("/posts/after/" + $scope.postpage.beginId);
            """),format.raw/*409.13*/("""}"""),format.raw/*409.14*/(""";

            // previous page event handler
            $scope.loadPreviousPage = function(event) """),format.raw/*412.55*/("""{"""),format.raw/*412.56*/("""
                """),format.raw/*413.17*/("""event.preventDefault();
                $scope.loadPage("/posts/before/" + $scope.postpage.endId);
            """),format.raw/*415.13*/("""}"""),format.raw/*415.14*/(""";

            // loads the first page
            $scope.loadFirstPage = function() """),format.raw/*418.47*/("""{"""),format.raw/*418.48*/("""
                """),format.raw/*419.17*/("""$scope.postpage.numPosts = "0";
                $scope.postpage.bLastPage = false;
                $scope.postpage.arr = [];
                $scope.postpage.beginId = "-1";
                $scope.postpage.endId = "-1";
                $scope.loadPage("/posts/first");
            """),format.raw/*425.13*/("""}"""),format.raw/*425.14*/(""";

            // add comment event handler
            $scope.addComment = function(event, index) """),format.raw/*428.56*/("""{"""),format.raw/*428.57*/("""
                """),format.raw/*429.17*/("""event.preventDefault();

                // validate the comments form
                if ($scope.postpage.arr[index].comment == "") """),format.raw/*432.63*/("""{"""),format.raw/*432.64*/("""
                    """),format.raw/*433.21*/("""return;
                """),format.raw/*434.17*/("""}"""),format.raw/*434.18*/("""

                """),format.raw/*436.17*/("""// add the comment
                $scope.postpage.arr[index].cconerror = "";
                $scope.postpage.arr[index].cadderror = "";
                $("#addError" + $scope.postpage.arr[index].id).html("");
                $http("""),format.raw/*440.23*/("""{"""),format.raw/*440.24*/("""
                        """),format.raw/*441.25*/("""method : "POST",
                        url : "/comment/" + $scope.postpage.arr[index].id,
                        data : """),format.raw/*443.32*/("""{"""),format.raw/*443.33*/(""""comment" : $scope.postpage.arr[index].comment"""),format.raw/*443.79*/("""}"""),format.raw/*443.80*/(""",
                        headers : """),format.raw/*444.35*/("""{"""),format.raw/*444.36*/("""
                            """),format.raw/*445.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*446.25*/("""}"""),format.raw/*446.26*/("""
                    """),format.raw/*447.21*/("""}"""),format.raw/*447.22*/(""").then(function successCallback(response) """),format.raw/*447.64*/("""{"""),format.raw/*447.65*/("""
                        """),format.raw/*448.25*/("""$scope.postpage.arr[index].comment = "";
                        $scope.loadCommentLastPage(null, index);
                    """),format.raw/*450.21*/("""}"""),format.raw/*450.22*/(""", function errorCallback(response) """),format.raw/*450.57*/("""{"""),format.raw/*450.58*/("""
                        """),format.raw/*451.25*/("""if (response.status == 400) """),format.raw/*451.53*/("""{"""),format.raw/*451.54*/("""
                            """),format.raw/*452.29*/("""$scope.postpage.arr[index].cadderror = response.data.error;
                            $("#addError" + $scope.postpage.arr[index].id).html("<div id='aErr" + $scope.postpage.arr[index].id + "' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.postpage.arr[index].cadderror + "</div>");
                        """),format.raw/*454.25*/("""}"""),format.raw/*454.26*/(""" """),format.raw/*454.27*/("""else """),format.raw/*454.32*/("""{"""),format.raw/*454.33*/("""
                            """),format.raw/*455.29*/("""if (response.status == 403)
                               $scope.showForbiddenPage();
                            else """),format.raw/*457.34*/("""{"""),format.raw/*457.35*/("""
                                """),format.raw/*458.33*/("""$scope.postpage.arr[index].cconerror = "Error posting the comment. Retry";
                                $('#' + $scope.postpage.arr[index].id).modal('show');
                            """),format.raw/*460.29*/("""}"""),format.raw/*460.30*/("""
                        """),format.raw/*461.25*/("""}"""),format.raw/*461.26*/("""
                    """),format.raw/*462.21*/("""}"""),format.raw/*462.22*/(""");
            """),format.raw/*463.13*/("""}"""),format.raw/*463.14*/(""";

            // delete comment event handler
            $scope.deleteComment = function(event, index, commentId) """),format.raw/*466.70*/("""{"""),format.raw/*466.71*/("""
                """),format.raw/*467.17*/("""event.preventDefault();

                // delete the comment
                $scope.postpage.arr[index].cconerror = "";
                $scope.postpage.arr[index].cdelerror = "";
                $("#delError" + $scope.postpage.arr[index].id).html("");
                $http("""),format.raw/*473.23*/("""{"""),format.raw/*473.24*/("""
                        """),format.raw/*474.25*/("""method : "DELETE",
                        url : "/comment/" + $scope.postpage.arr[index].id + "/" + commentId,
                        headers : """),format.raw/*476.35*/("""{"""),format.raw/*476.36*/("""
                            """),format.raw/*477.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*478.25*/("""}"""),format.raw/*478.26*/("""
                    """),format.raw/*479.21*/("""}"""),format.raw/*479.22*/(""").then(function successCallback(response) """),format.raw/*479.64*/("""{"""),format.raw/*479.65*/("""
                        """),format.raw/*480.25*/("""$scope.refreshCommentCurrentPage(null, index);
                    """),format.raw/*481.21*/("""}"""),format.raw/*481.22*/(""", function errorCallback(response) """),format.raw/*481.57*/("""{"""),format.raw/*481.58*/("""
                        """),format.raw/*482.25*/("""if (response.status == 400) """),format.raw/*482.53*/("""{"""),format.raw/*482.54*/("""
                            """),format.raw/*483.29*/("""$scope.postpage.arr[index].cdelerror = response.data.error + ". Refresh the current comment page if comment does not exist.";
                            $("#delError" + $scope.postpage.arr[index].id).html("<div id='dErr" + $scope.postpage.arr[index].id + "' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.postpage.arr[index].cdelerror + "</div>");
                        """),format.raw/*485.25*/("""}"""),format.raw/*485.26*/(""" """),format.raw/*485.27*/("""else """),format.raw/*485.32*/("""{"""),format.raw/*485.33*/("""
                             """),format.raw/*486.30*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                             else """),format.raw/*488.35*/("""{"""),format.raw/*488.36*/("""
                                """),format.raw/*489.33*/("""$scope.postpage.arr[index].cconerror = "Error deleting the comment. Retry.";
                                $('#' + $scope.postpage.arr[index].id).modal('show');
                             """),format.raw/*491.30*/("""}"""),format.raw/*491.31*/("""
                        """),format.raw/*492.25*/("""}"""),format.raw/*492.26*/("""
                    """),format.raw/*493.21*/("""}"""),format.raw/*493.22*/(""");
            """),format.raw/*494.13*/("""}"""),format.raw/*494.14*/(""";

            // comment page loader
            $scope.loadCommentPage = function(url, index) """),format.raw/*497.59*/("""{"""),format.raw/*497.60*/("""
                """),format.raw/*498.17*/("""$scope.postpage.arr[index].cdelerror = "";
                $("#delError" + $scope.postpage.arr[index].id).html("");
                $scope.postpage.arr[index].cconerror = "";
                $http("""),format.raw/*501.23*/("""{"""),format.raw/*501.24*/("""
                        """),format.raw/*502.25*/("""method : "GET",
                        url : url,
                        headers : """),format.raw/*504.35*/("""{"""),format.raw/*504.36*/("""
                            """),format.raw/*505.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*506.25*/("""}"""),format.raw/*506.26*/("""
                    """),format.raw/*507.21*/("""}"""),format.raw/*507.22*/(""").then(function successCallback(response) """),format.raw/*507.64*/("""{"""),format.raw/*507.65*/("""
                        """),format.raw/*508.25*/("""$scope.postpage.arr[index].commentpage = response.data;
                    """),format.raw/*509.21*/("""}"""),format.raw/*509.22*/(""", function errorCallback(response) """),format.raw/*509.57*/("""{"""),format.raw/*509.58*/("""
                        """),format.raw/*510.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*512.30*/("""{"""),format.raw/*512.31*/("""
                            """),format.raw/*513.29*/("""$scope.postpage.arr[index].cconerror = "Error retrieving the comment page from the server. Retry.";
                            $('#' + $scope.postpage.arr[index].id).modal('show');
                        """),format.raw/*515.25*/("""}"""),format.raw/*515.26*/("""
                    """),format.raw/*516.21*/("""}"""),format.raw/*516.22*/(""");
            """),format.raw/*517.13*/("""}"""),format.raw/*517.14*/(""";

            // refreshes the current comment page
            $scope.refreshCommentCurrentPage = function(event, index) """),format.raw/*520.71*/("""{"""),format.raw/*520.72*/("""
                """),format.raw/*521.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadCommentPage("/comments/refresh/" + $scope.postpage.arr[index].id + "/" + $scope.postpage.arr[index].commentpage.beginId, index);
            """),format.raw/*524.13*/("""}"""),format.raw/*524.14*/(""";

            // next comment page event handler
            $scope.loadCommentNextPage = function(event, index) """),format.raw/*527.65*/("""{"""),format.raw/*527.66*/("""
                """),format.raw/*528.17*/("""event.preventDefault();
                $scope.loadCommentPage("/comments/after/" + $scope.postpage.arr[index].id + "/" + $scope.postpage.arr[index].commentpage.endId, index);
            """),format.raw/*530.13*/("""}"""),format.raw/*530.14*/(""";

            // previous comment page event handler
            $scope.loadCommentPreviousPage = function(event, index) """),format.raw/*533.69*/("""{"""),format.raw/*533.70*/("""
                """),format.raw/*534.17*/("""event.preventDefault();
                $scope.loadCommentPage("/comments/before/" + $scope.postpage.arr[index].id + "/" + $scope.postpage.arr[index].commentpage.beginId, index);
            """),format.raw/*536.13*/("""}"""),format.raw/*536.14*/(""";

            $scope.loadCommentLastPage = function(event, index) """),format.raw/*538.65*/("""{"""),format.raw/*538.66*/("""
                """),format.raw/*539.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadCommentPage("/comments/last/" + $scope.postpage.arr[index].id, index);
            """),format.raw/*542.13*/("""}"""),format.raw/*542.14*/(""";


            // loads the first comment page
            $scope.loadCommentFirstPage = function(index) """),format.raw/*546.59*/("""{"""),format.raw/*546.60*/("""
                """),format.raw/*547.17*/("""$scope.postpage.arr[index].commentpage.numComments = "0";
                $scope.postpage.arr[index].commentpage.bLastPage = false;
                $scope.postpage.arr[index].commentpage.arr = [];
                $scope.postpage.arr[index].commentpage.beginId = "-1";
                $scope.postpage.arr[index].commentpage.endId = "-1";

                $scope.loadCommentPage("/comments/first/" + $scope.postpage.arr[index].id, index);
            """),format.raw/*554.13*/("""}"""),format.raw/*554.14*/(""";

            // toggles the comment editor for a post
            $scope.toggleCommentsEditor = function(event, index) """),format.raw/*557.66*/("""{"""),format.raw/*557.67*/("""
                """),format.raw/*558.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.postpage.arr[index].bShow)) """),format.raw/*559.75*/("""{"""),format.raw/*559.76*/("""
                    """),format.raw/*560.21*/("""$scope.postpage.arr[index].commentpage = new Object();

                    // initialize error state
                    $scope.postpage.arr[index].cdelerror = "";
                    $scope.postpage.arr[index].cconerror = "";
                    $scope.postpage.arr[index].cadderror = "";

                    $scope.postpage.arr[index].comment = "";
                    $scope.postpage.arr[index].bShow = true;
                    $scope.loadCommentFirstPage(index);
                """),format.raw/*570.17*/("""}"""),format.raw/*570.18*/(""" """),format.raw/*570.19*/("""else """),format.raw/*570.24*/("""{"""),format.raw/*570.25*/("""
                    """),format.raw/*571.21*/("""$scope.postpage.arr[index].bShow = !$scope.postpage.arr[index].bShow;
                """),format.raw/*572.17*/("""}"""),format.raw/*572.18*/("""
            """),format.raw/*573.13*/("""}"""),format.raw/*573.14*/(""";


            // Initialize the view
            $scope.InitPostView = function() """),format.raw/*577.46*/("""{"""),format.raw/*577.47*/("""
                """),format.raw/*578.17*/("""$scope.adderror = "";
                $scope.delerror = "";
                $scope.conerror = "";
                $scope.bConerror = false;
                $scope.postpage = new Object();
                $scope.loadFirstPage();
                $scope.addSuccess = false;
                $scope.delSuccess = false;
            """),format.raw/*586.13*/("""}"""),format.raw/*586.14*/("""

             """),format.raw/*588.14*/("""$scope.loadUserSummary = function() """),format.raw/*588.50*/("""{"""),format.raw/*588.51*/("""
                """),format.raw/*589.17*/("""$scope.conerror = "";
                $scope.users=[];
                $http("""),format.raw/*591.23*/("""{"""),format.raw/*591.24*/("""
                        """),format.raw/*592.25*/("""method : "GET",
                        url : """"),_display_(/*593.33*/routes/*593.39*/.HomeController.getUserSummary),format.raw/*593.69*/("""",
                        headers : """),format.raw/*594.35*/("""{"""),format.raw/*594.36*/("""
                        """),format.raw/*595.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*596.25*/("""}"""),format.raw/*596.26*/("""
                    """),format.raw/*597.21*/("""}"""),format.raw/*597.22*/(""").then(function successCallback(response) """),format.raw/*597.64*/("""{"""),format.raw/*597.65*/("""
                        """),format.raw/*598.25*/("""$scope.users = response.data;
                    """),format.raw/*599.21*/("""}"""),format.raw/*599.22*/(""", function errorCallback(response) """),format.raw/*599.57*/("""{"""),format.raw/*599.58*/("""
                        """),format.raw/*600.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*602.30*/("""{"""),format.raw/*602.31*/("""
                            """),format.raw/*603.29*/("""$scope.conerror = "Error refreshing the user summary. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*605.25*/("""}"""),format.raw/*605.26*/("""
                    """),format.raw/*606.21*/("""}"""),format.raw/*606.22*/("""
                """),format.raw/*607.17*/(""");
            """),format.raw/*608.13*/("""}"""),format.raw/*608.14*/(""";
            $scope.InitPostView()
            $scope.loadUserSummary();
            $scope.loadUserGroups(null);

        """),format.raw/*613.9*/("""}"""),format.raw/*613.10*/(""");
</script>
</body>
</html>
"""))
      }
    }
  }

  def render(isAdmin:java.lang.Boolean): play.twirl.api.HtmlFormat.Appendable = apply(isAdmin)

  def f:((java.lang.Boolean) => play.twirl.api.HtmlFormat.Appendable) = (isAdmin) => apply(isAdmin)

  def ref: this.type = this

}


}

/**/
object posts extends posts_Scope0.posts
              /*
                  -- GENERATED --
                  DATE: Tue Sep 27 11:19:18 IST 2016
                  SOURCE: /home/si2chip/temp/si2chip2/si2chip/app/views/posts.scala.html
                  HASH: 812b8843f96694cac282284e952756c4634799dd
                  MATRIX: 756->1|880->30|908->32|1211->309|1225->315|1293->363|1355->398|1370->404|1433->446|2078->1064|2093->1070|2149->1105|2178->1106|2309->1210|2329->1221|2369->1223|2418->1244|2580->1375|2625->1392|3449->2188|3478->2189|3507->2190|3543->2198|3572->2199|3601->2200|3654->2225|3968->2511|3997->2512|4026->2513|4068->2527|4097->2528|4126->2529|4887->3261|4917->3262|4947->3263|4987->3274|5017->3275|5047->3276|5364->3565|5393->3566|5422->3567|5467->3584|5496->3585|5525->3586|7330->5362|7360->5363|7390->5364|7429->5374|7459->5375|7489->5376|7529->5387|7559->5388|7590->5389|7632->5401|7663->5402|7694->5403|8051->5731|8081->5732|8111->5733|8148->5741|8178->5742|8208->5743|8959->6465|8989->6466|9019->6467|9071->6490|9101->6491|9131->6492|9777->7109|9807->7110|9837->7111|9896->7141|9926->7142|9956->7143|10030->7188|10245->7374|10275->7375|10305->7376|10357->7399|10387->7400|10417->7401|10756->7711|10786->7712|10816->7713|10890->7757|10921->7758|10952->7759|12481->9259|12511->9260|12541->9261|12585->9275|12616->9276|12647->9277|12688->9288|12719->9289|12750->9290|12799->9309|12830->9310|12861->9311|13320->9741|13350->9742|13380->9743|13424->9758|13454->9759|13484->9760|13866->10113|13896->10114|13926->10115|13978->10138|14008->10139|14038->10140|14590->10663|14620->10664|14650->10665|14702->10688|14732->10689|14762->10690|15073->10972|15103->10973|15133->10974|15174->10986|15204->10987|15234->10988|15676->11400|15707->11401|15738->11402|15776->11410|15807->11411|15838->11412|15894->11439|15924->11440|15954->11441|15991->11449|16021->11450|16051->11451|16100->11471|16130->11472|16160->11473|16200->11484|16230->11485|16260->11486|16642->11839|16672->11840|16714->11853|16771->11881|16801->11882|16863->11915|16893->11916|16948->11943|16978->11944|17066->12003|17096->12004|17138->12017|17227->12077|17257->12078|17303->12095|17384->12147|17414->12148|17468->12173|17597->12273|17627->12274|17681->12299|17770->12359|17800->12360|17850->12381|17880->12382|17957->12430|17987->12431|18041->12456|18167->12553|18197->12554|18248->12576|18278->12577|18332->12602|18457->12698|18487->12699|18531->12714|18561->12715|18599->12725|18629->12726|18762->12829|18793->12830|18837->12845|18899->12878|18929->12879|18975->12896|19047->12939|19077->12940|19159->12993|19189->12994|19235->13011|19412->13160|19428->13166|19483->13199|19598->13285|19628->13286|19705->13334|19735->13335|19781->13352|19998->13541|20014->13547|20058->13569|20173->13655|20203->13656|20286->13710|20316->13711|20362->13728|20447->13785|20463->13791|20515->13821|20630->13907|20660->13908|20744->13963|20774->13964|20820->13981|20905->14038|20921->14044|20974->14075|21089->14161|21119->14162|21197->14211|21227->14212|21273->14229|21477->14404|21507->14405|21561->14430|21696->14536|21726->14537|21784->14566|21873->14626|21903->14627|21953->14648|21983->14649|22054->14691|22084->14692|22138->14717|22210->14760|22240->14761|22304->14796|22334->14797|22388->14822|22445->14850|22475->14851|22533->14880|22823->15141|22853->15142|22883->15143|22917->15148|22947->15149|23005->15178|23155->15299|23185->15300|23247->15333|23419->15476|23449->15477|23503->15502|23533->15503|23583->15524|23613->15525|23658->15541|23688->15542|23732->15557|23868->15664|23898->15665|23944->15682|24245->15953|24276->15954|24330->15979|24417->16037|24447->16038|24511->16073|24541->16074|24595->16099|24652->16127|24682->16128|24740->16157|24806->16194|24836->16195|24866->16196|25013->16314|25043->16315|25101->16344|25307->16521|25337->16522|25387->16543|25417->16544|25463->16561|25507->16576|25537->16577|25652->16663|25682->16664|25728->16681|25878->16802|25908->16803|25958->16824|26011->16848|26041->16849|26088->16867|26276->17026|26306->17027|26360->17052|26437->17101|26453->17107|26498->17130|26561->17164|26591->17165|26640->17185|26670->17186|26735->17222|26765->17223|26823->17252|26912->17312|26942->17313|26992->17334|27022->17335|27093->17377|27123->17378|27177->17403|27292->17489|27322->17490|27386->17525|27416->17526|27470->17551|27527->17579|27557->17580|27615->17609|27880->17845|27910->17846|27940->17847|27974->17852|28004->17853|28062->17882|28212->18003|28242->18004|28304->18037|28477->18181|28507->18182|28561->18207|28591->18208|28641->18229|28671->18230|28715->18245|28745->18246|28874->18346|28904->18347|28950->18364|29178->18563|29208->18564|29262->18589|29393->18691|29423->18692|29481->18721|29570->18781|29600->18782|29650->18803|29680->18804|29751->18846|29781->18847|29835->18872|29917->18925|29947->18926|30011->18961|30041->18962|30095->18987|30152->19015|30182->19016|30240->19045|30560->19336|30590->19337|30620->19338|30654->19343|30684->19344|30742->19373|30892->19494|30922->19495|30984->19528|31159->19674|31189->19675|31243->19700|31273->19701|31323->19722|31353->19723|31397->19738|31427->19739|31530->19813|31560->19814|31606->19831|31758->19954|31788->19955|31842->19980|31956->20065|31986->20066|32044->20095|32133->20155|32163->20156|32213->20177|32243->20178|32314->20220|32344->20221|32398->20246|32480->20299|32510->20300|32574->20335|32604->20336|32659->20362|32802->20476|32832->20477|32890->20506|33073->20660|33103->20661|33153->20682|33183->20683|33227->20698|33257->20699|33387->20800|33417->20801|33463->20818|33643->20969|33673->20970|33794->21062|33824->21063|33870->21080|34011->21192|34041->21193|34170->21293|34200->21294|34246->21311|34386->21422|34416->21423|34530->21508|34560->21509|34606->21526|34915->21806|34945->21807|35073->21906|35103->21907|35149->21924|35311->22057|35341->22058|35391->22079|35444->22103|35474->22104|35521->22122|35782->22354|35812->22355|35866->22380|36018->22503|36048->22504|36123->22550|36153->22551|36218->22587|36248->22588|36306->22617|36395->22677|36425->22678|36475->22699|36505->22700|36576->22742|36606->22743|36660->22768|36815->22894|36845->22895|36909->22930|36939->22931|36993->22956|37050->22984|37080->22985|37138->23014|37514->23361|37544->23362|37574->23363|37608->23368|37638->23369|37696->23398|37845->23518|37875->23519|37937->23552|38155->23741|38185->23742|38239->23767|38269->23768|38319->23789|38349->23790|38393->23805|38423->23806|38568->23922|38598->23923|38644->23940|38949->24216|38979->24217|39033->24242|39208->24388|39238->24389|39296->24418|39385->24478|39415->24479|39465->24500|39495->24501|39566->24543|39596->24544|39650->24569|39746->24636|39776->24637|39840->24672|39870->24673|39924->24698|39981->24726|40011->24727|40069->24756|40511->25169|40541->25170|40571->25171|40605->25176|40635->25177|40694->25207|40845->25329|40875->25330|40937->25363|41158->25555|41188->25556|41242->25581|41272->25582|41322->25603|41352->25604|41396->25619|41426->25620|41551->25716|41581->25717|41627->25734|41853->25931|41883->25932|41937->25957|42051->26042|42081->26043|42139->26072|42228->26132|42258->26133|42308->26154|42338->26155|42409->26197|42439->26198|42493->26223|42598->26299|42628->26300|42692->26335|42722->26336|42776->26361|42918->26474|42948->26475|43006->26504|43241->26710|43271->26711|43321->26732|43351->26733|43395->26748|43425->26749|43577->26872|43607->26873|43653->26890|43913->27121|43943->27122|44086->27236|44116->27237|44162->27254|44379->27442|44409->27443|44560->27565|44590->27566|44636->27583|44856->27774|44886->27775|44982->27842|45012->27843|45058->27860|45260->28033|45290->28034|45425->28140|45455->28141|45501->28158|45979->28607|46009->28608|46159->28729|46189->28730|46235->28747|46362->28845|46392->28846|46442->28867|46957->29353|46987->29354|47017->29355|47051->29360|47081->29361|47131->29382|47246->29468|47276->29469|47318->29482|47348->29483|47461->29567|47491->29568|47537->29585|47892->29911|47922->29912|47966->29927|48031->29963|48061->29964|48107->29981|48213->30058|48243->30059|48297->30084|48373->30132|48389->30138|48441->30168|48507->30205|48537->30206|48591->30231|48680->30291|48710->30292|48760->30313|48790->30314|48861->30356|48891->30357|48945->30382|49024->30432|49054->30433|49118->30468|49148->30469|49202->30494|49344->30607|49374->30608|49432->30637|49606->30782|49636->30783|49686->30804|49716->30805|49762->30822|49806->30837|49836->30838|49988->30962|50018->30963
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|53->22|53->22|53->22|53->22|57->26|57->26|57->26|58->27|59->28|60->29|75->44|75->44|75->44|75->44|75->44|75->44|76->45|86->55|86->55|86->55|86->55|86->55|86->55|98->67|98->67|98->67|98->67|98->67|98->67|105->74|105->74|105->74|105->74|105->74|105->74|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|132->101|137->106|137->106|137->106|137->106|137->106|137->106|143->112|143->112|143->112|143->112|143->112|143->112|151->120|151->120|151->120|151->120|151->120|151->120|152->121|157->126|157->126|157->126|157->126|157->126|157->126|162->131|162->131|162->131|162->131|162->131|162->131|179->148|179->148|179->148|179->148|179->148|179->148|179->148|179->148|179->148|179->148|179->148|179->148|184->153|184->153|184->153|184->153|184->153|184->153|191->160|191->160|191->160|191->160|191->160|191->160|197->166|197->166|197->166|197->166|197->166|197->166|206->175|206->175|206->175|206->175|206->175|206->175|212->181|212->181|212->181|212->181|212->181|212->181|213->182|213->182|213->182|213->182|213->182|213->182|213->182|213->182|213->182|213->182|213->182|213->182|226->195|226->195|227->196|227->196|227->196|227->196|227->196|228->197|228->197|230->199|230->199|231->200|232->201|232->201|233->202|234->203|234->203|235->204|237->206|237->206|238->207|239->208|239->208|240->209|240->209|241->210|241->210|242->211|244->213|244->213|244->213|244->213|245->214|247->216|247->216|248->217|248->217|249->218|249->218|251->220|251->220|254->223|254->223|254->223|255->224|256->225|256->225|258->227|258->227|259->228|262->231|262->231|262->231|264->233|264->233|266->235|266->235|267->236|271->240|271->240|271->240|273->242|273->242|275->244|275->244|276->245|277->246|277->246|277->246|279->248|279->248|281->250|281->250|282->251|283->252|283->252|283->252|285->254|285->254|287->256|287->256|288->257|292->261|292->261|293->262|295->264|295->264|296->265|297->266|297->266|298->267|298->267|298->267|298->267|299->268|300->269|300->269|300->269|300->269|301->270|301->270|301->270|302->271|304->273|304->273|304->273|304->273|304->273|305->274|307->276|307->276|308->277|310->279|310->279|311->280|311->280|312->281|312->281|313->282|313->282|315->284|316->285|316->285|317->286|322->291|322->291|323->292|324->293|324->293|324->293|324->293|325->294|325->294|325->294|326->295|327->296|327->296|327->296|329->298|329->298|330->299|332->301|332->301|333->302|333->302|334->303|335->304|335->304|338->307|338->307|339->308|342->311|342->311|343->312|344->313|344->313|346->315|350->319|350->319|351->320|352->321|352->321|352->321|353->322|353->322|353->322|353->322|354->323|354->323|355->324|356->325|356->325|357->326|357->326|357->326|357->326|358->327|360->329|360->329|360->329|360->329|361->330|361->330|361->330|362->331|364->333|364->333|364->333|364->333|364->333|365->334|367->336|367->336|368->337|370->339|370->339|371->340|371->340|372->341|372->341|373->342|373->342|376->345|376->345|377->346|383->352|383->352|384->353|386->355|386->355|387->356|388->357|388->357|389->358|389->358|389->358|389->358|390->359|391->360|391->360|391->360|391->360|392->361|392->361|392->361|393->362|395->364|395->364|395->364|395->364|395->364|396->365|398->367|398->367|399->368|401->370|401->370|402->371|402->371|403->372|403->372|404->373|404->373|407->376|407->376|408->377|411->380|411->380|412->381|414->383|414->383|415->384|416->385|416->385|417->386|417->386|417->386|417->386|418->387|419->388|419->388|419->388|419->388|420->389|422->391|422->391|423->392|425->394|425->394|426->395|426->395|427->396|427->396|430->399|430->399|431->400|434->403|434->403|437->406|437->406|438->407|440->409|440->409|443->412|443->412|444->413|446->415|446->415|449->418|449->418|450->419|456->425|456->425|459->428|459->428|460->429|463->432|463->432|464->433|465->434|465->434|467->436|471->440|471->440|472->441|474->443|474->443|474->443|474->443|475->444|475->444|476->445|477->446|477->446|478->447|478->447|478->447|478->447|479->448|481->450|481->450|481->450|481->450|482->451|482->451|482->451|483->452|485->454|485->454|485->454|485->454|485->454|486->455|488->457|488->457|489->458|491->460|491->460|492->461|492->461|493->462|493->462|494->463|494->463|497->466|497->466|498->467|504->473|504->473|505->474|507->476|507->476|508->477|509->478|509->478|510->479|510->479|510->479|510->479|511->480|512->481|512->481|512->481|512->481|513->482|513->482|513->482|514->483|516->485|516->485|516->485|516->485|516->485|517->486|519->488|519->488|520->489|522->491|522->491|523->492|523->492|524->493|524->493|525->494|525->494|528->497|528->497|529->498|532->501|532->501|533->502|535->504|535->504|536->505|537->506|537->506|538->507|538->507|538->507|538->507|539->508|540->509|540->509|540->509|540->509|541->510|543->512|543->512|544->513|546->515|546->515|547->516|547->516|548->517|548->517|551->520|551->520|552->521|555->524|555->524|558->527|558->527|559->528|561->530|561->530|564->533|564->533|565->534|567->536|567->536|569->538|569->538|570->539|573->542|573->542|577->546|577->546|578->547|585->554|585->554|588->557|588->557|589->558|590->559|590->559|591->560|601->570|601->570|601->570|601->570|601->570|602->571|603->572|603->572|604->573|604->573|608->577|608->577|609->578|617->586|617->586|619->588|619->588|619->588|620->589|622->591|622->591|623->592|624->593|624->593|624->593|625->594|625->594|626->595|627->596|627->596|628->597|628->597|628->597|628->597|629->598|630->599|630->599|630->599|630->599|631->600|633->602|633->602|634->603|636->605|636->605|637->606|637->606|638->607|639->608|639->608|644->613|644->613
                  -- GENERATED --
              */
          