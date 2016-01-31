import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class EncodeSpacesInStringTests {

    @Test
    public void testEncodeSpaces(){
        char[] unencoded = "Mr John Smith    ".toCharArray();
        int length = 13;
        char[] encoded = "Mr%20John%20Smith".toCharArray();

        char[] result = EncodeSpacesInString.encode(unencoded,length);

        assertTrue(Arrays.equals(result, encoded));
    }
}
