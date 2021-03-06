package models.users;

import models.shopping.Wishlist;
import models.shopping.Basket;
import models.shopping.ShopOrder;
import models.productsAdditions.*;
import java.util.*;
import javax.persistence.*;
import java.util.List;

@Entity

// This is a Customer of type admin
@DiscriminatorValue("customer")

//A.S.-----------------------------------------------------------------------------------------------------------
public class Customer extends User{
	
	private String street1;
	private String street2;
    private String town;
    private String postCode;
    private String country;
    

    @OneToOne(mappedBy="customer", cascade = CascadeType.ALL)
    private Wishlist wishlist;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Basket basket;

    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<ShopOrder> orders;

    @OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
    private List<Comment> comment;

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(name="PLIKE_USER")
    private List<Plike> likes = new ArrayList<>();

	public Customer(String email, String role, String fName, String lName, String password, String password2, String street1, String street2, String town, String postCode, String creditCard){
		super(email, role, fName, lName, password, password2);
        this.street1 = street1;
        this.street2 = street2;
        this.town = town;
        this.postCode = postCode;
		this.country = country;
	}

    


    public void setLikes(List<Plike> likes) {
        this.likes = likes;
    }

    public List<Plike> getLikes() {
        return likes;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Wishlist getWishlist() {
         return wishlist;
    }

    public void setWishlist(Wishlist wishlist) {
          this.wishlist = wishlist;
    }  

    public List<ShopOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ShopOrder> orders) {
        this.orders = orders;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }

    public void removePlike(Plike p){
        likes.remove(p);
        p.getCustomer().remove(this); 
    }
}
