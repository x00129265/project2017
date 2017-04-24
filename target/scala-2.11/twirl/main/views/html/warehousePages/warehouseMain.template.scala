
package views.html.warehousePages

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object warehouseMain_Scope0 {
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

     object warehouseMain_Scope1 {
import controllers.LoginController
import controllers.security

class warehouseMain extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

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
                <a class="navbar-brand" href="">Warehouse</a>
            </div>
            <!-- List containing nav links -->
            <ul class="nav navbar-nav">
                <li """),_display_(/*46.22*/if(title == "Home")/*46.41*/{_display_(Seq[Any](format.raw/*46.42*/("""class="active"""")))}),format.raw/*46.57*/(""">
                    <a href=""""),_display_(/*47.31*/controllers/*47.42*/.routes.HomeController.index()),format.raw/*47.72*/("""" class="active">Home</a>
                </li>
                <li """),_display_(/*49.22*/if(title == "Orders")/*49.43*/{_display_(Seq[Any](format.raw/*49.44*/("""class="active"""")))}),format.raw/*49.59*/(""">
                    <a href=""""),_display_(/*50.31*/routes/*50.37*/.WarehouseController.ordersW()),format.raw/*50.67*/("""">Orders</a>
                </li>
                <li """),_display_(/*52.22*/if(title == "Products")/*52.45*/{_display_(Seq[Any](format.raw/*52.46*/("""class="active"""")))}),format.raw/*52.61*/(""">
                    <a href=""""),_display_(/*53.31*/routes/*53.37*/.WarehouseController.products()),format.raw/*53.68*/("""">Products</a>
                </li>
                
                <!-- Login/ Logout  Link - Check if user logged in-->
                <li """),_display_(/*57.22*/if(title == "Login")/*57.42*/{_display_(Seq[Any](format.raw/*57.43*/("""class="active"""")))}),format.raw/*57.58*/(""">
                    """),_display_(/*58.22*/if(user != null)/*58.38*/ {_display_(Seq[Any](format.raw/*58.40*/("""
                        """),format.raw/*59.25*/("""<a href=""""),_display_(/*59.35*/controllers/*59.46*/.routes.LoginController.logout()),format.raw/*59.78*/("""">Logout """),_display_(/*59.88*/user/*59.92*/.getfName()),format.raw/*59.103*/("""</a>
                    """)))}/*60.23*/else/*60.28*/{_display_(Seq[Any](format.raw/*60.29*/("""
                        """),format.raw/*61.25*/("""<a href=""""),_display_(/*61.35*/controllers/*61.46*/.routes.LoginController.login()),format.raw/*61.77*/("""">Login</a>
                    """)))}),format.raw/*62.22*/("""
                """),format.raw/*63.17*/("""</li>
            </ul>
    </nav>
    
    <div class="container-fluid">
        """),format.raw/*69.32*/("""
        """),_display_(/*70.10*/content),format.raw/*70.17*/("""
    """),format.raw/*71.5*/("""</div>
    <footer class="container-fluid">
         <p></p>
     </footer>

    </body>
    <!-- Load JavaScript libs last -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src=""""),_display_(/*80.19*/routes/*80.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*80.66*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*81.19*/routes/*81.25*/.Assets.versioned("javascripts/jquery.js")),format.raw/*81.67*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*82.18*/routes/*82.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*82.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*83.18*/routes/*83.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*83.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*84.18*/routes/*84.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*84.71*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*85.18*/routes/*85.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*85.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*86.18*/routes/*86.24*/.Assets.versioned("javascripts/main.js")),format.raw/*86.64*/("""" type="text/javascript"></script>
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
object warehouseMain extends warehouseMain_Scope0.warehouseMain_Scope1.warehouseMain
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 19:32:03 IST 2017
                  SOURCE: /home/wdd/webapps/project2017/app/views/warehousePages/warehouseMain.scala.html
                  HASH: eb22cf9b37414a305890ac1fc21076b54fb936cb
                  MATRIX: 898->66|1048->121|1075->122|1211->284|1246->293|1280->301|1305->306|1580->554|1595->560|1658->601|1746->662|1761->668|1822->707|1908->766|1923->772|1986->813|2081->881|2096->887|2161->931|2256->999|2271->1005|2343->1055|2439->1124|2454->1130|2529->1183|2624->1251|2639->1257|2709->1305|2804->1373|2819->1379|2889->1427|2984->1495|2999->1501|3068->1548|3173->1626|3188->1632|3249->1671|3301->1696|3316->1702|3378->1743|3457->1795|3472->1801|3542->1850|3621->1902|3636->1908|3700->1951|3779->2003|3794->2009|3856->2050|3935->2102|3950->2108|4012->2149|4091->2201|4106->2207|4172->2252|4251->2304|4266->2310|4329->2352|4408->2404|4423->2410|4498->2464|4577->2516|4592->2522|4668->2577|4747->2629|4762->2635|4830->2682|4986->2811|5001->2817|5091->2885|5121->2886|5216->2954|5231->2960|5320->3027|5350->3028|5431->3082|5446->3088|5534->3155|5563->3156|5994->3560|6022->3579|6061->3580|6107->3595|6166->3627|6186->3638|6237->3668|6333->3737|6363->3758|6402->3759|6448->3774|6507->3806|6522->3812|6573->3842|6656->3898|6688->3921|6727->3922|6773->3937|6832->3969|6847->3975|6899->4006|7071->4151|7100->4171|7139->4172|7185->4187|7235->4210|7260->4226|7300->4228|7353->4253|7390->4263|7410->4274|7463->4306|7500->4316|7513->4320|7546->4331|7591->4358|7604->4363|7643->4364|7696->4389|7733->4399|7753->4410|7805->4441|7869->4474|7914->4491|8024->4663|8061->4673|8089->4680|8121->4685|8483->5020|8498->5026|8560->5067|8640->5120|8655->5126|8718->5168|8797->5220|8812->5226|8882->5275|8961->5327|8976->5333|9052->5388|9131->5440|9146->5446|9214->5493|9293->5545|9308->5551|9383->5605|9462->5657|9477->5663|9538->5703
                  LINES: 31->3|36->3|37->4|41->8|42->9|42->9|42->9|45->12|45->12|45->12|46->13|46->13|46->13|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|50->17|50->17|50->17|51->18|51->18|51->18|52->19|52->19|52->19|53->20|53->20|53->20|54->21|54->21|54->21|55->22|55->22|55->22|56->23|56->23|56->23|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|60->27|60->27|60->27|61->28|61->28|61->28|62->29|62->29|62->29|63->30|63->30|63->30|64->31|64->31|64->31|66->33|66->33|66->33|66->33|67->34|67->34|67->34|67->34|68->35|68->35|68->35|68->35|79->46|79->46|79->46|79->46|80->47|80->47|80->47|82->49|82->49|82->49|82->49|83->50|83->50|83->50|85->52|85->52|85->52|85->52|86->53|86->53|86->53|90->57|90->57|90->57|90->57|91->58|91->58|91->58|92->59|92->59|92->59|92->59|92->59|92->59|92->59|93->60|93->60|93->60|94->61|94->61|94->61|94->61|95->62|96->63|101->69|102->70|102->70|103->71|112->80|112->80|112->80|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86
                  -- GENERATED --
              */
          