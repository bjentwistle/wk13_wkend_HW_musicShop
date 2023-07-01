package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public class Bugle extends Instrument implements IPlay {
    private String mouthpiecePlating;

    public Bugle(String name, double wholesalePrice, double retailPrice, String colour, String size, String material, String family, String type, String mouthpiecePlating) {
        super(name, wholesalePrice, retailPrice, colour, size, material, family, type);
        this.mouthpiecePlating = mouthpiecePlating;
    }

    public String getMouthpiecePlating() {
        return mouthpiecePlating;
    }

    public String playSounds(){
        return "Rooty Toot";
    }

}
