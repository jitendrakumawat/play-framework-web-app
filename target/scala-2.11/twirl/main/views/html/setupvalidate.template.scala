
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object setupvalidate_Scope0 {
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

class setupvalidate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <link rel="stylesheet" href="""),_display_(/*8.34*/routes/*8.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.81*/(""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-animate.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>

    <title>Si2chip Setup</title>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <img src="""),_display_(/*21.23*/routes/*21.29*/.Assets.versioned("images/l46.png")),format.raw/*21.64*/(""" """),format.raw/*21.65*/("""class="logo">
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li><a href="#" class="active"><span class="glyphicon glyphicon-log-in"></span> Login </a></li>
        </ul>

    </div>
</nav>

<div class="container" ng-app="login" ng-controller="loginCtrl">
    <div class="row">
        <div class="col-sm-4">
        </div>
        <div class="col-sm-4">
            <div class="well well-lg">
                <div class="text-center">
                    <h4 id="logintitle">Login</h4>
                </div>
                <form role="form" name="lf">
                    <div class="form-group">
                        <input type="email" class="form-control" maxlength="255" ng-model="userId" placeholder="Email Address" required name="userId">
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" ng-model="password" placeholder="Password" required  name="password">
                    </div>
                    <div class="text-center">
                        <button type="submit" class="btn btn-default btn-sm" ng-click="submit($event)">Login</button>
                    </div>

                </form>
                <span ng-show="lf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                <span ng-show="lf.userId.$touched && lf.userId.$error.required" class="editmsgs">UserId required. Enter a valid email id</span><br>
                <span ng-if="!(lf.userId.$dirty || lf.password.$dirty)" ng-bind="error" class="error"></span>
            </div>
         </div>
    </div>
</div>
<script>
        //todo: progress indicator

        var app = angular.module('login',  ['ngCookies','ngAnimate']);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*62.80*/("""{"""),format.raw/*62.81*/("""
            """),format.raw/*63.13*/("""$locationProvider.html5Mode("""),format.raw/*63.41*/("""{"""),format.raw/*63.42*/("""enabled: true, requireBase: false"""),format.raw/*63.75*/("""}"""),format.raw/*63.76*/(""").hashPrefix('*');
        """),format.raw/*64.9*/("""}"""),format.raw/*64.10*/("""]);


        app.controller('loginCtrl', function($scope, $http, $location, $window, $cookies) """),format.raw/*67.91*/("""{"""),format.raw/*67.92*/("""
            """),format.raw/*68.13*/("""// Initialize the view
            $scope.error="";
            $scope.conerror = "";
            $scope.bConerror = false;
            $scope.users=[];
            $scope.userId = "";





           // Login as no group with username password
             $scope.submit  = function(event) """),format.raw/*80.47*/("""{"""),format.raw/*80.48*/("""
                """),format.raw/*81.17*/("""event.preventDefault();

                // validate the login form
                if ($scope.lf.userId.$error.required || $scope.lf.userId.$error.email || !($scope.lf.userId.$dirty || $scope.lf.password.$dirty)) """),format.raw/*84.147*/("""{"""),format.raw/*84.148*/("""
                    """),format.raw/*85.21*/("""$scope.lf.userId.$touched = true;
                    return;

                """),format.raw/*88.17*/("""}"""),format.raw/*88.18*/("""
                """),format.raw/*89.17*/("""// set user cookies
                $cookies.put("tzoffset", new Date().getTimezoneOffset().toString());
                $cookies.put("userId", $scope.userId);
                  alert('fine');

                $scope.conerror = "";
                $scope.bConerror = false;
                $http("""),format.raw/*96.23*/("""{"""),format.raw/*96.24*/("""
                        """),format.raw/*97.25*/("""method : "POST",
                        url : """"),_display_(/*98.33*/routes/*98.39*/.AdminController.showSetup),format.raw/*98.65*/("""",
                        data : """),format.raw/*99.32*/("""{"""),format.raw/*99.33*/(""""userId" : $scope.userId,"password" : $scope.password"""),format.raw/*99.86*/("""}"""),format.raw/*99.87*/(""",
                        headers : """),format.raw/*100.35*/("""{"""),format.raw/*100.36*/("""
                            """),format.raw/*101.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*102.25*/("""}"""),format.raw/*102.26*/("""
                    """),format.raw/*103.21*/("""}"""),format.raw/*103.22*/(""").then(function successCallback(response) """),format.raw/*103.64*/("""{"""),format.raw/*103.65*/("""
                         """),format.raw/*104.26*/("""$scope.UserId = "";
                        $scope.Password = "";
                    """),format.raw/*106.21*/("""}"""),format.raw/*106.22*/(""", function errorCallback(response) """),format.raw/*106.57*/("""{"""),format.raw/*106.58*/("""
                        """),format.raw/*107.25*/("""$cookies.remove("userId");
                        $cookies.remove("tzoffset");
                        if (response.status == 400) """),format.raw/*109.53*/("""{"""),format.raw/*109.54*/("""
                            """),format.raw/*110.29*/("""$scope.error = response.data.error;
                            $scope.lf.$setPristine();
                        """),format.raw/*112.25*/("""}"""),format.raw/*112.26*/(""" """),format.raw/*112.27*/("""else """),format.raw/*112.32*/("""{"""),format.raw/*112.33*/("""
                            """),format.raw/*113.29*/("""$scope.bConerror = true;
                            $scope.conerror = "Error trying to login. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*116.25*/("""}"""),format.raw/*116.26*/("""
                    """),format.raw/*117.21*/("""}"""),format.raw/*117.22*/(""");
            """),format.raw/*118.13*/("""}"""),format.raw/*118.14*/(""";

        """),format.raw/*120.9*/("""}"""),format.raw/*120.10*/(""");
    </script>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object setupvalidate extends setupvalidate_Scope0.setupvalidate
              /*
                  -- GENERATED --
                  DATE: Sat Oct 15 14:05:05 IST 2016
                  SOURCE: /home/si2chip/si2chip/app/views/setupvalidate.scala.html
                  HASH: 8e0660f6eb14eaba167cd5c1a4f58d1aead029fa
                  MATRIX: 843->0|1146->277|1160->283|1228->331|1289->366|1303->372|1364->413|2060->1082|2075->1088|2131->1123|2160->1124|4037->2973|4066->2974|4107->2987|4163->3015|4192->3016|4253->3049|4282->3050|4336->3077|4365->3078|4489->3174|4518->3175|4559->3188|4878->3479|4907->3480|4952->3497|5195->3711|5225->3712|5274->3733|5381->3812|5410->3813|5455->3830|5779->4126|5808->4127|5861->4152|5937->4201|5952->4207|5999->4233|6061->4267|6090->4268|6171->4321|6200->4322|6265->4358|6295->4359|6353->4388|6442->4448|6472->4449|6522->4470|6552->4471|6623->4513|6653->4514|6708->4540|6823->4626|6853->4627|6917->4662|6947->4663|7001->4688|7162->4820|7192->4821|7250->4850|7393->4964|7423->4965|7453->4966|7487->4971|7517->4972|7575->5001|7790->5187|7820->5188|7870->5209|7900->5210|7944->5225|7974->5226|8013->5237|8043->5238
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|52->21|52->21|52->21|52->21|93->62|93->62|94->63|94->63|94->63|94->63|94->63|95->64|95->64|98->67|98->67|99->68|111->80|111->80|112->81|115->84|115->84|116->85|119->88|119->88|120->89|127->96|127->96|128->97|129->98|129->98|129->98|130->99|130->99|130->99|130->99|131->100|131->100|132->101|133->102|133->102|134->103|134->103|134->103|134->103|135->104|137->106|137->106|137->106|137->106|138->107|140->109|140->109|141->110|143->112|143->112|143->112|143->112|143->112|144->113|147->116|147->116|148->117|148->117|149->118|149->118|151->120|151->120
                  -- GENERATED --
              */
          