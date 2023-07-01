import Peripherals.Strap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrapTest {

    Strap bugleStrap;

    @Before
    public void before(){
        bugleStrap = new Strap("Bugle Strap", 40.00, 30.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bugle Strap", bugleStrap.getName());
    }

    @Test public void canBeSold(){assertEquals("Cha Ching!", bugleStrap.isSold());}
}

