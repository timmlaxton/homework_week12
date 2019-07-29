package MusicShop;

import Instruments.Trumpet;
import Shop.MusicShop;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

public class MusicShopTest<drum, piano, bass> {

    private MusicShop shop;
    private Trumpet trumpet;


    @Before
    public void setup(){
        shop = new MusicShop("Out of Tune");
    }

    @Test
    public void hasName(){
        assertEquals("Out of Tune", shop.getName());
    }

    @Test
    public void canCountStock() {
        assertEquals(0, shop.stockCount());
    }



    @Test
    public void canAddStockToShop() {
        shop.addItem(trumpet);
        assertEquals(1, shop.stockCount());
        assertTrue(shop.getStock().contains(trumpet));
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItem(trumpet);
        shop.removeItem(trumpet);
        assertEquals(0, shop.stockCount());
    }


}
