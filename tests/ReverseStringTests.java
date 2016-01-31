import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ReverseStringTests {

    @Test
    public void reverseUsingLoop(){
        String forward = "abcdefg";
        String reverse = "gfedcba";

        assertEquals(reverse, ReverseString.usingLoop(forward));
    }
}
