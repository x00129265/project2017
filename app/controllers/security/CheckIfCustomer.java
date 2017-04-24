package controllers.security;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import play.mvc.*;
import views.html.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

/* - Docs -
https://alexgaribay.com/2014/06/16/authentication-in-play-framework-using-java/
https://www.playframework.com/documentation/2.2.x/JavaActionsComposition
*/

// Check if this is an admin user (before permitting an action)
public class CheckIfCustomer extends Action.Simple {
    Long cat;
    String filters;
    // Functional Java which is executed concurrently
    // Promise represents a handle for the future result
    // Http.Context contains the current request - which will be allowed
    // only if the conditions here are met
    public CompletionStage<Result> call(Http.Context ctx) {

        // Check if current user (in session) is an admin
        String id = ctx.session().get("email");
        if (id != null) {
            User u = User.getUserById(id);
            if ("customer".equals(u.getRole())) {

                // User admin sp continue with the http request
                return delegate.call(ctx);
            } else {
                // flash("fail", "You need to be logged in as a customer to access this method");
                ctx.flash().put("fail", "You need to be logged in as a customer to access this method.");
                return CompletableFuture.completedFuture(redirect(controllers.routes.HomeController.index(0, "")));
            }
        }
        //Result unauthorized = Results.unauthorized("unauthorized");
        // Unauthorised - redirect to login page
        ctx.flash().put("error", "Customer Login Required.");
        return CompletableFuture.completedFuture(redirect(controllers.routes.LoginController.login(cat, filters)));
    }
}
