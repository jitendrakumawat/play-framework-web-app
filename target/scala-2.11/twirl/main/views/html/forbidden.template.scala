
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object forbidden_Scope0 {
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

class forbidden extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(msg: java.lang.String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>

    <title>SI2Chip Access Error</title>
</head>
<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <img src="""),_display_(/*19.27*/routes/*19.33*/.Assets.versioned("images/l46.png")),format.raw/*19.68*/(""" """),format.raw/*19.69*/("""class="logo">
            </div>
        </div>
    </nav>
    <div class="container">
        <div class="jumbotron">
            <h1>Access denied</h1>
            <p>"""),_display_(/*26.17*/msg),format.raw/*26.20*/("""</p>
        </div>
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(msg:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(msg)

  def f:((java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (msg) => apply(msg)

  def ref: this.type = this

}


}

/**/
object forbidden extends forbidden_Scope0.forbidden
              /*
                  -- GENERATED --
                  DATE: Tue Sep 06 15:00:34 IST 2016
                  SOURCE: /home/si2chip/Backup/backup1/si2chip/app/views/forbidden.scala.html
                  HASH: a8fee3094bf7934519c1e48ad99c84742092d7a6
                  MATRIX: 763->1|881->24|909->26|1665->755|1680->761|1736->796|1765->797|1962->967|1986->970
                  LINES: 27->1|32->1|34->3|50->19|50->19|50->19|50->19|57->26|57->26
                  -- GENERATED --
              */
          