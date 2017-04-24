
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
                               <th>Item Priority Price </th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*32.18*/if(customer.getWishlist() != null)/*32.52*/ {_display_(Seq[Any](format.raw/*32.54*/("""
                    """),format.raw/*33.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*34.22*/for(i <- customer.getWishlist().getWishItems()) yield /*34.69*/ {_display_(Seq[Any](format.raw/*34.71*/("""
                    """),format.raw/*35.21*/("""<tr>
                        <td>"""),_display_(/*36.30*/i/*36.31*/.getProduct.getName),format.raw/*36.50*/("""</td>
                        <td>"""),_display_(/*37.30*/i/*37.31*/.getProduct.getDescription()),format.raw/*37.59*/("""</td>
                        <td>&euro; """),_display_(/*38.37*/("%.2f".format(i.getPrice))),format.raw/*38.64*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getItemTotal))),format.raw/*39.68*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getQuantity()),format.raw/*40.45*/("""</td>
                        <td><a href=""""),_display_(/*41.39*/routes/*41.45*/.WishlistCtrl.DeleteOne(i.getId)),format.raw/*41.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                         <td><a href=""""),_display_(/*42.40*/routes/*42.46*/.ShoppingCtrl.addOne(i.getId)),format.raw/*42.75*/(""""><span class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i></td>
                    </tr>

                    <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*48.31*/routes/*48.37*/.WishlistCtrl.emptyWishlist(catId, filter)),format.raw/*48.79*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty WishList</a>
                </p>
           			
                   
                </p>
				</a>
				
            </div>  
              
	</div>		  




        </div>
                    """)))}),format.raw/*64.22*/("""<!-- End of For loop -->
                """)))}),format.raw/*65.18*/("""
			"""),format.raw/*66.4*/("""</tbody>
		</table>
    
        
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*75.24*/("""{"""),format.raw/*75.25*/("""
		"""),format.raw/*76.3*/("""return confirm('Are you sure?');
	"""),format.raw/*77.2*/("""}"""),format.raw/*77.3*/("""
"""),format.raw/*78.1*/("""</script>
""")))}),format.raw/*79.2*/("""
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
                  DATE: Mon Apr 24 10:27:30 IST 2017
                  SOURCE: /home/wdd/webapps/project2017/app/views/customer/wishList.scala.html
                  HASH: 33a21e9e0d9936a3dff3ee3b6d77217f55198a81
                  MATRIX: 827->1|1144->123|1172->229|1199->230|1270->276|1329->327|1368->329|1398->332|1471->379|1512->411|1552->413|1585->419|1656->463|1670->468|1706->483|1739->489|1779->499|1811->504|2125->791|2168->825|2208->827|2257->848|2367->931|2430->978|2470->980|2519->1001|2580->1035|2590->1036|2630->1055|2692->1090|2702->1091|2751->1119|2820->1161|2868->1188|2937->1230|2989->1261|3051->1296|3061->1297|3096->1311|3167->1355|3182->1361|3235->1393|3365->1496|3380->1502|3430->1531|3711->1785|3726->1791|3789->1833|4150->2163|4223->2205|4254->2209|4441->2368|4470->2369|4500->2372|4561->2406|4589->2407|4617->2408|4658->2419
                  LINES: 27->1|35->1|37->7|38->8|39->9|39->9|39->9|42->12|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|62->32|62->32|62->32|63->33|64->34|64->34|64->34|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|78->48|78->48|78->48|94->64|95->65|96->66|105->75|105->75|106->76|107->77|107->77|108->78|109->79
                  -- GENERATED --
              */
          