
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/project2017/conf/routes
// @DATE:Mon Apr 24 10:47:52 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:9
  HomeController_4: controllers.HomeController,
  // @LINE:21
  CustomerCtrl_7: controllers.CustomerCtrl,
  // @LINE:26
  WishlistCtrl_0: controllers.WishlistCtrl,
  // @LINE:34
  ShoppingCtrl_6: controllers.ShoppingCtrl,
  // @LINE:51
  AdminController_1: controllers.AdminController,
  // @LINE:95
  LoginController_9: controllers.LoginController,
  // @LINE:112
  WarehouseController_3: controllers.WarehouseController,
  // @LINE:126
  CountController_2: controllers.CountController,
  // @LINE:128
  AsyncController_5: controllers.AsyncController,
  // @LINE:131
  Assets_8: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:9
    HomeController_4: controllers.HomeController,
    // @LINE:21
    CustomerCtrl_7: controllers.CustomerCtrl,
    // @LINE:26
    WishlistCtrl_0: controllers.WishlistCtrl,
    // @LINE:34
    ShoppingCtrl_6: controllers.ShoppingCtrl,
    // @LINE:51
    AdminController_1: controllers.AdminController,
    // @LINE:95
    LoginController_9: controllers.LoginController,
    // @LINE:112
    WarehouseController_3: controllers.WarehouseController,
    // @LINE:126
    CountController_2: controllers.CountController,
    // @LINE:128
    AsyncController_5: controllers.AsyncController,
    // @LINE:131
    Assets_8: controllers.Assets
  ) = this(errorHandler, HomeController_4, CustomerCtrl_7, WishlistCtrl_0, ShoppingCtrl_6, AdminController_1, LoginController_9, WarehouseController_3, CountController_2, AsyncController_5, Assets_8, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_4, CustomerCtrl_7, WishlistCtrl_0, ShoppingCtrl_6, AdminController_1, LoginController_9, WarehouseController_3, CountController_2, AsyncController_5, Assets_8, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """index""", """controllers.HomeController.index(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """products""", """controllers.HomeController.products(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productDetails/""" + "$" + """id<[^/]+>""", """controllers.HomeController.productDetails(cat:Long ?= 0, filter:String ?= "", id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """aboutUs""", """controllers.HomeController.aboutUs(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.CustomerCtrl.profile(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profileEdit""", """controllers.CustomerCtrl.profileEdit(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """orderHistory""", """controllers.CustomerCtrl.orderHistory(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cancelOrder/""" + "$" + """id<[^/]+>""", """controllers.CustomerCtrl.cancelOrder(cat:Long ?= 0, filter:String ?= "", id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToWishlist/""" + "$" + """id<[^/]+>""", """controllers.WishlistCtrl.addToWishlist(id:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyWishlist""", """controllers.WishlistCtrl.emptyWishlist(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """DeleteOne/""" + "$" + """itemId<[^/]+>""", """controllers.WishlistCtrl.DeleteOne(itemId:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showWishlist""", """controllers.WishlistCtrl.showWishlist(id:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket(id:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne""", """controllers.ShoppingCtrl.removeOne(itemId:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long, cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """payment""", """controllers.ShoppingCtrl.payment(cat:Long ?= 0, filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """paymentSubmit""", """controllers.ShoppingCtrl.paymentSubmit(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/products""", """controllers.AdminController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addproduct""", """controllers.AdminController.addProduct"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addProductSubmit""", """controllers.AdminController.addProductSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/orders""", """controllers.AdminController.orders"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/cancelOrder/""" + "$" + """id<[^/]+>""", """controllers.AdminController.cancelOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateStatus""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateStatus(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/indexSliders""", """controllers.AdminController.indexSliders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addIndexSlider""", """controllers.AdminController.addIndexSlider()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addIndexSliderSubmit""", """controllers.AdminController.addIndexSliderSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateIndexSlider/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateIndexSlider(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateIndexSliderSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminController.updateIndexSliderSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delIndexSlider/""" + "$" + """id<[^/]+>""", """controllers.AdminController.deleteIndexSlider(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/warehouses1""", """controllers.AdminController.warehouses1()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addWarehouse""", """controllers.AdminController.addWarehouse()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/addWarehouseSubmit""", """controllers.AdminController.addWarehouseSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateWarehouse/""" + "$" + """s<[^/]+>""", """controllers.AdminController.updateWarehouse(s:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/updateWarehouseSubmit/""" + "$" + """s<[^/]+>""", """controllers.AdminController.updateWarehouseSubmit(s:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/delWarehouse/""" + "$" + """s<[^/]+>""", """controllers.AdminController.delWarehouse(s:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/setAsMain/""" + "$" + """s<[^/]+>""", """controllers.AdminController.setAsMain(s:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login(cat:Long ?= 0, filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout(cat:Long ?= 0, filter:String ?= "")"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addUserSubmit""", """controllers.HomeController.addUserSubmit(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """like""" + "$" + """id<[^/]+>""", """controllers.HomeController.like(cat:Long ?= 0, filter:String ?= "", id:Long, s:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment""" + "$" + """id<[^/]+>""", """controllers.CustomerCtrl.comment(cat:Long ?= 0, filter:String ?= "", id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/ordersW""", """controllers.WarehouseController.ordersW"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/orderDetails/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.orderDetails(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/cancelOrder/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.cancelOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/updateStatus""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.updateStatus(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/products""", """controllers.WarehouseController.products(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/supplyWarehouse/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.supplyWarehouse(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """warehouse/supplyWarehouseSubmit/""" + "$" + """id<[^/]+>""", """controllers.WarehouseController.supplyWarehouseSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:9
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_4.index(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """ An example controller showing a sample home page
###############################################################################
 Main
###############################################################################""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("index")))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    HomeController_4.index(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """index"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_products2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("products")))
  )
  private[this] lazy val controllers_HomeController_products2_invoker = createInvoker(
    HomeController_4.products(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "products",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """products"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_productDetails3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_productDetails3_invoker = createInvoker(
    HomeController_4.productDetails(fakeValue[Long], fakeValue[String], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "productDetails",
      Seq(classOf[Long], classOf[String], classOf[Long]),
      "GET",
      """""",
      this.prefix + """productDetails/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_aboutUs4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("aboutUs")))
  )
  private[this] lazy val controllers_HomeController_aboutUs4_invoker = createInvoker(
    HomeController_4.aboutUs(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "aboutUs",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """aboutUs"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_CustomerCtrl_profile5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_CustomerCtrl_profile5_invoker = createInvoker(
    CustomerCtrl_7.profile(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "profile",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """###############################################################################
 Customer
###############################################################################""",
      this.prefix + """profile"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_CustomerCtrl_profileEdit6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profileEdit")))
  )
  private[this] lazy val controllers_CustomerCtrl_profileEdit6_invoker = createInvoker(
    CustomerCtrl_7.profileEdit(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "profileEdit",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """profileEdit"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CustomerCtrl_orderHistory7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("orderHistory")))
  )
  private[this] lazy val controllers_CustomerCtrl_orderHistory7_invoker = createInvoker(
    CustomerCtrl_7.orderHistory(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "orderHistory",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """orderHistory"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_CustomerCtrl_cancelOrder8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cancelOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerCtrl_cancelOrder8_invoker = createInvoker(
    CustomerCtrl_7.cancelOrder(fakeValue[Long], fakeValue[String], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "cancelOrder",
      Seq(classOf[Long], classOf[String], classOf[Long]),
      "GET",
      """""",
      this.prefix + """cancelOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_WishlistCtrl_addToWishlist9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToWishlist/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WishlistCtrl_addToWishlist9_invoker = createInvoker(
    WishlistCtrl_0.addToWishlist(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WishlistCtrl",
      "addToWishlist",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """addToWishlist/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_WishlistCtrl_emptyWishlist10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyWishlist")))
  )
  private[this] lazy val controllers_WishlistCtrl_emptyWishlist10_invoker = createInvoker(
    WishlistCtrl_0.emptyWishlist(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WishlistCtrl",
      "emptyWishlist",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """emptyWishlist"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_WishlistCtrl_DeleteOne11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("DeleteOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WishlistCtrl_DeleteOne11_invoker = createInvoker(
    WishlistCtrl_0.DeleteOne(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WishlistCtrl",
      "DeleteOne",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """DeleteOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_WishlistCtrl_showWishlist12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showWishlist")))
  )
  private[this] lazy val controllers_WishlistCtrl_showWishlist12_invoker = createInvoker(
    WishlistCtrl_0.showWishlist(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WishlistCtrl",
      "showWishlist",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """showWishlist"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ShoppingCtrl_showBasket13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket13_invoker = createInvoker(
    ShoppingCtrl_6.showBasket(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """###############################################################################
 Shopping
###############################################################################""",
      this.prefix + """showBasket"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_ShoppingCtrl_addToBasket14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket14_invoker = createInvoker(
    ShoppingCtrl_6.addToBasket(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ShoppingCtrl_removeOne15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne")))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne15_invoker = createInvoker(
    ShoppingCtrl_6.removeOne(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """removeOne"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_ShoppingCtrl_addOne16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne16_invoker = createInvoker(
    ShoppingCtrl_6.addOne(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_ShoppingCtrl_removeOne17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne17_invoker = createInvoker(
    ShoppingCtrl_6.removeOne(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket18_invoker = createInvoker(
    ShoppingCtrl_6.emptyBasket(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """emptyBasket"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_ShoppingCtrl_placeOrder19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder19_invoker = createInvoker(
    ShoppingCtrl_6.placeOrder(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """placeOrder"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ShoppingCtrl_viewOrder20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder20_invoker = createInvoker(
    ShoppingCtrl_6.viewOrder(fakeValue[Long], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long], classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_ShoppingCtrl_payment21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("payment")))
  )
  private[this] lazy val controllers_ShoppingCtrl_payment21_invoker = createInvoker(
    ShoppingCtrl_6.payment(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "payment",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """payment"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ShoppingCtrl_paymentSubmit22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("paymentSubmit")))
  )
  private[this] lazy val controllers_ShoppingCtrl_paymentSubmit22_invoker = createInvoker(
    ShoppingCtrl_6.paymentSubmit(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "paymentSubmit",
      Seq(classOf[Long], classOf[String]),
      "POST",
      """""",
      this.prefix + """paymentSubmit"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_AdminController_products23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/products")))
  )
  private[this] lazy val controllers_AdminController_products23_invoker = createInvoker(
    AdminController_1.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """###############################################################################
 Admin 
###############################################################################
 products -----------------------------------------------------""",
      this.prefix + """admin/products"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_AdminController_addProduct24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addproduct")))
  )
  private[this] lazy val controllers_AdminController_addProduct24_invoker = createInvoker(
    AdminController_1.addProduct,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProduct",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addproduct"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_AdminController_addProductSubmit25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminController_addProductSubmit25_invoker = createInvoker(
    AdminController_1.addProductSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addProductSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/addProductSubmit"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_AdminController_deleteProduct26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteProduct26_invoker = createInvoker(
    AdminController_1.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_AdminController_updateProduct27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateProduct27_invoker = createInvoker(
    AdminController_1.updateProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/updateProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_AdminController_updateProductSubmit28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateProductSubmit28_invoker = createInvoker(
    AdminController_1.updateProductSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/updateProductSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_AdminController_orders29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/orders")))
  )
  private[this] lazy val controllers_AdminController_orders29_invoker = createInvoker(
    AdminController_1.orders,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "orders",
      Nil,
      "GET",
      """ Orders-----------------------------------------------------""",
      this.prefix + """admin/orders"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_AdminController_cancelOrder30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cancelOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_cancelOrder30_invoker = createInvoker(
    AdminController_1.cancelOrder(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "cancelOrder",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/cancelOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_AdminController_updateStatus31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateStatus"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateStatus31_invoker = createInvoker(
    AdminController_1.updateStatus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateStatus",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/updateStatus""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_AdminController_indexSliders32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/indexSliders")))
  )
  private[this] lazy val controllers_AdminController_indexSliders32_invoker = createInvoker(
    AdminController_1.indexSliders(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "indexSliders",
      Nil,
      "GET",
      """ Index sliders-----------------------------------------------------""",
      this.prefix + """admin/indexSliders"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_AdminController_addIndexSlider33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addIndexSlider")))
  )
  private[this] lazy val controllers_AdminController_addIndexSlider33_invoker = createInvoker(
    AdminController_1.addIndexSlider(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addIndexSlider",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addIndexSlider"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_AdminController_addIndexSliderSubmit34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addIndexSliderSubmit")))
  )
  private[this] lazy val controllers_AdminController_addIndexSliderSubmit34_invoker = createInvoker(
    AdminController_1.addIndexSliderSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addIndexSliderSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/addIndexSliderSubmit"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_AdminController_updateIndexSlider35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateIndexSlider/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateIndexSlider35_invoker = createInvoker(
    AdminController_1.updateIndexSlider(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateIndexSlider",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/updateIndexSlider/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_AdminController_updateIndexSliderSubmit36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateIndexSliderSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateIndexSliderSubmit36_invoker = createInvoker(
    AdminController_1.updateIndexSliderSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateIndexSliderSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """admin/updateIndexSliderSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_AdminController_deleteIndexSlider37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delIndexSlider/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_deleteIndexSlider37_invoker = createInvoker(
    AdminController_1.deleteIndexSlider(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "deleteIndexSlider",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """admin/delIndexSlider/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_AdminController_warehouses138_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/warehouses1")))
  )
  private[this] lazy val controllers_AdminController_warehouses138_invoker = createInvoker(
    AdminController_1.warehouses1(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "warehouses1",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/warehouses1"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_AdminController_addWarehouse39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addWarehouse")))
  )
  private[this] lazy val controllers_AdminController_addWarehouse39_invoker = createInvoker(
    AdminController_1.addWarehouse(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addWarehouse",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/addWarehouse"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_AdminController_addWarehouseSubmit40_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/addWarehouseSubmit")))
  )
  private[this] lazy val controllers_AdminController_addWarehouseSubmit40_invoker = createInvoker(
    AdminController_1.addWarehouseSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "addWarehouseSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """admin/addWarehouseSubmit"""
    )
  )

  // @LINE:84
  private[this] lazy val controllers_AdminController_updateWarehouse41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateWarehouse/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateWarehouse41_invoker = createInvoker(
    AdminController_1.updateWarehouse(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateWarehouse",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/updateWarehouse/""" + "$" + """s<[^/]+>"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_AdminController_updateWarehouseSubmit42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/updateWarehouseSubmit/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_updateWarehouseSubmit42_invoker = createInvoker(
    AdminController_1.updateWarehouseSubmit(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "updateWarehouseSubmit",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """admin/updateWarehouseSubmit/""" + "$" + """s<[^/]+>"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_AdminController_delWarehouse43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/delWarehouse/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_delWarehouse43_invoker = createInvoker(
    AdminController_1.delWarehouse(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "delWarehouse",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/delWarehouse/""" + "$" + """s<[^/]+>"""
    )
  )

  // @LINE:89
  private[this] lazy val controllers_AdminController_setAsMain44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/setAsMain/"), DynamicPart("s", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminController_setAsMain44_invoker = createInvoker(
    AdminController_1.setAsMain(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "setAsMain",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """admin/setAsMain/""" + "$" + """s<[^/]+>"""
    )
  )

  // @LINE:95
  private[this] lazy val controllers_LoginController_login45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login45_invoker = createInvoker(
    LoginController_9.login(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """###############################################################################
 Login routes 
###############################################################################""",
      this.prefix + """login"""
    )
  )

  // @LINE:96
  private[this] lazy val controllers_LoginController_loginSubmit46_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit46_invoker = createInvoker(
    LoginController_9.loginSubmit(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Seq(classOf[Long], classOf[String]),
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_LoginController_logout47_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout47_invoker = createInvoker(
    LoginController_9.logout(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:98
  private[this] lazy val controllers_HomeController_addUserSubmit48_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addUserSubmit")))
  )
  private[this] lazy val controllers_HomeController_addUserSubmit48_invoker = createInvoker(
    HomeController_4.addUserSubmit(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addUserSubmit",
      Seq(classOf[Long], classOf[String]),
      "POST",
      """""",
      this.prefix + """addUserSubmit"""
    )
  )

  // @LINE:104
  private[this] lazy val controllers_HomeController_like49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("like"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_like49_invoker = createInvoker(
    HomeController_4.like(fakeValue[Long], fakeValue[String], fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "like",
      Seq(classOf[Long], classOf[String], classOf[Long], classOf[String]),
      "GET",
      """###############################################################################
 Others
###############################################################################""",
      this.prefix + """like""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:105
  private[this] lazy val controllers_CustomerCtrl_comment50_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CustomerCtrl_comment50_invoker = createInvoker(
    CustomerCtrl_7.comment(fakeValue[Long], fakeValue[String], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CustomerCtrl",
      "comment",
      Seq(classOf[Long], classOf[String], classOf[Long]),
      "POST",
      """""",
      this.prefix + """comment""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:112
  private[this] lazy val controllers_WarehouseController_ordersW51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/ordersW")))
  )
  private[this] lazy val controllers_WarehouseController_ordersW51_invoker = createInvoker(
    WarehouseController_3.ordersW,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "ordersW",
      Nil,
      "GET",
      """""",
      this.prefix + """warehouse/ordersW"""
    )
  )

  // @LINE:113
  private[this] lazy val controllers_WarehouseController_orderDetails52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/orderDetails/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_orderDetails52_invoker = createInvoker(
    WarehouseController_3.orderDetails(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "orderDetails",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/orderDetails/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:114
  private[this] lazy val controllers_WarehouseController_cancelOrder53_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/cancelOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_cancelOrder53_invoker = createInvoker(
    WarehouseController_3.cancelOrder(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "cancelOrder",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/cancelOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:115
  private[this] lazy val controllers_WarehouseController_updateStatus54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/updateStatus"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_updateStatus54_invoker = createInvoker(
    WarehouseController_3.updateStatus(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "updateStatus",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/updateStatus""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:119
  private[this] lazy val controllers_WarehouseController_products55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/products")))
  )
  private[this] lazy val controllers_WarehouseController_products55_invoker = createInvoker(
    WarehouseController_3.products(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "products",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/products"""
    )
  )

  // @LINE:121
  private[this] lazy val controllers_WarehouseController_supplyWarehouse56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/supplyWarehouse/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_supplyWarehouse56_invoker = createInvoker(
    WarehouseController_3.supplyWarehouse(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "supplyWarehouse",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """warehouse/supplyWarehouse/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:122
  private[this] lazy val controllers_WarehouseController_supplyWarehouseSubmit57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("warehouse/supplyWarehouseSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WarehouseController_supplyWarehouseSubmit57_invoker = createInvoker(
    WarehouseController_3.supplyWarehouseSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WarehouseController",
      "supplyWarehouseSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """warehouse/supplyWarehouseSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:126
  private[this] lazy val controllers_CountController_count58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count58_invoker = createInvoker(
    CountController_2.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """####################################################################################
 An example controller showing how to use dependency injection""",
      this.prefix + """count"""
    )
  )

  // @LINE:128
  private[this] lazy val controllers_AsyncController_message59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message59_invoker = createInvoker(
    AsyncController_5.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:131
  private[this] lazy val controllers_Assets_versioned60_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned60_invoker = createInvoker(
    Assets_8.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:9
    case controllers_HomeController_index0_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_index0_invoker.call(HomeController_4.index(cat, filter))
      }
  
    // @LINE:10
    case controllers_HomeController_index1_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_index1_invoker.call(HomeController_4.index(cat, filter))
      }
  
    // @LINE:12
    case controllers_HomeController_products2_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_products2_invoker.call(HomeController_4.products(cat, filter))
      }
  
    // @LINE:14
    case controllers_HomeController_productDetails3_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some("")), params.fromPath[Long]("id", None)) { (cat, filter, id) =>
        controllers_HomeController_productDetails3_invoker.call(HomeController_4.productDetails(cat, filter, id))
      }
  
    // @LINE:16
    case controllers_HomeController_aboutUs4_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_aboutUs4_invoker.call(HomeController_4.aboutUs(cat, filter))
      }
  
    // @LINE:21
    case controllers_CustomerCtrl_profile5_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_CustomerCtrl_profile5_invoker.call(CustomerCtrl_7.profile(cat, filter))
      }
  
    // @LINE:22
    case controllers_CustomerCtrl_profileEdit6_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_CustomerCtrl_profileEdit6_invoker.call(CustomerCtrl_7.profileEdit(cat, filter))
      }
  
    // @LINE:23
    case controllers_CustomerCtrl_orderHistory7_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_CustomerCtrl_orderHistory7_invoker.call(CustomerCtrl_7.orderHistory(cat, filter))
      }
  
    // @LINE:24
    case controllers_CustomerCtrl_cancelOrder8_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some("")), params.fromPath[Long]("id", None)) { (cat, filter, id) =>
        controllers_CustomerCtrl_cancelOrder8_invoker.call(CustomerCtrl_7.cancelOrder(cat, filter, id))
      }
  
    // @LINE:26
    case controllers_WishlistCtrl_addToWishlist9_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (id, cat, filter) =>
        controllers_WishlistCtrl_addToWishlist9_invoker.call(WishlistCtrl_0.addToWishlist(id, cat, filter))
      }
  
    // @LINE:27
    case controllers_WishlistCtrl_emptyWishlist10_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_WishlistCtrl_emptyWishlist10_invoker.call(WishlistCtrl_0.emptyWishlist(cat, filter))
      }
  
    // @LINE:28
    case controllers_WishlistCtrl_DeleteOne11_route(params) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (itemId, cat, filter) =>
        controllers_WishlistCtrl_DeleteOne11_invoker.call(WishlistCtrl_0.DeleteOne(itemId, cat, filter))
      }
  
    // @LINE:29
    case controllers_WishlistCtrl_showWishlist12_route(params) =>
      call(params.fromQuery[Long]("id", Some(0)), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_WishlistCtrl_showWishlist12_invoker.call(WishlistCtrl_0.showWishlist(id, filter))
      }
  
    // @LINE:34
    case controllers_ShoppingCtrl_showBasket13_route(params) =>
      call(params.fromQuery[Long]("id", Some(0)), params.fromQuery[String]("filter", Some(""))) { (id, filter) =>
        controllers_ShoppingCtrl_showBasket13_invoker.call(ShoppingCtrl_6.showBasket(id, filter))
      }
  
    // @LINE:35
    case controllers_ShoppingCtrl_addToBasket14_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (id, cat, filter) =>
        controllers_ShoppingCtrl_addToBasket14_invoker.call(ShoppingCtrl_6.addToBasket(id, cat, filter))
      }
  
    // @LINE:36
    case controllers_ShoppingCtrl_removeOne15_route(params) =>
      call(params.fromQuery[Long]("itemId", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (itemId, cat, filter) =>
        controllers_ShoppingCtrl_removeOne15_invoker.call(ShoppingCtrl_6.removeOne(itemId, cat, filter))
      }
  
    // @LINE:37
    case controllers_ShoppingCtrl_addOne16_route(params) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (itemId, cat, filter) =>
        controllers_ShoppingCtrl_addOne16_invoker.call(ShoppingCtrl_6.addOne(itemId, cat, filter))
      }
  
    // @LINE:38
    case controllers_ShoppingCtrl_removeOne17_route(params) =>
      call(params.fromPath[Long]("itemId", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (itemId, cat, filter) =>
        controllers_ShoppingCtrl_removeOne17_invoker.call(ShoppingCtrl_6.removeOne(itemId, cat, filter))
      }
  
    // @LINE:39
    case controllers_ShoppingCtrl_emptyBasket18_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ShoppingCtrl_emptyBasket18_invoker.call(ShoppingCtrl_6.emptyBasket(cat, filter))
      }
  
    // @LINE:40
    case controllers_ShoppingCtrl_placeOrder19_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ShoppingCtrl_placeOrder19_invoker.call(ShoppingCtrl_6.placeOrder(cat, filter))
      }
  
    // @LINE:41
    case controllers_ShoppingCtrl_viewOrder20_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (id, cat, filter) =>
        controllers_ShoppingCtrl_viewOrder20_invoker.call(ShoppingCtrl_6.viewOrder(id, cat, filter))
      }
  
    // @LINE:42
    case controllers_ShoppingCtrl_payment21_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ShoppingCtrl_payment21_invoker.call(ShoppingCtrl_6.payment(cat, filter))
      }
  
    // @LINE:43
    case controllers_ShoppingCtrl_paymentSubmit22_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ShoppingCtrl_paymentSubmit22_invoker.call(ShoppingCtrl_6.paymentSubmit(cat, filter))
      }
  
    // @LINE:51
    case controllers_AdminController_products23_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_AdminController_products23_invoker.call(AdminController_1.products(cat))
      }
  
    // @LINE:53
    case controllers_AdminController_addProduct24_route(params) =>
      call { 
        controllers_AdminController_addProduct24_invoker.call(AdminController_1.addProduct)
      }
  
    // @LINE:54
    case controllers_AdminController_addProductSubmit25_route(params) =>
      call { 
        controllers_AdminController_addProductSubmit25_invoker.call(AdminController_1.addProductSubmit)
      }
  
    // @LINE:56
    case controllers_AdminController_deleteProduct26_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_deleteProduct26_invoker.call(AdminController_1.deleteProduct(id))
      }
  
    // @LINE:58
    case controllers_AdminController_updateProduct27_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateProduct27_invoker.call(AdminController_1.updateProduct(id))
      }
  
    // @LINE:59
    case controllers_AdminController_updateProductSubmit28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateProductSubmit28_invoker.call(AdminController_1.updateProductSubmit(id))
      }
  
    // @LINE:62
    case controllers_AdminController_orders29_route(params) =>
      call { 
        controllers_AdminController_orders29_invoker.call(AdminController_1.orders)
      }
  
    // @LINE:63
    case controllers_AdminController_cancelOrder30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_cancelOrder30_invoker.call(AdminController_1.cancelOrder(id))
      }
  
    // @LINE:64
    case controllers_AdminController_updateStatus31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateStatus31_invoker.call(AdminController_1.updateStatus(id))
      }
  
    // @LINE:67
    case controllers_AdminController_indexSliders32_route(params) =>
      call { 
        controllers_AdminController_indexSliders32_invoker.call(AdminController_1.indexSliders())
      }
  
    // @LINE:69
    case controllers_AdminController_addIndexSlider33_route(params) =>
      call { 
        controllers_AdminController_addIndexSlider33_invoker.call(AdminController_1.addIndexSlider())
      }
  
    // @LINE:70
    case controllers_AdminController_addIndexSliderSubmit34_route(params) =>
      call { 
        controllers_AdminController_addIndexSliderSubmit34_invoker.call(AdminController_1.addIndexSliderSubmit())
      }
  
    // @LINE:72
    case controllers_AdminController_updateIndexSlider35_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateIndexSlider35_invoker.call(AdminController_1.updateIndexSlider(id))
      }
  
    // @LINE:73
    case controllers_AdminController_updateIndexSliderSubmit36_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_updateIndexSliderSubmit36_invoker.call(AdminController_1.updateIndexSliderSubmit(id))
      }
  
    // @LINE:75
    case controllers_AdminController_deleteIndexSlider37_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminController_deleteIndexSlider37_invoker.call(AdminController_1.deleteIndexSlider(id))
      }
  
    // @LINE:79
    case controllers_AdminController_warehouses138_route(params) =>
      call { 
        controllers_AdminController_warehouses138_invoker.call(AdminController_1.warehouses1())
      }
  
    // @LINE:81
    case controllers_AdminController_addWarehouse39_route(params) =>
      call { 
        controllers_AdminController_addWarehouse39_invoker.call(AdminController_1.addWarehouse())
      }
  
    // @LINE:82
    case controllers_AdminController_addWarehouseSubmit40_route(params) =>
      call { 
        controllers_AdminController_addWarehouseSubmit40_invoker.call(AdminController_1.addWarehouseSubmit())
      }
  
    // @LINE:84
    case controllers_AdminController_updateWarehouse41_route(params) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_AdminController_updateWarehouse41_invoker.call(AdminController_1.updateWarehouse(s))
      }
  
    // @LINE:85
    case controllers_AdminController_updateWarehouseSubmit42_route(params) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_AdminController_updateWarehouseSubmit42_invoker.call(AdminController_1.updateWarehouseSubmit(s))
      }
  
    // @LINE:87
    case controllers_AdminController_delWarehouse43_route(params) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_AdminController_delWarehouse43_invoker.call(AdminController_1.delWarehouse(s))
      }
  
    // @LINE:89
    case controllers_AdminController_setAsMain44_route(params) =>
      call(params.fromPath[String]("s", None)) { (s) =>
        controllers_AdminController_setAsMain44_invoker.call(AdminController_1.setAsMain(s))
      }
  
    // @LINE:95
    case controllers_LoginController_login45_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_LoginController_login45_invoker.call(LoginController_9.login(cat, filter))
      }
  
    // @LINE:96
    case controllers_LoginController_loginSubmit46_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_LoginController_loginSubmit46_invoker.call(LoginController_9.loginSubmit(cat, filter))
      }
  
    // @LINE:97
    case controllers_LoginController_logout47_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_LoginController_logout47_invoker.call(LoginController_9.logout(cat, filter))
      }
  
    // @LINE:98
    case controllers_HomeController_addUserSubmit48_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_HomeController_addUserSubmit48_invoker.call(HomeController_4.addUserSubmit(cat, filter))
      }
  
    // @LINE:104
    case controllers_HomeController_like49_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some("")), params.fromPath[Long]("id", None), params.fromQuery[String]("s", None)) { (cat, filter, id, s) =>
        controllers_HomeController_like49_invoker.call(HomeController_4.like(cat, filter, id, s))
      }
  
    // @LINE:105
    case controllers_CustomerCtrl_comment50_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some("")), params.fromPath[Long]("id", None)) { (cat, filter, id) =>
        controllers_CustomerCtrl_comment50_invoker.call(CustomerCtrl_7.comment(cat, filter, id))
      }
  
    // @LINE:112
    case controllers_WarehouseController_ordersW51_route(params) =>
      call { 
        controllers_WarehouseController_ordersW51_invoker.call(WarehouseController_3.ordersW)
      }
  
    // @LINE:113
    case controllers_WarehouseController_orderDetails52_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_orderDetails52_invoker.call(WarehouseController_3.orderDetails(id))
      }
  
    // @LINE:114
    case controllers_WarehouseController_cancelOrder53_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_cancelOrder53_invoker.call(WarehouseController_3.cancelOrder(id))
      }
  
    // @LINE:115
    case controllers_WarehouseController_updateStatus54_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_updateStatus54_invoker.call(WarehouseController_3.updateStatus(id))
      }
  
    // @LINE:119
    case controllers_WarehouseController_products55_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_WarehouseController_products55_invoker.call(WarehouseController_3.products(cat))
      }
  
    // @LINE:121
    case controllers_WarehouseController_supplyWarehouse56_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_supplyWarehouse56_invoker.call(WarehouseController_3.supplyWarehouse(id))
      }
  
    // @LINE:122
    case controllers_WarehouseController_supplyWarehouseSubmit57_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_WarehouseController_supplyWarehouseSubmit57_invoker.call(WarehouseController_3.supplyWarehouseSubmit(id))
      }
  
    // @LINE:126
    case controllers_CountController_count58_route(params) =>
      call { 
        controllers_CountController_count58_invoker.call(CountController_2.count)
      }
  
    // @LINE:128
    case controllers_AsyncController_message59_route(params) =>
      call { 
        controllers_AsyncController_message59_invoker.call(AsyncController_5.message)
      }
  
    // @LINE:131
    case controllers_Assets_versioned60_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned60_invoker.call(Assets_8.versioned(path, file))
      }
  }
}
