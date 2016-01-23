import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayAddsToNumberTests {

    @Test
    public void emptyArrayReturnsFalse(){
        int[] array = new int[]{};
        int sum = 8;

        assertFalse(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void zeroSumReturnsFalse(){
        int[] array = new int[]{10,5,7,3,2,6,4};
        int sum = 0;

        assertFalse(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void singleIntArrayFoundReturnsTrue(){
        int[] array = new int[]{8};
        int sum = 8;

        assertTrue(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void lessThanArrayNotFoundReturnsFalse(){
        int[] array = new int[]{10,5,7,3,6,4};
        int sum = 2;

        assertFalse(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void moreThanArrayNotFoundReturnsFalse(){
        int[] array = new int[]{10,5,7,3,6,4};
        int sum = 20;

        assertFalse(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void withinArrayNotFoundReturnsFalse(){
        int[] array = new int[]{10,5,7,3,6,4};
        int sum = 5;

        assertFalse(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void sumEdgeUnsortedReturnsTrue(){
        int[] array = new int[]{10,5,7,3,6,4};
        int sum = 14;

        assertTrue(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void sumEdgeSortedReturnsTrue(){
        int[] array = new int[]{10,5,7,3,6,4};
        int sum = 13;

        assertTrue(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void sumCentreSortedReturnsTrue(){
        int[] array = new int[]{10,5,7,3,6,4};
        int sum = 10;

        assertTrue(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void sumEdgeAndInnerSortedReturnsTrue(){
        int[] array = new int[]{10,5,7,3,6,4};
        int sum = 17;

        assertTrue(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void sumInnerSortedReturnsTrue(){
        int[] array = new int[]{10,5,7,3,6,4};
        int sum = 8;

        assertTrue(ArraySumsToNumber.arraySumsTo(array,sum));
    }

    @Test
    public void negativeSumFoundReturnsTrue(){
        int[] array = new int[]{-1,-3,-4,-2};
        int sum = -3;

        assertTrue(ArraySumsToNumber.arraySumsTo(array,sum));
    }
}
