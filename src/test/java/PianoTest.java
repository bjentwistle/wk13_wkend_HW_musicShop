import Instruments.Guitar;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Yamaha", 2150.00, 3500.00, "Black", "Baby", "Cast Iron", "String", "Electric", "Grande");
    }


    @Test
    public void canGetName(){
        assertEquals("Yamaha", piano.getName());
    }

//    @Test public void canPlaySound(){
//        assertEquals("Plink Plonk", piano.playSounds());
//    }
}
