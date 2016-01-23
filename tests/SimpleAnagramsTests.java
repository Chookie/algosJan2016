import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleAnagramsTests {

    @Test
    public void testCheckSimpleAnagramUsingSorting(){

        assertTrue(SimpleAnagrams.checkUsingSorting("word", "wrdo"));
        assertTrue(SimpleAnagrams.checkUsingSorting("mary", "army"));
        assertTrue(SimpleAnagrams.checkUsingSorting("mary", "Army"));
        assertTrue(SimpleAnagrams.checkUsingSorting("stop", "tops"));
        assertTrue(SimpleAnagrams.checkUsingSorting("boat", "btoa"));
        assertFalse(SimpleAnagrams.checkUsingSorting("pure", "in"));
        assertFalse(SimpleAnagrams.checkUsingSorting("fill", "fil"));
        assertFalse(SimpleAnagrams.checkUsingSorting("b", "bbb"));
        assertFalse(SimpleAnagrams.checkUsingSorting("ccc", "ccccccc"));
        assertTrue(SimpleAnagrams.checkUsingSorting("a", "a"));
        assertFalse(SimpleAnagrams.checkUsingSorting("sleep", "slep"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSortingAnagramsNullWord(){
        SimpleAnagrams.checkUsingSorting(null, "wrdo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSimpleSortingAnagramsEmptyWord(){
        SimpleAnagrams.checkUsingSorting("", "wrdo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSimpleSortingAnagramsNullAnagram(){
        SimpleAnagrams.checkUsingSorting(null, "wrdo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSimpleSortingAnagramsEmptyAnagram(){
        SimpleAnagrams.checkUsingSorting("", "wrdo");
    }



    @Test
    public void testCheckSimpleAnagramUsingSubstring(){

        assertTrue(SimpleAnagrams.checkUsingSubstring("word", "wrdo"));
        assertTrue(SimpleAnagrams.checkUsingSubstring("mary", "army"));
        assertTrue(SimpleAnagrams.checkUsingSubstring("mary", "Army"));
        assertTrue(SimpleAnagrams.checkUsingSubstring("stop", "tops"));
        assertTrue(SimpleAnagrams.checkUsingSubstring("boat", "btoa"));
        assertFalse(SimpleAnagrams.checkUsingSubstring("pure", "in"));
        assertFalse(SimpleAnagrams.checkUsingSubstring("fill", "fil"));
        assertFalse(SimpleAnagrams.checkUsingSubstring("b", "bbb"));
        assertFalse(SimpleAnagrams.checkUsingSubstring("ccc", "ccccccc"));
        assertTrue(SimpleAnagrams.checkUsingSubstring("a", "a"));
        assertFalse(SimpleAnagrams.checkUsingSubstring("sleep", "slep"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSubstringAnagramsNullWord(){
        SimpleAnagrams.checkUsingSubstring(null, "wrdo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSimpleSubstringAnagramsEmptyWord(){
        SimpleAnagrams.checkUsingSubstring("", "wrdo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSimpleSubstringAnagramsNullAnagram(){
        SimpleAnagrams.checkUsingSubstring(null, "wrdo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSimpleSubstringAnagramsEmptyAnagram(){
        SimpleAnagrams.checkUsingSubstring("", "wrdo");
    }


    @Test
    public void testCheckSimpleAnagramUsingStringBuilder(){

        assertTrue(SimpleAnagrams.checkUsingStringBuilder("word", "wrdo"));
        assertTrue(SimpleAnagrams.checkUsingStringBuilder("mary", "army"));
        assertTrue(SimpleAnagrams.checkUsingStringBuilder("mary", "Army"));
        assertTrue(SimpleAnagrams.checkUsingStringBuilder("stop", "tops"));
        assertTrue(SimpleAnagrams.checkUsingStringBuilder("boat", "btoa"));
        assertFalse(SimpleAnagrams.checkUsingStringBuilder("pure", "in"));
        assertFalse(SimpleAnagrams.checkUsingStringBuilder("fill", "fil"));
        assertFalse(SimpleAnagrams.checkUsingStringBuilder("b", "bbb"));
        assertFalse(SimpleAnagrams.checkUsingStringBuilder("ccc", "ccccccc"));
        assertTrue(SimpleAnagrams.checkUsingStringBuilder("a", "a"));
        assertFalse(SimpleAnagrams.checkUsingStringBuilder("sleep", "slep"));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleStringBuilderAnagramsNullWord(){
        SimpleAnagrams.checkUsingStringBuilder(null, "wrdo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSimpleStringBuilderAnagramsEmptyWord(){
        SimpleAnagrams.checkUsingStringBuilder("", "wrdo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSimpleStringBuilderAnagramsNullAnagram(){
        SimpleAnagrams.checkUsingStringBuilder(null, "wrdo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSimpleSimpleStringBuilderAnagramsEmptyAnagram(){
        SimpleAnagrams.checkUsingStringBuilder("", "wrdo");
    }
}
