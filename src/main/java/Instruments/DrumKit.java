package Instruments;

public class DrumKit extends Instrument{

    int numOfDrums;
    int numOfCymbals;

    public DrumKit(String name, double wholesalePrice, double retailPrice, String colour, String size, String material, String family, String type, int numOfDrums, int numOfCymbals) {
        super(name, wholesalePrice, retailPrice, colour, size, material, family, type);
        this.numOfDrums = numOfDrums;
        this.numOfCymbals = numOfCymbals;
    }
}
