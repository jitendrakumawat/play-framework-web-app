
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
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular-cookies.min.js"></script>

    <title>Si2chip Home</title>
</head>
<body>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <img src="""),_display_(/*20.23*/routes/*20.29*/.Assets.versioned("images/l46.png")),format.raw/*20.64*/(""" """),format.raw/*20.65*/("""class="logo">
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

        var app = angular.module('login',  ['ngCookies']);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*122.80*/("""{"""),format.raw/*122.81*/("""
            """),format.raw/*123.13*/("""$locationProvider.html5Mode("""),format.raw/*123.41*/("""{"""),format.raw/*123.42*/("""enabled: true, requireBase: false"""),format.raw/*123.75*/("""}"""),format.raw/*123.76*/(""").hashPrefix('*');
        """),format.raw/*124.9*/("""}"""),format.raw/*124.10*/("""]);


        app.controller('loginCtrl', function($scope, $http, $location, $window, $cookies) """),format.raw/*127.91*/("""{"""),format.raw/*127.92*/("""
            """),format.raw/*128.13*/("""// Initialize the view
            $scope.error="";
            $scope.conerror = "";
            $scope.bConerror = false;
            $scope.users=[];
            $scope.groupId = "";
            $scope.userId = "";





           // Login as no group with username password
             $scope.submit  = function(event) """),format.raw/*141.47*/("""{"""),format.raw/*141.48*/("""
                """),format.raw/*142.17*/("""event.preventDefault();

                // validate the login form
                if ($scope.lf.userId.$error.required || $scope.lf.userId.$error.email || !($scope.lf.userId.$dirty || $scope.lf.password.$dirty)) """),format.raw/*145.147*/("""{"""),format.raw/*145.148*/("""
                    """),format.raw/*146.21*/("""$scope.lf.userId.$touched = true;
                    return;

                """),format.raw/*149.17*/("""}"""),format.raw/*149.18*/("""
                """),format.raw/*150.17*/("""// set user cookies
                $cookies.put("tzoffset", new Date().getTimezoneOffset().toString());
                $cookies.put("userId", $scope.userId);
                $cookies.put("groupId", "None");

                $scope.conerror = "";
                $scope.bConerror = false;
                $http("""),format.raw/*157.23*/("""{"""),format.raw/*157.24*/("""
                        """),format.raw/*158.25*/("""method : "POST",
                        url : """"),_display_(/*159.33*/routes/*159.39*/.HomeController.login),format.raw/*159.60*/("""",
                        data : """),format.raw/*160.32*/("""{"""),format.raw/*160.33*/(""""userId" : $scope.userId, "groupId" : $scope.groupId, "password" : $scope.password"""),format.raw/*160.115*/("""}"""),format.raw/*160.116*/(""",
                        headers : """),format.raw/*161.35*/("""{"""),format.raw/*161.36*/("""
                            """),format.raw/*162.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*163.25*/("""}"""),format.raw/*163.26*/("""
                    """),format.raw/*164.21*/("""}"""),format.raw/*164.22*/(""").then(function successCallback(response) """),format.raw/*164.64*/("""{"""),format.raw/*164.65*/("""

                        """),format.raw/*166.25*/("""$location.path(""""),_display_(/*166.42*/routes/*166.48*/.PostController.getPosts),format.raw/*166.72*/("""").replace();
                        $window.location.href = $location.absUrl();
                    """),format.raw/*168.21*/("""}"""),format.raw/*168.22*/(""", function errorCallback(response) """),format.raw/*168.57*/("""{"""),format.raw/*168.58*/("""
                        """),format.raw/*169.25*/("""$cookies.remove("userId");
                        $cookies.remove("groupId");
                        $cookies.remove("tzoffset");
                        if (response.status == 400) """),format.raw/*172.53*/("""{"""),format.raw/*172.54*/("""
                            """),format.raw/*173.29*/("""$scope.error = response.data.error;
                            $scope.lf.$setPristine();
                        """),format.raw/*175.25*/("""}"""),format.raw/*175.26*/(""" """),format.raw/*175.27*/("""else """),format.raw/*175.32*/("""{"""),format.raw/*175.33*/("""
                            """),format.raw/*176.29*/("""$scope.bConerror = true;
                            $scope.conerror = "Error trying to login. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/("""
                    """),format.raw/*180.21*/("""}"""),format.raw/*180.22*/(""");
            """),format.raw/*181.13*/("""}"""),format.raw/*181.14*/(""";

            // password Reset
             $scope.reset  = function(event) """),format.raw/*184.46*/("""{"""),format.raw/*184.47*/("""
                """),format.raw/*185.17*/("""event.preve
                // validate the login form
                if ($scope.nf.userId.$error.required || $scope.nf.userId.$error.email || !$scope.nf.userId.$dirty ) """),format.raw/*187.117*/("""{"""),format.raw/*187.118*/("""
                    """),format.raw/*188.21*/("""$scope.nf.userId.$touched = true;


                """),format.raw/*191.17*/("""}"""),format.raw/*191.18*/("""
                """),format.raw/*192.17*/("""// set user cookies
                $cookies.put

                $scope.conerror = "";

                $scope.bConerror = false;
                $http("""),format.raw/*198.23*/("""{"""),format.raw/*198.24*/("""
                        """),format.raw/*199.25*/("""method : "POST",
                        url : """"),_display_(/*200.33*/routes/*200.39*/.PasswordResetController.changeRequest),format.raw/*200.77*/("""",
                        data : """),format.raw/*201.32*/("""{"""),format.raw/*201.33*/(""""userId" : $scope.muserId"""),format.raw/*201.58*/("""}"""),format.raw/*201.59*/(""",
                        headers : """),format.raw/*202.35*/("""{"""),format.raw/*202.36*/("""
                            """),format.raw/*203.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*204.25*/("""}"""),format.raw/*204.26*/("""
                    """),format.raw/*205.21*/("""}"""),format.raw/*205.22*/(""").then(function successCallback(response) """),format.raw/*205.64*/("""{"""),format.raw/*205.65*/("""


                        """),format.raw/*208.25*/("""$window.location.href = $location.absUrl();
                    """),format.raw/*209.21*/("""}"""),format.raw/*209.22*/(""", function errorCallback(response) """),format.raw/*209.57*/("""{"""),format.raw/*209.58*/("""
                        """),format.raw/*210.25*/("""$cookies.remove("userId");
                        if (response.status == 400) """),format.raw/*211.53*/("""{"""),format.raw/*211.54*/("""
                            """),format.raw/*212.29*/("""$scope.error = response.data.error;
                            $scope.nf.$setPristine();
                        """),format.raw/*214.25*/("""}"""),format.raw/*214.26*/(""" """),format.raw/*214.27*/("""else """),format.raw/*214.32*/("""{"""),format.raw/*214.33*/("""
                            """),format.raw/*215.29*/("""$scope.bConerror = true;
                            $scope.conerror = "Error trying to send email. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*218.25*/("""}"""),format.raw/*218.26*/("""
                    """),format.raw/*219.21*/("""}"""),format.raw/*219.22*/(""");
            """),format.raw/*220.13*/("""}"""),format.raw/*220.14*/(""";

        """),format.raw/*222.9*/("""}"""),format.raw/*222.10*/(""");
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
                  DATE: Thu Oct 06 19:46:10 IST 2016
                  SOURCE: /home/si2chip/test/si2chip1/si2chip/app/views/home.scala.html
                  HASH: 258045635af594ef5aeb7e4b6ff0d0282f94424b
                  MATRIX: 825->0|1128->277|1142->283|1210->331|1271->366|1285->372|1346->413|1940->980|1955->986|2011->1021|2040->1022|2927->1881|2956->1882|2985->1883|3021->1891|3050->1892|3079->1893|3132->1918|7626->6383|7656->6384|7698->6397|7755->6425|7785->6426|7847->6459|7877->6460|7932->6487|7962->6488|8087->6584|8117->6585|8159->6598|8512->6922|8542->6923|8588->6940|8832->7154|8863->7155|8913->7176|9021->7255|9051->7256|9097->7273|9438->7585|9468->7586|9522->7611|9599->7660|9615->7666|9658->7687|9721->7721|9751->7722|9863->7804|9894->7805|9959->7841|9989->7842|10047->7871|10136->7931|10166->7932|10216->7953|10246->7954|10317->7996|10347->7997|10402->8023|10447->8040|10463->8046|10509->8070|10640->8172|10670->8173|10734->8208|10764->8209|10818->8234|11031->8418|11061->8419|11119->8448|11262->8562|11292->8563|11322->8564|11356->8569|11386->8570|11444->8599|11659->8785|11689->8786|11739->8807|11769->8808|11813->8823|11843->8824|11950->8902|11980->8903|12026->8920|12227->9091|12258->9092|12308->9113|12389->9165|12419->9166|12465->9183|12647->9336|12677->9337|12731->9362|12808->9411|12824->9417|12884->9455|12947->9489|12977->9490|13031->9515|13061->9516|13126->9552|13156->9553|13214->9582|13303->9642|13333->9643|13383->9664|13413->9665|13484->9707|13514->9708|13570->9735|13663->9799|13693->9800|13757->9835|13787->9836|13841->9861|13949->9940|13979->9941|14037->9970|14180->10084|14210->10085|14240->10086|14274->10091|14304->10092|14362->10121|14582->10312|14612->10313|14662->10334|14692->10335|14736->10350|14766->10351|14805->10362|14835->10363
                  LINES: 32->1|38->7|38->7|38->7|39->8|39->8|39->8|51->20|51->20|51->20|51->20|71->40|71->40|71->40|71->40|71->40|71->40|72->41|153->122|153->122|154->123|154->123|154->123|154->123|154->123|155->124|155->124|158->127|158->127|159->128|172->141|172->141|173->142|176->145|176->145|177->146|180->149|180->149|181->150|188->157|188->157|189->158|190->159|190->159|190->159|191->160|191->160|191->160|191->160|192->161|192->161|193->162|194->163|194->163|195->164|195->164|195->164|195->164|197->166|197->166|197->166|197->166|199->168|199->168|199->168|199->168|200->169|203->172|203->172|204->173|206->175|206->175|206->175|206->175|206->175|207->176|210->179|210->179|211->180|211->180|212->181|212->181|215->184|215->184|216->185|218->187|218->187|219->188|222->191|222->191|223->192|229->198|229->198|230->199|231->200|231->200|231->200|232->201|232->201|232->201|232->201|233->202|233->202|234->203|235->204|235->204|236->205|236->205|236->205|236->205|239->208|240->209|240->209|240->209|240->209|241->210|242->211|242->211|243->212|245->214|245->214|245->214|245->214|245->214|246->215|249->218|249->218|250->219|250->219|251->220|251->220|253->222|253->222
                  -- GENERATED --
              */
          