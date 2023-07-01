package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Instrument{

    private String name;
    private double wholesalePrice;
    private double retailPrice;
    private String colour;
    private String size;
    private String material;
    private String family;
    private String type;


    public Instrument(String name, double wholesalePrice, double retailPrice, String colour, String size, String material, String family, String type) {
        this.name = name;
        this.wholesalePrice =wholesalePrice;
        this.retailPrice = retailPrice;
        this.colour = colour;
        this.size = size;
        this.material = material;
        this.family = family;
        this.type = type;
    }

    public String getName(){
        return name;
    }
}
