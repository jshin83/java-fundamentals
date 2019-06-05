/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Business {
    private String name;
    private int stars;
    private int price;
    private static int totalStars;
    private static List<Review> reviewList = new ArrayList<>();

    public Restaurant(String name, int price) {
        this.name = name;
        this.stars = 0;
        this.price = price;
    }


    /**
     * Getter for name of restaurant.
     * @return
     */
    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public int getPrice() {
        return price;
    }

    /**
     * Adds Review to list to track for this business,
     * sends this Business to review for it to track.
     * @param review Review object
     */
    @Override
    public void addReview(Review review) {
        //add Review to list
        reviewList.add(review);

        //increment total number of stars
        totalStars += review.getStars();

        //set star average
        setStarsAverage();

        //set reference of the passed in Review to hold business object
        review.setBusiness(this);
    }

    //helper method to set star average
    private void setStarsAverage() {
        stars = totalStars/(reviewList.size());
    }

    @Override
    public String toString() {
        return "Restaurant " +
                "name: '" + name + '\'' +
                ", stars: " + stars +
                ", price: " + price;
    }
}
