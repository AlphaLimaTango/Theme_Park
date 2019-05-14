package attractions_tests;

import attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground();
    }

    @Test
    public void hasMinAge(){
        assertEquals(15, playground.maxAge());
    }
}
