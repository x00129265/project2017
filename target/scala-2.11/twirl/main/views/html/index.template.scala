
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import models.Category
import models.Product
import models.users.User

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[play.api.Environment,List[models.Category],List[models.Product],models.users.User,Long,String,List[IndexSlider],IndexSlider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, categories: List[models.Category], products: List[models.Product], user: models.users.User, catId: Long, filter: String, iList: List[IndexSlider], activeI: IndexSlider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.198*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title, user, and content """),format.raw/*7.41*/("""{"""),format.raw/*7.42*/("""html between braces"""),format.raw/*7.61*/("""}"""),format.raw/*7.62*/(""" """),format.raw/*7.63*/("""to the main view -->
"""),_display_(/*8.2*/main("Home", user, categories, catId: Long, filter)/*8.53*/ {_display_(Seq[Any](format.raw/*8.55*/("""
"""),format.raw/*9.1*/("""<!--====================== J.T. =====================-->
	
	"""),_display_(/*11.3*/if(activeI != null)/*11.22*/{_display_(Seq[Any](format.raw/*11.23*/("""
	"""),format.raw/*12.2*/("""<section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-9">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						

						<!--Slider-->
						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>"""),_display_(/*23.21*/activeI/*23.28*/.getHeading),format.raw/*23.39*/("""</span></h1>
									<h2>"""),_display_(/*24.15*/activeI/*24.22*/.getHeading2),format.raw/*24.34*/("""</h2>
									<p>"""),_display_(/*25.14*/activeI/*25.21*/.getContent),format.raw/*25.32*/("""</p>
									<a href=""""),_display_(/*26.20*/(activeI.getPostLink)),format.raw/*26.41*/("""" <button type="button" class="btn btn-default">More</button></a>

								</div>
								<div class="col-sm-6">
									<img src="/assets/images/slider/"""),_display_(/*30.43*/(activeI.getId)),format.raw/*30.58*/(""".jpg" class="girl img-responsive" alt="" />

							</div>
							</div>

							"""),_display_(/*35.9*/for(i <- iList) yield /*35.24*/{_display_(Seq[Any](format.raw/*35.25*/("""
							
								"""),format.raw/*37.9*/("""<div class="pushDown item">
									<div class="col-sm-6">
										<h1><span>"""),_display_(/*39.22*/i/*39.23*/.getHeading),format.raw/*39.34*/("""</span></h1>
										<h2>"""),_display_(/*40.16*/i/*40.17*/.getHeading2),format.raw/*40.29*/("""</h2>
										<p>"""),_display_(/*41.15*/i/*41.16*/.getContent),format.raw/*41.27*/("""</p>
										<a href=""""),_display_(/*42.21*/(i.getPostLink)),format.raw/*42.36*/("""" <button type="button" class="btn btn-default">More</button></a>
									</div>
									<div class="col-sm-6">
										<img src="/assets/images/slider/"""),_display_(/*45.44*/(i.getId)),format.raw/*45.53*/(""".jpg" class="girl img-responsive" alt="" />
										
										<!--<img src="/assets/images/home/new.png"  class="pricing" alt="" />-->
									</div>
								</div>
							""")))}),format.raw/*50.9*/("""

						"""),format.raw/*52.7*/("""</div>

						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>

				</div>
			</div>
		</div>
	</section><!--/slider-->
	""")))}),format.raw/*66.3*/("""
"""),format.raw/*67.1*/("""<!--====================== J.T. end =====================-->
<!--====================== J.T. =====================-->
	<div class="col-sm-12 padding-right">
		<div class="row">
		"""),_display_(/*71.4*/if(flash.containsKey("success"))/*71.36*/{_display_(Seq[Any](format.raw/*71.37*/("""
							"""),format.raw/*72.8*/("""<div class="alert alert-success">
							"""),_display_(/*73.9*/flash/*73.14*/.get("success")),format.raw/*73.29*/("""
							"""),format.raw/*74.8*/("""</div>
						""")))}),format.raw/*75.8*/("""
						"""),_display_(/*76.8*/if(flash.containsKey("fail"))/*76.37*/{_display_(Seq[Any](format.raw/*76.38*/("""
							"""),format.raw/*77.8*/("""<div class="alert alert-danger">
							"""),_display_(/*78.9*/flash/*78.14*/.get("fail")),format.raw/*78.26*/("""
							"""),format.raw/*79.8*/("""</div>
						""")))}),format.raw/*80.8*/("""
            """),format.raw/*81.13*/("""<div class="features_items"><!--features_items-->
                <h2 class="title text-center">New products</h2>
                """),_display_(/*83.18*/for(p <- products) yield /*83.36*/ {_display_(Seq[Any](format.raw/*83.38*/("""
                    """),format.raw/*84.21*/("""<div  class="col-sm-4">
                        <div  class="product-image-wrapper">
                            <div class="single-products">
                                <div class="productinfo text-center">
                                    """),_display_(/*88.38*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*88.126*/ {_display_(Seq[Any](format.raw/*88.128*/("""
                                        """),format.raw/*89.41*/("""<img src="/assets/images/productImages/"""),_display_(/*89.81*/(p.getId)),format.raw/*89.90*/(""".jpg"/>
                                    """)))}/*90.39*/else/*90.44*/{_display_(Seq[Any](format.raw/*90.45*/("""
                                        """),format.raw/*91.41*/("""<img src="/assets/images/productImages/thumbnails/noImage.png"/>
                                    """)))}),format.raw/*92.38*/("""

                                """),format.raw/*94.33*/("""<h2>&euro; """),_display_(/*94.45*/("%.2f".format(p.getPrice))),format.raw/*94.72*/("""</h2>
                                <h3>"""),_display_(/*95.38*/p/*95.39*/.getName),format.raw/*95.47*/("""</h3>
                               
                              
                                </div>
                                <div class="product-overlay">
                                    <div class="overlay-content">
                                        <h2>&euro; """),_display_(/*101.53*/("%.2f".format(p.getPrice))),format.raw/*101.80*/("""</h2>
                                        <a   href=""""),_display_(/*102.53*/routes/*102.59*/.HomeController.productDetails(catId, filter, p.getId)),format.raw/*102.113*/("""" <p> """),_display_(/*102.120*/p/*102.121*/.getDescription),format.raw/*102.136*/("""</p> </a>
										"""),_display_(/*103.12*/if(user != null)/*103.28*/ {_display_(Seq[Any](format.raw/*103.30*/("""
											"""),_display_(/*104.13*/if(user.getRole == "customer")/*104.43*/{_display_(Seq[Any](format.raw/*104.44*/("""
											"""),format.raw/*105.12*/("""<a href=""""),_display_(/*105.22*/routes/*105.28*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*105.62*/("""" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
											""")))}),format.raw/*106.13*/("""
										""")))}),format.raw/*107.12*/("""	
									"""),format.raw/*108.10*/("""</div>
                                </div>
                            </div>
							
                            <div class="choose">
								
								<ul class="nav nav-pills nav-justified">
									"""),_display_(/*115.11*/if(user != null)/*115.27*/ {_display_(Seq[Any](format.raw/*115.29*/("""
										"""),_display_(/*116.12*/if(user.getRole == "customer")/*116.42*/{_display_(Seq[Any](format.raw/*116.43*/("""
										"""),format.raw/*117.11*/("""<li><a href=""""),_display_(/*117.25*/routes/*117.31*/.HomeController.like(catId, filter, p.getId, "index")),format.raw/*117.84*/(""""><b><i class="glyphicon glyphicon-thumbs-up"></i>Like """),_display_(/*117.140*/p/*117.141*/.getPlike().getLikeCount()),format.raw/*117.167*/(""" """),format.raw/*117.168*/("""</a></b></li>
										<li><a href=""""),_display_(/*118.25*/routes/*118.31*/.WishlistCtrl.addToWishlist(p.getId)),format.raw/*118.67*/(""""><b><i class="fa fa-plus-square"></i>Add to wishlist</a></b></li>  
										""")))}),format.raw/*119.12*/("""
									""")))}),format.raw/*120.11*/("""	
                                """),format.raw/*121.33*/("""</ul>
								
                            </div>
							
                        </div>
                    </div>
                """)))}),format.raw/*127.18*/("""
"""),format.raw/*128.1*/("""<!--====================== J.T. end=====================-->				
		</div>
		</div>
					
					
					
				</div>
""")))}),format.raw/*135.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[models.Category],products:List[models.Product],user:models.users.User,catId:Long,filter:String,iList:List[IndexSlider],activeI:IndexSlider): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,user,catId,filter,iList,activeI)

  def f:((play.api.Environment,List[models.Category],List[models.Product],models.users.User,Long,String,List[IndexSlider],IndexSlider) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,user,catId,filter,iList,activeI) => apply(env,categories,products,user,catId,filter,iList,activeI)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 19:48:33 IST 2017
                  SOURCE: /home/wdd/webapps/project2017/app/views/index.scala.html
                  HASH: 1876302b7e6c33d1535fbf3c35ab5fba814023d1
                  MATRIX: 960->75|1252->271|1280->273|1347->313|1375->314|1421->333|1449->334|1477->335|1524->357|1583->408|1622->410|1649->411|1736->472|1764->491|1803->492|1832->494|2191->826|2207->833|2239->844|2293->871|2309->878|2342->890|2388->909|2404->916|2436->927|2487->951|2529->972|2711->1127|2747->1142|2855->1224|2886->1239|2925->1240|2969->1257|3077->1338|3087->1339|3119->1350|3174->1378|3184->1379|3217->1391|3264->1411|3274->1412|3306->1423|3358->1448|3394->1463|3578->1620|3608->1629|3815->1806|3850->1814|4247->2181|4275->2182|4481->2362|4522->2394|4561->2395|4596->2403|4664->2445|4678->2450|4714->2465|4749->2473|4793->2487|4827->2495|4865->2524|4904->2525|4939->2533|5006->2574|5020->2579|5053->2591|5088->2599|5132->2613|5173->2626|5331->2757|5365->2775|5405->2777|5454->2798|5731->3048|5829->3136|5870->3138|5939->3179|6006->3219|6036->3228|6100->3274|6113->3279|6152->3280|6221->3321|6354->3423|6416->3457|6455->3469|6503->3496|6573->3539|6583->3540|6612->3548|6928->3836|6977->3863|7063->3921|7079->3927|7156->3981|7192->3988|7204->3989|7242->4004|7291->4025|7317->4041|7358->4043|7399->4056|7439->4086|7479->4087|7520->4099|7558->4109|7574->4115|7630->4149|7763->4250|7807->4262|7847->4273|8081->4479|8107->4495|8148->4497|8188->4509|8228->4539|8268->4540|8308->4551|8350->4565|8366->4571|8441->4624|8526->4680|8538->4681|8587->4707|8618->4708|8684->4746|8700->4752|8758->4788|8870->4868|8913->4879|8976->4913|9141->5046|9170->5047|9313->5159
                  LINES: 32->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|41->9|43->11|43->11|43->11|44->12|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|58->26|62->30|62->30|67->35|67->35|67->35|69->37|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|77->45|77->45|82->50|84->52|98->66|99->67|103->71|103->71|103->71|104->72|105->73|105->73|105->73|106->74|107->75|108->76|108->76|108->76|109->77|110->78|110->78|110->78|111->79|112->80|113->81|115->83|115->83|115->83|116->84|120->88|120->88|120->88|121->89|121->89|121->89|122->90|122->90|122->90|123->91|124->92|126->94|126->94|126->94|127->95|127->95|127->95|133->101|133->101|134->102|134->102|134->102|134->102|134->102|134->102|135->103|135->103|135->103|136->104|136->104|136->104|137->105|137->105|137->105|137->105|138->106|139->107|140->108|147->115|147->115|147->115|148->116|148->116|148->116|149->117|149->117|149->117|149->117|149->117|149->117|149->117|149->117|150->118|150->118|150->118|151->119|152->120|153->121|159->127|160->128|167->135
                  -- GENERATED --
              */
          