import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Cracking the code interview question 1.3
 */
public class Permutation {
    public static boolean isPermUsingLoop(String word, String perm) {

        if(word.length() != perm.length()){
            return false;
        }

        for(char c : perm.toCharArray()){
            int i = perm.indexOf(c);
            if(i==-1){
                return false;
            }
            perm = perm.substring(0,i) + perm.substring(i+1,perm.length());
        }
        return perm.length() == 0;
    }

    public static boolean isPermUsingSort(String word, String perm){
        char[] wordArray = word.toLowerCase().toCharArray();
        char[] permArray = perm.toLowerCase().toCharArray();

        Arrays.sort(wordArray);
        Arrays.sort(permArray);

        return Arrays.equals(wordArray, permArray);
    }

    public static List<String> findPermutations(String input){
        List<String> permutations = new ArrayList<>();
        findPermutations(permutations,"",input);
        return permutations;
    }

    public static void findPermutations(List<String> permutations, String prefix, String input){
        if(input.length()==0){
            System.out.printf("%s, ",prefix);
            permutations.add(prefix);
            return;
        }

        for(int i=0; i<input.length(); i++){
            char fixedChar = input.charAt(i);
            String remaining = input.substring(0,i) + input.substring(i+1,input.length());
            findPermutations(permutations,prefix + fixedChar, remaining);
        }
    }
}
