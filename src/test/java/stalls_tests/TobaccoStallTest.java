package stalls_tests;

import org.junit.Before;
import org.junit.Test;
import persons.Visitor;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobacco;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void tobacco(){
        tobacco = new TobaccoStall("Jimmy's Cigs", "Jimmy", 5, 3);
        visitor1 = new Visitor(6, 100, 5.0);
        visitor2 = new Visitor(19, 170, 15.0);
    }

    @Test
    public void canGetMinAge(){
        assertEquals(18, tobacco.getMinAge());
    }

    @Test
    public void canAuthorise(){
        assertEquals(true, tobacco.authorised(visitor2));
    }

    @Test
    public void rejectAuthorisation(){
        assertEquals(false, tobacco.authorised(visitor1));
    }

}
