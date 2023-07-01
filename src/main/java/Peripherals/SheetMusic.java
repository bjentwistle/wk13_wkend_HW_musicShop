package Peripherals;

import Interfaces.ISell;

public class SheetMusic extends Peripheral{

    String source; //paper or online

    public SheetMusic(String name, double wholesalePrice, double retailPrice, String source) {
        super(name, wholesalePrice, retailPrice);
        this.source = source;
    }

    public String getSource(){
        return source;
    }

}
