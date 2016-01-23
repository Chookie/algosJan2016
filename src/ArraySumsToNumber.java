import java.util.Arrays;

public class ArraySumsToNumber {
    public static boolean arraySumsTo(int[] array, int toFind) {

    	// primitive arrays use length, object arrays (like String) use length().
    	if(array.length == 0 || toFind == 0){
    		return false;
    	}

    	Arrays.sort(array);
    	int lower = 0;
    	int upper = array.length-1;

    	while(lower < upper){
	    	int sum = array[lower] + array[upper];
	    	if(sum == toFind){
	    		return true;
	    	}
	    	if(sum < toFind){
	    		lower += 1;
	    	}
	    	if(sum > toFind){
	    		upper -= 1;
	    	}
	    }

	    // in case only 1 element in array
        return array[lower] == toFind;
    }
}
