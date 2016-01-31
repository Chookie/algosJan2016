/**
 * Cracking the code inteview question 1.2
 */
public class ReverseString {
    public static String usingLoop(String forward) {

        if(forward == null || forward.length()<2){
            return forward;
        }

        int i=0;
        int j=forward.length()-1;
        char[] array = forward.toLowerCase().toCharArray();
        while(i < j){
            swap(array, i, j);
            i++;
            j--;
        }
        return String.copyValueOf(array);
    }

    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
