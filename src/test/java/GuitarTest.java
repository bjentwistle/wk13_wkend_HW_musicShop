import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Stratus", 150.00, 200.00, "Black", "3/4", "Wood", "String", "Acoustic", 6, false);
    }

    @Test
    public void canGetName(){
        assertEquals("Stratus", guitar.getName());
    }

    @Test public void canPlaySound(){
        assertEquals("Strumming", guitar.playSounds());
    }
    @Test public void canBeSold(){
        assertEquals("Cha Ching!", guitar.isSold());
    }

}
