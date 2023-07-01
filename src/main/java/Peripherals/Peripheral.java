package Peripherals;

import Interfaces.ISell;

public abstract class Peripheral implements ISell {
    private String name; //These three attributes are duplicated in Instruments
    //Therefore could have a base class above peripherals and instruments - but that would make the
    //ISellable interface unnecessary.
    private double wholesalePrice; //Price the shop buys the items for.
    private double retailPrice; //Price sold to customers in the store

    public Peripheral(String name, double wholesalePrice, double retailPrice){
        this.name = name;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }
    public String getName(){return name;}
    public String isSold() {System.out.printf("Sold peripheral - " + name + " for £%.2f", retailPrice); return "Cha Ching!";}
    public double calculateMarkup(){return retailPrice - wholesalePrice;}
    //Calculate the profit margin of the item
}
