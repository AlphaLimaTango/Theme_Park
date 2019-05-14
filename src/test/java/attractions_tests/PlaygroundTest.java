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
        playground = new Playground("soft play", 6);
        visitor1 = new Visitor(6, 100, 5.0);
        visitor2 = new Visitor(18, 170, 15.0);
    }

    @Test
    public void hasMinAge(){
        assertEquals(15, playground.maxAge());
    }

    @Test
    public void canAuthoriseVisitor(){
        assertEquals(true, playground.authorised(visitor1));
    }
}
