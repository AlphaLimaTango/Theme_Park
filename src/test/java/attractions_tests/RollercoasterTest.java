package attractions_tests;

import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster();
    }

    @Test
    public void hasMinAge(){
        assertEquals(12, rollercoaster.getMinAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(145, rollercoaster.getMinHeight());
    }
}
