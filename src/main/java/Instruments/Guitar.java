package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numOfStrings;
    private Boolean headless;

    public Guitar(String name, double wholesalePrice, double retailPrice, String colour, String size, String material, String family, String type, int numOfStrings, Boolean headless) {
        super(name, wholesalePrice, retailPrice, colour, size, material, family, type);
        this.numOfStrings = numOfStrings;
        this.headless = headless;
    }
    public String playSounds(){
        return "Strumming";
    }

    public String isSold() {
        return "Cha Ching!";
    }
}
