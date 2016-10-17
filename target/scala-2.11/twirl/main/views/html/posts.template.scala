
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
            <img src="""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("images/l46.png")),format.raw/*22.64*/(""" """),format.raw/*22.65*/("""class="logo">
        </div>

        <ul class="nav navbar-nav navbar-right">>
            """),_display_(/*26.14*/if(isAdmin)/*26.25*/ {_display_(Seq[Any](format.raw/*26.27*/("""
            """),format.raw/*27.13*/("""<li><a href="#" ng-click="showAdminPage($event)"><span class="glyphicon glyphicon-bishop"></span> Admin </a></li>
            """)))}),format.raw/*28.14*/("""
            """),format.raw/*29.13*/("""<li><a href="#" ng-click="showGroupsPage($event)">Groups</a></li>
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
                        """),format.raw/*45.25*/("""{"""),format.raw/*45.26*/("""{"""),format.raw/*45.27*/("""conerror"""),format.raw/*45.35*/("""}"""),format.raw/*45.36*/("""}"""),format.raw/*45.37*/("""
                    """),format.raw/*46.21*/("""</div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-4 col-md-offset-7">
            <div class="text-right">
                <span class="who">"""),format.raw/*56.35*/("""{"""),format.raw/*56.36*/("""{"""),format.raw/*56.37*/("""loggedInUser()"""),format.raw/*56.51*/("""}"""),format.raw/*56.52*/("""}"""),format.raw/*56.53*/("""</span><span></span>
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
                    <li><a href="#" ng-click="changeGroup('None')" class="list-group-item list-group-item-success" data-toggle="tooltip" data-placement="right">Home</a></li>
                    <li ng-repeat="grp in allUserGroups track by grp.groupId"  class="list-group-item list-group-item-success" data-toggle="tooltip" data-placement="right"><a href="#" ng-click="changeGroup(grp.groupId)">"""),format.raw/*68.221*/("""{"""),format.raw/*68.222*/("""{"""),format.raw/*68.223*/("""grp.groupId"""),format.raw/*68.234*/("""}"""),format.raw/*68.235*/("""}"""),format.raw/*68.236*/("""</a></li>
                </ul>
            </div>
        </div>
        <div class="col-md-7 ">
            <div class="well well-lg">
                <div id="changegroupError"></div>
                <h4 id="poststitle">Posts <span class="badge">"""),format.raw/*75.63*/("""{"""),format.raw/*75.64*/("""{"""),format.raw/*75.65*/("""postpage.numPosts"""),format.raw/*75.82*/("""}"""),format.raw/*75.83*/("""}"""),format.raw/*75.84*/("""</span></h4>
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
                        <h6 class="postedby"><span class="user">"""),format.raw/*102.65*/("""{"""),format.raw/*102.66*/("""{"""),format.raw/*102.67*/("""pst.userId"""),format.raw/*102.77*/("""}"""),format.raw/*102.78*/("""}"""),format.raw/*102.79*/("""</span> on """),format.raw/*102.90*/("""{"""),format.raw/*102.91*/("""{"""),format.raw/*102.92*/("""pst.postedOn"""),format.raw/*102.104*/("""}"""),format.raw/*102.105*/("""}"""),format.raw/*102.106*/("""</h6>
                        <a href="#" ng-click="deletePost($event,pst.id)" class="btn btn-info btn-xs">
                            <span class="glyphicon glyphicon-remove"></span>
                        </a>
                    </div>
                    <div class="postmsg"><span>"""),format.raw/*107.48*/("""{"""),format.raw/*107.49*/("""{"""),format.raw/*107.50*/("""pst.post"""),format.raw/*107.58*/("""}"""),format.raw/*107.59*/("""}"""),format.raw/*107.60*/("""</span></div>

                    <div class="text-right">

                        <a href="#" ng-click="count= count + 1" ng-init="count=0">Likes</button><span> :"""),format.raw/*111.105*/("""{"""),format.raw/*111.106*/("""{"""),format.raw/*111.107*/("""count"""),format.raw/*111.112*/("""}"""),format.raw/*111.113*/("""}"""),format.raw/*111.114*/("""</span>
                        </a>
                        <a href="#" ng-click="toggleCommentsEditor($event, $index)">Comments<span ng-show="!angular.isUndefined(postpage.arr[$index].bShow) && postpage.arr[$index].bShow" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(postpage.arr[$index].bShow) || !postpage.arr[$index].bShow" class="glyphicon glyphicon-menu-down"></span>
                        </a>
                    </div>
                    <div class="well well-md" ng-show="!angular.isUndefined(postpage.arr[$index].bShow) && postpage.arr[$index].bShow">
                        <div class="modal fade" id=""""),format.raw/*117.53*/("""{"""),format.raw/*117.54*/("""{"""),format.raw/*117.55*/("""postpage.arr[$index].id"""),format.raw/*117.78*/("""}"""),format.raw/*117.79*/("""}"""),format.raw/*117.80*/("""" role="dialog">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <span>An error occurred transacting with the server.</span>
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                    </div>
                                    <div class="modal-body">
                                        """),format.raw/*125.41*/("""{"""),format.raw/*125.42*/("""{"""),format.raw/*125.43*/("""postpage.arr[$index].cconerror"""),format.raw/*125.73*/("""}"""),format.raw/*125.74*/("""}"""),format.raw/*125.75*/("""
                                    """),format.raw/*126.37*/("""</div>
                                </div>
                            </div>
                        </div>

                        <div id="delError"""),format.raw/*131.42*/("""{"""),format.raw/*131.43*/("""{"""),format.raw/*131.44*/("""postpage.arr[$index].id"""),format.raw/*131.67*/("""}"""),format.raw/*131.68*/("""}"""),format.raw/*131.69*/(""""></div>
                        <table class="table">
                            <thead>
                            <tr>
                                <div class="text-center">
                                    <h4 id="commentstitle">Comments <span class="badge">"""),format.raw/*136.89*/("""{"""),format.raw/*136.90*/("""{"""),format.raw/*136.91*/("""postpage.arr[$index].commentpage.numComments"""),format.raw/*136.135*/("""}"""),format.raw/*136.136*/("""}"""),format.raw/*136.137*/("""</span></h4>
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
                                        <h6 class="commentedby"><span class="user">"""),format.raw/*153.84*/("""{"""),format.raw/*153.85*/("""{"""),format.raw/*153.86*/("""comment.userId"""),format.raw/*153.100*/("""}"""),format.raw/*153.101*/("""}"""),format.raw/*153.102*/("""</span> on """),format.raw/*153.113*/("""{"""),format.raw/*153.114*/("""{"""),format.raw/*153.115*/("""comment.commentedOn"""),format.raw/*153.134*/("""}"""),format.raw/*153.135*/("""}"""),format.raw/*153.136*/("""</h6>
                                        <a href="#" ng-click="deleteComment($event,$parent.$index,comment.id)" class="btn btn-success btn-xs">
                                            <span class="glyphicon glyphicon-remove"></span>
                                        </a>
                                    </div>
                                    <div class="commentmsg">"""),format.raw/*158.61*/("""{"""),format.raw/*158.62*/("""{"""),format.raw/*158.63*/("""comment.comment"""),format.raw/*158.78*/("""}"""),format.raw/*158.79*/("""}"""),format.raw/*158.80*/("""</div>
                                <td>
                            </tr>
                            </tbody>
                        </table>
                        <form role="form">
                            <div class="form-group">
                                <textarea id="comment"""),format.raw/*165.54*/("""{"""),format.raw/*165.55*/("""{"""),format.raw/*165.56*/("""postpage.arr[$index].id"""),format.raw/*165.79*/("""}"""),format.raw/*165.80*/("""}"""),format.raw/*165.81*/("""" ng-model="postpage.arr[$index].comment" maxlength="2000" class="form-control" required placeholder="Enter your comment here"></textarea>
                            </div>
                            <div class="text-right">
                                <button type="submit" ng-click="addComment($event, $index)" class="btn btn-success btn-xs">Comment</button>
                            </div>
                        </form>
                        <div id="addError"""),format.raw/*171.42*/("""{"""),format.raw/*171.43*/("""{"""),format.raw/*171.44*/("""postpage.arr[$index].id"""),format.raw/*171.67*/("""}"""),format.raw/*171.68*/("""}"""),format.raw/*171.69*/(""""></div>
                    </div>
                </div>
            </div>

        </div>
        <div class="col-md-3 sidenav ">

            <div class="text-center">
                <h4 id="summarytitle">users List <span class="badge">"""),format.raw/*180.70*/("""{"""),format.raw/*180.71*/("""{"""),format.raw/*180.72*/("""users.length"""),format.raw/*180.84*/("""}"""),format.raw/*180.85*/("""}"""),format.raw/*180.86*/("""</span></h4>

            </div>
            <div class="text-left">
                <ul class="list-group">
                    <li ng-repeat="x in users | orderBy : 'userId':false" class="list-group-item list-group-item-success" data-toggle="tooltip" data-placement="right" title=""""),format.raw/*185.175*/("""{"""),format.raw/*185.176*/("""{"""),format.raw/*185.177*/("""x.userId"""),format.raw/*185.185*/("""}"""),format.raw/*185.186*/("""}"""),format.raw/*185.187*/("""">
                        """),format.raw/*186.25*/("""{"""),format.raw/*186.26*/("""{"""),format.raw/*186.27*/("""x.userId"""),format.raw/*186.35*/("""}"""),format.raw/*186.36*/("""}"""),format.raw/*186.37*/("""

                    """),format.raw/*188.21*/("""</li>
                </ul>
            </div>
            </td>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
        //todo: progress indicator
        //todo: error message timing

        var app = angular.module('posts',  ["ngCookies"]);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*201.80*/("""{"""),format.raw/*201.81*/("""
            """),format.raw/*202.13*/("""$locationProvider.html5Mode("""),format.raw/*202.41*/("""{"""),format.raw/*202.42*/("""enabled: true, requireBase: false"""),format.raw/*202.75*/("""}"""),format.raw/*202.76*/(""").hashPrefix('*');
        """),format.raw/*203.9*/("""}"""),format.raw/*203.10*/("""]);

         app.service("GroupSvc", function($http, $q) """),format.raw/*205.54*/("""{"""),format.raw/*205.55*/("""
            """),format.raw/*206.13*/("""var deferred;
            this.getMyGroups = function (uId) """),format.raw/*207.47*/("""{"""),format.raw/*207.48*/("""
                """),format.raw/*208.17*/("""deferred = $q.defer();
                return $http("""),format.raw/*209.30*/("""{"""),format.raw/*209.31*/("""
                        """),format.raw/*210.25*/("""method : "GET",
                        url : "/mygroups/" + uId,
                        headers : """),format.raw/*212.35*/("""{"""),format.raw/*212.36*/("""
                        """),format.raw/*213.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*214.25*/("""}"""),format.raw/*214.26*/("""
                    """),format.raw/*215.21*/("""}"""),format.raw/*215.22*/(""")
                    .then(function (response) """),format.raw/*216.47*/("""{"""),format.raw/*216.48*/("""
                        """),format.raw/*217.25*/("""deferred.resolve(response);
                        return deferred.promise;
                    """),format.raw/*219.21*/("""}"""),format.raw/*219.22*/(""", function (response) """),format.raw/*219.44*/("""{"""),format.raw/*219.45*/("""
                        """),format.raw/*220.25*/("""deferred.reject(response);
                        return deferred.promise;
                    """),format.raw/*222.21*/("""}"""),format.raw/*222.22*/(""");
            """),format.raw/*223.13*/("""}"""),format.raw/*223.14*/(""";
        """),format.raw/*224.9*/("""}"""),format.raw/*224.10*/(""");

        app.controller('postsCtrl', function($scope, $http, $location, $cookies, $window,GroupSvc) """),format.raw/*226.100*/("""{"""),format.raw/*226.101*/("""


            """),format.raw/*229.13*/("""$scope.loggedInUser = function() """),format.raw/*229.46*/("""{"""),format.raw/*229.47*/("""
                """),format.raw/*230.17*/("""return $cookies.get("userId");
            """),format.raw/*231.13*/("""}"""),format.raw/*231.14*/(""";

            $scope.showForbiddenPage = function() """),format.raw/*233.51*/("""{"""),format.raw/*233.52*/("""
                """),format.raw/*234.17*/("""$cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*237.34*/routes/*237.40*/.HomeController.showForbiddenPage),format.raw/*237.73*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*239.13*/("""}"""),format.raw/*239.14*/(""";

            $scope.signOut = function(event) """),format.raw/*241.46*/("""{"""),format.raw/*241.47*/("""
                """),format.raw/*242.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*246.34*/routes/*246.40*/.HomeController.logout),format.raw/*246.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*248.13*/("""}"""),format.raw/*248.14*/(""";

            $scope.showAdminPage = function(event) """),format.raw/*250.52*/("""{"""),format.raw/*250.53*/("""
                """),format.raw/*251.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*252.34*/routes/*252.40*/.AdminController.showAdminPage),format.raw/*252.70*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*254.13*/("""}"""),format.raw/*254.14*/(""";

            $scope.showGroupsPage = function(event) """),format.raw/*256.53*/("""{"""),format.raw/*256.54*/("""
                """),format.raw/*257.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*258.34*/routes/*258.40*/.GroupController.showGroupsPage),format.raw/*258.71*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*260.13*/("""}"""),format.raw/*260.14*/(""";

             // change the group post

                $scope.changeGroup= function(gId) """),format.raw/*264.51*/("""{"""),format.raw/*264.52*/("""

                """),format.raw/*266.17*/("""if($scope.gId == "")
                    $scope.loadAllUsers();
                else
                    $scope.loadAllGroupUsers(gId);


                $scope.conerror = "";
                $scope.changegrouperror = "";
                $("#changegroupError").html("");
                $http("""),format.raw/*275.23*/("""{"""),format.raw/*275.24*/("""
                        """),format.raw/*276.25*/("""method : "PUT",
                        url : "/usergroup" + '/' + gId,
                        headers : """),format.raw/*278.35*/("""{"""),format.raw/*278.36*/("""
                            """),format.raw/*279.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*280.25*/("""}"""),format.raw/*280.26*/("""
                    """),format.raw/*281.21*/("""}"""),format.raw/*281.22*/(""").then(function successCallback(response) """),format.raw/*281.64*/("""{"""),format.raw/*281.65*/("""
                        """),format.raw/*282.25*/("""$scope.InitPostView();

                    """),format.raw/*284.21*/("""}"""),format.raw/*284.22*/(""", function errorCallback(response) """),format.raw/*284.57*/("""{"""),format.raw/*284.58*/("""
                        """),format.raw/*285.25*/("""if (response.status == 400) """),format.raw/*285.53*/("""{"""),format.raw/*285.54*/("""
                            """),format.raw/*286.29*/("""$scope.changegrouperror = response.data.error;
                            $("#changegroupError").html("<div id='cgErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.changegrouperror + "</div>");
                        """),format.raw/*288.25*/("""}"""),format.raw/*288.26*/(""" """),format.raw/*288.27*/("""else """),format.raw/*288.32*/("""{"""),format.raw/*288.33*/("""
                            """),format.raw/*289.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*291.34*/("""{"""),format.raw/*291.35*/("""
                                """),format.raw/*292.33*/("""$scope.conerror = "Error changing the group. Retry";
                                $('#conError').modal('show');
                            """),format.raw/*294.29*/("""}"""),format.raw/*294.30*/("""
                        """),format.raw/*295.25*/("""}"""),format.raw/*295.26*/("""
                    """),format.raw/*296.21*/("""}"""),format.raw/*296.22*/(""");
             """),format.raw/*297.14*/("""}"""),format.raw/*297.15*/("""


             """),format.raw/*300.14*/("""// loads all the groups in which this user is a member
            $scope.loadUserGroups = function(event) """),format.raw/*301.53*/("""{"""),format.raw/*301.54*/("""
                """),format.raw/*302.17*/("""//if (lf.userId.$error.required || lf.userId.$error.email)
                   // return;

                $scope.conerror = "";
                $scope.allUserGroups = [];
                GroupSvc.getMyGroups($scope.loggedInUser()).then(function successCallback(response) """),format.raw/*307.101*/("""{"""),format.raw/*307.102*/("""
                        """),format.raw/*308.25*/("""$scope.allUserGroups = response.data;
                    """),format.raw/*309.21*/("""}"""),format.raw/*309.22*/(""", function errorCallback(response) """),format.raw/*309.57*/("""{"""),format.raw/*309.58*/("""
                        """),format.raw/*310.25*/("""if (response.status == 400) """),format.raw/*310.53*/("""{"""),format.raw/*310.54*/("""
                            """),format.raw/*311.29*/("""//do nothing
                        """),format.raw/*312.25*/("""}"""),format.raw/*312.26*/(""" """),format.raw/*312.27*/("""else if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*314.30*/("""{"""),format.raw/*314.31*/("""
                            """),format.raw/*315.29*/("""$scope.conerror = "Error refreshing the list of groups in which the user is a member. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*317.25*/("""}"""),format.raw/*317.26*/("""
                    """),format.raw/*318.21*/("""}"""),format.raw/*318.22*/("""
                """),format.raw/*319.17*/(""");
            """),format.raw/*320.13*/("""}"""),format.raw/*320.14*/(""";


            // add post event handler
            $scope.addPost = function(event) """),format.raw/*324.46*/("""{"""),format.raw/*324.47*/("""
                """),format.raw/*325.17*/("""event.preventDefault();

                // validate the posts form
                if ($scope.apf.post.$error.required) """),format.raw/*328.54*/("""{"""),format.raw/*328.55*/("""
                    """),format.raw/*329.21*/("""return;
                """),format.raw/*330.17*/("""}"""),format.raw/*330.18*/("""

                """),format.raw/*332.17*/("""// post the message
                $scope.conerror = "";
                $scope.adderror = "";
                $("#addError").html("");
                $http("""),format.raw/*336.23*/("""{"""),format.raw/*336.24*/("""
                        """),format.raw/*337.25*/("""method : "POST",
                        url : """"),_display_(/*338.33*/routes/*338.39*/.PostController.addPost),format.raw/*338.62*/("""",
                        data : """),format.raw/*339.32*/("""{"""),format.raw/*339.33*/(""""post" : $scope.post"""),format.raw/*339.53*/("""}"""),format.raw/*339.54*/(""",
                        headers : """),format.raw/*340.35*/("""{"""),format.raw/*340.36*/("""
                            """),format.raw/*341.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*342.25*/("""}"""),format.raw/*342.26*/("""
                    """),format.raw/*343.21*/("""}"""),format.raw/*343.22*/(""").then(function successCallback(response) """),format.raw/*343.64*/("""{"""),format.raw/*343.65*/("""
                        """),format.raw/*344.25*/("""$scope.post = "";
                        $scope.loadFirstPage();
                    """),format.raw/*346.21*/("""}"""),format.raw/*346.22*/(""", function errorCallback(response) """),format.raw/*346.57*/("""{"""),format.raw/*346.58*/("""
                        """),format.raw/*347.25*/("""if (response.status == 400) """),format.raw/*347.53*/("""{"""),format.raw/*347.54*/("""
                            """),format.raw/*348.29*/("""$scope.adderror = response.data.error;
                            $("#addError").html("<div id='aErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.adderror + "</div>");
                        """),format.raw/*350.25*/("""}"""),format.raw/*350.26*/(""" """),format.raw/*350.27*/("""else """),format.raw/*350.32*/("""{"""),format.raw/*350.33*/("""
                            """),format.raw/*351.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*353.34*/("""{"""),format.raw/*353.35*/("""
                                """),format.raw/*354.33*/("""$scope.conerror = "Error posting the message. Retry";
                                $('#conError').modal('show');
                            """),format.raw/*356.29*/("""}"""),format.raw/*356.30*/("""
                        """),format.raw/*357.25*/("""}"""),format.raw/*357.26*/("""
                    """),format.raw/*358.21*/("""}"""),format.raw/*358.22*/(""");
            """),format.raw/*359.13*/("""}"""),format.raw/*359.14*/(""";

            // delete post event handler
            $scope.deletePost = function(event, postId) """),format.raw/*362.57*/("""{"""),format.raw/*362.58*/("""
                """),format.raw/*363.17*/("""event.preventDefault();

                // delete the post
                $scope.conerror = "";
                $scope.delerror = "";
                $("#delError").html("");
                $http("""),format.raw/*369.23*/("""{"""),format.raw/*369.24*/("""
                        """),format.raw/*370.25*/("""method : "DELETE",
                        url : "/post/" + postId,
                        headers : """),format.raw/*372.35*/("""{"""),format.raw/*372.36*/("""
                            """),format.raw/*373.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*374.25*/("""}"""),format.raw/*374.26*/("""
                    """),format.raw/*375.21*/("""}"""),format.raw/*375.22*/(""").then(function successCallback(response) """),format.raw/*375.64*/("""{"""),format.raw/*375.65*/("""
                        """),format.raw/*376.25*/("""$scope.refreshCurrentPage(null);
                    """),format.raw/*377.21*/("""}"""),format.raw/*377.22*/(""", function errorCallback(response) """),format.raw/*377.57*/("""{"""),format.raw/*377.58*/("""
                        """),format.raw/*378.25*/("""if (response.status == 400) """),format.raw/*378.53*/("""{"""),format.raw/*378.54*/("""
                            """),format.raw/*379.29*/("""$scope.delerror = response.data.error + ". Refresh the current page if post does not exist.";
                            $("#delError").html("<div id='dErr' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.delerror + "</div>");
                        """),format.raw/*381.25*/("""}"""),format.raw/*381.26*/(""" """),format.raw/*381.27*/("""else """),format.raw/*381.32*/("""{"""),format.raw/*381.33*/("""
                            """),format.raw/*382.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*384.34*/("""{"""),format.raw/*384.35*/("""
                                """),format.raw/*385.33*/("""$scope.conerror = "Error deleting the message. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*387.29*/("""}"""),format.raw/*387.30*/("""
                        """),format.raw/*388.25*/("""}"""),format.raw/*388.26*/("""
                    """),format.raw/*389.21*/("""}"""),format.raw/*389.22*/(""");
            """),format.raw/*390.13*/("""}"""),format.raw/*390.14*/(""";

            // page loader
            $scope.loadPage = function(url) """),format.raw/*393.45*/("""{"""),format.raw/*393.46*/("""
                """),format.raw/*394.17*/("""$scope.delerror = "";
                $("#delError").html("");
                $scope.conerror = "";
                $http("""),format.raw/*397.23*/("""{"""),format.raw/*397.24*/("""
                        """),format.raw/*398.25*/("""method : "GET",
                        url : url,
                        headers : """),format.raw/*400.35*/("""{"""),format.raw/*400.36*/("""
                            """),format.raw/*401.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*402.25*/("""}"""),format.raw/*402.26*/("""
                    """),format.raw/*403.21*/("""}"""),format.raw/*403.22*/(""").then(function successCallback(response) """),format.raw/*403.64*/("""{"""),format.raw/*403.65*/("""
                        """),format.raw/*404.25*/("""$scope.postpage = response.data;
                    """),format.raw/*405.21*/("""}"""),format.raw/*405.22*/(""", function errorCallback(response) """),format.raw/*405.57*/("""{"""),format.raw/*405.58*/("""
                         """),format.raw/*406.26*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                         else """),format.raw/*408.31*/("""{"""),format.raw/*408.32*/("""
                            """),format.raw/*409.29*/("""$scope.conerror = "Error retrieving the page from the server. Retry.";
                            $('#conError').modal('show');
                         """),format.raw/*411.26*/("""}"""),format.raw/*411.27*/("""
                    """),format.raw/*412.21*/("""}"""),format.raw/*412.22*/(""");
            """),format.raw/*413.13*/("""}"""),format.raw/*413.14*/(""";

            // refreshes the current page
            $scope.refreshCurrentPage = function(event) """),format.raw/*416.57*/("""{"""),format.raw/*416.58*/("""
                """),format.raw/*417.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadPage("/posts/refresh/" + $scope.postpage.endId);
            """),format.raw/*420.13*/("""}"""),format.raw/*420.14*/(""";

            // next page event handler
            $scope.loadNextPage = function(event) """),format.raw/*423.51*/("""{"""),format.raw/*423.52*/("""
                """),format.raw/*424.17*/("""event.preventDefault();
                $scope.loadPage("/posts/after/" + $scope.postpage.beginId);
            """),format.raw/*426.13*/("""}"""),format.raw/*426.14*/(""";

            // previous page event handler
            $scope.loadPreviousPage = function(event) """),format.raw/*429.55*/("""{"""),format.raw/*429.56*/("""
                """),format.raw/*430.17*/("""event.preventDefault();
                $scope.loadPage("/posts/before/" + $scope.postpage.endId);
            """),format.raw/*432.13*/("""}"""),format.raw/*432.14*/(""";

            // loads the first page
            $scope.loadFirstPage = function() """),format.raw/*435.47*/("""{"""),format.raw/*435.48*/("""
                """),format.raw/*436.17*/("""$scope.postpage.numPosts = "0";
                $scope.postpage.bLastPage = false;
                $scope.postpage.arr = [];
                $scope.postpage.beginId = "-1";
                $scope.postpage.endId = "-1";
                $scope.loadPage("/posts/first");
            """),format.raw/*442.13*/("""}"""),format.raw/*442.14*/(""";

            // add comment event handler
            $scope.addComment = function(event, index) """),format.raw/*445.56*/("""{"""),format.raw/*445.57*/("""
                """),format.raw/*446.17*/("""event.preventDefault();

                // validate the comments form
                if ($scope.postpage.arr[index].comment == "") """),format.raw/*449.63*/("""{"""),format.raw/*449.64*/("""
                    """),format.raw/*450.21*/("""return;
                """),format.raw/*451.17*/("""}"""),format.raw/*451.18*/("""

                """),format.raw/*453.17*/("""// add the comment
                $scope.postpage.arr[index].cconerror = "";
                $scope.postpage.arr[index].cadderror = "";
                $("#addError" + $scope.postpage.arr[index].id).html("");
                $http("""),format.raw/*457.23*/("""{"""),format.raw/*457.24*/("""
                        """),format.raw/*458.25*/("""method : "POST",
                        url : "/comment/" + $scope.postpage.arr[index].id,
                        data : """),format.raw/*460.32*/("""{"""),format.raw/*460.33*/(""""comment" : $scope.postpage.arr[index].comment"""),format.raw/*460.79*/("""}"""),format.raw/*460.80*/(""",
                        headers : """),format.raw/*461.35*/("""{"""),format.raw/*461.36*/("""
                            """),format.raw/*462.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*463.25*/("""}"""),format.raw/*463.26*/("""
                    """),format.raw/*464.21*/("""}"""),format.raw/*464.22*/(""").then(function successCallback(response) """),format.raw/*464.64*/("""{"""),format.raw/*464.65*/("""
                        """),format.raw/*465.25*/("""$scope.postpage.arr[index].comment = "";
                        $scope.loadCommentLastPage(null, index);
                    """),format.raw/*467.21*/("""}"""),format.raw/*467.22*/(""", function errorCallback(response) """),format.raw/*467.57*/("""{"""),format.raw/*467.58*/("""
                        """),format.raw/*468.25*/("""if (response.status == 400) """),format.raw/*468.53*/("""{"""),format.raw/*468.54*/("""
                            """),format.raw/*469.29*/("""$scope.postpage.arr[index].cadderror = response.data.error;
                            $("#addError" + $scope.postpage.arr[index].id).html("<div id='aErr" + $scope.postpage.arr[index].id + "' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.postpage.arr[index].cadderror + "</div>");
                        """),format.raw/*471.25*/("""}"""),format.raw/*471.26*/(""" """),format.raw/*471.27*/("""else """),format.raw/*471.32*/("""{"""),format.raw/*471.33*/("""
                            """),format.raw/*472.29*/("""if (response.status == 403)
                               $scope.showForbiddenPage();
                            else """),format.raw/*474.34*/("""{"""),format.raw/*474.35*/("""
                                """),format.raw/*475.33*/("""$scope.postpage.arr[index].cconerror = "Error posting the comment. Retry";
                                $('#' + $scope.postpage.arr[index].id).modal('show');
                            """),format.raw/*477.29*/("""}"""),format.raw/*477.30*/("""
                        """),format.raw/*478.25*/("""}"""),format.raw/*478.26*/("""
                    """),format.raw/*479.21*/("""}"""),format.raw/*479.22*/(""");
            """),format.raw/*480.13*/("""}"""),format.raw/*480.14*/(""";

            // delete comment event handler
            $scope.deleteComment = function(event, index, commentId) """),format.raw/*483.70*/("""{"""),format.raw/*483.71*/("""
                """),format.raw/*484.17*/("""event.preventDefault();

                // delete the comment
                $scope.postpage.arr[index].cconerror = "";
                $scope.postpage.arr[index].cdelerror = "";
                $("#delError" + $scope.postpage.arr[index].id).html("");
                $http("""),format.raw/*490.23*/("""{"""),format.raw/*490.24*/("""
                        """),format.raw/*491.25*/("""method : "DELETE",
                        url : "/comment/" + $scope.postpage.arr[index].id + "/" + commentId,
                        headers : """),format.raw/*493.35*/("""{"""),format.raw/*493.36*/("""
                            """),format.raw/*494.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*495.25*/("""}"""),format.raw/*495.26*/("""
                    """),format.raw/*496.21*/("""}"""),format.raw/*496.22*/(""").then(function successCallback(response) """),format.raw/*496.64*/("""{"""),format.raw/*496.65*/("""
                        """),format.raw/*497.25*/("""$scope.refreshCommentCurrentPage(null, index);
                    """),format.raw/*498.21*/("""}"""),format.raw/*498.22*/(""", function errorCallback(response) """),format.raw/*498.57*/("""{"""),format.raw/*498.58*/("""
                        """),format.raw/*499.25*/("""if (response.status == 400) """),format.raw/*499.53*/("""{"""),format.raw/*499.54*/("""
                            """),format.raw/*500.29*/("""$scope.postpage.arr[index].cdelerror = response.data.error + ". Refresh the current comment page if comment does not exist.";
                            $("#delError" + $scope.postpage.arr[index].id).html("<div id='dErr" + $scope.postpage.arr[index].id + "' class='alert alert-danger'><a class='close' data-dismiss='alert'>&times;</a>" + $scope.postpage.arr[index].cdelerror + "</div>");
                        """),format.raw/*502.25*/("""}"""),format.raw/*502.26*/(""" """),format.raw/*502.27*/("""else """),format.raw/*502.32*/("""{"""),format.raw/*502.33*/("""
                             """),format.raw/*503.30*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                             else """),format.raw/*505.35*/("""{"""),format.raw/*505.36*/("""
                                """),format.raw/*506.33*/("""$scope.postpage.arr[index].cconerror = "Error deleting the comment. Retry.";
                                $('#' + $scope.postpage.arr[index].id).modal('show');
                             """),format.raw/*508.30*/("""}"""),format.raw/*508.31*/("""
                        """),format.raw/*509.25*/("""}"""),format.raw/*509.26*/("""
                    """),format.raw/*510.21*/("""}"""),format.raw/*510.22*/(""");
            """),format.raw/*511.13*/("""}"""),format.raw/*511.14*/(""";

            // comment page loader
            $scope.loadCommentPage = function(url, index) """),format.raw/*514.59*/("""{"""),format.raw/*514.60*/("""
                """),format.raw/*515.17*/("""$scope.postpage.arr[index].cdelerror = "";
                $("#delError" + $scope.postpage.arr[index].id).html("");
                $scope.postpage.arr[index].cconerror = "";
                $http("""),format.raw/*518.23*/("""{"""),format.raw/*518.24*/("""
                        """),format.raw/*519.25*/("""method : "GET",
                        url : url,
                        headers : """),format.raw/*521.35*/("""{"""),format.raw/*521.36*/("""
                            """),format.raw/*522.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*523.25*/("""}"""),format.raw/*523.26*/("""
                    """),format.raw/*524.21*/("""}"""),format.raw/*524.22*/(""").then(function successCallback(response) """),format.raw/*524.64*/("""{"""),format.raw/*524.65*/("""
                        """),format.raw/*525.25*/("""$scope.postpage.arr[index].commentpage = response.data;
                    """),format.raw/*526.21*/("""}"""),format.raw/*526.22*/(""", function errorCallback(response) """),format.raw/*526.57*/("""{"""),format.raw/*526.58*/("""
                        """),format.raw/*527.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*529.30*/("""{"""),format.raw/*529.31*/("""
                            """),format.raw/*530.29*/("""$scope.postpage.arr[index].cconerror = "Error retrieving the comment page from the server. Retry.";
                            $('#' + $scope.postpage.arr[index].id).modal('show');
                        """),format.raw/*532.25*/("""}"""),format.raw/*532.26*/("""
                    """),format.raw/*533.21*/("""}"""),format.raw/*533.22*/(""");
            """),format.raw/*534.13*/("""}"""),format.raw/*534.14*/(""";

            // refreshes the current comment page
            $scope.refreshCommentCurrentPage = function(event, index) """),format.raw/*537.71*/("""{"""),format.raw/*537.72*/("""
                """),format.raw/*538.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadCommentPage("/comments/refresh/" + $scope.postpage.arr[index].id + "/" + $scope.postpage.arr[index].commentpage.beginId, index);
            """),format.raw/*541.13*/("""}"""),format.raw/*541.14*/(""";

            // next comment page event handler
            $scope.loadCommentNextPage = function(event, index) """),format.raw/*544.65*/("""{"""),format.raw/*544.66*/("""
                """),format.raw/*545.17*/("""event.preventDefault();
                $scope.loadCommentPage("/comments/after/" + $scope.postpage.arr[index].id + "/" + $scope.postpage.arr[index].commentpage.endId, index);
            """),format.raw/*547.13*/("""}"""),format.raw/*547.14*/(""";

            // previous comment page event handler
            $scope.loadCommentPreviousPage = function(event, index) """),format.raw/*550.69*/("""{"""),format.raw/*550.70*/("""
                """),format.raw/*551.17*/("""event.preventDefault();
                $scope.loadCommentPage("/comments/before/" + $scope.postpage.arr[index].id + "/" + $scope.postpage.arr[index].commentpage.beginId, index);
            """),format.raw/*553.13*/("""}"""),format.raw/*553.14*/(""";

            $scope.loadCommentLastPage = function(event, index) """),format.raw/*555.65*/("""{"""),format.raw/*555.66*/("""
                """),format.raw/*556.17*/("""if (event != null)
                    event.preventDefault();
                $scope.loadCommentPage("/comments/last/" + $scope.postpage.arr[index].id, index);
            """),format.raw/*559.13*/("""}"""),format.raw/*559.14*/(""";


            // loads the first comment page
            $scope.loadCommentFirstPage = function(index) """),format.raw/*563.59*/("""{"""),format.raw/*563.60*/("""
                """),format.raw/*564.17*/("""$scope.postpage.arr[index].commentpage.numComments = "0";
                $scope.postpage.arr[index].commentpage.bLastPage = false;
                $scope.postpage.arr[index].commentpage.arr = [];
                $scope.postpage.arr[index].commentpage.beginId = "-1";
                $scope.postpage.arr[index].commentpage.endId = "-1";

                $scope.loadCommentPage("/comments/first/" + $scope.postpage.arr[index].id, index);
            """),format.raw/*571.13*/("""}"""),format.raw/*571.14*/(""";

            // toggles the comment editor for a post
            $scope.toggleCommentsEditor = function(event, index) """),format.raw/*574.66*/("""{"""),format.raw/*574.67*/("""
                """),format.raw/*575.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.postpage.arr[index].bShow)) """),format.raw/*576.75*/("""{"""),format.raw/*576.76*/("""
                    """),format.raw/*577.21*/("""$scope.postpage.arr[index].commentpage = new Object();

                    // initialize error state
                    $scope.postpage.arr[index].cdelerror = "";
                    $scope.postpage.arr[index].cconerror = "";
                    $scope.postpage.arr[index].cadderror = "";

                    $scope.postpage.arr[index].comment = "";
                    $scope.postpage.arr[index].bShow = true;
                    $scope.loadCommentFirstPage(index);
                """),format.raw/*587.17*/("""}"""),format.raw/*587.18*/(""" """),format.raw/*587.19*/("""else """),format.raw/*587.24*/("""{"""),format.raw/*587.25*/("""
                    """),format.raw/*588.21*/("""$scope.postpage.arr[index].bShow = !$scope.postpage.arr[index].bShow;
                """),format.raw/*589.17*/("""}"""),format.raw/*589.18*/("""
            """),format.raw/*590.13*/("""}"""),format.raw/*590.14*/(""";


            // Initialize the view
            $scope.InitPostView = function() """),format.raw/*594.46*/("""{"""),format.raw/*594.47*/("""
                """),format.raw/*595.17*/("""$scope.adderror = "";
                $scope.delerror = "";
                $scope.conerror = "";
                $scope.bConerror = false;
                $scope.postpage = new Object();
                $scope.loadFirstPage();

                $scope.addSuccess = false;
                $scope.delSuccess = false;
            """),format.raw/*604.13*/("""}"""),format.raw/*604.14*/(""";

             $scope.loadUserSummary = function() """),format.raw/*606.50*/("""{"""),format.raw/*606.51*/("""
                """),format.raw/*607.17*/("""$scope.conerror = "";
                $scope.activeusers=[];
                $http("""),format.raw/*609.23*/("""{"""),format.raw/*609.24*/("""
                        """),format.raw/*610.25*/("""method : "GET",
                        url : """"),_display_(/*611.33*/routes/*611.39*/.HomeController.getUserSummary),format.raw/*611.69*/("""",
                        headers : """),format.raw/*612.35*/("""{"""),format.raw/*612.36*/("""
                        """),format.raw/*613.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*614.25*/("""}"""),format.raw/*614.26*/("""
                    """),format.raw/*615.21*/("""}"""),format.raw/*615.22*/(""").then(function successCallback(response) """),format.raw/*615.64*/("""{"""),format.raw/*615.65*/("""
                        """),format.raw/*616.25*/("""$scope.activeusers = response.data;
                    """),format.raw/*617.21*/("""}"""),format.raw/*617.22*/(""", function errorCallback(response) """),format.raw/*617.57*/("""{"""),format.raw/*617.58*/("""
                        """),format.raw/*618.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*620.30*/("""{"""),format.raw/*620.31*/("""
                            """),format.raw/*621.29*/("""$scope.conerror = "Error refreshing the user summary. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*623.25*/("""}"""),format.raw/*623.26*/("""
                    """),format.raw/*624.21*/("""}"""),format.raw/*624.22*/("""
                """),format.raw/*625.17*/(""");
            """),format.raw/*626.13*/("""}"""),format.raw/*626.14*/(""";



            $scope.loadAllUsers = function() """),format.raw/*630.46*/("""{"""),format.raw/*630.47*/("""
                """),format.raw/*631.17*/("""$scope.conerror = "";
                $scope.users = [];
                $http("""),format.raw/*633.23*/("""{"""),format.raw/*633.24*/("""
                        """),format.raw/*634.25*/("""method : "GET",
                        url : """"),_display_(/*635.33*/routes/*635.39*/.GroupController.getUsers),format.raw/*635.64*/("""",
                        headers : """),format.raw/*636.35*/("""{"""),format.raw/*636.36*/("""
                        """),format.raw/*637.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*638.25*/("""}"""),format.raw/*638.26*/("""
                    """),format.raw/*639.21*/("""}"""),format.raw/*639.22*/(""").then(function successCallback(response) """),format.raw/*639.64*/("""{"""),format.raw/*639.65*/("""
                            """),format.raw/*640.29*/("""$scope.users = response.data;
                    """),format.raw/*641.21*/("""}"""),format.raw/*641.22*/(""", function errorCallback(response) """),format.raw/*641.57*/("""{"""),format.raw/*641.58*/("""
                        """),format.raw/*642.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*644.30*/("""{"""),format.raw/*644.31*/("""
                            """),format.raw/*645.29*/("""$scope.conerror = "Error refreshing the list of all users. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*647.25*/("""}"""),format.raw/*647.26*/("""
                    """),format.raw/*648.21*/("""}"""),format.raw/*648.22*/("""
                """),format.raw/*649.17*/(""");
            """),format.raw/*650.13*/("""}"""),format.raw/*650.14*/(""";


            $scope.loadAllGroupUsers = function(gId) """),format.raw/*653.54*/("""{"""),format.raw/*653.55*/("""
                """),format.raw/*654.17*/("""$scope.conerror = "";
                $scope.users = [];
                $http("""),format.raw/*656.23*/("""{"""),format.raw/*656.24*/("""
                        """),format.raw/*657.25*/("""method : "GET",
                        url : "/groupusers" + "/" + gId,
                        headers : """),format.raw/*659.35*/("""{"""),format.raw/*659.36*/("""
                        """),format.raw/*660.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*661.25*/("""}"""),format.raw/*661.26*/("""
                    """),format.raw/*662.21*/("""}"""),format.raw/*662.22*/(""").then(function successCallback(response) """),format.raw/*662.64*/("""{"""),format.raw/*662.65*/("""
                            """),format.raw/*663.29*/("""$scope.users  = response.data;
                    """),format.raw/*664.21*/("""}"""),format.raw/*664.22*/(""", function errorCallback(response) """),format.raw/*664.57*/("""{"""),format.raw/*664.58*/("""
                        """),format.raw/*665.25*/("""if (response.status == 403)
                            $scope.showForbiddenPage();
                        else """),format.raw/*667.30*/("""{"""),format.raw/*667.31*/("""
                            """),format.raw/*668.29*/("""if (response.status == 400)
                                $scope.conerror = response.data.error;
                            else
                                $scope.conerror = "Error refreshing the list of all group users. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*673.25*/("""}"""),format.raw/*673.26*/("""
                    """),format.raw/*674.21*/("""}"""),format.raw/*674.22*/("""
                """),format.raw/*675.17*/(""");
            """),format.raw/*676.13*/("""}"""),format.raw/*676.14*/(""";



            $scope.InitPostView()
            //$scope.loadUserSummary();
               $scope.loadUserGroups(null);
               $scope.loadAllUsers();

        """),format.raw/*685.9*/("""}"""),format.raw/*685.10*/(""");
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
                  DATE: Fri Oct 14 15:46:17 IST 2016
                  SOURCE: /home/si2chip/si2chip/app/views/posts.scala.html
                  HASH: 796ae49b6efc26fa99c59ff7e582310d5f6fcf9d
                  MATRIX: 756->1|880->30|908->32|1211->309|1225->315|1293->363|1355->398|1370->404|1433->446|2062->1048|2077->1054|2133->1089|2162->1090|2282->1183|2302->1194|2342->1196|2383->1209|2541->1336|2582->1349|3347->2086|3376->2087|3405->2088|3441->2096|3470->2097|3499->2098|3548->2119|3822->2365|3851->2366|3880->2367|3922->2381|3951->2382|3980->2383|4693->3067|4723->3068|4753->3069|4793->3080|4823->3081|4853->3082|5130->3331|5159->3332|5188->3333|5233->3350|5262->3351|5291->3352|6892->4924|6922->4925|6952->4926|6991->4936|7021->4937|7051->4938|7091->4949|7121->4950|7151->4951|7193->4963|7224->4964|7255->4965|7572->5253|7602->5254|7632->5255|7669->5263|7699->5264|7729->5265|7924->5430|7955->5431|7986->5432|8021->5437|8052->5438|8083->5439|8764->6091|8794->6092|8824->6093|8876->6116|8906->6117|8936->6118|9518->6671|9548->6672|9578->6673|9637->6703|9667->6704|9697->6705|9763->6742|9946->6896|9976->6897|10006->6898|10058->6921|10088->6922|10118->6923|10417->7193|10447->7194|10477->7195|10551->7239|10582->7240|10613->7241|12006->8605|12036->8606|12066->8607|12110->8621|12141->8622|12172->8623|12213->8634|12244->8635|12275->8636|12324->8655|12355->8656|12386->8657|12805->9047|12835->9048|12865->9049|12909->9064|12939->9065|12969->9066|13295->9363|13325->9364|13355->9365|13407->9388|13437->9389|13467->9390|13971->9865|14001->9866|14031->9867|14083->9890|14113->9891|14143->9892|14414->10134|14444->10135|14474->10136|14515->10148|14545->10149|14575->10150|14888->10433|14919->10434|14950->10435|14988->10443|15019->10444|15050->10445|15106->10472|15136->10473|15166->10474|15203->10482|15233->10483|15263->10484|15314->10506|15692->10855|15722->10856|15764->10869|15821->10897|15851->10898|15913->10931|15943->10932|15998->10959|16028->10960|16115->11018|16145->11019|16187->11032|16276->11092|16306->11093|16352->11110|16433->11162|16463->11163|16517->11188|16646->11288|16676->11289|16730->11314|16819->11374|16849->11375|16899->11396|16929->11397|17006->11445|17036->11446|17090->11471|17216->11568|17246->11569|17297->11591|17327->11592|17381->11617|17506->11713|17536->11714|17580->11729|17610->11730|17648->11740|17678->11741|17811->11844|17842->11845|17886->11860|17948->11893|17978->11894|18024->11911|18096->11954|18126->11955|18208->12008|18238->12009|18284->12026|18461->12175|18477->12181|18532->12214|18647->12300|18677->12301|18754->12349|18784->12350|18830->12367|19047->12556|19063->12562|19107->12584|19222->12670|19252->12671|19335->12725|19365->12726|19411->12743|19496->12800|19512->12806|19564->12836|19679->12922|19709->12923|19793->12978|19823->12979|19869->12996|19954->13053|19970->13059|20023->13090|20138->13176|20168->13177|20289->13269|20319->13270|20366->13288|20688->13581|20718->13582|20772->13607|20907->13713|20937->13714|20995->13743|21084->13803|21114->13804|21164->13825|21194->13826|21265->13868|21295->13869|21349->13894|21422->13938|21452->13939|21516->13974|21546->13975|21600->14000|21657->14028|21687->14029|21745->14058|22035->14319|22065->14320|22095->14321|22129->14326|22159->14327|22217->14356|22367->14477|22397->14478|22459->14511|22631->14654|22661->14655|22715->14680|22745->14681|22795->14702|22825->14703|22870->14719|22900->14720|22945->14736|23081->14843|23111->14844|23157->14861|23458->15132|23489->15133|23543->15158|23630->15216|23660->15217|23724->15252|23754->15253|23808->15278|23865->15306|23895->15307|23953->15336|24019->15373|24049->15374|24079->15375|24226->15493|24256->15494|24314->15523|24520->15700|24550->15701|24600->15722|24630->15723|24676->15740|24720->15755|24750->15756|24866->15843|24896->15844|24942->15861|25092->15982|25122->15983|25172->16004|25225->16028|25255->16029|25302->16047|25490->16206|25520->16207|25574->16232|25651->16281|25667->16287|25712->16310|25775->16344|25805->16345|25854->16365|25884->16366|25949->16402|25979->16403|26037->16432|26126->16492|26156->16493|26206->16514|26236->16515|26307->16557|26337->16558|26391->16583|26506->16669|26536->16670|26600->16705|26630->16706|26684->16731|26741->16759|26771->16760|26829->16789|27094->17025|27124->17026|27154->17027|27188->17032|27218->17033|27276->17062|27426->17183|27456->17184|27518->17217|27691->17361|27721->17362|27775->17387|27805->17388|27855->17409|27885->17410|27929->17425|27959->17426|28088->17526|28118->17527|28164->17544|28392->17743|28422->17744|28476->17769|28607->17871|28637->17872|28695->17901|28784->17961|28814->17962|28864->17983|28894->17984|28965->18026|28995->18027|29049->18052|29131->18105|29161->18106|29225->18141|29255->18142|29309->18167|29366->18195|29396->18196|29454->18225|29774->18516|29804->18517|29834->18518|29868->18523|29898->18524|29956->18553|30106->18674|30136->18675|30198->18708|30373->18854|30403->18855|30457->18880|30487->18881|30537->18902|30567->18903|30611->18918|30641->18919|30744->18993|30774->18994|30820->19011|30972->19134|31002->19135|31056->19160|31170->19245|31200->19246|31258->19275|31347->19335|31377->19336|31427->19357|31457->19358|31528->19400|31558->19401|31612->19426|31694->19479|31724->19480|31788->19515|31818->19516|31873->19542|32016->19656|32046->19657|32104->19686|32287->19840|32317->19841|32367->19862|32397->19863|32441->19878|32471->19879|32601->19980|32631->19981|32677->19998|32857->20149|32887->20150|33008->20242|33038->20243|33084->20260|33225->20372|33255->20373|33384->20473|33414->20474|33460->20491|33600->20602|33630->20603|33744->20688|33774->20689|33820->20706|34129->20986|34159->20987|34287->21086|34317->21087|34363->21104|34525->21237|34555->21238|34605->21259|34658->21283|34688->21284|34735->21302|34996->21534|35026->21535|35080->21560|35232->21683|35262->21684|35337->21730|35367->21731|35432->21767|35462->21768|35520->21797|35609->21857|35639->21858|35689->21879|35719->21880|35790->21922|35820->21923|35874->21948|36029->22074|36059->22075|36123->22110|36153->22111|36207->22136|36264->22164|36294->22165|36352->22194|36728->22541|36758->22542|36788->22543|36822->22548|36852->22549|36910->22578|37059->22698|37089->22699|37151->22732|37369->22921|37399->22922|37453->22947|37483->22948|37533->22969|37563->22970|37607->22985|37637->22986|37782->23102|37812->23103|37858->23120|38163->23396|38193->23397|38247->23422|38422->23568|38452->23569|38510->23598|38599->23658|38629->23659|38679->23680|38709->23681|38780->23723|38810->23724|38864->23749|38960->23816|38990->23817|39054->23852|39084->23853|39138->23878|39195->23906|39225->23907|39283->23936|39725->24349|39755->24350|39785->24351|39819->24356|39849->24357|39908->24387|40059->24509|40089->24510|40151->24543|40372->24735|40402->24736|40456->24761|40486->24762|40536->24783|40566->24784|40610->24799|40640->24800|40765->24896|40795->24897|40841->24914|41067->25111|41097->25112|41151->25137|41265->25222|41295->25223|41353->25252|41442->25312|41472->25313|41522->25334|41552->25335|41623->25377|41653->25378|41707->25403|41812->25479|41842->25480|41906->25515|41936->25516|41990->25541|42132->25654|42162->25655|42220->25684|42455->25890|42485->25891|42535->25912|42565->25913|42609->25928|42639->25929|42791->26052|42821->26053|42867->26070|43127->26301|43157->26302|43300->26416|43330->26417|43376->26434|43593->26622|43623->26623|43774->26745|43804->26746|43850->26763|44070->26954|44100->26955|44196->27022|44226->27023|44272->27040|44474->27213|44504->27214|44639->27320|44669->27321|44715->27338|45193->27787|45223->27788|45373->27909|45403->27910|45449->27927|45576->28025|45606->28026|45656->28047|46171->28533|46201->28534|46231->28535|46265->28540|46295->28541|46345->28562|46460->28648|46490->28649|46532->28662|46562->28663|46675->28747|46705->28748|46751->28765|47107->29092|47137->29093|47218->29145|47248->29146|47294->29163|47406->29246|47436->29247|47490->29272|47566->29320|47582->29326|47634->29356|47700->29393|47730->29394|47784->29419|47873->29479|47903->29480|47953->29501|47983->29502|48054->29544|48084->29545|48138->29570|48223->29626|48253->29627|48317->29662|48347->29663|48401->29688|48543->29801|48573->29802|48631->29831|48805->29976|48835->29977|48885->29998|48915->29999|48961->30016|49005->30031|49035->30032|49114->30082|49144->30083|49190->30100|49298->30179|49328->30180|49382->30205|49458->30253|49474->30259|49521->30284|49587->30321|49617->30322|49671->30347|49760->30407|49790->30408|49840->30429|49870->30430|49941->30472|49971->30473|50029->30502|50108->30552|50138->30553|50202->30588|50232->30589|50286->30614|50428->30727|50458->30728|50516->30757|50695->30907|50725->30908|50775->30929|50805->30930|50851->30947|50895->30962|50925->30963|51011->31020|51041->31021|51087->31038|51195->31117|51225->31118|51279->31143|51415->31250|51445->31251|51499->31276|51588->31336|51618->31337|51668->31358|51698->31359|51769->31401|51799->31402|51857->31431|51937->31482|51967->31483|52031->31518|52061->31519|52115->31544|52257->31657|52287->31658|52345->31687|52694->32007|52724->32008|52774->32029|52804->32030|52850->32047|52894->32062|52924->32063|53122->32233|53152->32234
                  LINES: 27->1|32->1|34->3|40->9|40->9|40->9|41->10|41->10|41->10|53->22|53->22|53->22|53->22|57->26|57->26|57->26|58->27|59->28|60->29|76->45|76->45|76->45|76->45|76->45|76->45|77->46|87->56|87->56|87->56|87->56|87->56|87->56|99->68|99->68|99->68|99->68|99->68|99->68|106->75|106->75|106->75|106->75|106->75|106->75|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|133->102|138->107|138->107|138->107|138->107|138->107|138->107|142->111|142->111|142->111|142->111|142->111|142->111|148->117|148->117|148->117|148->117|148->117|148->117|156->125|156->125|156->125|156->125|156->125|156->125|157->126|162->131|162->131|162->131|162->131|162->131|162->131|167->136|167->136|167->136|167->136|167->136|167->136|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|184->153|189->158|189->158|189->158|189->158|189->158|189->158|196->165|196->165|196->165|196->165|196->165|196->165|202->171|202->171|202->171|202->171|202->171|202->171|211->180|211->180|211->180|211->180|211->180|211->180|216->185|216->185|216->185|216->185|216->185|216->185|217->186|217->186|217->186|217->186|217->186|217->186|219->188|232->201|232->201|233->202|233->202|233->202|233->202|233->202|234->203|234->203|236->205|236->205|237->206|238->207|238->207|239->208|240->209|240->209|241->210|243->212|243->212|244->213|245->214|245->214|246->215|246->215|247->216|247->216|248->217|250->219|250->219|250->219|250->219|251->220|253->222|253->222|254->223|254->223|255->224|255->224|257->226|257->226|260->229|260->229|260->229|261->230|262->231|262->231|264->233|264->233|265->234|268->237|268->237|268->237|270->239|270->239|272->241|272->241|273->242|277->246|277->246|277->246|279->248|279->248|281->250|281->250|282->251|283->252|283->252|283->252|285->254|285->254|287->256|287->256|288->257|289->258|289->258|289->258|291->260|291->260|295->264|295->264|297->266|306->275|306->275|307->276|309->278|309->278|310->279|311->280|311->280|312->281|312->281|312->281|312->281|313->282|315->284|315->284|315->284|315->284|316->285|316->285|316->285|317->286|319->288|319->288|319->288|319->288|319->288|320->289|322->291|322->291|323->292|325->294|325->294|326->295|326->295|327->296|327->296|328->297|328->297|331->300|332->301|332->301|333->302|338->307|338->307|339->308|340->309|340->309|340->309|340->309|341->310|341->310|341->310|342->311|343->312|343->312|343->312|345->314|345->314|346->315|348->317|348->317|349->318|349->318|350->319|351->320|351->320|355->324|355->324|356->325|359->328|359->328|360->329|361->330|361->330|363->332|367->336|367->336|368->337|369->338|369->338|369->338|370->339|370->339|370->339|370->339|371->340|371->340|372->341|373->342|373->342|374->343|374->343|374->343|374->343|375->344|377->346|377->346|377->346|377->346|378->347|378->347|378->347|379->348|381->350|381->350|381->350|381->350|381->350|382->351|384->353|384->353|385->354|387->356|387->356|388->357|388->357|389->358|389->358|390->359|390->359|393->362|393->362|394->363|400->369|400->369|401->370|403->372|403->372|404->373|405->374|405->374|406->375|406->375|406->375|406->375|407->376|408->377|408->377|408->377|408->377|409->378|409->378|409->378|410->379|412->381|412->381|412->381|412->381|412->381|413->382|415->384|415->384|416->385|418->387|418->387|419->388|419->388|420->389|420->389|421->390|421->390|424->393|424->393|425->394|428->397|428->397|429->398|431->400|431->400|432->401|433->402|433->402|434->403|434->403|434->403|434->403|435->404|436->405|436->405|436->405|436->405|437->406|439->408|439->408|440->409|442->411|442->411|443->412|443->412|444->413|444->413|447->416|447->416|448->417|451->420|451->420|454->423|454->423|455->424|457->426|457->426|460->429|460->429|461->430|463->432|463->432|466->435|466->435|467->436|473->442|473->442|476->445|476->445|477->446|480->449|480->449|481->450|482->451|482->451|484->453|488->457|488->457|489->458|491->460|491->460|491->460|491->460|492->461|492->461|493->462|494->463|494->463|495->464|495->464|495->464|495->464|496->465|498->467|498->467|498->467|498->467|499->468|499->468|499->468|500->469|502->471|502->471|502->471|502->471|502->471|503->472|505->474|505->474|506->475|508->477|508->477|509->478|509->478|510->479|510->479|511->480|511->480|514->483|514->483|515->484|521->490|521->490|522->491|524->493|524->493|525->494|526->495|526->495|527->496|527->496|527->496|527->496|528->497|529->498|529->498|529->498|529->498|530->499|530->499|530->499|531->500|533->502|533->502|533->502|533->502|533->502|534->503|536->505|536->505|537->506|539->508|539->508|540->509|540->509|541->510|541->510|542->511|542->511|545->514|545->514|546->515|549->518|549->518|550->519|552->521|552->521|553->522|554->523|554->523|555->524|555->524|555->524|555->524|556->525|557->526|557->526|557->526|557->526|558->527|560->529|560->529|561->530|563->532|563->532|564->533|564->533|565->534|565->534|568->537|568->537|569->538|572->541|572->541|575->544|575->544|576->545|578->547|578->547|581->550|581->550|582->551|584->553|584->553|586->555|586->555|587->556|590->559|590->559|594->563|594->563|595->564|602->571|602->571|605->574|605->574|606->575|607->576|607->576|608->577|618->587|618->587|618->587|618->587|618->587|619->588|620->589|620->589|621->590|621->590|625->594|625->594|626->595|635->604|635->604|637->606|637->606|638->607|640->609|640->609|641->610|642->611|642->611|642->611|643->612|643->612|644->613|645->614|645->614|646->615|646->615|646->615|646->615|647->616|648->617|648->617|648->617|648->617|649->618|651->620|651->620|652->621|654->623|654->623|655->624|655->624|656->625|657->626|657->626|661->630|661->630|662->631|664->633|664->633|665->634|666->635|666->635|666->635|667->636|667->636|668->637|669->638|669->638|670->639|670->639|670->639|670->639|671->640|672->641|672->641|672->641|672->641|673->642|675->644|675->644|676->645|678->647|678->647|679->648|679->648|680->649|681->650|681->650|684->653|684->653|685->654|687->656|687->656|688->657|690->659|690->659|691->660|692->661|692->661|693->662|693->662|693->662|693->662|694->663|695->664|695->664|695->664|695->664|696->665|698->667|698->667|699->668|704->673|704->673|705->674|705->674|706->675|707->676|707->676|716->685|716->685
                  -- GENERATED --
              */
          