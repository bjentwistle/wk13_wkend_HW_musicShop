package Main;

import Instruments.Instrument;
import Interfaces.IPlay;
import Interfaces.ISell;
import Peripherals.Peripheral;

import java.util.ArrayList;

public class Shop {

    ArrayList<Instrument> instruments;
    ArrayList<Peripheral> peripherals;

    public Shop(ArrayList<Instrument> instruments, ArrayList<Peripheral> peripherals) {
        this.instruments = instruments;
        this.peripherals = peripherals;
    }

    public void addInstruments(Instrument instrument){
        instruments.add(instrument);
    }
}
