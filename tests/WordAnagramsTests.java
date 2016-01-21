import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class WordAnagramsTests {

    @Test
    public void testCheckAnagramUsingSorting(){

        assertEquals("Mother-in-law","Woman Hitler");
        assertEquals("The earthquakes","That queer shake");
        assertEquals("Astronomer","Moon starer");
        assertEquals("Fir cones","Conifers");
        assertEquals("God","dog");
        assertEquals("Mary","Army");
        assertEquals("","");
        assertEquals(null,null);

        assertNotEquals("Dog","Gods");
        assertNotEquals("Sleep","Slep");
        assertNotEquals("Pure","In");
        assertNotEquals(null,"");
    }
}
