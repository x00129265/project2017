
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object aboutUs_Scope0 {
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

     object aboutUs_Scope1 {
import models.Category
import models.Product
import models.users.User

class aboutUs extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[models.Category],List[models.Product],models.users.User,Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(env: play.api.Environment, categories: List[models.Category], products: List[models.Product], user: models.users.User, catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.150*/("""

"""),format.raw/*7.1*/("""<!-- Pass page title, user, and content """),format.raw/*7.41*/("""{"""),format.raw/*7.42*/("""html between braces"""),format.raw/*7.61*/("""}"""),format.raw/*7.62*/(""" """),format.raw/*7.63*/("""to the main view -->
"""),_display_(/*8.2*/main("about us",user, categories, catId: Long, filter)/*8.56*/ {_display_(Seq[Any](format.raw/*8.58*/("""

 """),format.raw/*10.2*/("""<!-- Modal -->

	<!-- J.J-->
	

	<div class="containerblack">
  <h1>About Us ?</h1>
  <blockquote>
    <p>We are A&J. We are an empowering, bold and forward thinking online fashion brand, inspired by real life. We design and create product informed by you, our customers, our friends and global influences: Catwalk, celebrity, social media, bloggers and street style, creating an online fashion destination that encompasses and celebrates everything it means to be a girl in a digitally immersed world today.

With thousands of styles live at one time and fresh new threads hitting down every single day, We’re not just fast fashion, we’re rapid fashion. Our pieces are exclusive and created by our very own design talent who strive to create killer garms for the dreamers, believers and night lovers, taking the risks no one else dares to take.

And most importantly, we believe shopping is a right, not a luxury, so we aim to deliver the biggest trends at the most affordable prices, on a global scale. Along with competitive delivery to 160 countries worldwide, we’re here for when the good times roll.

We do all this and as much as we can to ensure we source ethically and to avoid acts that constitute modern slavery. To this end we have a team that is dedicated to understanding our supply chains, ask them about their operations, ensure they understand what supplying ethically means and provide guidance, training and assistance where necessary. Download our Modern Slavery Statement.

We are A&J, We are real. And we do things the simple way.

Welcome to our world !!!. </p>
    <footer>From "Herald" Aug 24(2016)</footer>
  </blockquote>
</div>
	 <br>
      <br>

      <div class="col-md-12">

          


            </div>
</div>


 <div class="container">
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Contact Us</h4>
        </div>
        <div class="modal-body">
          <p>Our online Representative will contact you within 2 hours </p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>











<div class="jumbotron text-center">
  
  <a>Subscribe for new clothes</a>
  <form class="form-inline">
    <input type="email" class="form-control" size="50" placeholder="Email Address" required>
    <button type="button" class="btn btn-danger">Subscribe</button>
  </form>
</div>


 













<div class="container">
 <form id="contact-form" method="post" action="contact.php" role="form">

    <div class="messages"></div>

    <div class="controls">

        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label for="form_name">Firstname *</label>
                    <input id="form_name" type="text" name="name" class="form-control" placeholder="Please enter your firstname *" required="required" data-error="Firstname is required.">
                    <div class="help-block with-errors"></div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label for="form_lastname">Lastname *</label>
                    <input id="form_lastname" type="text" name="surname" class="form-control" placeholder="Please enter your lastname *" required="required" data-error="Lastname is required.">
                    <div class="help-block with-errors"></div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <label for="form_email">Email *</label>
                    <input id="form_email" type="email" name="email" class="form-control" placeholder="Please enter your email *" required="required" data-error="Valid email is required.">
                    <div class="help-block with-errors"></div>
                </div>
            </div>
            <div class="col-md-6">
                <div class="form-group">
                    <label for="form_phone">Phone</label>
                    <input id="form_phone" type="tel" name="phone" class="form-control" placeholder="Please enter your phone">
                    <div class="help-block with-errors"></div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="form-group">
                    <label for="form_message">Enquiry *</label>
                    <textarea id="form_message" name="message" class="form-control" placeholder="Enquiry for me *" rows="4" required="required" data-error="Please,leave us a message."></textarea>
                    <div class="help-block with-errors"></div>
                </div>
      <div class="checkbox">
      <label><input type="checkbox"> I'm not Robot</label>
    </div>


            </div>
            <div class="col-md-12">
                <input type="button" class="btn btn-success btn-send" value="Send message">
            </div>
        </div>


 
  
</div>

</body>
</html>

<div class="container">
 <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Contact Us</h4>
        </div>
        <div class="modal-body">
          <p>Our online Representative will contact you within 2 hours </p>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
----
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>






        <div class="row">
            <div class="col-md-12">
                <p class="text-muted"><strong>*</strong> These fields are required.</p>
            </div>
        </div>
    </div>

</form> 
</div>


<div class="container">
  <h2>What Our Customers say ??</h2>
  <p>This was the reviews submited by the Users to the european Shopping watchdog about A&J ():</p><br>
  <div class="media">
    <div class="media-left">
     <img src="/assets/images/productImages/70.jpg" class="media-object" style="width:45px">
    </div>
    <div class="media-body">
      <h4 class="media-heading">John Kean <small><i>Posted on February 19, 2016</i></small></h4>
      <p>Loved the products always in good quality.</p>
      
      <!-- Nested media object -->
      <div class="media">
        <div class="media-left">
         <img src="/assets/images/productImages/10.jpg" class="media-object" style="width:45px">
        </div>
        <div class="media-body">
          <h4 class="media-heading">Emily Johnson <small><i>Posted on February 20, 2016</i></small></h4>
          <p>Bought Two pair of Jeans last week, Got immediate delivery and product in good shape.</p>

          <!-- Nested media object -->
          <div class="media">
            <div class="media-left">
             <img src="/assets/images/productImages/57.jpg" class="media-object" style="width:45px">
            </div>
            <div class="media-body">
              <h4 class="media-heading">Adam Thomas <small><i>Posted on February 25, 2016</i></small></h4>
              <p>Been a loyal customer since start !!!!.</p>
            </div>
          </div>
          
        </div>
        
        <!-- Nested media object -->
        <div class="media">
          <div class="media-left">
           <img src="/assets/images/productImages/50.jpg" class="media-object" style="width:45px">
          </div>
          <div class="media-body">
            <h4 class="media-heading">Jannette Tom <small><i>Posted on February 25, 2016</i></small></h4>
            <p>j'adore le product je suis tres joy pour la products !! je amor !!!.</p>
          </div>
        </div>
        
      </div>
    </div>
    
    <!-- Nested media object -->    
    <div class="media">
      <div class="media-left">
       <img src="/assets/images/productImages/71.jpg" class="media-object" style="width:45px">
      </div>
      <div class="media-body">
        <h4 class="media-heading">Andy O'neil<small><i>Posted on February 29, 2016</i></small></h4>
        <p>The delivery was quick really apreciate the fastness.</p>
      </div>
    </div>

  </div>
</div>

</body>
</html>













  <!-- Page Content -->
    <div class="container">
  <div class="col-md-12">

          

                <!-- Side Widget Well -->
                <div class="well">
                    <h4>A & J Clothings</h4>
                    <p>SandyFord Road</p>
                    <p>Co.Dublin</p>
                    <p>01234567</p>
                    <p>087-123456</p>
                </div>

            </div>
        <!-- Jumbotron Header -->
        <header class="jumbotron hero-spacer">
            <img src="images/locate.png" alt="" style="float:right; padding-right:180px;"/>
            <h1>How to find us!</h1>
                   <h4>A & J Clothings</h4>
                    <p>SandyFord Road</p>
                    <p>Co.Dublin</p>
                    <p>01234567</p>
                    <p>087-123456</p>
            <h3>We are located in  SandyFord, Dublin .</h3>
            <p>Come by anytime to see our HQ about enquiries on doing Business with us !</p>            
            
            </p>
        </header>

        <div id="map" style="width:500px;height:500px;background:yellow;"></div>
        <h3>Our team looks forward to seeing you!</h3>
<script>
function myMap() """),format.raw/*324.18*/("""{"""),format.raw/*324.19*/("""
"""),format.raw/*325.1*/("""    var mapOptions = """),format.raw/*325.22*/("""{"""),format.raw/*325.23*/("""
"""),format.raw/*326.1*/("""        center: new google.maps.LatLng(53.274737, -6.21841),
        zoom: 18,
        mapTypeId: google.maps.MapTypeId.HYBRID
    """),format.raw/*329.5*/("""}"""),format.raw/*329.6*/("""
"""),format.raw/*330.1*/("""var map = new google.maps.Map(document.getElementById("map"), mapOptions);
"""),format.raw/*331.1*/("""}"""),format.raw/*331.2*/("""
"""),format.raw/*332.1*/("""</script>

<script src="https://maps.googleapis.com/maps/api/js?callback=myMap"></script>

        <hr>





       
	<section id="slider"><!--slider-->
		<div class="container">
			<div class="row">
				<div class="col-sm-9">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>

						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>A</span>&Js</h1>
									<h2>Welcome </h2>
									<p>Find the lowest prices</p>
									<button type="button" class="btn btn-default get">Get it now</button>
								</div>
								<div class="col-sm-6">
									<img src="/assets/images/home/product5.jpg" class="girl img-responsive" alt="" />
									
									<img src="/assets/images/home/new.png"  class="pricing" alt="" />

								
								
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1><span>E</span>-Delivery</h1>
									<h2>100% Satisfaction</h2>
									<p>Buy Now get next day Delivery Free </p>
									<button type="button" class="btn btn-default get">Get it now</button>
								</div>
								<div class="col-sm-6">
									<img src="/assets/images/home/product3.jpg" class="Delivery" alt="" />

									
								</div>
							</div>

							<div class="item">
								<div class="col-sm-6">
									<h1><span>E</span>-Clothing</h1>
									<h2>Get Massive Discounts</h2>
									<p>We provide the best clothing from Fair Trade nations and Huge International collection </p>
									<button type="button" class="btn btn-default get">Get it now</button>
								</div>
								<div class="col-sm-6">
									<img src="/assets/images/home/product2.jpg" class="Delivery" alt="" />

									

								</div>
							</div>

						</div>

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

	<div class="col-sm-12 padding-right">
		<div class="row">
		"""),_display_(/*417.4*/if(flash.containsKey("success"))/*417.36*/ {_display_(Seq[Any](format.raw/*417.38*/("""
                """),format.raw/*418.17*/("""<div class="alert alert-success">
                """),_display_(/*419.18*/flash/*419.23*/.get("success")),format.raw/*419.38*/("""
                """),format.raw/*420.17*/("""</div>
            """)))}),format.raw/*421.14*/("""
            """),format.raw/*422.13*/("""<div class="features_items"><!--features_items-->
                <h2 class="title text-center">New products</h2>
                """),_display_(/*424.18*/for(p <- products) yield /*424.36*/ {_display_(Seq[Any](format.raw/*424.38*/("""
                    """),format.raw/*425.21*/("""<div  class="col-sm-4">
                        <div  class="product-image-wrapper">
                            <div class="single-products">
                                <div class="productinfo text-center">
                                    """),_display_(/*429.38*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*429.126*/ {_display_(Seq[Any](format.raw/*429.128*/("""
                                        """),format.raw/*430.41*/("""<img src="/assets/images/productImages/"""),_display_(/*430.81*/(p.getId)),format.raw/*430.90*/(""".jpg"/>
                                    """)))}/*431.39*/else/*431.44*/{_display_(Seq[Any](format.raw/*431.45*/("""
                                        """),format.raw/*432.41*/("""<img src="/assets/images/productImages/thumbnails/noImage.png"/>
                                    """)))}),format.raw/*433.38*/("""

                                """),format.raw/*435.33*/("""<h2>&euro; """),_display_(/*435.45*/("%.2f".format(p.getPrice))),format.raw/*435.72*/("""</h2>
                                <h3>"""),_display_(/*436.38*/p/*436.39*/.getName),format.raw/*436.47*/("""</h3>
                               
                              
                                </div>
                                <div class="product-overlay">
                                    <div class="overlay-content">
                                        <h2>&euro; """),_display_(/*442.53*/("%.2f".format(p.getPrice))),format.raw/*442.80*/("""</h2>
                                        <a   href=""""),_display_(/*443.53*/routes/*443.59*/.HomeController.productDetails(catId, filter, p.getId)),format.raw/*443.113*/("""" <p> """),_display_(/*443.120*/p/*443.121*/.getDescription),format.raw/*443.136*/("""</p> </a>
                                        <a href=""""),_display_(/*444.51*/routes/*444.57*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*444.91*/("""" class="btn btn-default add-to-cart"><i class="fa fa-shopping-cart"></i>Add to cart</a>
                                    </div>
                                </div>
                            </div>
                            <div class="choose">
								<ul class="nav nav-pills nav-justified">
                                    <li><a href=""""),_display_(/*450.51*/routes/*450.57*/.HomeController.like(catId, filter, p.getId, "index")),format.raw/*450.110*/(""""><b><i class="glyphicon glyphicon-thumbs-up"></i>Like """),_display_(/*450.166*/p/*450.167*/.getPlike().getLikeCount()),format.raw/*450.193*/(""" """),format.raw/*450.194*/("""</a></b></li>
                                    <li><a href="#"><b><i class="fa fa-plus-square"></i>Add to wishlist</a></b></li>  
                                </ul>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*456.18*/("""
		"""),format.raw/*457.3*/("""</div>
		</div>
					
					
					
				</div>
""")))}),format.raw/*463.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[models.Category],products:List[models.Product],user:models.users.User,catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,user,catId,filter)

  def f:((play.api.Environment,List[models.Category],List[models.Product],models.users.User,Long,String) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,user,catId,filter) => apply(env,categories,products,user,catId,filter)

  def ref: this.type = this

}


}
}

/**/
object aboutUs extends aboutUs_Scope0.aboutUs_Scope1.aboutUs
              /*
                  -- GENERATED --
                  DATE: Mon Apr 24 10:27:30 IST 2017
                  SOURCE: /home/wdd/webapps/project2017/app/views/aboutUs.scala.html
                  HASH: a840ca0232c7fac8fabe5554a1e2814f4852c11c
                  MATRIX: 936->75|1180->223|1208->225|1275->265|1303->266|1349->285|1377->286|1405->287|1452->309|1514->363|1553->365|1583->368|12026->10782|12056->10783|12085->10784|12135->10805|12165->10806|12194->10807|12353->10938|12382->10939|12411->10940|12514->11015|12543->11016|12572->11017|15074->13492|15116->13524|15157->13526|15203->13543|15282->13594|15297->13599|15334->13614|15380->13631|15432->13651|15474->13664|15633->13795|15668->13813|15709->13815|15759->13836|16037->14086|16136->14174|16178->14176|16248->14217|16316->14257|16347->14266|16412->14312|16426->14317|16466->14318|16536->14359|16670->14461|16733->14495|16773->14507|16822->14534|16893->14577|16904->14578|16934->14586|17250->14874|17299->14901|17385->14959|17401->14965|17478->15019|17514->15026|17526->15027|17564->15042|17652->15102|17668->15108|17724->15142|18106->15496|18122->15502|18198->15555|18283->15611|18295->15612|18344->15638|18375->15639|18688->15920|18719->15923|18796->15969
                  LINES: 32->5|37->5|39->7|39->7|39->7|39->7|39->7|39->7|40->8|40->8|40->8|42->10|356->324|356->324|357->325|357->325|357->325|358->326|361->329|361->329|362->330|363->331|363->331|364->332|449->417|449->417|449->417|450->418|451->419|451->419|451->419|452->420|453->421|454->422|456->424|456->424|456->424|457->425|461->429|461->429|461->429|462->430|462->430|462->430|463->431|463->431|463->431|464->432|465->433|467->435|467->435|467->435|468->436|468->436|468->436|474->442|474->442|475->443|475->443|475->443|475->443|475->443|475->443|476->444|476->444|476->444|482->450|482->450|482->450|482->450|482->450|482->450|482->450|488->456|489->457|495->463
                  -- GENERATED --
              */
          