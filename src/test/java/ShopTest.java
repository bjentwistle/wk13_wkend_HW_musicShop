import Instruments.Bugle;
import Instruments.Guitar;
import Instruments.Instrument;
import Instruments.Piano;
import Interfaces.ISell;
import Main.Shop;
import Peripherals.Peripheral;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ArrayList<ISell> stock;
    Guitar guitar1;
    Guitar guitar2;
    Piano pianoBabyGrande;
    Piano keyboardElectronic;
    Bugle bugle;

    public void Shop(ArrayList<ISell> stock){
        this.stock = stock;
    }
    @Before public void before() {
        bugle = new Bugle("Military Made", 250.00, 300.00, "Bronze", "Fullsize", "Brass", "Brass", "Acoustic", "Gold");
        pianoBabyGrande = new Piano("Yamaha", 2150.00, 3500.00, "Black",
                "Baby", "Cast Iron", "String", "Electric", "Grande");
        keyboardElectronic = new Piano("Yamaha", 750.00, 900.00, "Pink",
                "Full size", "Plastic", "String", "Electric", "Keyboard");
        shop = new Shop(stock);
        shop.addStock(bugle);
        shop.addStock(pianoBabyGrande);
        shop.addStock(keyboardElectronic);

    }
    @Test public void canGetStockSize(){
        assertEquals(3, shop.getStock());

    }

}