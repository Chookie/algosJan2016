import java.util.Arrays;
import java.util.List;

public class WordChecker {
    public static boolean isWord(String wordToCheck){

    	List<String> words = Arrays.asList(
    		"woman",
    		"hitler",
    		"that",
    		"queer",
    		"shake",
    		"moon",
    		"starer",
    		"conifers",
    		"",
    		"",
    		"",
    		"",
    		""
		);
        return words.contains(wordToCheck);
    }
}
