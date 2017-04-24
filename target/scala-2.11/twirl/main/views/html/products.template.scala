
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

     object products_Scope1 {
import models.Category
import models.Product
import models.users.User

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[Category],List[Product],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], catId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.123*/("""
"""),format.raw/*6.1*/("""<!--====================== J.T. =====================-->

"""),_display_(/*8.2*/main("Products", user, categories, catId: Long, filter: String)/*8.65*/ {_display_(Seq[Any](format.raw/*8.67*/("""

    """),format.raw/*10.5*/("""<div class="row">

        <div class="col-sm-12">

            """),_display_(/*14.14*/if(flash.containsKey("success"))/*14.46*/ {_display_(Seq[Any](format.raw/*14.48*/("""
                """),format.raw/*15.17*/("""<div class="alert alert-success">
                """),_display_(/*16.18*/flash/*16.23*/.get("success")),format.raw/*16.38*/("""
                """),format.raw/*17.17*/("""</div>
            """)))}),format.raw/*18.14*/("""
            """),format.raw/*19.13*/("""<div class="features_items"><!--features_items-->
                <h2 class="title text-center">Products</h2>
                """),_display_(/*21.18*/for(p <- products) yield /*21.36*/ {_display_(Seq[Any](format.raw/*21.38*/("""
                    """),format.raw/*22.21*/("""<div  class="col-sm-4">
                        <div  class="product-image-wrapper">
                            <div class="single-products">
                                <div class="productinfo text-center">
                                    """),_display_(/*26.38*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*26.126*/ {_display_(Seq[Any](format.raw/*26.128*/("""
                                        """),format.raw/*27.41*/("""<img src="/assets/images/productImages/"""),_display_(/*27.81*/(p.getId)),format.raw/*27.90*/(""".jpg"/>
                                    """)))}/*28.39*/else/*28.44*/{_display_(Seq[Any](format.raw/*28.45*/("""
                                        """),format.raw/*29.41*/("""<img src="/assets/images/productImages/thumbnails/noImage.png"/>
                                    """)))}),format.raw/*30.38*/("""

                                """),format.raw/*32.33*/("""<h2>&euro; """),_display_(/*32.45*/("%.2f".format(p.getPrice))),format.raw/*32.72*/("""</h2>
                                <h3>"""),_display_(/*33.38*/p/*33.39*/.getName),format.raw/*33.47*/("""</h3>
                               
                              
                                </div>
                                <div class="product-overlay">
                                    <div class="overlay-content">
                                        <h2>&euro; """),_display_(/*39.53*/("%.2f".format(p.getPrice))),format.raw/*39.80*/("""</h2>
                                        <a   href=""""),_display_(/*40.53*/routes/*40.59*/.HomeController.productDetails(catId, filter, p.getId)),format.raw/*40.113*/("""" <p> """),_display_(/*40.120*/p/*40.121*/.getDescription),format.raw/*40.136*/("""</p> </a>
                                        """),_display_(/*41.42*/if(user != null)/*41.58*/ {_display_(Seq[Any](format.raw/*41.60*/("""
                                            """),_display_(/*42.46*/if(user.getRole == "customer")/*42.76*/{_display_(Seq[Any](format.raw/*42.77*/("""
                                            """),format.raw/*43.45*/("""<a href=""""),_display_(/*43.55*/routes/*43.61*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*43.95*/("""" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                            """)))}),format.raw/*44.46*/("""
                                        """)))}),format.raw/*45.42*/("""
                                    """),format.raw/*46.37*/("""</div>
                                </div>
                            </div>
                            <div class="choose">
								<ul class="nav nav-pills nav-justified">
                                    """),_display_(/*51.38*/if(user != null)/*51.54*/ {_display_(Seq[Any](format.raw/*51.56*/("""
                                        """),_display_(/*52.42*/if(user.getRole == "customer")/*52.72*/{_display_(Seq[Any](format.raw/*52.73*/("""
                                    """),format.raw/*53.37*/("""<li><a href=""""),_display_(/*53.51*/routes/*53.57*/.HomeController.like(catId, filter, p.getId, "products")),format.raw/*53.113*/(""""><b><i class="glyphicon glyphicon-thumbs-up"></i>Like """),_display_(/*53.169*/p/*53.170*/.getPlike().getLikeCount()),format.raw/*53.196*/(""" """),format.raw/*53.197*/("""</a></b></li>
                                    <li><a href=""""),_display_(/*54.51*/routes/*54.57*/.WishlistCtrl.addToWishlist(p.getId)),format.raw/*54.93*/(""""><b><i class="fa fa-plus-square"></i>Add to wishlist</a></b></li>  
                                        """)))}),format.raw/*55.42*/("""
                                    """)))}),format.raw/*56.38*/("""    
                                """),format.raw/*57.33*/("""</ul>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*61.18*/("""

            """),format.raw/*63.13*/("""</div>
        </div>
    </div>
        <!-- End of content for main -->
""")))}),format.raw/*67.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],catId:Long,filter:String,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,catId,filter,user)

  def f:((play.api.Environment,List[Category],List[Product],Long,String,User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,catId,filter,user) => apply(env,categories,products,catId,filter,user)

  def ref: this.type = this

}


}
}

/**/
object products extends products_Scope0.products_Scope1.products
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 19:48:33 IST 2017
                  SOURCE: /home/wdd/webapps/project2017/app/views/products.scala.html
                  HASH: 55c1879db0d9efe4595773cc14c44aff838d9c5e
                  MATRIX: 912->75|1129->196|1156->197|1240->256|1311->319|1350->321|1383->327|1475->392|1516->424|1556->426|1601->443|1679->494|1693->499|1729->514|1774->531|1825->551|1866->564|2020->691|2054->709|2094->711|2143->732|2420->982|2518->1070|2559->1072|2628->1113|2695->1153|2725->1162|2789->1208|2802->1213|2841->1214|2910->1255|3043->1357|3105->1391|3144->1403|3192->1430|3262->1473|3272->1474|3301->1482|3616->1770|3664->1797|3749->1855|3764->1861|3840->1915|3875->1922|3886->1923|3923->1938|4001->1989|4026->2005|4066->2007|4139->2053|4178->2083|4217->2084|4290->2129|4327->2139|4342->2145|4397->2179|4562->2313|4635->2355|4700->2392|4943->2608|4968->2624|5008->2626|5077->2668|5116->2698|5155->2699|5220->2736|5261->2750|5276->2756|5354->2812|5438->2868|5449->2869|5497->2895|5527->2896|5618->2960|5633->2966|5690->3002|5831->3112|5900->3150|5965->3187|6112->3303|6154->3317|6259->3392
                  LINES: 32->5|37->5|38->6|40->8|40->8|40->8|42->10|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|51->19|53->21|53->21|53->21|54->22|58->26|58->26|58->26|59->27|59->27|59->27|60->28|60->28|60->28|61->29|62->30|64->32|64->32|64->32|65->33|65->33|65->33|71->39|71->39|72->40|72->40|72->40|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|75->43|76->44|77->45|78->46|83->51|83->51|83->51|84->52|84->52|84->52|85->53|85->53|85->53|85->53|85->53|85->53|85->53|85->53|86->54|86->54|86->54|87->55|88->56|89->57|93->61|95->63|99->67
                  -- GENERATED --
              */
          