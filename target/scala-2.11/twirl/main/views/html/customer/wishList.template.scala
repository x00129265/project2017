
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object wishList_Scope0 {
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

class wishList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models._

Seq[Any](format.raw/*1.124*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("MyWishList", user, categories, catId, filter)/*9.53*/ {_display_(Seq[Any](format.raw/*9.55*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
                <th>Delete</th>
                <th>Add to basket</th>               
			</tr>
			</thead>
			<tbody>
                """),_display_(/*33.18*/if(customer.getWishlist() != null)/*33.52*/ {_display_(Seq[Any](format.raw/*33.54*/("""
                    """),format.raw/*34.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*35.22*/for(i <- customer.getWishlist().getWishItems()) yield /*35.69*/ {_display_(Seq[Any](format.raw/*35.71*/("""
                    """),format.raw/*36.21*/("""<tr>
                        <td>"""),_display_(/*37.30*/i/*37.31*/.getProduct.getName),format.raw/*37.50*/("""</td>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getProduct.getDescription()),format.raw/*38.59*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getPrice))),format.raw/*39.64*/("""</td>
                        <td>
                            <a href=""""),_display_(/*41.39*/routes/*41.45*/.WishlistCtrl.DeleteOne(i.getId)),format.raw/*41.77*/("""" class="btn-xs btn-danger"
                            onclick="return confirmDel();">
                            <span class="glyphicon glyphicon-trash"></span></a>
                        </td>
                         <td><a href=""""),_display_(/*45.40*/routes/*45.46*/.ShoppingCtrl.addToBasket(i.getProduct().getId)),format.raw/*45.93*/(""""><span class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i></td>
                         
                    </tr>

                    <div class="row">
            <div class="col-md-6">
                
           			
                   
                </p>
				</a>
				
            </div>  
              
	</div>		  




        </div>
                    """)))}),format.raw/*65.22*/("""<!-- End of For loop -->
                """)))}),format.raw/*66.18*/("""
			"""),format.raw/*67.4*/("""</tbody>
		</table>
        <p class="text-right">
                    <a href=""""),_display_(/*70.31*/routes/*70.37*/.WishlistCtrl.emptyWishlist(catId, filter)),format.raw/*70.79*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty WishList</a>
                </p>
        
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*79.24*/("""{"""),format.raw/*79.25*/("""
		"""),format.raw/*80.3*/("""return confirm('Are you sure?');
	"""),format.raw/*81.2*/("""}"""),format.raw/*81.3*/("""
"""),format.raw/*82.1*/("""</script>
""")))}),format.raw/*83.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,user:models.users.User,categories:List[models.Category],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(customer,user,categories,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (customer,user,categories,catId,filter) => apply(customer,user,categories,catId,filter)

  def ref: this.type = this

}


}

/**/
object wishList extends wishList_Scope0.wishList
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 19:32:03 IST 2017
                  SOURCE: /home/wdd/webapps/project2017/app/views/customer/wishList.scala.html
                  HASH: 316a85316e18668326b712428b8231fc7fd598b4
                  MATRIX: 827->1|1144->123|1172->229|1199->230|1270->276|1329->327|1368->329|1398->332|1471->379|1512->411|1552->413|1585->419|1656->463|1670->468|1706->483|1739->489|1779->499|1811->504|2150->816|2193->850|2233->852|2282->873|2392->956|2455->1003|2495->1005|2544->1026|2605->1060|2615->1061|2655->1080|2717->1115|2727->1116|2776->1144|2845->1186|2893->1213|2993->1286|3008->1292|3061->1324|3325->1561|3340->1567|3408->1614|3825->2000|3898->2042|3929->2046|4037->2127|4052->2133|4115->2175|4449->2481|4478->2482|4508->2485|4569->2519|4597->2520|4625->2521|4666->2532
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|42->12|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|63->33|63->33|63->33|64->34|65->35|65->35|65->35|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|71->41|71->41|71->41|75->45|75->45|75->45|95->65|96->66|97->67|100->70|100->70|100->70|109->79|109->79|110->80|111->81|111->81|112->82|113->83
                  -- GENERATED --
              */
          