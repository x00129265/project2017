
package views.html.customer.profileFiles

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profileEdit_Scope0 {
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

class profileEdit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[models.users.Customer,models.users.User,List[models.Category],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, user: models.users.User, categories: List[models.Category], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.124*/("""


"""),_display_(/*4.2*/main("Edit profile", user, categories, catId, filter)/*4.55*/  {_display_(Seq[Any](format.raw/*4.58*/("""
"""),format.raw/*5.1*/("""<!--====================== A.S. =====================-->

	<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				
				<h2 class="title text-center">Edit profile</h2>
				<div id="accordian">
					<div class="list-group">

							

					</div>
				</div>
				<div>
				</div>
			</div>


""")))}),format.raw/*24.2*/("""

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
object profileEdit extends profileEdit_Scope0.profileEdit
              /*
                  -- GENERATED --
                  DATE: Sat Apr 22 15:53:33 IST 2017
                  SOURCE: /home/wdd/webapps/integrated-11-04-17/app/views/customer/profileFiles/profileEdit.scala.html
                  HASH: 5ff4b9f56b3937833d3f35671f651f0e4111691b
                  MATRIX: 846->1|1064->123|1093->127|1154->180|1194->183|1221->184|1573->506
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|55->24
                  -- GENERATED --
              */
          