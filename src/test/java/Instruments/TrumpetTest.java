package Instruments;

import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Bach VBS1", "Gold", "Brass", 2800, 1400, 10);

    }

    @Test
    public void hasNumberOfValves(){
        assertEquals(4, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Miles Davis on crack pointing a gun in someones face", trumpet.play());
    }


}
