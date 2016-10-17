
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
                                            <input type="DATE" class="form-control" maxlength="255" ng-model="nuserbirth" placeholder="dd/MM/yyyy" required name="userbirth">
                                        </div>
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
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*128.80*/("""{"""),format.raw/*128.81*/("""
            """),format.raw/*129.13*/("""$locationProvider.html5Mode("""),format.raw/*129.41*/("""{"""),format.raw/*129.42*/("""enabled: true, requireBase: false"""),format.raw/*129.75*/("""}"""),format.raw/*129.76*/(""").hashPrefix('*');
        """),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""]);

        app.service("AdminSvc", function ($http, $q) """),format.raw/*132.54*/("""{"""),format.raw/*132.55*/("""
            """),format.raw/*133.13*/("""var deferred;
            this.getAdmins = function () """),format.raw/*134.42*/("""{"""),format.raw/*134.43*/("""
                """),format.raw/*135.17*/("""deferred = $q.defer();
                return $http("""),format.raw/*136.30*/("""{"""),format.raw/*136.31*/("""
                        """),format.raw/*137.25*/("""method : "GET",
                        url : """"),_display_(/*138.33*/routes/*138.39*/.AdminController.getAdminUsers),format.raw/*138.69*/("""",
                        headers : """),format.raw/*139.35*/("""{"""),format.raw/*139.36*/("""
                        """),format.raw/*140.25*/(""""Content-Type" : "application/json"
                        """),format.raw/*141.25*/("""}"""),format.raw/*141.26*/("""
                    """),format.raw/*142.21*/("""}"""),format.raw/*142.22*/(""")
                    .then(function (response) """),format.raw/*143.47*/("""{"""),format.raw/*143.48*/("""
                        """),format.raw/*144.25*/("""deferred.resolve(response);
                        return deferred.promise;
                    """),format.raw/*146.21*/("""}"""),format.raw/*146.22*/(""", function (response) """),format.raw/*146.44*/("""{"""),format.raw/*146.45*/("""
                        """),format.raw/*147.25*/("""deferred.reject(response);
                        return deferred.promise;
                    """),format.raw/*149.21*/("""}"""),format.raw/*149.22*/(""");
            """),format.raw/*150.13*/("""}"""),format.raw/*150.14*/(""";
        """),format.raw/*151.9*/("""}"""),format.raw/*151.10*/(""");

        app.controller('adminCtrl', function($scope, $http, $location, $window, AdminSvc) """),format.raw/*153.91*/("""{"""),format.raw/*153.92*/("""
            """),format.raw/*154.13*/("""// Initialize the view
            $scope.adderror="";
            $scope.moderror="";
            $scope.conerror = "";
            $scope.allAdmins=[];
            $scope.nPassword = "";
            $scope.mPassword = "";
            $scope.addSuccess = false;
            $scope.modSuccess = false;

            $scope.showHome = function(event) """),format.raw/*164.47*/("""{"""),format.raw/*164.48*/("""
                """),format.raw/*165.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*166.34*/routes/*166.40*/.HomeController.showHomePage),format.raw/*166.68*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*168.13*/("""}"""),format.raw/*168.14*/(""";

            $scope.addUser  = function(event) """),format.raw/*170.47*/("""{"""),format.raw/*170.48*/("""
                """),format.raw/*171.17*/("""event.preventDefault();

                // validate the add user form
                if ($scope.auf.userId.$error.required || $scope.auf.userId.$error.email || !($scope.auf.userId.$dirty || $scope.auf.password.$dirty)) """),format.raw/*174.151*/("""{"""),format.raw/*174.152*/("""
                    """),format.raw/*175.21*/("""$scope.auf.userId.$touched = true;
                    return;
                """),format.raw/*177.17*/("""}"""),format.raw/*177.18*/("""

                """),format.raw/*179.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                $http("""),format.raw/*182.23*/("""{"""),format.raw/*182.24*/("""
                        """),format.raw/*183.25*/("""method : "POST",
                        url : """"),_display_(/*184.33*/routes/*184.39*/.AdminController.addAdmin),format.raw/*184.64*/("""",
                        data : """),format.raw/*185.32*/("""{"""),format.raw/*185.33*/(""""name" : $scope.nUserName, "userId" : $scope.nUserId, "password" : $scope.nPassword, "userDesignation" : $scope.nuserDesignation, "userbirth" : $scope.nuserbirth"""),format.raw/*185.194*/("""}"""),format.raw/*185.195*/(""",
                        headers : """),format.raw/*186.35*/("""{"""),format.raw/*186.36*/("""
                            """),format.raw/*187.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*188.25*/("""}"""),format.raw/*188.26*/("""
                    """),format.raw/*189.21*/("""}"""),format.raw/*189.22*/(""").then(function successCallback(response) """),format.raw/*189.64*/("""{"""),format.raw/*189.65*/("""
                        """),format.raw/*190.25*/("""$scope.nUserId = "";
                        $scope.nPassword = "";
                        $scope.auf.userId.$touched = false;
                        $scope.auf.password.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*195.21*/("""}"""),format.raw/*195.22*/(""", function errorCallback(response) """),format.raw/*195.57*/("""{"""),format.raw/*195.58*/("""
                        """),format.raw/*196.25*/("""if (response.status == 400) """),format.raw/*196.53*/("""{"""),format.raw/*196.54*/("""
                            """),format.raw/*197.29*/("""$scope.adderror = response.data.error;
                            $scope.auf.$setPristine();
                        """),format.raw/*199.25*/("""}"""),format.raw/*199.26*/(""" """),format.raw/*199.27*/("""else """),format.raw/*199.32*/("""{"""),format.raw/*199.33*/("""
                            """),format.raw/*200.29*/("""$scope.conerror = "Error trying to add the admin user. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*202.25*/("""}"""),format.raw/*202.26*/("""
                    """),format.raw/*203.21*/("""}"""),format.raw/*203.22*/(""");
            """),format.raw/*204.13*/("""}"""),format.raw/*204.14*/(""";

            $scope.toggleAddAdminEditor = function(event) """),format.raw/*206.59*/("""{"""),format.raw/*206.60*/("""
                """),format.raw/*207.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowAUE)) """),format.raw/*208.58*/("""{"""),format.raw/*208.59*/("""
                    """),format.raw/*209.21*/("""$scope.bShowAUE = true;
                    $scope.nUserId = "";
                    $scope.nPassword = "";
                """),format.raw/*212.17*/("""}"""),format.raw/*212.18*/(""" """),format.raw/*212.19*/("""else """),format.raw/*212.24*/("""{"""),format.raw/*212.25*/("""
                    """),format.raw/*213.21*/("""$scope.bShowAUE = !$scope.bShowAUE;
                """),format.raw/*214.17*/("""}"""),format.raw/*214.18*/("""
            """),format.raw/*215.13*/("""}"""),format.raw/*215.14*/(""";

            $scope.refreshAdminUsers = function(event)"""),format.raw/*217.55*/("""{"""),format.raw/*217.56*/("""
                """),format.raw/*218.17*/("""$scope.loadAllAdmins(event);
                $scope.rpf.userId.$touched = false;
                $scope.rpf.password.$touched = false;
                $scope.moderror = "";
                $scope.modSuccess = false;
            """),format.raw/*223.13*/("""}"""),format.raw/*223.14*/(""";

            $scope.loadAllAdmins = function(event) """),format.raw/*225.52*/("""{"""),format.raw/*225.53*/("""
                """),format.raw/*226.17*/("""if (event != null)
                    event.preventDefault();
                $scope.conerror = "";
                $scope.allAdmins=[];
                AdminSvc.getAdmins().then(function successCallback(response) """),format.raw/*230.78*/("""{"""),format.raw/*230.79*/("""
                        """),format.raw/*231.25*/("""$scope.allAdmins = response.data;
                    """),format.raw/*232.21*/("""}"""),format.raw/*232.22*/(""", function errorCallback(response) """),format.raw/*232.57*/("""{"""),format.raw/*232.58*/("""
                        """),format.raw/*233.25*/("""$scope.conerror = "Error refreshing the list of all admin users. Retry.";
                        $('#conError').modal('show');
                    """),format.raw/*235.21*/("""}"""),format.raw/*235.22*/("""
                """),format.raw/*236.17*/(""");
            """),format.raw/*237.13*/("""}"""),format.raw/*237.14*/(""";

            $scope.modifyAdmin  = function(event) """),format.raw/*239.51*/("""{"""),format.raw/*239.52*/("""
                """),format.raw/*240.17*/("""event.preventDefault();

                // validate the modify user form
                if ($scope.rpf.userId.$error.required || !$scope.rpf.userId.$dirty) """),format.raw/*243.85*/("""{"""),format.raw/*243.86*/("""
                    """),format.raw/*244.21*/("""$scope.rpf.userId.$touched = true;
                    return;
                """),format.raw/*246.17*/("""}"""),format.raw/*246.18*/("""

                """),format.raw/*248.17*/("""$scope.conerror = "";
                $scope.moderror = "";
                $scope.modSuccess = false;
                $http("""),format.raw/*251.23*/("""{"""),format.raw/*251.24*/("""
                        """),format.raw/*252.25*/("""method : "PUT",
                        url : """"),_display_(/*253.33*/routes/*253.39*/.AdminController.modifyAdmin),format.raw/*253.67*/("""",
                        data : """),format.raw/*254.32*/("""{"""),format.raw/*254.33*/(""""userId" : $scope.mUser.userId, "password" : $scope.mPassword"""),format.raw/*254.94*/("""}"""),format.raw/*254.95*/(""",
                        headers : """),format.raw/*255.35*/("""{"""),format.raw/*255.36*/("""
                            """),format.raw/*256.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*257.25*/("""}"""),format.raw/*257.26*/("""
                    """),format.raw/*258.21*/("""}"""),format.raw/*258.22*/(""").then(function successCallback(response) """),format.raw/*258.64*/("""{"""),format.raw/*258.65*/("""
                        """),format.raw/*259.25*/("""$scope.mUser = null;
                        $scope.mPassword = "";
                        $scope.rpf.userId.$touched = false;
                        $scope.rpf.password.$touched = false;
                        $scope.modSuccess = true;
                    """),format.raw/*264.21*/("""}"""),format.raw/*264.22*/(""", function errorCallback(response) """),format.raw/*264.57*/("""{"""),format.raw/*264.58*/("""
                        """),format.raw/*265.25*/("""if (response.status == 400) """),format.raw/*265.53*/("""{"""),format.raw/*265.54*/("""
                            """),format.raw/*266.29*/("""$scope.moderror = response.data.error;
                            $scope.rpf.$setPristine();
                        """),format.raw/*268.25*/("""}"""),format.raw/*268.26*/(""" """),format.raw/*268.27*/("""else """),format.raw/*268.32*/("""{"""),format.raw/*268.33*/("""
                            """),format.raw/*269.29*/("""$scope.conerror = "Error trying to reset the password. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*271.25*/("""}"""),format.raw/*271.26*/("""
                    """),format.raw/*272.21*/("""}"""),format.raw/*272.22*/(""");
            """),format.raw/*273.13*/("""}"""),format.raw/*273.14*/(""";

            $scope.toggleAdminEditor = function(event) """),format.raw/*275.56*/("""{"""),format.raw/*275.57*/("""
                """),format.raw/*276.17*/("""event.preventDefault();
                if(angular.isUndefined($scope.bShowRPE)) """),format.raw/*277.58*/("""{"""),format.raw/*277.59*/("""
                    """),format.raw/*278.21*/("""$scope.bShowRPE = true;
                    $scope.loadAllAdmins(null);
                """),format.raw/*280.17*/("""}"""),format.raw/*280.18*/(""" """),format.raw/*280.19*/("""else """),format.raw/*280.24*/("""{"""),format.raw/*280.25*/("""
                    """),format.raw/*281.21*/("""$scope.bShowRPE = !$scope.bShowRPE;
                """),format.raw/*282.17*/("""}"""),format.raw/*282.18*/("""
            """),format.raw/*283.13*/("""}"""),format.raw/*283.14*/(""";
        """),format.raw/*284.9*/("""}"""),format.raw/*284.10*/(""");
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
                  DATE: Sat Oct 15 15:39:27 IST 2016
                  SOURCE: /home/si2chip/si2chip/app/views/setup.scala.html
                  HASH: 1c48eb2b4eafc6cbbc243ad973ceef4f63983b7c
                  MATRIX: 827->1|1130->278|1144->284|1212->332|1273->367|1287->373|1349->415|1880->919|1895->925|1951->960|1980->961|2897->1850|2926->1851|2955->1852|2991->1860|3020->1861|3049->1862|3102->1887|9264->8020|9294->8021|9336->8034|9393->8062|9423->8063|9485->8096|9515->8097|9570->8124|9600->8125|9687->8183|9717->8184|9759->8197|9843->8252|9873->8253|9919->8270|10000->8322|10030->8323|10084->8348|10160->8396|10176->8402|10228->8432|10294->8469|10324->8470|10378->8495|10467->8555|10497->8556|10547->8577|10577->8578|10654->8626|10684->8627|10738->8652|10864->8749|10894->8750|10945->8772|10975->8773|11029->8798|11154->8894|11184->8895|11228->8910|11258->8911|11296->8921|11326->8922|11449->9016|11479->9017|11521->9030|11899->9379|11929->9380|11975->9397|12060->9454|12076->9460|12126->9488|12241->9574|12271->9575|12349->9624|12379->9625|12425->9642|12676->9863|12707->9864|12757->9885|12865->9964|12895->9965|12942->9983|13096->10108|13126->10109|13180->10134|13257->10183|13273->10189|13320->10214|13383->10248|13413->10249|13604->10410|13635->10411|13700->10447|13730->10448|13788->10477|13877->10537|13907->10538|13957->10559|13987->10560|14058->10602|14088->10603|14142->10628|14431->10888|14461->10889|14525->10924|14555->10925|14609->10950|14666->10978|14696->10979|14754->11008|14901->11126|14931->11127|14961->11128|14995->11133|15025->11134|15083->11163|15258->11309|15288->11310|15338->11331|15368->11332|15412->11347|15442->11348|15532->11409|15562->11410|15608->11427|15718->11508|15748->11509|15798->11530|15951->11654|15981->11655|16011->11656|16045->11661|16075->11662|16125->11683|16206->11735|16236->11736|16278->11749|16308->11750|16394->11807|16424->11808|16470->11825|16727->12053|16757->12054|16840->12108|16870->12109|16916->12126|17160->12341|17190->12342|17244->12367|17327->12421|17357->12422|17421->12457|17451->12458|17505->12483|17682->12631|17712->12632|17758->12649|17802->12664|17832->12665|17914->12718|17944->12719|17990->12736|18177->12894|18207->12895|18257->12916|18365->12995|18395->12996|18442->13014|18596->13139|18626->13140|18680->13165|18756->13213|18772->13219|18822->13247|18885->13281|18915->13282|19005->13343|19035->13344|19100->13380|19130->13381|19188->13410|19277->13470|19307->13471|19357->13492|19387->13493|19458->13535|19488->13536|19542->13561|19831->13821|19861->13822|19925->13857|19955->13858|20009->13883|20066->13911|20096->13912|20154->13941|20301->14059|20331->14060|20361->14061|20395->14066|20425->14067|20483->14096|20658->14242|20688->14243|20738->14264|20768->14265|20812->14280|20842->14281|20929->14339|20959->14340|21005->14357|21115->14438|21145->14439|21195->14460|21312->14548|21342->14549|21372->14550|21406->14555|21436->14556|21486->14577|21567->14629|21597->14630|21639->14643|21669->14644|21707->14654|21737->14655
                  LINES: 32->2|38->8|38->8|38->8|39->9|39->9|39->9|49->19|49->19|49->19|49->19|68->38|68->38|68->38|68->38|68->38|68->38|69->39|158->128|158->128|159->129|159->129|159->129|159->129|159->129|160->130|160->130|162->132|162->132|163->133|164->134|164->134|165->135|166->136|166->136|167->137|168->138|168->138|168->138|169->139|169->139|170->140|171->141|171->141|172->142|172->142|173->143|173->143|174->144|176->146|176->146|176->146|176->146|177->147|179->149|179->149|180->150|180->150|181->151|181->151|183->153|183->153|184->154|194->164|194->164|195->165|196->166|196->166|196->166|198->168|198->168|200->170|200->170|201->171|204->174|204->174|205->175|207->177|207->177|209->179|212->182|212->182|213->183|214->184|214->184|214->184|215->185|215->185|215->185|215->185|216->186|216->186|217->187|218->188|218->188|219->189|219->189|219->189|219->189|220->190|225->195|225->195|225->195|225->195|226->196|226->196|226->196|227->197|229->199|229->199|229->199|229->199|229->199|230->200|232->202|232->202|233->203|233->203|234->204|234->204|236->206|236->206|237->207|238->208|238->208|239->209|242->212|242->212|242->212|242->212|242->212|243->213|244->214|244->214|245->215|245->215|247->217|247->217|248->218|253->223|253->223|255->225|255->225|256->226|260->230|260->230|261->231|262->232|262->232|262->232|262->232|263->233|265->235|265->235|266->236|267->237|267->237|269->239|269->239|270->240|273->243|273->243|274->244|276->246|276->246|278->248|281->251|281->251|282->252|283->253|283->253|283->253|284->254|284->254|284->254|284->254|285->255|285->255|286->256|287->257|287->257|288->258|288->258|288->258|288->258|289->259|294->264|294->264|294->264|294->264|295->265|295->265|295->265|296->266|298->268|298->268|298->268|298->268|298->268|299->269|301->271|301->271|302->272|302->272|303->273|303->273|305->275|305->275|306->276|307->277|307->277|308->278|310->280|310->280|310->280|310->280|310->280|311->281|312->282|312->282|313->283|313->283|314->284|314->284
                  -- GENERATED --
              */
          