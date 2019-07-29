package Instruments;

import javax.sound.midi.Instrument;

public class Piano extends Instrument {

    private int numberOfKeys;
    private int numberOfPedals;


    public Piano(String model, String colour, String material, int sellingPrice, int buyingPrice, int numberOfKeys, int numberOfPedals) {
        super(model, colour, material, sellingPrice, buyingPrice);
        this.numberOfKeys = numberOfKeys;
        this.numberOfPedals = numberOfPedals ;

    }

    public int getNumberOfKeys(){
        return this.getKeys;
    }

    public int getPedals(){
        return this.getPedals;
    }

    public String play() {
        return "Oscar Peterson full of Whiskey and rage";
    }


}
