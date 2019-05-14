package stalls_tests;

import org.junit.Before;
import org.junit.Test;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoTest {

    TobaccoStall tobacco;

    @Before
    public void tobacco(){
        tobacco = new TobaccoStall("Jimmy's Cigs", "Jimmy", 5, 3);
    }

    @Test
    public void canGetMinAge(){
        assertEquals(18, tobacco.getMinAge());
    }

}
