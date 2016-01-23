import java.util.Arrays;

/**
* Allow any combination of letters to be anagram as long as they match.
* Does not have to be a real word.
**/
public class SimpleAnagrams {

    public static boolean checkUsingSorting(String word, String anagram){

        if(word==null || word.isEmpty() || word == null || word.isEmpty()){
            throw new IllegalArgumentException("word or anagram are null or empty");
        }

        char[] wordArray = word.toLowerCase().toCharArray();
        char[] anagramArray = anagram.toLowerCase().toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(anagramArray);

        return Arrays.equals(wordArray, anagramArray);
    }

    public static boolean checkUsingSubstring(String word, String anagram){

        if(word==null || word.isEmpty() || anagram == null || anagram.isEmpty()){
            throw new IllegalArgumentException("word or anagram are null or empty");
        }

        char[] wordArray = word.toLowerCase().toCharArray();

        for(char c : wordArray){
            int i = anagram.toLowerCase().indexOf(c);
            if(i == -1){
                return false;
            }
            anagram = anagram.substring(0,i) + anagram.substring(i+1,anagram.length());
        }

        return anagram.length() == 0;
    }

    public static boolean checkUsingStringBuilder(String word, String anagram){        

        if(word==null || word.isEmpty() || anagram == null || anagram.isEmpty()){
            throw new IllegalArgumentException("word or anagram are null or empty");
        }

        char[] wordArray = word.toLowerCase().toCharArray();
        StringBuilder result = new StringBuilder(anagram.toLowerCase());

        for(char c : wordArray){
            int i = result.indexOf(String.valueOf(c));
            if( i == -1){
                return false;
            }
            result.deleteCharAt(i);
        }
        return result.length() == 0;
    }
}
