package Main;

import Instruments.Instrument;
import Interfaces.IPlay;
import Interfaces.ISell;
import Peripherals.Peripheral;

import java.util.ArrayList;

public class Shop {

    ArrayList<ISell> stock;

    public Shop(ArrayList<ISell> stock ){
        this.stock = stock;
    }

    public void addStock(Object object){
        stock.add((ISell) object);
    }

    public int getStock() {
        return stock.size();
    }
}
