
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newuser_Scope0 {
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

class newuser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
<body ng-app="newuser" ng-controller="userCtrl">
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
       <div class="col-md-5 col-md-offset-3">
        <div class="panel panel-primary">
            <div class="panel-body">

                    <div class="text-center">
                        <div class="form-group">
                           <h2>Create account</h2>
                        </div>
                    </div>
                <form role="form" name="uf">
                    <div class="form-group">
                        <label class="control-label" for="signupName">Your name</label>
                        <input type="name" class="form-control" maxlength="20" ng-model="nUserName" placeholder="Full Name" required name="nUserName">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupEmail">Email</label>
                        <input type="email" class="form-control" maxlength="255" ng-model="nUserId" placeholder="email" required name="userId">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="signupPassword">Password</label>
                        <input type="Password" type="password" maxlength="25" class="form-control" ng-model="nPassword" placeholder="Password" >
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="Designation">Designation</label>
                        <input type="text"  maxlength="25" class="form-control" ng-model="nDesignation" placeholder="Designation" >
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="birthDate">Date of Birth</label>
                        <input type="date" maxlength="25" class="form-control" ng-model="nbirthdate" placeholder="dd/mm/yyyy" >
                    </div>

                    <div class="form-group">
                        <button type="submit" class="btn btn-info btn-block" ng-click="addUsers($event)">Submit</button>
                    </div>
                </form>
                <span ng-show="uf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                <span ng-show="uf.userId.$touched && uf.userId.$error.required" class="editmsgs">UserId required. Enter a valid email id</span><br>
                <span ng-if="!(uf.userId.$dirty || uf.password.$dirty)" ng-bind="adderror" class="error"></span>
                <span ng-if="!(uf.userId.$touched || uf.password.$touched) && addSuccess" class="success">User added successfully</span>

            </div>
        </div>
       </div>
    </div>
</div>


<script type="text/javascript">
        var app = angular.module('newuser',  ["ngCookies"]);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*81.80*/("""{"""),format.raw/*81.81*/("""
            """),format.raw/*82.13*/("""$locationProvider.html5Mode("""),format.raw/*82.41*/("""{"""),format.raw/*82.42*/("""enabled: true, requireBase: false"""),format.raw/*82.75*/("""}"""),format.raw/*82.76*/(""").hashPrefix('*');
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/("""]);

        app.controller('userCtrl', function($scope, $http, $location, $window, $cookies) """),format.raw/*85.90*/("""{"""),format.raw/*85.91*/("""
            """),format.raw/*86.13*/("""// Initialize the view
            $scope.conerror = "";
            $scope.adderror= "";
            $scope.delerror = "";
            $scope.moderror = "";
            $scope.addSuccess = false;
            $scope.modSuccess = false;


            $scope.showForbiddenPage = function() """),format.raw/*95.51*/("""{"""),format.raw/*95.52*/("""
                """),format.raw/*96.17*/("""$cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*99.34*/routes/*99.40*/.AdminController.showForbiddenPage),format.raw/*99.74*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*101.13*/("""}"""),format.raw/*101.14*/(""";

             $scope.showPosts = function(event) """),format.raw/*103.49*/("""{"""),format.raw/*103.50*/("""
                """),format.raw/*104.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*105.34*/routes/*105.40*/.PostController.getPosts),format.raw/*105.64*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*107.13*/("""}"""),format.raw/*107.14*/(""";

              $scope.signOut = function(event) """),format.raw/*109.48*/("""{"""),format.raw/*109.49*/("""
                """),format.raw/*110.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("groupId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*114.34*/routes/*114.40*/.HomeController.logout),format.raw/*114.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*116.13*/("""}"""),format.raw/*116.14*/(""";


            $scope.addUsers  = function(event) """),format.raw/*119.48*/("""{"""),format.raw/*119.49*/("""
                """),format.raw/*120.17*/("""event.preventDefault();

                // validate the add user form
                if ($scope.uf.userId.$error.required || $scope.uf.userId.$error.email || !($scope.uf.userId.$dirty || $scope.uf.password.$dirty)) """),format.raw/*123.147*/("""{"""),format.raw/*123.148*/("""
                    """),format.raw/*124.21*/("""$scope.uf.userId.$touched = true;
                    return;
                """),format.raw/*126.17*/("""}"""),format.raw/*126.18*/("""

                """),format.raw/*128.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                $http("""),format.raw/*131.23*/("""{"""),format.raw/*131.24*/("""
                        """),format.raw/*132.25*/("""method : "POST",
                        url : """"),_display_(/*133.33*/routes/*133.39*/.AdminController.addUser),format.raw/*133.63*/("""",
                        data : """),format.raw/*134.32*/("""{"""),format.raw/*134.33*/(""""username" : $scope.nUserName,  "userId" : $scope.nUserId, "password" : $scope.nPassword, "userDesignation" : $scope:nDesignation, "userbirth" : $scope.nbirthdate"""),format.raw/*134.195*/("""}"""),format.raw/*134.196*/(""",
                        headers : """),format.raw/*135.35*/("""{"""),format.raw/*135.36*/("""
                            """),format.raw/*136.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*137.25*/("""}"""),format.raw/*137.26*/("""
                    """),format.raw/*138.21*/("""}"""),format.raw/*138.22*/(""").then(function successCallback(response) """),format.raw/*138.64*/("""{"""),format.raw/*138.65*/("""
                        """),format.raw/*139.25*/("""$scope.nUserId = "";
                        $scope.nPassword = "";
                        $scope.nUserName ="";
                        $scope.userDesignation ="";
                        $scope.nbirthdate ="";
                        $scope.auf.userId.$touched = false;
                        $scope.auf.password.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*147.21*/("""}"""),format.raw/*147.22*/(""", function errorCallback(response) """),format.raw/*147.57*/("""{"""),format.raw/*147.58*/("""
                        """),format.raw/*148.25*/("""if (response.status == 400) """),format.raw/*148.53*/("""{"""),format.raw/*148.54*/("""
                            """),format.raw/*149.29*/("""$scope.adderror = response.data.error;
                            $scope.auf.$setPristine();
                        """),format.raw/*151.25*/("""}"""),format.raw/*151.26*/(""" """),format.raw/*151.27*/("""else """),format.raw/*151.32*/("""{"""),format.raw/*151.33*/("""
                            """),format.raw/*152.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*154.34*/("""{"""),format.raw/*154.35*/("""
                                """),format.raw/*155.33*/("""$scope.conerror = "Error trying to add the user. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*157.29*/("""}"""),format.raw/*157.30*/("""
                        """),format.raw/*158.25*/("""}"""),format.raw/*158.26*/("""
                    """),format.raw/*159.21*/("""}"""),format.raw/*159.22*/(""");
            """),format.raw/*160.13*/("""}"""),format.raw/*160.14*/(""";



        """),format.raw/*164.9*/("""}"""),format.raw/*164.10*/(""");
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
object newuser extends newuser_Scope0.newuser
              /*
                  -- GENERATED --
                  DATE: Thu Oct 06 19:46:10 IST 2016
                  SOURCE: /home/si2chip/test/si2chip1/si2chip/app/views/newuser.scala.html
                  HASH: 1441cda4cdd49da0d68e3605695bd85dd641f415
                  MATRIX: 831->0|1134->277|1148->283|1216->331|1277->366|1291->372|1353->414|1414->449|1428->455|1490->497|2126->1106|2141->1112|2197->1147|2226->1148|5516->4410|5545->4411|5586->4424|5642->4452|5671->4453|5732->4486|5761->4487|5815->4514|5844->4515|5966->4609|5995->4610|6036->4623|6352->4911|6381->4912|6426->4929|6602->5078|6617->5084|6672->5118|6787->5204|6817->5205|6897->5256|6927->5257|6973->5274|7058->5331|7074->5337|7120->5361|7235->5447|7265->5448|7344->5498|7374->5499|7420->5516|7637->5705|7653->5711|7697->5733|7812->5819|7842->5820|7922->5871|7952->5872|7998->5889|8245->6106|8276->6107|8326->6128|8433->6206|8463->6207|8510->6225|8664->6350|8694->6351|8748->6376|8825->6425|8841->6431|8887->6455|8950->6489|8980->6490|9172->6652|9203->6653|9268->6689|9298->6690|9356->6719|9445->6779|9475->6780|9525->6801|9555->6802|9626->6844|9656->6845|9710->6870|10144->7275|10174->7276|10238->7311|10268->7312|10322->7337|10379->7365|10409->7366|10467->7395|10614->7513|10644->7514|10674->7515|10708->7520|10738->7521|10796->7550|10946->7671|10976->7672|11038->7705|11215->7853|11245->7854|11299->7879|11329->7880|11379->7901|11409->7902|11453->7917|11483->7918|11524->7931|11554->7932
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|51->20|51->20|51->20|51->20|112->81|112->81|113->82|113->82|113->82|113->82|113->82|114->83|114->83|116->85|116->85|117->86|126->95|126->95|127->96|130->99|130->99|130->99|132->101|132->101|134->103|134->103|135->104|136->105|136->105|136->105|138->107|138->107|140->109|140->109|141->110|145->114|145->114|145->114|147->116|147->116|150->119|150->119|151->120|154->123|154->123|155->124|157->126|157->126|159->128|162->131|162->131|163->132|164->133|164->133|164->133|165->134|165->134|165->134|165->134|166->135|166->135|167->136|168->137|168->137|169->138|169->138|169->138|169->138|170->139|178->147|178->147|178->147|178->147|179->148|179->148|179->148|180->149|182->151|182->151|182->151|182->151|182->151|183->152|185->154|185->154|186->155|188->157|188->157|189->158|189->158|190->159|190->159|191->160|191->160|195->164|195->164
                  -- GENERATED --
              */
          