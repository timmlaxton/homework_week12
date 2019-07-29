package Shop;

import Instruments.Trumpet;
import Interfaces.ISell;

import java.util.ArrayList;
import java.util.Collection;

public class MusicShop<name> {


    private ArrayList<ISell> stock;
    private String name;

    public MusicShop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName(){
        return this.name;

    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public int stockCount() {
    return this.stock.size();
    }

    public void addItem(ISell item) {
    this.stock.add(item);
    }


    public void removeItem(ISell item) {
        this.stock.remove(item);
    }
}
