import java.util.Arrays;

/**
* Allow any combination of letters to be anagram as long as they match.
* Does not have to be a real word.
**/
public class SimpleAnagrams {

    public static boolean checkUsingSorting(String word, String anagram){

    	if(null == word || word.isEmpty() || null == anagram || anagram.isEmpty()){
    		throw new IllegalArgumentException("Argument is null or empty.");
    	}
    	if(word.length() != anagram.length()){
    		return false;
    	}

    	char[] charFromWord = word.toLowerCase().toCharArray();
    	char[] charFromAnagram = anagram.toLowerCase().toCharArray();
    	Arrays.sort(charFromWord);
    	Arrays.sort(charFromAnagram);

    	return Arrays.equals(charFromWord,charFromAnagram);
    }
}
