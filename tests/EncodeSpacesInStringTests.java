import org.junit.Test;

public class EncodeSpacesInStringTests {

    @Test
    public void testEncodeSpaces(){
        String unencoded = "Mr John Smith    ";
        int length = 13;
        String encoded = "Mr%20John%20Smith";

        String result = EncodeSpacesInString.encode(unencoded.toCharArray());

        assertEquals(result, encoded);
    }
}
