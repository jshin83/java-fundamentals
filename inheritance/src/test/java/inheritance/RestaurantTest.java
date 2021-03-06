/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    Restaurant dinTaiFung;

    @Before
    public void init() {
        dinTaiFung = new Restaurant("din tai fung", 2);
    }

    @Test (expected = IllegalArgumentException.class)
    public void initInvalidStars() {
        Review invalidStars = new Review("yummy", "me", 7);
        Review starsTooLow = new Review("yuck", "me", -1);
    }

    @Test
    public void checkJustInstantiatedRestaurant() {
        assertSame("Restaurant should have 0 stars after instantiation.", 0,
                dinTaiFung.getStars());
        assertSame("Name should be din tai fung", "din tai fung", dinTaiFung.getName());
        assertSame("Din Tai Fung should have 2 as price", 2, dinTaiFung.getPrice());
        assertTrue("To string method for din tai fung should contain name",
                dinTaiFung.toString().contains("name"));
        assertEquals("To string for dintaifung should b Restaurant name: 'din tai fung', stars: 0, price: 2",
                "Restaurant name: 'din tai fung', stars: 0, price: 2", dinTaiFung.toString());
    }

    @Test
    public void addReviewsToDTF() {
        Review review = new Review("highly recommend", "j", 4);
        //test review
        assertEquals("Review body should state highly recommend", "highly recommend",
                review.getBody());
        assertEquals("Review author should be j", "j", review.getAuthor());
        assertEquals("Review stars should be 4", 4, review.getStars());

        dinTaiFung.addReview(review);
        assertEquals("DTF stars should now be 4", 4, dinTaiFung.getStars());

        Review secondReview = new Review("okay", "l", 2);
        dinTaiFung.addReview(secondReview);
        assertEquals("DTF stars should now be 3", 3, dinTaiFung.getStars());

        assertEquals("DTF to string should reflect current stars is 3",
                "Restaurant name: 'din tai fung', stars: 3, price: 2", dinTaiFung.toString());
    }
}
