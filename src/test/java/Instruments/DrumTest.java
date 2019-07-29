package Instruments;

import Instruments.Drum;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before
    public void before() {
        drum = new Drum("Ludwig", "Amber", "Acrylic", 6000, 3000, 5);

    }

    @Test
    public void hasCymbals(){
        assertEquals(5, drum.getCymbals());
    }

    @Test
    public void canPlay(){
        assertEquals("Ginger Baker dancing with Femi Kuti", drum.play());
    }

}
