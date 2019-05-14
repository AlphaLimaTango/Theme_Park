package attractions_tests;

import attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import persons.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Death Scare", 20);
        visitor1 = new Visitor(21, 150, 25.0);
        visitor2 = new Visitor(21, 130, 5.0);
        visitor3 = new Visitor(16, 150, 15.0);
        visitor4 = new Visitor(16, 130, 15.0);
    }

    @Test
    public void hasMinAge(){
        assertEquals(12, rollercoaster.getMinAge());
    }

    @Test
    public void hasMinHeight(){
        assertEquals(145, rollercoaster.getMinHeight());
    }

    @Test
    public void correctAgeCorrectHeightAuthorisation(){
        assertEquals(true, rollercoaster.authorised(visitor1));
    }

    @Test
    public void correctAgeWrongHeightAuthorisation(){
        assertEquals(false, rollercoaster.authorised(visitor2));
    }

    @Test
    public void wrongAgeCorrectHeightAuthorisation(){
        assertEquals(false, rollercoaster.authorised(visitor3));
    }

    @Test
    public void wrongAgeWrongHeightAuthorisation(){
        assertEquals(false, rollercoaster.authorised(visitor4));
    }
}
