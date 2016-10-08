
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object setup_Scope0 {
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

class setup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    <link rel="stylesheet" href="""),_display_(/*9.34*/routes/*9.40*/.Assets.versioned("stylesheets/admin.css")),format.raw/*9.82*/(""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <title>SI2Chip Setup</title>
</head>
<body ng-app="admin" ng-controller="adminCtrl">
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <img src="""),_display_(/*19.23*/routes/*19.29*/.Assets.versioned("images/l46.png")),format.raw/*19.64*/(""" """),format.raw/*19.65*/("""class="logo">
        </div>
        <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="#"> Setup </a></li>
            <li><a href="#" ng-click="showHome($event)"><span class="glyphicon glyphicon-log-in"></span> Login </a></li>
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
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <div class="modal-body">
                            """),format.raw/*38.29*/("""{"""),format.raw/*38.30*/("""{"""),format.raw/*38.31*/("""conerror"""),format.raw/*38.39*/("""}"""),format.raw/*38.40*/("""}"""),format.raw/*38.41*/("""
                        """),format.raw/*39.25*/("""</div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6">
            <div class="well well-lg">
                <table class="table">
                    <thead>
                    <tr>
                        <th>
                            <div class="text-center">
                                <h4 id="adminmgmttitle">Admin Setup</h4>
                            </div>
                        </th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>
                            <a href="#" ng-click="toggleAddAdminEditor($event)">Add admin<span ng-show="!angular.isUndefined(bShowAUE)&& bShowAUE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowAUE) || !bShowAUE" class="glyphicon glyphicon-menu-down"></span>
                            </a>
                            <div class="well well-md" ng-show="!angular.isUndefined(bShowAUE) && bShowAUE">
                                <form role="form" name="auf">
                                    <div class="form-group">
                                        <input type="email" class="form-control" maxlength="255" ng-model="nUserId" placeholder="Enter email id here" required name="userId">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" ng-model="nPassword" placeholder="Enter password here" name="password">
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-default btn-md" ng-click="addUser($event)">Add</button>
                                    </div>
                                </form>
                                <span ng-show="auf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                                <span ng-show="auf.userId.$touched && auf.userId.$error.required" class="editmsgs">UserId required. Enter a valid email id</span><br>
                                <span ng-if="!(auf.userId.$dirty || auf.password.$dirty)" ng-bind="adderror" class="error"></span>
                                <span ng-if="!(auf.userId.$touched || auf.password.$touched) && addSuccess" class="success">Admin added successfully</span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <a href="#" ng-click="toggleAdminEditor($event)">Reset password<span ng-show="!angular.isUndefined(bShowRPE)&& bShowRPE" class="glyphicon glyphicon-menu-up"></span><span ng-show="angular.isUndefined(bShowRPE) || !bShowRPE" class="glyphicon glyphicon-menu-down"></span>
                            </a>
                            <div class="well well-md" ng-show="!angular.isUndefined(bShowRPE) && bShowRPE">
                                <form role="form" name="rpf">
                                    <div class="form-group">
                                        <a href="#" ng-click="refreshAdminUsers($event)" class="btn btn-info btn-xs">
                                            <span class="glyphicon glyphicon-refresh"></span> Refresh admin list
                                        </a>
                                    </div>
                                    <div class="form-group">
                                        <select class="form-control" ng-options="usr.userId for usr in allAdmins" name="userId" ng-model="mUser" required>
                                            <option value="">Select Admin</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" ng-model="mPassword" placeholder="Enter password here" name="password">
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-default btn-md" ng-click="modifyAdmin($event)">Reset</button>
                                    </div>
                                </form>
                                <span ng-show="allAdmins.length != 0 && rpf.userId.$touched && rpf.userId.$error.required" class="editmsgs">UserId required. Select a email id</span><br>
                                <span ng-if="!rpf.userId.$dirty" ng-bind="moderror" class="error"></span>
                                <span ng-if="!(rpf.userId.$touched || rpf.password.$touched) && modSuccess" class="success">Password changed</span>
                            </div>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
        var app = angular.module('admin',  []);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*119.80*/("""{"""),format.raw/*119.81*/("""
            """),format.raw/*120.13*/("""$locationProvider.html5Mode("""),format.raw/*120.41*/("""{"""),format.raw/*120.42*/("""enabled: true, requireBase: false"""),format.raw/*120.75*/("""}"""),format.raw/*120.76*/(""").hashPrefix('*');
        """),format.raw/*121.9*/("""}"""),format.raw/*121.10*/("""]);

        app.service("AdminSvc", function ($http, $q) """),format.raw/*123.54*/("""{"""),format.raw/*123.55*/("""
            """),format.raw/*124.13*/("""var deferred;
            this.getAdmins = function () """),format.raw/*125.42*/("""{"""),format.raw/*125.43*/("""
                """),format.raw/*126.17*/("""deferred = $q.defer();
                return $http("""),format.raw/*127.30*/("""{"""),format.raw/*127.31*/("""
                        """),format.raw/*128.25*/("""method : "GET",
                        url : """"),_display_(/*129.33*/routes/*129.39*/.AdminController.getAdminUsers),format.raw/*129.69*/("""",
                        headers : """),format.raw/*130.35*/("""{"""),format.raw/*130.36*/("""
                        """),format.raw/*131.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*132.25*/("""}"""),format.raw/*132.26*/("""
                    """),format.raw/*133.21*/("""}"""),format.raw/*133.22*/(""")
                    .then(function (response) """),format.raw/*134.47*/("""{"""),format.raw/*134.48*/("""
                        """),format.raw/*135.25*/("""deferred.resolve(response);
                        return deferred.promise;
                    """),format.raw/*137.21*/("""}"""),format.raw/*137.22*/(""", function (response) """),format.raw/*137.44*/("""{"""),format.raw/*137.45*/("""
                        """),format.raw/*138.25*/("""deferred.reject(response);
                        return deferred.promise;
                    """),format.raw/*140.21*/("""}"""),format.raw/*140.22*/(""");
            """),format.raw/*141.13*/("""}"""),format.raw/*141.14*/(""";
        """),format.raw/*142.9*/("""}"""),format.raw/*142.10*/(""");

        app.controller('adminCtrl', function($scope, $http, $location, $window, AdminSvc) """),format.raw/*144.91*/("""{"""),format.raw/*144.92*/("""
            """),format.raw/*145.13*/("""// Initialize the view
            $scope.adderror="";
            $scope.moderror="";
            $scope.conerror = "";
            $scope.allAdmins=[];
            $scope.nPassword = "";
            $scope.mPassword = "";
            $scope.addSuccess = false;
            $scope.modSuccess = false;

            $scope.showHome = function(event) """),format.raw/*155.47*/("""{"""),format.raw/*155.48*/("""
                """),format.raw/*156.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*157.34*/routes/*157.40*/.HomeController.showHomePage),format.raw/*157.68*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*159.13*/("""}"""),format.raw/*159.14*/(""";

            $scope.addUser  = function(event) """),format.raw/*161.47*/("""{"""),format.raw/*161.48*/("""
                """),format.raw/*162.17*/("""event.preventDefault();

                // validate the add user form
                if ($scope.auf.userId.$error.required || $scope.auf.userId.$error.email || !($scope.auf.userId.$dirty || $scope.auf.password.$dirty)) """),format.raw/*165.151*/("""{"""),format.raw/*165.152*/("""
                    """),format.raw/*166.21*/("""$scope.auf.userId.$touched = true;
                    return;
                """),format.raw/*168.17*/("""}"""),format.raw/*168.18*/("""

                """),format.raw/*170.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                $http("""),format.raw/*173.23*/("""{"""),format.raw/*173.24*/("""
                        """),format.raw/*174.25*/("""method : "POST",
                        url : """"),_display_(/*175.33*/routes/*175.39*/.AdminController.addAdmin),format.raw/*175.64*/("""",
                        data : """),format.raw/*176.32*/("""{"""),format.raw/*176.33*/(""""userId" : $scope.nUserId, "password" : $scope.nPassword"""),format.raw/*176.89*/("""}"""),format.raw/*176.90*/(""",
                        headers : """),format.raw/*177.35*/("""{"""),format.raw/*177.36*/("""
                            """),format.raw/*178.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*179.25*/("""}"""),format.raw/*179.26*/("""
                    """),format.raw/*180.21*/("""}"""),format.raw/*180.22*/(""").then(function successCallback(response) """),format.raw/*180.64*/("""{"""),format.raw/*180.65*/("""
                        """),format.raw/*181.25*/("""$scope.nUserId = "";
                        $scope.nPassword = "";
                        $scope.auf.userId.$touched = false;
                        $scope.auf.password.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*186.21*/("""}"""),format.raw/*186.22*/(""", function errorCallback(response) """),format.raw/*186.57*/("""{"""),format.raw/*186.58*/("""
                        """),format.raw/*187.25*/("""if (response.status == 400) """),format.raw/*187.53*/("""{"""),format.raw/*187.54*/("""
                            """),format.raw/*188.29*/("""$scope.adderror = response.data.error;
                            $scope.auf.$setPristine();
                        """),format.raw/*190.25*/("""}"""),format.raw/*190.26*/(""" """),format.raw/*190.27*/("""else """),format.raw/*190.32*/("""{"""),format.raw/*190.33*/("""
                            """),format.raw/*191.29*/("""$scope.conerror = "Error trying to add the admin user. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*193.25*/("""}"""),format.raw/*193.26*/("""
                    """),format.raw/*194.21*/("""}"""),format.raw/*194.22*/(""");
            """),format.raw/*195.13*/("""}"""),format.raw/*195.14*/(""";

            $scope.toggleAddAdminEditor = function(event) """),format.raw/*197.59*/("""{"""),format.raw/*197.60*/("""
                """),format.raw/*198.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowAUE)) """),format.raw/*199.58*/("""{"""),format.raw/*199.59*/("""
                    """),format.raw/*200.21*/("""$scope.bShowAUE = true;
                    $scope.nUserId = "";
                    $scope.nPassword = "";
                """),format.raw/*203.17*/("""}"""),format.raw/*203.18*/(""" """),format.raw/*203.19*/("""else """),format.raw/*203.24*/("""{"""),format.raw/*203.25*/("""
                    """),format.raw/*204.21*/("""$scope.bShowAUE = !$scope.bShowAUE;
                """),format.raw/*205.17*/("""}"""),format.raw/*205.18*/("""
            """),format.raw/*206.13*/("""}"""),format.raw/*206.14*/(""";

            $scope.refreshAdminUsers = function(event)"""),format.raw/*208.55*/("""{"""),format.raw/*208.56*/("""
                """),format.raw/*209.17*/("""$scope.loadAllAdmins(event);
                $scope.rpf.userId.$touched = false;
                $scope.rpf.password.$touched = false;
                $scope.moderror = "";
                $scope.modSuccess = false;
            """),format.raw/*214.13*/("""}"""),format.raw/*214.14*/(""";

            $scope.loadAllAdmins = function(event) """),format.raw/*216.52*/("""{"""),format.raw/*216.53*/("""
                """),format.raw/*217.17*/("""if (event != null)
                    event.preventDefault();
                $scope.conerror = "";
                $scope.allAdmins=[];
                AdminSvc.getAdmins().then(function successCallback(response) """),format.raw/*221.78*/("""{"""),format.raw/*221.79*/("""
                        """),format.raw/*222.25*/("""$scope.allAdmins = response.data;
                    """),format.raw/*223.21*/("""}"""),format.raw/*223.22*/(""", function errorCallback(response) """),format.raw/*223.57*/("""{"""),format.raw/*223.58*/("""
                        """),format.raw/*224.25*/("""$scope.conerror = "Error refreshing the list of all admin users. Retry.";
                        $('#conError').modal('show');
                    """),format.raw/*226.21*/("""}"""),format.raw/*226.22*/("""
                """),format.raw/*227.17*/(""");
            """),format.raw/*228.13*/("""}"""),format.raw/*228.14*/(""";

            $scope.modifyAdmin  = function(event) """),format.raw/*230.51*/("""{"""),format.raw/*230.52*/("""
                """),format.raw/*231.17*/("""event.preventDefault();

                // validate the modify user form
                if ($scope.rpf.userId.$error.required || !$scope.rpf.userId.$dirty) """),format.raw/*234.85*/("""{"""),format.raw/*234.86*/("""
                    """),format.raw/*235.21*/("""$scope.rpf.userId.$touched = true;
                    return;
                """),format.raw/*237.17*/("""}"""),format.raw/*237.18*/("""

                """),format.raw/*239.17*/("""$scope.conerror = "";
                $scope.moderror = "";
                $scope.modSuccess = false;
                $http("""),format.raw/*242.23*/("""{"""),format.raw/*242.24*/("""
                        """),format.raw/*243.25*/("""method : "PUT",
                        url : """"),_display_(/*244.33*/routes/*244.39*/.AdminController.modifyAdmin),format.raw/*244.67*/("""",
                        data : """),format.raw/*245.32*/("""{"""),format.raw/*245.33*/(""""userId" : $scope.mUser.userId, "password" : $scope.mPassword"""),format.raw/*245.94*/("""}"""),format.raw/*245.95*/(""",
                        headers : """),format.raw/*246.35*/("""{"""),format.raw/*246.36*/("""
                            """),format.raw/*247.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*248.25*/("""}"""),format.raw/*248.26*/("""
                    """),format.raw/*249.21*/("""}"""),format.raw/*249.22*/(""").then(function successCallback(response) """),format.raw/*249.64*/("""{"""),format.raw/*249.65*/("""
                        """),format.raw/*250.25*/("""$scope.mUser = null;
                        $scope.mPassword = "";
                        $scope.rpf.userId.$touched = false;
                        $scope.rpf.password.$touched = false;
                        $scope.modSuccess = true;
                    """),format.raw/*255.21*/("""}"""),format.raw/*255.22*/(""", function errorCallback(response) """),format.raw/*255.57*/("""{"""),format.raw/*255.58*/("""
                        """),format.raw/*256.25*/("""if (response.status == 400) """),format.raw/*256.53*/("""{"""),format.raw/*256.54*/("""
                            """),format.raw/*257.29*/("""$scope.moderror = response.data.error;
                            $scope.rpf.$setPristine();
                        """),format.raw/*259.25*/("""}"""),format.raw/*259.26*/(""" """),format.raw/*259.27*/("""else """),format.raw/*259.32*/("""{"""),format.raw/*259.33*/("""
                            """),format.raw/*260.29*/("""$scope.conerror = "Error trying to reset the password. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*262.25*/("""}"""),format.raw/*262.26*/("""
                    """),format.raw/*263.21*/("""}"""),format.raw/*263.22*/(""");
            """),format.raw/*264.13*/("""}"""),format.raw/*264.14*/(""";

            $scope.toggleAdminEditor = function(event) """),format.raw/*266.56*/("""{"""),format.raw/*266.57*/("""
                """),format.raw/*267.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowRPE)) """),format.raw/*268.58*/("""{"""),format.raw/*268.59*/("""
                    """),format.raw/*269.21*/("""$scope.bShowRPE = true;
                    $scope.loadAllAdmins(null);
                """),format.raw/*271.17*/("""}"""),format.raw/*271.18*/(""" """),format.raw/*271.19*/("""else """),format.raw/*271.24*/("""{"""),format.raw/*271.25*/("""
                    """),format.raw/*272.21*/("""$scope.bShowRPE = !$scope.bShowRPE;
                """),format.raw/*273.17*/("""}"""),format.raw/*273.18*/("""
            """),format.raw/*274.13*/("""}"""),format.raw/*274.14*/(""";
        """),format.raw/*275.9*/("""}"""),format.raw/*275.10*/(""");
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
object setup extends setup_Scope0.setup
              /*
                  -- GENERATED --
                  DATE: Fri Sep 16 10:40:32 IST 2016
                  SOURCE: /home/si2chip/applications/si2chip/app/views/setup.scala.html
                  HASH: 522ead8dfbab4502e7fb250a101d8a302bda5967
                  MATRIX: 827->1|1130->278|1144->284|1212->332|1273->367|1287->373|1349->415|1880->919|1895->925|1951->960|1980->961|2897->1850|2926->1851|2955->1852|2991->1860|3020->1861|3049->1862|3102->1887|8425->7181|8455->7182|8497->7195|8554->7223|8584->7224|8646->7257|8676->7258|8731->7285|8761->7286|8848->7344|8878->7345|8920->7358|9004->7413|9034->7414|9080->7431|9161->7483|9191->7484|9245->7509|9321->7557|9337->7563|9389->7593|9455->7630|9485->7631|9539->7656|9628->7716|9658->7717|9708->7738|9738->7739|9815->7787|9845->7788|9899->7813|10025->7910|10055->7911|10106->7933|10136->7934|10190->7959|10315->8055|10345->8056|10389->8071|10419->8072|10457->8082|10487->8083|10610->8177|10640->8178|10682->8191|11060->8540|11090->8541|11136->8558|11221->8615|11237->8621|11287->8649|11402->8735|11432->8736|11510->8785|11540->8786|11586->8803|11837->9024|11868->9025|11918->9046|12026->9125|12056->9126|12103->9144|12257->9269|12287->9270|12341->9295|12418->9344|12434->9350|12481->9375|12544->9409|12574->9410|12659->9466|12689->9467|12754->9503|12784->9504|12842->9533|12931->9593|12961->9594|13011->9615|13041->9616|13112->9658|13142->9659|13196->9684|13485->9944|13515->9945|13579->9980|13609->9981|13663->10006|13720->10034|13750->10035|13808->10064|13955->10182|13985->10183|14015->10184|14049->10189|14079->10190|14137->10219|14312->10365|14342->10366|14392->10387|14422->10388|14466->10403|14496->10404|14586->10465|14616->10466|14662->10483|14772->10564|14802->10565|14852->10586|15005->10710|15035->10711|15065->10712|15099->10717|15129->10718|15179->10739|15260->10791|15290->10792|15332->10805|15362->10806|15448->10863|15478->10864|15524->10881|15781->11109|15811->11110|15894->11164|15924->11165|15970->11182|16214->11397|16244->11398|16298->11423|16381->11477|16411->11478|16475->11513|16505->11514|16559->11539|16736->11687|16766->11688|16812->11705|16856->11720|16886->11721|16968->11774|16998->11775|17044->11792|17231->11950|17261->11951|17311->11972|17419->12051|17449->12052|17496->12070|17650->12195|17680->12196|17734->12221|17810->12269|17826->12275|17876->12303|17939->12337|17969->12338|18059->12399|18089->12400|18154->12436|18184->12437|18242->12466|18331->12526|18361->12527|18411->12548|18441->12549|18512->12591|18542->12592|18596->12617|18885->12877|18915->12878|18979->12913|19009->12914|19063->12939|19120->12967|19150->12968|19208->12997|19355->13115|19385->13116|19415->13117|19449->13122|19479->13123|19537->13152|19712->13298|19742->13299|19792->13320|19822->13321|19866->13336|19896->13337|19983->13395|20013->13396|20059->13413|20169->13494|20199->13495|20249->13516|20366->13604|20396->13605|20426->13606|20460->13611|20490->13612|20540->13633|20621->13685|20651->13686|20693->13699|20723->13700|20761->13710|20791->13711
                  LINES: 32->2|38->8|38->8|38->8|39->9|39->9|39->9|49->19|49->19|49->19|49->19|68->38|68->38|68->38|68->38|68->38|68->38|69->39|149->119|149->119|150->120|150->120|150->120|150->120|150->120|151->121|151->121|153->123|153->123|154->124|155->125|155->125|156->126|157->127|157->127|158->128|159->129|159->129|159->129|160->130|160->130|161->131|162->132|162->132|163->133|163->133|164->134|164->134|165->135|167->137|167->137|167->137|167->137|168->138|170->140|170->140|171->141|171->141|172->142|172->142|174->144|174->144|175->145|185->155|185->155|186->156|187->157|187->157|187->157|189->159|189->159|191->161|191->161|192->162|195->165|195->165|196->166|198->168|198->168|200->170|203->173|203->173|204->174|205->175|205->175|205->175|206->176|206->176|206->176|206->176|207->177|207->177|208->178|209->179|209->179|210->180|210->180|210->180|210->180|211->181|216->186|216->186|216->186|216->186|217->187|217->187|217->187|218->188|220->190|220->190|220->190|220->190|220->190|221->191|223->193|223->193|224->194|224->194|225->195|225->195|227->197|227->197|228->198|229->199|229->199|230->200|233->203|233->203|233->203|233->203|233->203|234->204|235->205|235->205|236->206|236->206|238->208|238->208|239->209|244->214|244->214|246->216|246->216|247->217|251->221|251->221|252->222|253->223|253->223|253->223|253->223|254->224|256->226|256->226|257->227|258->228|258->228|260->230|260->230|261->231|264->234|264->234|265->235|267->237|267->237|269->239|272->242|272->242|273->243|274->244|274->244|274->244|275->245|275->245|275->245|275->245|276->246|276->246|277->247|278->248|278->248|279->249|279->249|279->249|279->249|280->250|285->255|285->255|285->255|285->255|286->256|286->256|286->256|287->257|289->259|289->259|289->259|289->259|289->259|290->260|292->262|292->262|293->263|293->263|294->264|294->264|296->266|296->266|297->267|298->268|298->268|299->269|301->271|301->271|301->271|301->271|301->271|302->272|303->273|303->273|304->274|304->274|305->275|305->275
                  -- GENERATED --
              */
          