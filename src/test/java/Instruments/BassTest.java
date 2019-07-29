package Instruments;

import Instruments.Bass;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BassTest {

    private Bass bass;

    @Before
    public void setup() {
        bass = new Bass("Fender Squier", "Sunburst", "Mahogany", 300, 150, 10);

    }

    @Test
    public void hasNumberOfString() {
        assertEquals(10, bass.getNumberOfStrings()); // why is this red

    }

    @Test
    public void canPLay(){
        assertEquals("John Deacon rolling his eyes at Roger Taylor suggesting terrible song titles", bass.play());
    }

}

