package Instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String model, String colour, String material, int sellingPrice, int buyingPrice, int numberOfValves) {
        super(model, colour, material, sellingPrice, buyingPrice);
        this.numberOfValves = numberOfValves;
    }


  public int getNumberOfValves(){
        return this.numberOfValves;
  }

    public String play() {
        return "Miles Davis on crack pointing a gun in someones face";
    }
}
