package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements ISell{

    private String name;
    private double wholesalePrice; //Price the shop buys the items for.
    private double retailPrice; //price sold to customers in the store
    private String colour;
    private String size; //usually full size or a fraction of it.
    private String material; //Wood, brass metal etc.
    private String family; //Woodwind, Brass, Strings etc
    private String type; //Acoustic, electric or hybrid.
    public Instrument(String name, double wholesalePrice, double retailPrice, String colour,
                      String size, String material, String family, String type)
    {
        this.name = name;
        this.wholesalePrice = wholesalePrice;
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
    public String isSold() {
        return "Cha Ching!";
    }
    public double calculateMarkup(){ //Calculate the profit margin of the item
        return retailPrice - wholesalePrice;
    }
}
