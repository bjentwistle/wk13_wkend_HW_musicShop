package Peripherals;

import Interfaces.ISell;

public class Peripheral implements ISell {
    private String name;
    private double wholesalePrice; //Price the shop buys the items for.
    private double retailPrice; //Price sold to customers in the store

    public Peripheral(String name, double wholesalePrice, double retailPrice){
        this.name = name;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }
    public String getName(){return name;}
    public String isSold() {return "Cha Ching!";}
    public double calculateMarkup(){return retailPrice - wholesalePrice;}
    //Calculate the profit margin of the item
}
