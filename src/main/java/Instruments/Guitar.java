package Instruments;

import Interfaces.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numOfStrings;
    private Boolean headless;

    public Guitar(String name, double wholesalePrice, double retailPrice, String colour, String size,
                  String material, String family, String type, int numOfStrings, Boolean headless)
    {
        super(name, wholesalePrice, retailPrice, colour, size, material, family, type);
        this.numOfStrings = numOfStrings;
        this.headless = headless;
    }
    public String playSounds(){
        return "Strumming";
    }
    public int getNumOfStrings() {
        return numOfStrings;
    }

}
