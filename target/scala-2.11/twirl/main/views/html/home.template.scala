
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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

    <title>Si2chip Home</title>
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
        <div class="col-sm-6 col-sm-offset-3">
            <div class="modal fade" id="conError" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <span>An error occurred transacting with the server.</span>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
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
        <div class="col-sm-4">
        </div>
        <div class="col-sm-4">
            <div class="well well-lg">
                <div class="text-center">
                    <h4 id="logintitle">Login</h4>
                </div>
                <form role="form" name="lf">
                    <div class="form-group">
                        <input type="email" class="form-control" ng-change="loadUserGroups($event)" maxlength="255" ng-model="userId" placeholder="Email Address" required name="userId">
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
                <div class="container">
                    <a href="#" data-target="#pwdModal" data-toggle="modal">Reset password</a>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
                <!--modal-->
                <div id="pwdModal" class="modal fade" tabindex="-1" role="dialog" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                <h1 class="text-center">Reset Password</h1>
                            </div>
                            <div class="modal-body">
                                <div class="col-md-12">
                                    <div class="panel panel-default">
                                        <div class="text-center">
                                            <div class="panel-body">
                                                <p>A verification link will be sent to your Email acccount.</p>
                                                <form role="form" name="nf" >
                                                    <div class="form-group">
                                                        <input type="email" class="form-control" ng-model="muserId" placeholder="Email Address" required name="userId">
                                                    </div>
                                                    <div class="text-center">
                                                        <button type="submit" class="btn btn-default btn-sm" ng-click="reset($event)">Submit</button>
                                                    </div>

                                                </form>
                                                <span ng-show="nf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                                                <span ng-show="nf.userId.$touched && nf.userId.$error.required" class="editmsgs">UserId required.Enter a valid email id</span><br>

                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <div class="col-md-12">
                                    <button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </div>
</div>
<script>
        //todo: progress indicator

        var app = angular.module('login',  ['ngCookies','ngAnimate']);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*123.80*/("""{"""),format.raw/*123.81*/("""
            """),format.raw/*124.13*/("""$locationProvider.html5Mode("""),format.raw/*124.41*/("""{"""),format.raw/*124.42*/("""enabled: true, requireBase: false"""),format.raw/*124.75*/("""}"""),format.raw/*124.76*/(""").hashPrefix('*');
        """),format.raw/*125.9*/("""}"""),format.raw/*125.10*/("""]);


        app.controller('loginCtrl', function($scope, $http, $location, $window, $cookies) """),format.raw/*128.91*/("""{"""),format.raw/*128.92*/("""
            """),format.raw/*129.13*/("""// Initialize the view
            $scope.error="";
            $scope.conerror = "";
            $scope.bConerror = false;
            $scope.users=[];
            $scope.groupId = "";
            $scope.userId = "";





           // Login as no group with username password
             $scope.submit  = function(event) """),format.raw/*142.47*/("""{"""),format.raw/*142.48*/("""
                """),format.raw/*143.17*/("""event.preventDefault();

                // validate the login form
                if ($scope.lf.userId.$error.required || $scope.lf.userId.$error.email || !($scope.lf.userId.$dirty || $scope.lf.password.$dirty)) """),format.raw/*146.147*/("""{"""),format.raw/*146.148*/("""
                    """),format.raw/*147.21*/("""$scope.lf.userId.$touched = true;
                    return;

                """),format.raw/*150.17*/("""}"""),format.raw/*150.18*/("""
                """),format.raw/*151.17*/("""// set user cookies
                $cookies.put("tzoffset", new Date().getTimezoneOffset().toString());
                $cookies.put("userId", $scope.userId);
                $cookies.put("groupId", "None");

                $scope.conerror = "";
                $scope.bConerror = false;
                $http("""),format.raw/*158.23*/("""{"""),format.raw/*158.24*/("""
                        """),format.raw/*159.25*/("""method : "POST",
                        url : """"),_display_(/*160.33*/routes/*160.39*/.HomeController.login),format.raw/*160.60*/("""",
                        data : """),format.raw/*161.32*/("""{"""),format.raw/*161.33*/(""""userId" : $scope.userId, "groupId" : $scope.groupId, "password" : $scope.password"""),format.raw/*161.115*/("""}"""),format.raw/*161.116*/(""",
                        headers : """),format.raw/*162.35*/("""{"""),format.raw/*162.36*/("""
                            """),format.raw/*163.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*164.25*/("""}"""),format.raw/*164.26*/("""
                    """),format.raw/*165.21*/("""}"""),format.raw/*165.22*/(""").then(function successCallback(response) """),format.raw/*165.64*/("""{"""),format.raw/*165.65*/("""

                        """),format.raw/*167.25*/("""$location.path(""""),_display_(/*167.42*/routes/*167.48*/.PostController.getPosts),format.raw/*167.72*/("""").replace();
                        $window.location.href = $location.absUrl();
                    """),format.raw/*169.21*/("""}"""),format.raw/*169.22*/(""", function errorCallback(response) """),format.raw/*169.57*/("""{"""),format.raw/*169.58*/("""
                        """),format.raw/*170.25*/("""$cookies.remove("userId");
                        $cookies.remove("groupId");
                        $cookies.remove("tzoffset");
                        if (response.status == 400) """),format.raw/*173.53*/("""{"""),format.raw/*173.54*/("""
                            """),format.raw/*174.29*/("""$scope.error = response.data.error;
                            $scope.lf.$setPristine();
                        """),format.raw/*176.25*/("""}"""),format.raw/*176.26*/(""" """),format.raw/*176.27*/("""else """),format.raw/*176.32*/("""{"""),format.raw/*176.33*/("""
                            """),format.raw/*177.29*/("""$scope.bConerror = true;
                            $scope.conerror = "Error trying to login. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*180.25*/("""}"""),format.raw/*180.26*/("""
                    """),format.raw/*181.21*/("""}"""),format.raw/*181.22*/(""");
            """),format.raw/*182.13*/("""}"""),format.raw/*182.14*/(""";

            // password Reset
             $scope.reset  = function(event) """),format.raw/*185.46*/("""{"""),format.raw/*185.47*/("""
                """),format.raw/*186.17*/("""event.preve
                // validate the login form
                if ($scope.nf.userId.$error.required || $scope.nf.userId.$error.email || !$scope.nf.userId.$dirty ) """),format.raw/*188.117*/("""{"""),format.raw/*188.118*/("""
                    """),format.raw/*189.21*/("""$scope.nf.userId.$touched = true;


                """),format.raw/*192.17*/("""}"""),format.raw/*192.18*/("""
                """),format.raw/*193.17*/("""// set user cookies
                $cookies.put

                $scope.conerror = "";

                $scope.bConerror = false;
                $http("""),format.raw/*199.23*/("""{"""),format.raw/*199.24*/("""
                        """),format.raw/*200.25*/("""method : "POST",
                        url : """"),_display_(/*201.33*/routes/*201.39*/.PasswordResetController.changeRequest),format.raw/*201.77*/("""",
                        data : """),format.raw/*202.32*/("""{"""),format.raw/*202.33*/(""""userId" : $scope.muserId"""),format.raw/*202.58*/("""}"""),format.raw/*202.59*/(""",
                        headers : """),format.raw/*203.35*/("""{"""),format.raw/*203.36*/("""
                            """),format.raw/*204.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*205.25*/("""}"""),format.raw/*205.26*/("""
                    """),format.raw/*206.21*/("""}"""),format.raw/*206.22*/(""").then(function successCallback(response) """),format.raw/*206.64*/("""{"""),format.raw/*206.65*/("""


                        """),format.raw/*209.25*/("""$window.location.href = $location.absUrl();
                    """),format.raw/*210.21*/("""}"""),format.raw/*210.22*/(""", function errorCallback(response) """),format.raw/*210.57*/("""{"""),format.raw/*210.58*/("""
                        """),format.raw/*211.25*/("""$cookies.remove("userId");
                        if (response.status == 400) """),format.raw/*212.53*/("""{"""),format.raw/*212.54*/("""
                            """),format.raw/*213.29*/("""$scope.error = response.data.error;
                            $scope.nf.$setPristine();
                        """),format.raw/*215.25*/("""}"""),format.raw/*215.26*/(""" """),format.raw/*215.27*/("""else """),format.raw/*215.32*/("""{"""),format.raw/*215.33*/("""
                            """),format.raw/*216.29*/("""$scope.bConerror = true;
                            $scope.conerror = "Error trying to send email. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*219.25*/("""}"""),format.raw/*219.26*/("""
                    """),format.raw/*220.21*/("""}"""),format.raw/*220.22*/(""");
            """),format.raw/*221.13*/("""}"""),format.raw/*221.14*/(""";

        """),format.raw/*223.9*/("""}"""),format.raw/*223.10*/(""");
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
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Fri Oct 14 15:46:16 IST 2016
                  SOURCE: /home/si2chip/si2chip/app/views/home.scala.html
                  HASH: dd9474929ef0b194c5471e6f036cda8f2dc2b980
                  MATRIX: 825->0|1128->277|1142->283|1210->331|1271->366|1285->372|1346->413|2041->1081|2056->1087|2112->1122|2141->1123|3028->1982|3057->1983|3086->1984|3122->1992|3151->1993|3180->1994|3233->2019|7739->6496|7769->6497|7811->6510|7868->6538|7898->6539|7960->6572|7990->6573|8045->6600|8075->6601|8200->6697|8230->6698|8272->6711|8625->7035|8655->7036|8701->7053|8945->7267|8976->7268|9026->7289|9134->7368|9164->7369|9210->7386|9551->7698|9581->7699|9635->7724|9712->7773|9728->7779|9771->7800|9834->7834|9864->7835|9976->7917|10007->7918|10072->7954|10102->7955|10160->7984|10249->8044|10279->8045|10329->8066|10359->8067|10430->8109|10460->8110|10515->8136|10560->8153|10576->8159|10622->8183|10753->8285|10783->8286|10847->8321|10877->8322|10931->8347|11144->8531|11174->8532|11232->8561|11375->8675|11405->8676|11435->8677|11469->8682|11499->8683|11557->8712|11772->8898|11802->8899|11852->8920|11882->8921|11926->8936|11956->8937|12063->9015|12093->9016|12139->9033|12340->9204|12371->9205|12421->9226|12502->9278|12532->9279|12578->9296|12760->9449|12790->9450|12844->9475|12921->9524|12937->9530|12997->9568|13060->9602|13090->9603|13144->9628|13174->9629|13239->9665|13269->9666|13327->9695|13416->9755|13446->9756|13496->9777|13526->9778|13597->9820|13627->9821|13683->9848|13776->9912|13806->9913|13870->9948|13900->9949|13954->9974|14062->10053|14092->10054|14150->10083|14293->10197|14323->10198|14353->10199|14387->10204|14417->10205|14475->10234|14695->10425|14725->10426|14775->10447|14805->10448|14849->10463|14879->10464|14918->10475|14948->10476
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|52->21|52->21|52->21|52->21|72->41|72->41|72->41|72->41|72->41|72->41|73->42|154->123|154->123|155->124|155->124|155->124|155->124|155->124|156->125|156->125|159->128|159->128|160->129|173->142|173->142|174->143|177->146|177->146|178->147|181->150|181->150|182->151|189->158|189->158|190->159|191->160|191->160|191->160|192->161|192->161|192->161|192->161|193->162|193->162|194->163|195->164|195->164|196->165|196->165|196->165|196->165|198->167|198->167|198->167|198->167|200->169|200->169|200->169|200->169|201->170|204->173|204->173|205->174|207->176|207->176|207->176|207->176|207->176|208->177|211->180|211->180|212->181|212->181|213->182|213->182|216->185|216->185|217->186|219->188|219->188|220->189|223->192|223->192|224->193|230->199|230->199|231->200|232->201|232->201|232->201|233->202|233->202|233->202|233->202|234->203|234->203|235->204|236->205|236->205|237->206|237->206|237->206|237->206|240->209|241->210|241->210|241->210|241->210|242->211|243->212|243->212|244->213|246->215|246->215|246->215|246->215|246->215|247->216|250->219|250->219|251->220|251->220|252->221|252->221|254->223|254->223
                  -- GENERATED --
              */
          