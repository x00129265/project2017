
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/project2017/conf/routes
// @DATE:Mon Apr 24 10:47:52 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:9
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:131
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:131
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:54
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addProductSubmit"})
        }
      """
    )
  
    // @LINE:67
    def indexSliders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.indexSliders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/indexSliders"})
        }
      """
    )
  
    // @LINE:51
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.products",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/products" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:64
    def updateStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateStatus",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateStatus" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:87
    def delWarehouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.delWarehouse",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/delWarehouse/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s0))})
        }
      """
    )
  
    // @LINE:82
    def addWarehouseSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addWarehouseSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addWarehouseSubmit"})
        }
      """
    )
  
    // @LINE:79
    def warehouses1: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.warehouses1",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/warehouses1"})
        }
      """
    )
  
    // @LINE:69
    def addIndexSlider: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addIndexSlider",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addIndexSlider"})
        }
      """
    )
  
    // @LINE:63
    def cancelOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.cancelOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cancelOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:56
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/delProduct/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:75
    def deleteIndexSlider: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.deleteIndexSlider",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/delIndexSlider/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:58
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateProduct/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:81
    def addWarehouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addWarehouse",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addWarehouse"})
        }
      """
    )
  
    // @LINE:62
    def orders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.orders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/orders"})
        }
      """
    )
  
    // @LINE:73
    def updateIndexSliderSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateIndexSliderSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateIndexSliderSubmit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:84
    def updateWarehouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateWarehouse",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateWarehouse/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s0))})
        }
      """
    )
  
    // @LINE:85
    def updateWarehouseSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateWarehouseSubmit",
      """
        function(s0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateWarehouseSubmit/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s0))})
        }
      """
    )
  
    // @LINE:53
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addproduct"})
        }
      """
    )
  
    // @LINE:89
    def setAsMain: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.setAsMain",
      """
        function(s0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/setAsMain/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("s", encodeURIComponent(s0))})
        }
      """
    )
  
    // @LINE:70
    def addIndexSliderSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.addIndexSliderSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/addIndexSliderSubmit"})
        }
      """
    )
  
    // @LINE:59
    def updateProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateProductSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateProductSubmit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:72
    def updateIndexSlider: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.updateIndexSlider",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/updateIndexSlider/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:112
  class ReverseWarehouseController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:122
    def supplyWarehouseSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.supplyWarehouseSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/supplyWarehouseSubmit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:119
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.products",
      """
        function(cat0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/products" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0))])})
        }
      """
    )
  
    // @LINE:115
    def updateStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.updateStatus",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/updateStatus" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:113
    def orderDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.orderDetails",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/orderDetails/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:112
    def ordersW: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.ordersW",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/ordersW"})
        }
      """
    )
  
    // @LINE:114
    def cancelOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.cancelOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/cancelOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:121
    def supplyWarehouse: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WarehouseController.supplyWarehouse",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "warehouse/supplyWarehouse/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:126
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:126
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:26
  class ReverseWishlistCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def emptyWishlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WishlistCtrl.emptyWishlist",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyWishlist" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:29
    def showWishlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WishlistCtrl.showWishlist",
      """
        function(id0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showWishlist" + _qS([(id0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:26
    def addToWishlist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WishlistCtrl.addToWishlist",
      """
        function(id0,cat1,filter2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToWishlist/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + _qS([(cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
        }
      """
    )
  
    // @LINE:28
    def DeleteOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.WishlistCtrl.DeleteOne",
      """
        function(itemId0,cat1,filter2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "DeleteOne/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0) + _qS([(cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def aboutUs: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.aboutUs",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "aboutUs" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:12
    def products: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.products",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "products" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(cat0,filter1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + """" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
          }
        
        }
      """
    )
  
    // @LINE:104
    def like: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.like",
      """
        function(cat0,filter1,id2,s3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "like" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id2) + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1)), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s3)])})
        }
      """
    )
  
    // @LINE:98
    def addUserSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.addUserSubmit",
      """
        function(cat0,filter1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addUserSubmit" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:14
    def productDetails: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.productDetails",
      """
        function(cat0,filter1,id2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "productDetails/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id2) + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }

  // @LINE:128
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:128
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:95
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:97
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:95
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:96
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.loginSubmit",
      """
        function(cat0,filter1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "loginSubmit" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseCustomerCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def orderHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.orderHistory",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "orderHistory" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:22
    def profileEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.profileEdit",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profileEdit" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:105
    def comment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.comment",
      """
        function(cat0,filter1,id2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id2) + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:21
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.profile",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:24
    def cancelOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CustomerCtrl.cancelOrder",
      """
        function(cat0,filter1,id2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cancelOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id2) + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseShoppingCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:42
    def payment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.payment",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "payment" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:37
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addOne",
      """
        function(itemId0,cat1,filter2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0) + _qS([(cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
        }
      """
    )
  
    // @LINE:36
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeOne",
      """
        function(itemId0,cat1,filter2) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("itemId", itemId0), (cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
          }
        
        }
      """
    )
  
    // @LINE:39
    def emptyBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.emptyBasket",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyBasket" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:41
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrder",
      """
        function(id0,cat1,filter2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + _qS([(cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
        }
      """
    )
  
    // @LINE:35
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToBasket",
      """
        function(id0,cat1,filter2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToBasket/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0) + _qS([(cat1 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat1)), (filter2 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter2))])})
        }
      """
    )
  
    // @LINE:40
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.placeOrder",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:43
    def paymentSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.paymentSubmit",
      """
        function(cat0,filter1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "paymentSubmit" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:34
    def showBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.showBasket",
      """
        function(id0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showBasket" + _qS([(id0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }


}
