package Instruments;

import javax.sound.midi.Instrument;

public class Drum extends Instrument {

    private int numberOfCymbals;


    public Drum(String model, String colour, String material, int sellingPrice, int buyingPrice, int numberOfCymbals) {
        super(model, colour, material, sellingPrice, buyingPrice);
        this.numberOfCymbals = numberOfCymbals;
    }

    public int getCymbals(){
        return this.numberOfCymbals;
    }

    public String play() {
        return "Ginger Baker dancing with Femi Kuti";
    }

    public Object getData() {
        return null;
    }
}
