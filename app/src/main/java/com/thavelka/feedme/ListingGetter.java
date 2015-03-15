package com.thavelka.feedme;

/**
 * Created by tim on 3/14/15.
 */
public class ListingGetter {

    //MAKE RESTAURANTS
    public Restaurant rest1 = new Restaurant("Buffalo Wild Wings", "903 University Drive");
    public Restaurant rest2 = new Restaurant("Domino's Pizza", "409 University Drive");
    public Restaurant rest3 = new Restaurant("Fazoli's", "400 Harvey Road");
    public Restaurant[] mRestaurants = {rest1, rest2, rest3};
    public int[] days1 = {2};
    public int[] days2 = {1,2,3,4,5};
    public int[] days3 = {2,4};
    public Listing listing1 = new Listing(rest1, days1, "Wing Tuesday: $0.65 traditional wings all day. Minimum 6 pieces", true);
    public Listing listing2 = new Listing(rest2, days2, "$7.99 3-topping large", true);
    public Listing listing3 = new Listing(rest3, days3, "$2.99 Trio: Pizza, spaghetti, fettucinni, and unlimited breadsticks", true);
    public Listing[] mListings = {listing1, listing2, listing3, listing1, listing2, listing3, listing1, listing2, listing3};

    public Restaurant[] getRestaurants() {
        return mRestaurants;
    }

    public Listing[] getListings() {
        return mListings;
    }
}
