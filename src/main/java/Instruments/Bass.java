package Instruments;

import javax.sound.midi.Instrument;

public class Bass extends Instrument {

    private int numberOfStrings;

    public Bass(String model, String colour, String material, int sellingPrice, int buyingPrice, int numberOfStrings) {
        super(model, colour, material, sellingPrice, buyingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberofStrings(){
        return this.numberOfStrings;
    }

    public String play() {
        return "John Deacon rolling his eyes at Roger Taylor suggesting terrible song titles";
    }


}
