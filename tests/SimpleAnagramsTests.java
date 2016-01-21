import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleAnagramsTests {

    @Test
    public void testCheckAnagramUsingSorting(){

        assertTrue(SimpleAnagrams.checkUsingSorting("word", "wrdo"));
        assertTrue(SimpleAnagrams.checkUsingSorting("mary", "army"));
        assertTrue(SimpleAnagrams.checkUsingSorting("stop", "tops"));
        assertTrue(SimpleAnagrams.checkUsingSorting("boat", "btoa"));
        assertFalse(SimpleAnagrams.checkUsingSorting("pure", "in"));
        assertFalse(SimpleAnagrams.checkUsingSorting("fill", "fil"));
        assertFalse(SimpleAnagrams.checkUsingSorting("b", "bbb"));
        assertFalse(SimpleAnagrams.checkUsingSorting("ccc", "ccccccc"));
        assertTrue(SimpleAnagrams.checkUsingSorting("a", "a"));
        assertFalse(SimpleAnagrams.checkUsingSorting("sleep", "slep"));
    }
}
