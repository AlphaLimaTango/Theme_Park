import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(21, 180, 75.00);
    }

    @Test
    public void hasAge(){
        assertEquals(21, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(180, visitor.getHeight());
    }

    @Test
    public void hasMoney(){
        assertEquals(75.00, visitor.getMoney(), 0.01);
    }
}
