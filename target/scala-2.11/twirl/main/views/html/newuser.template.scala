
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
            <li><a href="#" ng-click="showPosts($event)"> Home </a></li>
            <li><a href="#" ng-click="Signout($event)"><span class="glyphicon glyphicon-log-out"></span> Signout </a></li>
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
                            <div class="text-center">
                                <h4 id="adminmgmttitle">Create Account</h4>
                            </div>

                            <div class="well well-md">
                                <form role="form" name="lf">
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
                                            <input type="date" class="form-control" maxlength="255" ng-model="nuserbirth" placeholder="dd/mm/yyyy" required name="userbirth">
                                        </div>
                                        <button type="submit" class="btn btn-default btn-md" ng-click="addUser($event)">Add</button>
                                    </div>
                                </form>
                                <span ng-show="lf.userId.$error.email" class="editmsgs">Not a valid e-mail address</span><br>
                                <span ng-show="lf.userId.$touched && lf.userId.$error.required" class="editmsgs">UserId required. Enter a valid email id</span><br>
                                <span ng-if="!(lf.userId.$dirty || lf.password.$dirty)" ng-bind="adderror" class="error"></span>
                                <span ng-if="!(lf.userId.$touched || lf.password.$touched) && addSuccess" class="success">Admin added successfully</span>
                            </div>
                    </thead>
                </table>

            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
        var app = angular.module('admin',  []);
        app.config(['$locationProvider', function AppConfig($locationProvider) """),format.raw/*89.80*/("""{"""),format.raw/*89.81*/("""
            """),format.raw/*90.13*/("""$locationProvider.html5Mode("""),format.raw/*90.41*/("""{"""),format.raw/*90.42*/("""enabled: true, requireBase: false"""),format.raw/*90.75*/("""}"""),format.raw/*90.76*/(""").hashPrefix('*');
        """),format.raw/*91.9*/("""}"""),format.raw/*91.10*/("""]);



        app.controller('adminCtrl', function($scope, $http, $location, $window) """),format.raw/*95.81*/("""{"""),format.raw/*95.82*/("""
            """),format.raw/*96.13*/("""// Initialize the view
            $scope.adderror="";
            $scope.moderror="";
            $scope.conerror = "";
            $scope.allAdmins=[];
            $scope.nPassword = "";
            $scope.mPassword = "";
            $scope.addSuccess = false;
            $scope.modSuccess = false;


                // goto posts page
            $scope.showPosts = function(event) """),format.raw/*108.48*/("""{"""),format.raw/*108.49*/("""
                """),format.raw/*109.17*/("""event.preventDefault();
                $location.path(""""),_display_(/*110.34*/routes/*110.40*/.PostController.getPosts),format.raw/*110.64*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*112.13*/("""}"""),format.raw/*112.14*/(""";
               $scope.signOut = function(event) """),format.raw/*113.49*/("""{"""),format.raw/*113.50*/("""
                """),format.raw/*114.17*/("""event.preventDefault();
                $cookies.remove("userId");
                $cookies.remove("tzoffset");
                $location.path(""""),_display_(/*117.34*/routes/*117.40*/.HomeController.logout),format.raw/*117.62*/("""").replace();
                $window.location.href = $location.absUrl();
            """),format.raw/*119.13*/("""}"""),format.raw/*119.14*/(""";

            $scope.addUser  = function(event) """),format.raw/*121.47*/("""{"""),format.raw/*121.48*/("""
                """),format.raw/*122.17*/("""event.preventDefault();
                   

                // validate the add user form
                if ($scope.lf.userId.$error.required || $scope.lf.userId.$error.email || !($scope.lf.userId.$dirty || $scope.lf.password.$dirty)) """),format.raw/*126.147*/("""{"""),format.raw/*126.148*/("""
                  """),format.raw/*127.19*/("""alert('fine2')
                    $scope.lf.userId.$touched = true;
                    return;
                """),format.raw/*130.17*/("""}"""),format.raw/*130.18*/("""

                """),format.raw/*132.17*/("""$scope.conerror = "";
                $scope.adderror = "";
                $scope.addSuccess = false;
                 alert('fine3')
                $http("""),format.raw/*136.23*/("""{"""),format.raw/*136.24*/("""
                        """),format.raw/*137.25*/("""method : "POST",
                        url : """"),_display_(/*138.33*/routes/*138.39*/.AdminController.addUser),format.raw/*138.63*/("""",
                        data : """),format.raw/*139.32*/("""{"""),format.raw/*139.33*/(""""name" : $scope.nUserName, "userId" : $scope.nUserId, "password" : $scope.nPassword, "userDesignation" : $scope.nuserDesignation, "userbirth" : $scope.nuserbirth"""),format.raw/*139.194*/("""}"""),format.raw/*139.195*/(""",
                        headers : """),format.raw/*140.35*/("""{"""),format.raw/*140.36*/("""
                            """),format.raw/*141.29*/(""""Content-Type" : "application/json"
                        """),format.raw/*142.25*/("""}"""),format.raw/*142.26*/("""
                    """),format.raw/*143.21*/("""}"""),format.raw/*143.22*/(""").then(function successCallback(response) """),format.raw/*143.64*/("""{"""),format.raw/*143.65*/("""
                        """),format.raw/*144.25*/("""$scope.nUserId = "";
                        $scope.nPassword = "";
                        $scope.lf.userId.$touched = false;
                        $scope.lf.password.$touched = false;
                        $scope.addSuccess = true;
                    """),format.raw/*149.21*/("""}"""),format.raw/*149.22*/(""", function errorCallback(response) """),format.raw/*149.57*/("""{"""),format.raw/*149.58*/("""
                        """),format.raw/*150.25*/("""if (response.status == 400) """),format.raw/*150.53*/("""{"""),format.raw/*150.54*/("""
                            """),format.raw/*151.29*/("""$scope.adderror = response.data.error;
                            $scope.lf.$setPristine();
                        """),format.raw/*153.25*/("""}"""),format.raw/*153.26*/(""" """),format.raw/*153.27*/("""else """),format.raw/*153.32*/("""{"""),format.raw/*153.33*/("""
                            """),format.raw/*154.29*/("""$scope.conerror = "Error trying to add the admin user. Retry.";
                            $('#conError').modal('show');
                        """),format.raw/*156.25*/("""}"""),format.raw/*156.26*/("""
                    """),format.raw/*157.21*/("""}"""),format.raw/*157.22*/(""");
            """),format.raw/*158.13*/("""}"""),format.raw/*158.14*/(""";

        """),format.raw/*160.9*/("""}"""),format.raw/*160.10*/(""");
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
                  DATE: Fri Oct 14 15:46:17 IST 2016
                  SOURCE: /home/si2chip/si2chip/app/views/newuser.scala.html
                  HASH: eaa9c06241c30e66a52d0619386bd50832350449
                  MATRIX: 831->1|1134->278|1148->284|1216->332|1277->367|1291->373|1353->415|1884->919|1899->925|1955->960|1984->961|2916->1865|2945->1866|2974->1867|3010->1875|3039->1876|3068->1877|3121->1902|6220->4973|6249->4974|6290->4987|6346->5015|6375->5016|6436->5049|6465->5050|6519->5077|6548->5078|6663->5165|6692->5166|6733->5179|7148->5565|7178->5566|7224->5583|7309->5640|7325->5646|7371->5670|7486->5756|7516->5757|7595->5807|7625->5808|7671->5825|7844->5970|7860->5976|7904->5998|8019->6084|8049->6085|8127->6134|8157->6135|8203->6152|8470->6389|8501->6390|8549->6409|8691->6522|8721->6523|8768->6541|8954->6698|8984->6699|9038->6724|9115->6773|9131->6779|9177->6803|9240->6837|9270->6838|9461->6999|9492->7000|9557->7036|9587->7037|9645->7066|9734->7126|9764->7127|9814->7148|9844->7149|9915->7191|9945->7192|9999->7217|10286->7475|10316->7476|10380->7511|10410->7512|10464->7537|10521->7565|10551->7566|10609->7595|10755->7712|10785->7713|10815->7714|10849->7719|10879->7720|10937->7749|11112->7895|11142->7896|11192->7917|11222->7918|11266->7933|11296->7934|11335->7945|11365->7946
                  LINES: 32->2|38->8|38->8|38->8|39->9|39->9|39->9|49->19|49->19|49->19|49->19|68->38|68->38|68->38|68->38|68->38|68->38|69->39|119->89|119->89|120->90|120->90|120->90|120->90|120->90|121->91|121->91|125->95|125->95|126->96|138->108|138->108|139->109|140->110|140->110|140->110|142->112|142->112|143->113|143->113|144->114|147->117|147->117|147->117|149->119|149->119|151->121|151->121|152->122|156->126|156->126|157->127|160->130|160->130|162->132|166->136|166->136|167->137|168->138|168->138|168->138|169->139|169->139|169->139|169->139|170->140|170->140|171->141|172->142|172->142|173->143|173->143|173->143|173->143|174->144|179->149|179->149|179->149|179->149|180->150|180->150|180->150|181->151|183->153|183->153|183->153|183->153|183->153|184->154|186->156|186->156|187->157|187->157|188->158|188->158|190->160|190->160
                  -- GENERATED --
              */
          