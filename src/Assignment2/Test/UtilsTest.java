package Assignment2.Test;

import Assignment2.Util.Util;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * utility file to perform common tasks throughout the program
 */
public class UtilsTest {
    @Test
    public void shouldExit() throws Exception {
        assertTrue(Util.shouldExit("exit"));
        assertFalse(Util.shouldExit(null));
        assertFalse(Util.shouldExit("hello"));
    }

}