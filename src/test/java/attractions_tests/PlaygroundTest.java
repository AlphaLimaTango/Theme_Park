package attractions_tests;

import attractions.Playground;
import org.junit.Before;
import org.junit.Test;
import persons.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground();
        visitor1 = new Visitor();
    }

    @Test
    public void hasMinAge(){
        assertEquals(15, playground.maxAge());
    }

    @Test
    public void canAuthoriseVisitor(){
        assertEquals();
    }
}
