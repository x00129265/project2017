
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

     object main_Scope1 {
import controllers.LoginController
import controllers.security

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[String,models.users.User,List[models.Category],Long,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(title: String, user: models.users.User, categories: List[models.Category], catId: Long, filter: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.121*/("""

"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*8.62*/("""
        """),format.raw/*9.9*/("""<title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*10.54*/routes/*10.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*10.101*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*11.49*/routes/*11.55*/.Assets.versioned("stylesheets/animate.css")),format.raw/*11.99*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*12.49*/routes/*12.55*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*12.105*/(""""  rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*13.49*/routes/*13.55*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*13.108*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*14.49*/routes/*14.55*/.Assets.versioned("stylesheets/prettyPhoto.css")),format.raw/*14.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*15.49*/routes/*15.55*/.Assets.versioned("stylesheets/price-range.css")),format.raw/*15.103*/("""" rel="stylesheet">
   <link rel="stylesheet" media="screen" href=""""),_display_(/*16.49*/routes/*16.55*/.Assets.versioned("stylesheets/responsive.css")),format.raw/*16.102*/("""" rel="stylesheet">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.versioned("images/favicon.png")),format.raw/*17.104*/("""">
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*18.70*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*19.18*/routes/*19.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*19.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*20.18*/routes/*20.24*/.Assets.versioned("javascripts/contact.js")),format.raw/*20.67*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*21.18*/routes/*21.24*/.Assets.versioned("javascripts/gmaps.js")),format.raw/*21.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*22.18*/routes/*22.24*/.Assets.versioned("javascripts/hello.js")),format.raw/*22.65*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*23.18*/routes/*23.24*/.Assets.versioned("javascripts/html5shiv.js")),format.raw/*23.69*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*24.18*/routes/*24.24*/.Assets.versioned("javascripts/jquery.js")),format.raw/*24.66*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*25.18*/routes/*25.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*25.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*26.18*/routes/*26.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*26.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*27.18*/routes/*27.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*27.71*/("""" type="text/javascript"></script>
   <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link  sizes="144x144" href=""""),_display_(/*29.35*/routes/*29.41*/.Assets.versioned("images/ico/apple-touch-icon-144-precomposed.png")),format.raw/*29.109*/(""" """),format.raw/*29.110*/("""rel="apple-touch-icon-precomposed">
    <link  sizes="114x114" href=""""),_display_(/*30.35*/routes/*30.41*/.Assets.versioned("images/ico/apple-touch-icon-114-precomposed.png")),format.raw/*30.109*/(""" """),format.raw/*30.110*/("""rel="apple-touch-icon-precomposed">
    <link  sizes="72x72" href=""""),_display_(/*31.33*/routes/*31.39*/.Assets.versioned("images/ico/apple-touch-icon-72-precomposed.png")),format.raw/*31.106*/(""" """),format.raw/*31.107*/("""rel="apple-touch-icon-precomposed">
    <link  href=""""),_display_(/*32.19*/routes/*32.25*/.Assets.versioned("images/ico/apple-touch-icon-57-precomposed.png")),format.raw/*32.92*/(""" """),format.raw/*32.93*/("""rel="apple-touch-icon-precomposed">
   

   
   
   
   
   
    </head>
    <body>
        """),format.raw/*43.32*/("""

   
   """),format.raw/*46.4*/("""<header id="header"><!--header-->
      <div class="header_top"><!--header_top-->
         <div class="container">
            <div class="row">
               <div class="col-sm-5">
                  <div class="contactinfo">
                     <ul class="nav nav-pills">
                        <li><a href="#"><i class="fa fa-phone"></i> +353 8533 3333</a></li>
                        <li><a href="#"><i class="fa fa-envelope"></i> aAndJs&#64;gmail.com</a></li>
                     </ul>
                  </div>
               </div>
               <div class="col-sm-7">
                   <div class="shop-menu pull-right">
                       <ul class="nav navbar-nav">
                           """),_display_(/*61.29*/if(user != null)/*61.45*/ {_display_(Seq[Any](format.raw/*61.47*/("""
                               """),_display_(/*62.33*/if(user.getRole == "customer")/*62.63*/{_display_(Seq[Any](format.raw/*62.64*/("""
                           """),format.raw/*63.28*/("""<li><a href=""""),_display_(/*63.42*/routes/*63.48*/.CustomerCtrl.profile(catId, filter)),format.raw/*63.84*/(""""><i class="fa fa-user"></i> Account</a></li>
                           <li><a href=""""),_display_(/*64.42*/routes/*64.48*/.WishlistCtrl.showWishlist(catId, filter)),format.raw/*64.89*/(""""><i class="fa fa-star"></i> Wishlist</a></li>
                           <li><a href=""""),_display_(/*65.42*/routes/*65.48*/.ShoppingCtrl.showBasket(catId, filter)),format.raw/*65.87*/(""""><i class="fa fa-shopping-cart"></i> Cart</a></li>""")))}),format.raw/*65.139*/("""
                           """),format.raw/*66.28*/("""<li """),_display_(/*66.33*/if(title == "Login")/*66.53*/{_display_(Seq[Any](format.raw/*66.54*/("""class="active"""")))}),format.raw/*66.69*/(""">  
                               <a href=""""),_display_(/*67.42*/controllers/*67.53*/.routes.LoginController.logout()),format.raw/*67.85*/("""">Logout """),_display_(/*67.95*/user/*67.99*/.getfName()),format.raw/*67.110*/("""</a>
                           """)))}/*68.30*/else/*68.35*/{_display_(Seq[Any](format.raw/*68.36*/("""
                               """),format.raw/*69.32*/("""<a href=""""),_display_(/*69.42*/controllers/*69.53*/.routes.LoginController.login()),format.raw/*69.84*/(""""><h5><b>SIGN IN or SIGN UP</b></h5></a>
                           """)))}),format.raw/*70.29*/("""

                           """),format.raw/*72.28*/("""</li>
                       </ul>
                   </div>
               </div>
            </div>
         </div>
      </div><!--/header_top-->
      
      <div class="header-middle"><!--header-middle-->
         <div class="container">
            <div class="row">
                  <!--<div class="col-sm-4">
                  <div class="logo pull-left">
                     <a href="index.html"><img src="images/home/logo.png" alt="" /></a>
                  </div>
               </div>-->
               <div class="col-sm-6">
                     <h1><font size="10"><b>A <small>&</small> Js</b></font></h1>  
               </div>
               <div class="col-sm-6">
                   <h3><p> </p></h3>
                   
                       <!-- Search Form -->
                  <div class="pull-right">
                      <div id="actions">
                          <form action=""""),_display_(/*97.42*/routes/*97.48*/.HomeController.products(catId)),format.raw/*97.79*/("""" method="GET">
                              <input type="search" id="searchbox" name="filter" value=""""),_display_(/*98.89*/filter),format.raw/*98.95*/("""" placeholder="">
                              <input type="submit" id="searchsubmit" value="Search" class="btn btn-default">

                          </form>
                      </div>
                  </div>
               </div>
            </div>
         </div>
      </div><!--/header-middle-->
   
      <div class="header-bottom"><!--header-bottom-->
         <div class="container">
            <div class="row">
               <div class="col-sm-9">
                  <div class="navbar-header">
                     <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                     </button>
                  </div>
                  <div class="mainmenu pull-left">
                     <ul class="nav navbar-nav collapse navbar-collapse">
                        <li><a href=""""),_display_(/*123.39*/controllers/*123.50*/.routes.HomeController.index()),format.raw/*123.80*/("""" class="active">Home</a></li>
                        <li><a href=""""),_display_(/*124.39*/routes/*124.45*/.HomeController.products()),format.raw/*124.71*/("""">Products</a></li>
                        <li><a href=""""),_display_(/*125.39*/routes/*125.45*/.HomeController.aboutUs()),format.raw/*125.70*/("""">About Us</a></li>
                        
                     </ul>
                  </div>
               </div>

            </div>
         </div>
      </div><!--/header-bottom-->
   </header><!--/header-->
   

   
   <section>
      <div class="container">
         <div class="row">
            <div class="col-sm-3">
               <div class="left-sidebar">
                  <a href=""""),_display_(/*143.29*/routes/*143.35*/.HomeController.products(0)),format.raw/*143.62*/(""""></a><h2>Category</h2></a>
                  <div class="panel-group category-products" id="accordian"><!--category-productsr-->
                     <div class="panel panel-default">
                        <div class="list-group">
                              <!-- A link to display all products -->


                              <!-- Start of For loop - For each c in categories add a list item -->
                              <!-- Also show the number of products in each category -->
                           <div class="panel panel-default">
                              <div class="panel-heading">
                                 <h4 class="panel-title">
                              """),_display_(/*155.32*/for(c <- categories) yield /*155.52*/ {_display_(Seq[Any](format.raw/*155.54*/("""
                                 """),format.raw/*156.34*/("""<a href=""""),_display_(/*156.44*/routes/*156.50*/.HomeController.products(c.getId)),format.raw/*156.83*/("""" class="list-group-item">"""),_display_(/*156.110*/c/*156.111*/.getName),format.raw/*156.119*/("""
                                 """),format.raw/*157.34*/("""</a>
                              """)))}),format.raw/*158.32*/("""
                                 """),format.raw/*159.34*/("""</h4>
                              </div>
                           </div>
                        </div>
                     </div>
                     
                     <!--<div class="panel panel-default">
                        <div class="panel-heading">
                           <h4 class="panel-title">
                              <a data-toggle="collapse" data-parent="#accordian" href="#womens">
                                 <span class="badge pull-right"><i class="fa fa-plus"></i></span>
                                 Womens
                              </a>
                           </h4>
                        </div>
                        <div id="womens" class="panel-collapse collapse">
                           <div class="panel-body">
                              <ul>
                                 <li><a href="#">Fendi</a></li>
                                 <li><a href="#">Guess</a></li>
                                 <li><a href="#">Valentino</a></li>
                                 <li><a href="#">Dior</a></li>
                                 <li><a href="#">Versace</a></li>
                              </ul>
                           </div>
                        </div>
                     </div>
                     <div class="panel panel-default">
                        <div class="panel-heading">
                           <h4 class="panel-title"><a href="#">Kids</a></h4>
                        </div>
                     </div>-->
                  </div><!--/category-products-->
               
                  
                  
                  <!--<div class="price-range"><!--price-range
                     <h2>Price Range</h2>
                     <div class="well text-center">
                         <input type="text" class="span2" value="" data-slider-min="0" data-slider-max="600" data-slider-step="5" data-slider-value="[250,450]" id="sl2" ><br />
                         <b class="pull-left">$ 0</b> <b class="pull-right">$ 600</b>
                     </div>
                  </div><!--/price-range
                  
                  <div class="shipping text-center"><!--shipping
                     <img src="images/home/shipping.jpg" alt="" />
                  </div>//shipping-->
               
               </div>
            </div>
            
            <div class="col-sm-9 padding-right">
               
 
               """),_display_(/*213.17*/content),format.raw/*213.24*/("""
     
            
            """),format.raw/*216.13*/("""</div>
         </div>
      </div>
   </section>
   

      <footer id="footer"><!--Footer-->
      <div class="footer-top">
         <div class="container">
            <div class="row">
               <div class="col-sm-2">
                  <div class="companyinfo">
                     <h2><span>A</span>&<span>Js</span></h2>
                     <p>Welcome to A and Js online shop</p>
                  </div>
               </div>
               <div class="col-sm-7">

                  <div class="col-sm-1">
                     
                  </div> 
                  <div class="col-sm-5">
                     <div class="single-widget">
                     <h2>Contack us</h2>
                     <ul class="nav nav-pills nav-stacked">
                        <li>Phone: +353 8533 3333</li>
                        <li>Email: aAndJs&#64;gmail.com</li>
                        <li>Facebook: AandJs</li>
                        <li>Address: 32 crumlin road, Crumlin</li>
                     </ul>
                  </div>
                  </div>
                  
                  
                  
                  
                  <div class="col-sm-6">
                  <div class="single-widget">
                     <h2>About Shopper</h2>
                     <form action="#" class="searchform">
                        <input type="text" placeholder="Your email address" />
                        <button type="submit" class="btn btn-default"><i class="fa fa-arrow-circle-o-right"></i></button>
                        <p>Get the most recent updates from <br />our site and be updated your self...</p>
                     </form>
                  </div>
                </div>
               </div>
               <div class="col-sm-3">
                  <div class="address">
                     <img src="/assets/images/home/dublin.jpg" alt="" />
                     <p>Dublin, Ireland</p>
                  </div>
               </div>
            </div>
         </div>
      </div>
      
      
      
      <div class="footer-bottom">
         <div class="container">
            <div class="row">
               <p class="pull-left">Copyright © 2017 The lads.</p>
               <p class="pull-right">Designed by <span><a target="_blank" href="http://www.it-tallaght.ie/">ITT Students</a></span></p>
            </div>
         </div>
      </div>
      
   </footer><!--/Footer-->
   

  
        
   
   
        
        

   <script src=""""),_display_(/*294.18*/routes/*294.24*/.Assets.versioned("javascripts/jquery.js")),format.raw/*294.66*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*295.18*/routes/*295.24*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*295.73*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*296.18*/routes/*296.24*/.Assets.versioned("javascripts/jquery.scrollUp.min.js")),format.raw/*296.79*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*297.18*/routes/*297.24*/.Assets.versioned("javascripts/price-range.js")),format.raw/*297.71*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*298.18*/routes/*298.24*/.Assets.versioned("javascripts/jquery.prettyPhoto.js")),format.raw/*298.78*/("""" type="text/javascript"></script>
   <script src=""""),_display_(/*299.18*/routes/*299.24*/.Assets.versioned("javascripts/main.js")),format.raw/*299.64*/("""" type="text/javascript"></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,categories:List[models.Category],catId:Long,filter:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user,categories,catId,filter)(content)

  def f:((String,models.users.User,List[models.Category],Long,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user,categories,catId,filter) => (content) => apply(title,user,categories,catId,filter)(content)

  def ref: this.type = this

}


}
}

/**/
object main extends main_Scope0.main_Scope1.main
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 11:33:47 IST 2017
                  SOURCE: /home/wdd/webapps/project2017/app/views/main.scala.html
                  HASH: f97c72767356e39e9806331896f4b414bf47efa6
                  MATRIX: 890->66|1105->185|1133->187|1212->292|1247->301|1281->309|1306->314|1395->376|1410->382|1473->423|1568->491|1583->497|1648->541|1743->609|1758->615|1830->665|1926->734|1941->740|2016->793|2111->861|2126->867|2196->915|2291->983|2306->989|2376->1037|2471->1105|2486->1111|2555->1158|2660->1236|2675->1242|2736->1281|2788->1306|2803->1312|2865->1353|2944->1405|2959->1411|3029->1460|3108->1512|3123->1518|3187->1561|3266->1613|3281->1619|3343->1660|3422->1712|3437->1718|3499->1759|3578->1811|3593->1817|3659->1862|3738->1914|3753->1920|3816->1962|3895->2014|3910->2020|3985->2074|4064->2126|4079->2132|4155->2187|4234->2239|4249->2245|4317->2292|4473->2421|4488->2427|4578->2495|4608->2496|4705->2566|4720->2572|4810->2640|4840->2641|4935->2709|4950->2715|5039->2782|5069->2783|5150->2837|5165->2843|5253->2910|5282->2911|5402->3093|5438->3102|6178->3815|6203->3831|6243->3833|6303->3866|6342->3896|6381->3897|6437->3925|6478->3939|6493->3945|6550->3981|6664->4068|6679->4074|6741->4115|6856->4203|6871->4209|6931->4248|7015->4300|7071->4328|7103->4333|7132->4353|7171->4354|7217->4369|7289->4414|7309->4425|7362->4457|7399->4467|7412->4471|7445->4482|7497->4516|7510->4521|7549->4522|7609->4554|7646->4564|7666->4575|7718->4606|7818->4675|7875->4704|8813->5615|8828->5621|8880->5652|9011->5756|9038->5762|10153->6849|10174->6860|10226->6890|10323->6959|10339->6965|10387->6991|10473->7049|10489->7055|10536->7080|10964->7480|10980->7486|11029->7513|11760->8216|11797->8236|11838->8238|11901->8272|11939->8282|11955->8288|12010->8321|12066->8348|12078->8349|12109->8357|12172->8391|12240->8427|12303->8461|14782->10912|14811->10919|14872->10951|17394->13445|17410->13451|17474->13493|17554->13545|17570->13551|17641->13600|17721->13652|17737->13658|17814->13713|17894->13765|17910->13771|17979->13818|18059->13870|18075->13876|18151->13930|18231->13982|18247->13988|18309->14028
                  LINES: 31->3|36->3|38->5|41->8|42->9|42->9|42->9|43->10|43->10|43->10|44->11|44->11|44->11|45->12|45->12|45->12|46->13|46->13|46->13|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|50->17|50->17|50->17|51->18|51->18|51->18|52->19|52->19|52->19|53->20|53->20|53->20|54->21|54->21|54->21|55->22|55->22|55->22|56->23|56->23|56->23|57->24|57->24|57->24|58->25|58->25|58->25|59->26|59->26|59->26|60->27|60->27|60->27|62->29|62->29|62->29|62->29|63->30|63->30|63->30|63->30|64->31|64->31|64->31|64->31|65->32|65->32|65->32|65->32|75->43|78->46|93->61|93->61|93->61|94->62|94->62|94->62|95->63|95->63|95->63|95->63|96->64|96->64|96->64|97->65|97->65|97->65|97->65|98->66|98->66|98->66|98->66|98->66|99->67|99->67|99->67|99->67|99->67|99->67|100->68|100->68|100->68|101->69|101->69|101->69|101->69|102->70|104->72|129->97|129->97|129->97|130->98|130->98|155->123|155->123|155->123|156->124|156->124|156->124|157->125|157->125|157->125|175->143|175->143|175->143|187->155|187->155|187->155|188->156|188->156|188->156|188->156|188->156|188->156|188->156|189->157|190->158|191->159|245->213|245->213|248->216|326->294|326->294|326->294|327->295|327->295|327->295|328->296|328->296|328->296|329->297|329->297|329->297|330->298|330->298|330->298|331->299|331->299|331->299
                  -- GENERATED --
              */
          