package Instruments;

import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String model;
    private String colour;
    private String material;
    private int sellingPrice;
    private int buyingPrice;

    public Instrument(String model, String colour, String material, int sellingPrice, int buyingPrice) {
        this.model = model;
        this.colour = colour;
        this.material = material;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

}
