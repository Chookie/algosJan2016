import org.jboss.arquillian.core.spi.Validate;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Cracking the coding interview page 73 exercise 1.1
 */
public class UniqueCharacters {

    public static boolean inPlaceArray(String input){

        Validate.notNull(input,"input cannot be null");
        // Assume ANSI so 128 characters max
        if(input.length() > 128){
            return false;
        }

        boolean[] found = new boolean[128];
        for(int i=0; i<input.length(); i++){
            int ch = input.toUpperCase().charAt(i);
            if(found[ch]){
                return false;
            }
            found[ch] = true;
        }
        return true;
    }

    public static boolean inPlaceLoop(String input) {

        Validate.notNull(input,"input cannot be null");

        for(int i=0; i<input.length()-1;i++){
            for(int j=i+1; j <= input.length()-1;j++) {
                System.out.printf("i=%d, j=%d%n",i,j);
                char left = input.toLowerCase().charAt(i);
                char right = input.toLowerCase().charAt(j);
                if(left == right) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean useSetLoop(String input) {

        Validate.notNull(input,"input cannot be null");
        if(input.length() > 128){
            // only 128 characters
            return false;
        }

        Set<Character> set = new HashSet<>();
        for(char c : input.toLowerCase().toCharArray()){
            set.add(c);
        }
        return set.size() == input.length();
    }

    public static boolean useSetStream(String input){
        Validate.notNull(input,"input cannot be null");
        if(input.length() > 128){
            // only 128 characters
            return false;
        }

        Long count = Stream.of(input)
                .map(String::toLowerCase)
                .flatMapToInt(CharSequence::chars)
                .distinct()
                .count();
        return count == input.length();
    }
}
