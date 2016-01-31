/**
 * Cracking the coding interview 1.8
 */
public class StringRotation {
    public static boolean check(String input, String rotation) {

        if(input.length() == 0 || rotation.length() == 0 || rotation.length() != input.length()){
            return false;
        }

        // Java 8 uses StringBuilder under the hood so no need to use it explicitly
        String builder = input + input;
        return isSubstring(builder,rotation);
    }

    private static boolean isSubstring(String main, String sub){

        return main.contains(sub);
    }
}
