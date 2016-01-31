import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;


public class PermutationTests {

    @Test
    public void usingLoopWithValidIsTrue(){
        String word = "ABCDE";
        String perm = "EBCAD";

        assertTrue(perm,Permutation.isPermUsingLoop(word,perm));
    }

    @Test
    public void usingLoopWithInvalidIsFalse(){

        String word = "ABCDE";
        String perm = "EBC";

        assertFalse(perm,Permutation.isPermUsingLoop(word,perm));
    }

    @Test
    public void usingSortWithValidIsTrue(){
        String word = "ABCDE";
        String perm = "EBCAD";

        assertTrue(perm,Permutation.isPermUsingSort(word,perm));
    }

    @Test
    public void usingSortWithInvalidIsFalse(){

        String word = "ABCDE";
        String perm = "EBC";

        assertFalse(perm,Permutation.isPermUsingSort(word,perm));
    }

    @Test
    public void usingRecursonFindAll(){
        String word = "cba";
        List<String> permutations = Arrays.asList("cba", "bca", "bac","cab","acb","abc");

        List<String> results = Permutation.findPermutations(word);
        results.stream().forEach(System.out::println);

        assertTrue(results.containsAll(permutations));
    }
}
