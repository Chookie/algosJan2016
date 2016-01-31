import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Cracking the coding interview 1.8
 */
public class StrintRotationTests {

    @Test
    public void testRotationReturnsTrue(){

        assertTrue(StringRotation.check("waterbottle","erbottlewat"));
    }

    @Test
    public void testNotRotationReturnsFalse(){

        assertFalse(StringRotation.check("waterbottle","bottlewat"));

    }
}
