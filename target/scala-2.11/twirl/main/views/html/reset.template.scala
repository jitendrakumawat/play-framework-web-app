
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reset_Scope0 {
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

class reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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

    <title>Si2chip Reset</title>
</head>
<body ng-app="reset" ng-controller="resetCtrl">
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <img src="""),_display_(/*21.23*/routes/*21.29*/.Assets.versioned("images/l46.png")),format.raw/*21.64*/(""" """),format.raw/*21.65*/("""class="logo">
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#" ng-click="showHome($event)"><span class="glyphicon glyphicon-log-in"></span> Login </a></li>
        </ul>
    </div>
</nav>

<div class="container">
    <div class="row">
        <div class="col-sm-6 col-sm-offset-3">
            <div class="modal fade" id="conError" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <span>An error occurred transacting with the server.</span>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            """),format.raw/*40.29*/("""{"""),format.raw/*40.30*/("""{"""),format.raw/*40.31*/("""conerror"""),format.raw/*40.39*/("""}"""),format.raw/*40.40*/("""}"""),format.raw/*40.41*/("""
                        """),format.raw/*41.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-sm-4">
        </div>
        <div class="col-sm-4">
            <div class="well well-lg">
                <div class="text-center">
                    <h4 id="logintitle">Reset your Password</h4>
                </div>
                <form role="form" name="cf">
                    <div class="form-group">
                        <label>Email</label>
                        <input type="email" class="form-control"  ng-model="mUserId" placeholder="Email Address" required name="userId">
                    </div>
                    <div class="form-group">
                        <label> New password</label>
                        <input type="password" class="form-control" ng-model="mPassword" placeholder="New password" required name="password">
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-default btn-sm" ng-click="resetpassword($event)">Submit</button>
                    </div>

                </form>
                <span ng-show="cf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                <span ng-show="cf.userId.$touched && cf.userId.$error.required" class="editmsgs">UserId required. Enter a valid email id</span><br>
                <span ng-if="!cf.userId.$dirty" ng-bind="moderror" class="error"></span>
                <span ng-if="!(cf.userId.$touched || cf.password.$touched) && modSuccess" class="success">Password changed</span>
            </div>
        </div>
    </div>
</div>
<script>
        //todo: progress indicator

         var app = angular.module('reset',  ['ngCookies']);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*81.80*/("""{"""),format.raw/*81.81*/("""
            """),format.raw/*82.13*/("""$locationProvider.html5Mode("""),format.raw/*82.41*/("""{"""),format.raw/*82.42*/("""enabled: true, requireBase: false"""),format.raw/*82.75*/("""}"""),format.raw/*82.76*/(""").hashPrefix('*');
        """),format.raw/*83.9*/("""}"""),format.raw/*83.10*/("""]);


        app.controller('resetCtrl', function($scope, $http, $location, $window, $cookies) """),format.raw/*86.91*/("""{"""),format.raw/*86.92*/("""
            """),format.raw/*87.13*/("""// Initialize the view
            $scope.error="";
            $scope.conerror = "";

            $scope.users=[];
            $scope.groupId = "";
            $scope.userId = "";
            $scope.modSuccess = false;

            $scope.init = function() """),format.raw/*96.38*/("""{"""),format.raw/*96.39*/("""

            """),format.raw/*98.13*/("""}"""),format.raw/*98.14*/("""
            """),format.raw/*99.13*/("""$scope.init()



          $scope.showHome = function(event) """),format.raw/*103.45*/("""{"""),format.raw/*103.46*/("""

                """),format.raw/*105.17*/("""event.preventDefault();
                $location.url(""""),_display_(/*106.33*/routes/*106.39*/.HomeController.showHomePage),format.raw/*106.67*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*108.13*/("""}"""),format.raw/*108.14*/(""";

            $scope.resetpassword  = function(event) """),format.raw/*110.53*/("""{"""),format.raw/*110.54*/("""
                """),format.raw/*111.17*/("""event.preventDefault();

                // validate the modify user form
                if ($scope.cf.userId.$error.required || !$scope.cf.userId.$dirty) """),format.raw/*114.83*/("""{"""),format.raw/*114.84*/("""
                    """),format.raw/*115.21*/("""$scope.cf.userId.$touched = true;
                    return;
                """),format.raw/*117.17*/("""}"""),format.raw/*117.18*/("""

                """),format.raw/*119.17*/("""$scope.conerror = "";
                $scope.moderror = "";
                $scope.modSuccess = false;
                $http("""),format.raw/*122.23*/("""{"""),format.raw/*122.24*/("""
                        """),format.raw/*123.25*/("""method : "PUT",
                        url : """"),_display_(/*124.33*/routes/*124.39*/.PasswordResetController.resetUserPassword),format.raw/*124.81*/("""",
                        data : """),format.raw/*125.32*/("""{"""),format.raw/*125.33*/(""""userId" : $scope.mUserId, "password" : $scope.mPassword"""),format.raw/*125.89*/("""}"""),format.raw/*125.90*/(""",
                        headers : """),format.raw/*126.35*/("""{"""),format.raw/*126.36*/("""
                            """),format.raw/*127.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*128.25*/("""}"""),format.raw/*128.26*/("""
                    """),format.raw/*129.21*/("""}"""),format.raw/*129.22*/(""").then(function successCallback(response) """),format.raw/*129.64*/("""{"""),format.raw/*129.65*/("""
                        """),format.raw/*130.25*/("""$scope.mUserId = null;
                        $scope.mPassword = "";
                        $scope.cf.userId.$touched = false;
                        $scope.cf.password.$touched = false;
                        $scope.modSuccess = true;
                    """),format.raw/*135.21*/("""}"""),format.raw/*135.22*/(""", function errorCallback(response) """),format.raw/*135.57*/("""{"""),format.raw/*135.58*/("""
                        """),format.raw/*136.25*/("""if (response.status == 400) """),format.raw/*136.53*/("""{"""),format.raw/*136.54*/("""
                            """),format.raw/*137.29*/("""$scope.moderror = response.data.error;
                            $scope.rpf.$setPristine();
                        """),format.raw/*139.25*/("""}"""),format.raw/*139.26*/(""" """),format.raw/*139.27*/("""else """),format.raw/*139.32*/("""{"""),format.raw/*139.33*/("""
                            """),format.raw/*140.29*/("""if (response.status == 403)
                                $scope.showForbiddenPage();
                            else """),format.raw/*142.34*/("""{"""),format.raw/*142.35*/("""
                                """),format.raw/*143.33*/("""$scope.conerror = "Error trying to reset the password. Retry.";
                                $('#conError').modal('show');
                            """),format.raw/*145.29*/("""}"""),format.raw/*145.30*/("""
                        """),format.raw/*146.25*/("""}"""),format.raw/*146.26*/("""
                    """),format.raw/*147.21*/("""}"""),format.raw/*147.22*/(""");
            """),format.raw/*148.13*/("""}"""),format.raw/*148.14*/(""";



        """),format.raw/*152.9*/("""}"""),format.raw/*152.10*/(""");

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
object reset extends reset_Scope0.reset
              /*
                  -- GENERATED --
                  DATE: Thu Oct 06 19:46:10 IST 2016
                  SOURCE: /home/si2chip/test/si2chip1/si2chip/app/views/reset.scala.html
                  HASH: 5e9c9b7f36d49d355b4b49fe8d73957579b9740b
                  MATRIX: 827->1|1130->278|1144->284|1212->332|1273->367|1287->373|1348->414|1984->1023|1999->1029|2055->1064|2084->1065|2942->1895|2971->1896|3000->1897|3036->1905|3065->1906|3094->1907|3147->1932|5048->3805|5077->3806|5118->3819|5174->3847|5203->3848|5264->3881|5293->3882|5347->3909|5376->3910|5500->4006|5529->4007|5570->4020|5856->4278|5885->4279|5927->4293|5956->4294|5997->4307|6087->4368|6117->4369|6164->4387|6248->4443|6264->4449|6314->4477|6429->4563|6459->4564|6543->4619|6573->4620|6619->4637|6804->4793|6834->4794|6884->4815|6991->4893|7021->4894|7068->4912|7222->5037|7252->5038|7306->5063|7382->5111|7398->5117|7462->5159|7525->5193|7555->5194|7640->5250|7670->5251|7735->5287|7765->5288|7823->5317|7912->5377|7942->5378|7992->5399|8022->5400|8093->5442|8123->5443|8177->5468|8466->5728|8496->5729|8560->5764|8590->5765|8644->5790|8701->5818|8731->5819|8789->5848|8936->5966|8966->5967|8996->5968|9030->5973|9060->5974|9118->6003|9268->6124|9298->6125|9360->6158|9543->6312|9573->6313|9627->6338|9657->6339|9707->6360|9737->6361|9781->6376|9811->6377|9852->6390|9882->6391
                  LINES: 32->2|38->8|38->8|38->8|39->9|39->9|39->9|51->21|51->21|51->21|51->21|70->40|70->40|70->40|70->40|70->40|70->40|71->41|111->81|111->81|112->82|112->82|112->82|112->82|112->82|113->83|113->83|116->86|116->86|117->87|126->96|126->96|128->98|128->98|129->99|133->103|133->103|135->105|136->106|136->106|136->106|138->108|138->108|140->110|140->110|141->111|144->114|144->114|145->115|147->117|147->117|149->119|152->122|152->122|153->123|154->124|154->124|154->124|155->125|155->125|155->125|155->125|156->126|156->126|157->127|158->128|158->128|159->129|159->129|159->129|159->129|160->130|165->135|165->135|165->135|165->135|166->136|166->136|166->136|167->137|169->139|169->139|169->139|169->139|169->139|170->140|172->142|172->142|173->143|175->145|175->145|176->146|176->146|177->147|177->147|178->148|178->148|182->152|182->152
                  -- GENERATED --
              */
          