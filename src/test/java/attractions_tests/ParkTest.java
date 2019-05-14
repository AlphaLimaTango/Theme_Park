package attractions_tests;

import attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Green Gardens", 5);
    }

    @Test
    public void hasName(){
        assertEquals("Green Gardens", park.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(5, park.getRating());
    }


}
