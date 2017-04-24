
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object adminMain_Scope0 {
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

     object adminMain_Scope1 {
import controllers.LoginController
import controllers.security

class adminMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.57*/("""
"""),format.raw/*4.1*/("""<!--====================== J.T. =====================-->
<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*13.59*/routes/*13.65*/.Assets.versioned("images/favicon.png")),format.raw/*13.104*/("""">
           <link rel="stylesheet" media="screen" href=""""),_display_(/*14.57*/routes/*14.63*/.Assets.versioned("stylesheets/main.css")),format.raw/*14.104*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*15.49*/routes/*15.55*/.Assets.versioned("stylesheets/animate.css")),format.raw/*15.99*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*16.49*/routes/*16.55*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*16.105*/(""""  rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*17.49*/routes/*17.55*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*17.108*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*18.49*/routes/*18.55*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*18.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*19.49*/routes/*19.55*/.Assets.versioned("stylesheets/price-range.css")),format.raw/*19.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*20.49*/routes/*20.55*/.Assets.versioned("stylesheets/responsive.css")),format.raw/*20.102*/("""" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*21.59*/routes/*21.65*/.Assets.versioned("images/favicon.png")),format.raw/*21.104*/("""">
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*22.70*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*23.18*/routes/*23.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*23.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("javascripts/contact.js")),format.raw/*24.67*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("javascripts/gmaps.js")),format.raw/*25.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("javascripts/hello.js")),format.raw/*26.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*27.18*/routes/*27.24*/.Assets.versioned("javascripts/html5shiv.js")),format.raw/*27.69*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*28.18*/routes/*28.24*/.Assets.versioned("javascripts/jquery.js")),format.raw/*28.66*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*29.18*/routes/*29.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*29.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*30.18*/routes/*30.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*30.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*31.18*/routes/*31.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*31.71*/("""" type="text/javascript"></script>
   <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link  sizes="114x114" href=""""),_display_(/*33.35*/routes/*33.41*/.Assets.versioned("images/ico/apple-touch-icon-114-precomposed.png")),format.raw/*33.109*/(""" """),format.raw/*33.110*/("""rel="apple-touch-icon-precomposed">
    <link  sizes="72x72" href=""""),_display_(/*34.33*/routes/*34.39*/.Assets.versioned("images/ico/apple-touch-icon-72-precomposed.png")),format.raw/*34.106*/(""" """),format.raw/*34.107*/("""rel="apple-touch-icon-precomposed">
    <link  href=""""),_display_(/*35.19*/routes/*35.25*/.Assets.versioned("images/ico/apple-touch-icon-57-precomposed.png")),format.raw/*35.92*/(""" """),format.raw/*35.93*/("""rel="apple-touch-icon-precomposed">
    </head>
    <body>
    <!-- start of nav section -->
    <nav class="navbar navbar-inverse">
            <!-- nav header/ branding -->
            <div class="navbar-header">
                <a class="navbar-brand" href="">Admin</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*46.22*/if(title == "Home")/*46.41*/{_display_(Seq[Any](format.raw/*46.42*/("""class="active"""")))}),format.raw/*46.57*/(""">
                    <a href=""""),_display_(/*47.31*/controllers/*47.42*/.routes.HomeController.index()),format.raw/*47.72*/("""" class="active">Home</a>
                </li>
                <li """),_display_(/*49.22*/if(title == "Products")/*49.45*/{_display_(Seq[Any](format.raw/*49.46*/("""class="active"""")))}),format.raw/*49.61*/(""">
                    <a href=""""),_display_(/*50.31*/routes/*50.37*/.AdminController.products()),format.raw/*50.64*/("""">Products</a>
                </li>
                <li """),_display_(/*52.22*/if(title == "Warehouses")/*52.47*/{_display_(Seq[Any](format.raw/*52.48*/("""class="active"""")))}),format.raw/*52.63*/(""">
                    <a href=""""),_display_(/*53.31*/routes/*53.37*/.AdminController.warehouses1()),format.raw/*53.67*/("""">Warehouses</a>
                </li>
                <li """),_display_(/*55.22*/if(title == "Orders")/*55.43*/{_display_(Seq[Any](format.raw/*55.44*/("""class="active"""")))}),format.raw/*55.59*/(""">
                    <a href=""""),_display_(/*56.31*/routes/*56.37*/.AdminController.orders()),format.raw/*56.62*/("""">Orders</a>
                </li>
                <li """),_display_(/*58.22*/if(title == "Index sliders")/*58.50*/{_display_(Seq[Any](format.raw/*58.51*/("""class="active"""")))}),format.raw/*58.66*/(""">
                    <a href=""""),_display_(/*59.31*/routes/*59.37*/.AdminController.indexSliders()),format.raw/*59.68*/("""">Index sliders</a>
                </li>
                <!-- Login/ Logout  Link - Check if user logged in-->
                <li """),_display_(/*62.22*/if(title == "Login")/*62.42*/{_display_(Seq[Any](format.raw/*62.43*/("""class="active"""")))}),format.raw/*62.58*/(""">
                    """),_display_(/*63.22*/if(user != null)/*63.38*/ {_display_(Seq[Any](format.raw/*63.40*/("""
                        """),format.raw/*64.25*/("""<a href=""""),_display_(/*64.35*/controllers/*64.46*/.routes.LoginController.logout()),format.raw/*64.78*/("""">Logout """),_display_(/*64.88*/user/*64.92*/.getfName()),format.raw/*64.103*/("""</a>
                    """)))}/*65.23*/else/*65.28*/{_display_(Seq[Any](format.raw/*65.29*/("""
                        """),format.raw/*66.25*/("""<a href=""""),_display_(/*66.35*/controllers/*66.46*/.routes.LoginController.login()),format.raw/*66.77*/("""">Login</a>
                    """)))}),format.raw/*67.22*/("""
                """),format.raw/*68.17*/("""</li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*74.32*/("""
        """),_display_(/*75.10*/content),format.raw/*75.17*/("""
    """),format.raw/*76.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*85.19*/routes/*85.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*85.66*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*86.19*/routes/*86.25*/.Assets.versioned("javascripts/jquery.js")),format.raw/*86.67*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*87.18*/routes/*87.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*87.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*88.18*/routes/*88.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*88.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*89.18*/routes/*89.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*89.71*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*90.18*/routes/*90.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*90.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*91.18*/routes/*91.24*/.Assets.versioned("javascripts/main.js")),format.raw/*91.64*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}
}

/**/
object adminMain extends adminMain_Scope0.adminMain_Scope1.adminMain
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 19:32:03 IST 2017
                  SOURCE: /home/wdd/webapps/project2017/app/views/admin/adminMain.scala.html
                  HASH: 379091e432bb3a39903c390247f205bf686006b6
                  MATRIX: 877->66|1027->121|1054->122|1190->284|1225->293|1259->301|1284->306|1559->554|1574->560|1637->601|1725->662|1740->668|1801->707|1887->766|1902->772|1965->813|2060->881|2075->887|2140->931|2235->999|2250->1005|2322->1055|2418->1124|2433->1130|2508->1183|2603->1251|2618->1257|2688->1305|2783->1373|2798->1379|2868->1427|2963->1495|2978->1501|3047->1548|3152->1626|3167->1632|3228->1671|3280->1696|3295->1702|3357->1743|3436->1795|3451->1801|3521->1850|3600->1902|3615->1908|3679->1951|3758->2003|3773->2009|3835->2050|3914->2102|3929->2108|3991->2149|4070->2201|4085->2207|4151->2252|4230->2304|4245->2310|4308->2352|4387->2404|4402->2410|4477->2464|4556->2516|4571->2522|4647->2577|4726->2629|4741->2635|4809->2682|4965->2811|4980->2817|5070->2885|5100->2886|5195->2954|5210->2960|5299->3027|5329->3028|5410->3082|5425->3088|5513->3155|5542->3156|5969->3556|5997->3575|6036->3576|6082->3591|6141->3623|6161->3634|6212->3664|6308->3733|6340->3756|6379->3757|6425->3772|6484->3804|6499->3810|6547->3837|6632->3895|6666->3920|6705->3921|6751->3936|6810->3968|6825->3974|6876->4004|6963->4064|6993->4085|7032->4086|7078->4101|7137->4133|7152->4139|7198->4164|7281->4220|7318->4248|7357->4249|7403->4264|7462->4296|7477->4302|7529->4333|7689->4466|7718->4486|7757->4487|7803->4502|7853->4525|7878->4541|7918->4543|7971->4568|8008->4578|8028->4589|8081->4621|8118->4631|8131->4635|8164->4646|8209->4673|8222->4678|8261->4679|8314->4704|8351->4714|8371->4725|8423->4756|8487->4789|8532->4806|8642->4978|8679->4988|8707->4995|8739->5000|9101->5335|9116->5341|9178->5382|9258->5435|9273->5441|9336->5483|9415->5535|9430->5541|9500->5590|9579->5642|9594->5648|9670->5703|9749->5755|9764->5761|9832->5808|9911->5860|9926->5866|10001->5920|10080->5972|10095->5978|10156->6018
                  LINES: 31->3|36->3|37->4|41->8|42->9|42->9|42->9|45->12|45->12|45->12|46->13|46->13|46->13|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|50->17|50->17|50->17|51->18|51->18|51->18|52->19|52->19|52->19|53->20|53->20|53->20|54->21|54->21|54->21|55->22|55->22|55->22|56->23|56->23|56->23|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|66->33|66->33|66->33|66->33|67->34|67->34|67->34|67->34|68->35|68->35|68->35|68->35|79->46|79->46|79->46|79->46|80->47|80->47|80->47|82->49|82->49|82->49|82->49|83->50|83->50|83->50|85->52|85->52|85->52|85->52|86->53|86->53|86->53|88->55|88->55|88->55|88->55|89->56|89->56|89->56|91->58|91->58|91->58|91->58|92->59|92->59|92->59|95->62|95->62|95->62|95->62|96->63|96->63|96->63|97->64|97->64|97->64|97->64|97->64|97->64|97->64|98->65|98->65|98->65|99->66|99->66|99->66|99->66|100->67|101->68|106->74|107->75|107->75|108->76|117->85|117->85|117->85|118->86|118->86|118->86|119->87|119->87|119->87|120->88|120->88|120->88|121->89|121->89|121->89|122->90|122->90|122->90|123->91|123->91|123->91
                  -- GENERATED --
              */
          