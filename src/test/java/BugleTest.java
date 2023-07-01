import Instruments.Bugle;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BugleTest {

    Bugle bugle;

    @Before
    public void before(){
        bugle = new Bugle("Military Made", 250.00, 300.00, "Bronze", "Fullsize", "Brass", "Brass", "Acoustic", "Gold");
    }

    @Test public void canGetMouthPiece(){
        assertEquals("Gold", bugle.getMouthpiecePlating());
    }
    @Test public void canPlaySound(){
        assertEquals("Rooty Toot", bugle.playSounds());
    }
    @Test public void canBeSold(){
        assertEquals("Cha Ching!", bugle.isSold());
    }
}
