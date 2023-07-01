import Instruments.Bugle;
import Instruments.Guitar;
import Instruments.Instrument;
import Instruments.Piano;
import Main.Shop;
import Peripherals.Peripheral;
import org.junit.Before;

import java.util.ArrayList;

public class ShopTest {

    Shop shop;
    ArrayList<Instrument> instruments;
    ArrayList<Peripheral> peripherals;
    Guitar guitar1;
    Guitar guitar2;
    Piano pianoBabyGrande;
    Piano keyboardElectronic;
    Bugle bugle;

    public Shop(ArrayList<Instrument> instruments,  ArrayList<Peripheral> peripherals){
        this.instruments = instruments;
        this.peripherals = peripherals;
    }
    @Before public void before() {
        bugle = new Bugle("Military Made", 250.00, 300.00, "Bronze", "Fullsize", "Brass", "Brass", "Acoustic", "Gold");
        pianoBabyGrande = new Piano("Yamaha", 2150.00, 3500.00, "Black",
                "Baby", "Cast Iron", "String", "Electric", "Grande");
        keyboardElectronic = new Piano("Yamaha", 750.00, 900.00, "Pink",
                "Full size", "Plastic", "String", "Electric", "Keyboard");
        shop = new Shop(instruments, peripherals);
    }

}