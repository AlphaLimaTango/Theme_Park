package stalls_tests;

import org.junit.Before;
import org.junit.Test;
import stalls.CandyFlossStall;

import static org.junit.Assert.assertEquals;

public class CandyflossTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Jenny's Floss", "Jenny", 7, 9 );
    }

    @Test
    public void canGetName(){
        assertEquals("Jenny's Floss", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Jenny", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(7, candyFlossStall.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(9, candyFlossStall.getRating());
    }

}
