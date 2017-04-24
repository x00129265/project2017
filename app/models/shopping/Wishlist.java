package models.shopping;
import java.util.*;
import com.avaje.ebean.Model;
import models.users.Customer;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Iterator;
import java.util.List;
import javax.persistence.*;
import models.*;


//J.J--------------------------------------------------------------------------------------------

@Entity
public class Wishlist extends Model {

    @Id
    private Long id;

    @OneToMany(mappedBy = "wishlist", cascade = CascadeType.PERSIST)
    private List<OrderItem> wishItems;

    @OneToOne
    private Customer customer;

    // Default constructor
    public Wishlist() {
    }

    // Add product to wish-list
    // Either update existing order item or ad a new one.
    public void addProduct(Product p) {

        boolean itemFound = false;

        for (OrderItem i : wishItems) {
            if (i.getProduct().getId() == p.getId()) {
                i.increaseQty();
                itemFound = true;
                break;
            }
        }
        if (itemFound == false) {
            // Add orderItem to list
            OrderItem newItem = new OrderItem(p);
            // Add to items
            wishItems.add(newItem);
        }
    }

    public void removeWishItem(OrderItem item) {

        for (Iterator<OrderItem> itr = wishItems.iterator(); itr.hasNext();) {
            OrderItem i = itr.next();
            if (i.getId().equals(item.getId()))
            {
                // If more than one of these items in the basket then decrement
                if (i.getQuantity() > 1 ) {
                    i.decreaseQty();
                }
                // If only one left, remove this item from the basket (via the iterator)
                else {
                    // delete object from db
                    i.delete();
                    // remove object from list
                    itr.remove();
                    break;
                }
            }
        }
    }

    public void removeAllItems() {
        for(OrderItem i: this.wishItems) {
            i.delete();
        }
        this.wishItems = null;
    }

    //Generic query helper
    public static Finder<Long,Wishlist> find = new Finder<Long,Wishlist>(Wishlist.class);

    //Find all Products in the database
    public static List<Wishlist> findAll() {
        return Wishlist.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getWishItems() {
        return wishItems;
    }

    public void setWishItems(List<OrderItem> wishItems) {
        this.wishItems = wishItems;
    }
     
	 public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
//J.J. -------------------------------------------------------------------------------------------