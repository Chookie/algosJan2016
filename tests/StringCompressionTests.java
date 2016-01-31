import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Cracking the coding interview 1.5
 */
public class StringCompressionTests {

    @Test
    public void compressBadTestPass() {
        String raw = "aabcccccaaa";
        String compressed = "a2b1c5a3";

        String result = StringCompress.compressBad(raw);

        assertEquals(compressed, result);
    }

    @Test
    public void compressBadTestFail() {
        String raw = "aabcccccaaa";
        String compressed = "a4b1";

        String result = StringCompress.compressBad(raw);

        assertNotEquals(compressed, result);
    }

    @Test
    public void compressBetterTestPass() {
        String raw = "aabcccccaaa";
        String compressed = "a2b1c5a3";

        String result = StringCompress.compressBetter(raw);

        assertEquals(compressed, result);
    }

    @Test
    public void compressBetterTestFails() {
        String raw = "aabcccccaaa";
        String compressed = "a4b1";

        String result = StringCompress.compressBetter(raw);

        assertNotEquals(compressed, result);
    }

    @Test
    public void compressBestTestPass() {
        String raw = "aabcccccaaa";
        String compressed = "a2b1c5a3";

        String result = StringCompress.compressBest(raw);

        assertEquals(compressed, result);
        System.out.printf("Compressed=%s%n",result);
    }

    @Test
    public void compressBestTestFails() {
        String raw = "aabcccccaaa";
        String compressed = "a4b1";

        String result = StringCompress.compressBest(raw);

        assertNotEquals(compressed, result);
    }
}
