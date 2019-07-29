package Instruments;

import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){
        piano = new Piano("Steinway", "Black", "Wood", 40000, 20000, 88, 3);

    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(88, piano.getKeys()); // Why is this red
    }

    @Test
    public void hasNumberOfPedals(){
        assertEquals(3, piano.getPedals());
    }

    @Test
    public void canPLay(){
        assertEquals("Oscar Peterson full of Whiskey and rage", piano.play());
    }



}

