import Instruments.Guitar;
import Instruments.Instrument;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    Guitar guitar2;

    @Before
    public void before(){
        guitar = new Guitar("Stratus", 150.00, 200.00, "Black", "3/4", "Wood", "String", "Acoustic", 6, false);
        guitar2 = new Guitar("Gibson", 1000.0, 2000.0, "Red", "Medium", "Wood", "String", "Electric", 6, false);
    }
    @Test public void canGetName(){
        assertEquals("Stratus", guitar.getName());
    }
    @Test public void canGetNumOfStrings(){
        assertEquals(6, guitar2.getNumOfStrings());
    }
    @Test public void canPlaySound(){
        assertEquals("Strumming", guitar.playSounds());
    }
    @Test public void canBeSold(){
        assertEquals("Cha Ching!", guitar.isSold());
    }
    @Test public void canGetMarkup(){
        assertEquals(50, guitar.calculateMarkup(), 0.01);
    }

}
