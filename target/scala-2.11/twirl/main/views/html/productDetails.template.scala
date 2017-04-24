
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object productDetails_Scope0 {
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

     object productDetails_Scope1 {
import helper._

class productDetails extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[List[models.Category],models.users.User,Long,String,models.Product,List[models.productsAdditions.Comment],Form[productsAdditions.Comment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(categories: List[models.Category], user: models.users.User, catId: Long, filter: String, prod: models.Product, cList: List[models.productsAdditions.Comment], commentForm: Form[productsAdditions.Comment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.206*/("""
"""),_display_(/*3.2*/main("productDetails", user,  categories, catId, filter)/*3.58*/ {_display_(Seq[Any](format.raw/*3.60*/("""
				"""),format.raw/*4.5*/("""<div class="col-sm-12 padding-right">
					"""),_display_(/*5.7*/if(flash.containsKey("success"))/*5.39*/{_display_(Seq[Any](format.raw/*5.40*/("""
							"""),format.raw/*6.8*/("""<div class="alert alert-success">
							"""),_display_(/*7.9*/flash/*7.14*/.get("success")),format.raw/*7.29*/("""
							"""),format.raw/*8.8*/("""</div>
						""")))}),format.raw/*9.8*/("""
						"""),_display_(/*10.8*/if(flash.containsKey("fail"))/*10.37*/{_display_(Seq[Any](format.raw/*10.38*/("""
							"""),format.raw/*11.8*/("""<div class="alert alert-danger">
							"""),_display_(/*12.9*/flash/*12.14*/.get("fail")),format.raw/*12.26*/("""
							"""),format.raw/*13.8*/("""</div>
						""")))}),format.raw/*14.8*/("""
"""),format.raw/*15.1*/("""<!--====================== A.S. =====================-->						
					<div class="product-details"><!--product-details-->
						<div class="col-sm-5">
							<div class="view-product">
								<img src="/assets/images/productImages/"""),_display_(/*19.49*/(prod.getId)),format.raw/*19.61*/(""".jpg" alt="" />
								
							</div>
							<div id="similar-product" class="carousel slide" data-ride="carousel">
								
								
							</div>
							

						</div>
						<div class="col-sm-7">
							<div class="product-information"><!--/product-information-->
								
								<h2>"""),_display_(/*32.14*/prod/*32.18*/.getName),format.raw/*32.26*/("""</h2>
								
								
								<span>
									<span>€"""),_display_(/*36.18*/prod/*36.22*/.getPrice),format.raw/*36.31*/("""</span>
									
									<a href=""""),_display_(/*38.20*/routes/*38.26*/.ShoppingCtrl.addToBasket(prod.getId)),format.raw/*38.63*/("""" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
								</span>

	
								<div class="form-group ">
  								<label for="sel1">Size:</label>
								  <select class="form-control" id="sel1">
								    <option>XS</option>
								    <option>S</option>
								    <option>M</option>
								    <option>L</option>
								    <option>XL</option>
								    <option>XXL</option>
								    <option>XXXL</option>
								  </select>
								</div>
								<p><b>Availability:</b> In Stock</p>
								<p><b>Condition:</b> New</p>
								<p><b>Brand:</b> A&JS</p>
								
							</div><!--/product-information-->
						</div>
					</div><!--/product-details-->
<!--====================== A.S. end =====================-->
<!--====================== J.T. =====================-->
						<!--Comment section-->
						<div class="tab-pane fade active in" id="reviews" >
							<div class="col-sm-12">
								"""),_display_(/*66.10*/for(c <- cList) yield /*66.25*/ {_display_(Seq[Any](format.raw/*66.27*/("""
									"""),format.raw/*67.10*/("""<div class="product-information">
									<ul>
										<li><a href=""><i class="fa fa-user"></i>"""),_display_(/*69.53*/c/*69.54*/.getCustomer().getfName()),format.raw/*69.79*/("""</a></li>
										<li><a href=""><i class="fa fa-clock-o"></i>"""),_display_(/*70.56*/c/*70.57*/.getTime()),format.raw/*70.67*/("""</a></li>
										<li><a href=""><i class="fa fa-calendar-o"></i>"""),_display_(/*71.59*/c/*71.60*/.getDate()),format.raw/*71.70*/("""</a></li>
									</ul>
									<p> """),_display_(/*73.15*/c/*73.16*/.getContent),format.raw/*73.27*/("""</p>
									</div>
								""")))}),format.raw/*75.10*/("""
								"""),_display_(/*76.10*/if(user.getRole == "customer")/*76.40*/{_display_(Seq[Any](format.raw/*76.41*/("""
								"""),format.raw/*77.9*/("""<p><b>Write Your Review</b></p>



									"""),_display_(/*81.11*/form(action = routes.CustomerCtrl.comment(catId, filter, prod.getId()), 'class -> "form-horizontal", 'role -> "form")/*81.128*/ {_display_(Seq[Any](format.raw/*81.130*/("""
									"""),_display_(/*82.11*/inputText(commentForm("content"), '_label -> "Write your comment here", 'class -> "form-control")),format.raw/*82.108*/("""
										"""),format.raw/*83.11*/("""<input type="submit" value="Add comment" class="btn btn-default pull-right">
									""")))}),format.raw/*84.11*/("""
								""")))}),format.raw/*85.10*/("""	

							"""),format.raw/*87.8*/("""</div>
						</div>
						<!--End comment section-->
<!--====================== J.T. end =====================-->
					
					
				</div>
""")))}))
      }
    }
  }

  def render(categories:List[models.Category],user:models.users.User,catId:Long,filter:String,prod:models.Product,cList:List[models.productsAdditions.Comment],commentForm:Form[productsAdditions.Comment]): play.twirl.api.HtmlFormat.Appendable = apply(categories,user,catId,filter,prod,cList,commentForm)

  def f:((List[models.Category],models.users.User,Long,String,models.Product,List[models.productsAdditions.Comment],Form[productsAdditions.Comment]) => play.twirl.api.HtmlFormat.Appendable) = (categories,user,catId,filter,prod,cList,commentForm) => apply(categories,user,catId,filter,prod,cList,commentForm)

  def ref: this.type = this

}


}
}

/**/
object productDetails extends productDetails_Scope0.productDetails_Scope1.productDetails
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 19:32:02 IST 2017
                  SOURCE: /home/wdd/webapps/project2017/app/views/productDetails.scala.html
                  HASH: aab6e57ac64c1ba2c367dd4d456eb9db8cd57357
                  MATRIX: 947->18|1247->222|1274->224|1338->280|1377->282|1408->287|1477->331|1517->363|1555->364|1589->372|1656->414|1669->419|1704->434|1738->442|1781->456|1815->464|1853->493|1892->494|1927->502|1994->543|2008->548|2041->560|2076->568|2120->582|2148->583|2406->814|2439->826|2756->1116|2769->1120|2798->1128|2881->1184|2894->1188|2924->1197|2988->1234|3003->1240|3061->1277|4040->2229|4071->2244|4111->2246|4149->2256|4276->2356|4286->2357|4332->2382|4424->2447|4434->2448|4465->2458|4560->2526|4570->2527|4601->2537|4667->2576|4677->2577|4709->2588|4770->2618|4807->2628|4846->2658|4885->2659|4921->2668|4993->2713|5120->2830|5161->2832|5199->2843|5318->2940|5357->2951|5475->3038|5516->3048|5553->3058
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|38->5|38->5|38->5|39->6|40->7|40->7|40->7|41->8|42->9|43->10|43->10|43->10|44->11|45->12|45->12|45->12|46->13|47->14|48->15|52->19|52->19|65->32|65->32|65->32|69->36|69->36|69->36|71->38|71->38|71->38|99->66|99->66|99->66|100->67|102->69|102->69|102->69|103->70|103->70|103->70|104->71|104->71|104->71|106->73|106->73|106->73|108->75|109->76|109->76|109->76|110->77|114->81|114->81|114->81|115->82|115->82|116->83|117->84|118->85|120->87
                  -- GENERATED --
              */
          