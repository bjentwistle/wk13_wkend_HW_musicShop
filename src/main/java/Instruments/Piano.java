package Instruments;
import Interfaces.IPlay;

public class Piano extends Instrument implements IPlay {
    private String style;

    public Piano(String name, double wholesalePrice, double retailPrice, String colour, String size, String material, String family, String type, String style) {
        super(name, wholesalePrice, retailPrice, colour, size, material, family, type);
        this.style = style;
    }
    public String playSounds(){
        return "Plink plonk!";
    }

    public String getStyle() {
        return style;
    }
}
