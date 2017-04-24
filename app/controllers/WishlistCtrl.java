package controllers;

import models.users.*;
import models.*;

import models.shopping.*;


import play.data.*;
import play.db.ebean.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security;
import play.mvc.With;
import views.html.*;
import views.html.customer.*;
import views.html.customer.profileFiles.*;
import controllers.security.*;

import java.util.ArrayList;
import java.util.List;

//J.J ----------------------------------------------------------------------------------------------------------------------------

// Import models
// Import security controllers

@Security.Authenticated(Secured.class)
@With(CheckIfCustomer.class)
public class WishlistCtrl extends Controller {    


    List<Category> categoriesList = Category.findAll();
    
      // Get a user - if logged in email will be set in the session
    private Customer getCurrentUser() {
        return (Customer)User.getUserById(session().get("email"));
    }


     @Transactional 
    public Result showWishlist(Long cat, String filters){
        Customer customer = getCurrentUser();

        return ok(wishList.render(getCurrentUser(),User.getUserById(session().get("email")), categoriesList, cat, filters) );
    }


    @Transactional
    public Result addToWishlist(Long id, Long cat, String filters){

        Product p = Product.find.byId(id);

        Customer customer = (Customer)User.getUserById(session().get("email"));

        if (customer.getWishlist() == null){
            customer.setWishlist(new Wishlist());
            customer.getWishlist().setCustomer(customer);
            customer.update();
        }
        customer.getWishlist().addProduct(p);
        customer.update();
         
          //show the wishList Contents
        return ok(wishList.render(customer,User.getUserById(session().get("email")),categoriesList,cat, filters));
    
}

    @Transactional
    public Result DeleteOne(Long itemId, Long cat, String filters) {

        // Get the order item
        OrderItem item = OrderItem.find.byId(itemId);
        // Get user
         Customer c = getCurrentUser();
        // Call wishlist remove item method
        c.getWishlist().removeWishItem(item);
        c.getWishlist().update();
        // back to basket
        return ok(wishList.render(c, User.getUserById(session().get("email")), categoriesList, cat, filters));
    }

    // Empty Wishlist
    @Transactional
    public Result emptyWishlist(Long cat, String filters) {

       Customer c = getCurrentUser();
        c.getWishlist().removeAllItems();
        c.getWishlist().update();

        return ok(wishList.render(c, User.getUserById(session().get("email")), categoriesList, cat, filters));
    }




  

   
}
//--J.J END------------------------------------------------------------------------------------------------------------------