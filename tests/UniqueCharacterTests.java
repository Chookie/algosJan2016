import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueCharacterTests {

    @Test
    public void useSetLoopOnStringWithDuplicateCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.useSetLoop("sTutUa"));
    }

    @Test
    public void useSetLoopOnUniqueCharactersReturnsTrue(){

        assertTrue(UniqueCharacters.useSetLoop("saivw"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void useSetLoopOnNullStringThrowsException(){

        UniqueCharacters.useSetLoop(null);
    }

    @Test
    public void useSetLoopOnStringWithDuplicateAtEndCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.useSetLoop("abcdee"));
    }

    @Test
    public void useSetLoopOnStringWithDuplicateAtStartCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.useSetLoop("aabcde"));
    }



    @Test
    public void useSetStreamOnStringWithDuplicateCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.useSetStream("sTutUa"));
    }

    @Test
    public void useSetStreamOnUniqueCharactersReturnsTrue(){

        assertTrue(UniqueCharacters.useSetStream("saivw"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void useSetStreamOnNullStringThrowsException(){

        UniqueCharacters.useSetStream(null);
    }

    @Test
    public void useSetStreamOnStringWithDuplicateAtEndCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.useSetStream("abcdee"));
    }

    @Test
    public void useSetStreamOnStringWithDuplicateAtStartCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.useSetStream("aabcde"));
    }




    @Test
    public void inPlaceLoopOnStringWithDuplicateCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.inPlaceLoop("sTutUa"));
    }

    @Test
    public void inPlaceLoopOnStringWithTwoCharactersEndCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.inPlaceLoop("ee"));
    }

    @Test
    public void inPlaceLoopOnStringWithDuplicateAtEndCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.inPlaceLoop("abcdee"));
    }

    @Test
    public void inPlaceLoopOnStringWithDuplicateAtStartCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.inPlaceLoop("aabcde"));
    }

    @Test
    public void inPlaceLoopOnUniqueCharactersReturnsTrue(){

        assertTrue(UniqueCharacters.inPlaceLoop("saivw"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void inPlaceLoopOnNullStringThrowsException(){

        UniqueCharacters.inPlaceLoop(null);
    }




    @Test
    public void inPlaceArrayOnStringWithDuplicateCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.inPlaceArray("sTutUa"));
    }

    @Test
    public void inPlaceArrayOnStringWithTwoCharactersEndCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.inPlaceArray("ee"));
    }

    @Test
    public void inPlaceArrayOnStringWithDuplicateAtEndCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.inPlaceArray("abcdee"));
    }

    @Test
    public void inPlaceArrayOnStringWithDuplicateAtStartCharactersReturnsFalse(){

        assertFalse(UniqueCharacters.inPlaceArray("aabcde"));
    }

    @Test
    public void inPlaceArrayOnUniqueCharactersReturnsTrue(){

        assertTrue(UniqueCharacters.inPlaceArray("saivw"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void inPlaceArrayOnNullStringThrowsException(){

        UniqueCharacters.inPlaceArray(null);
    }
}
