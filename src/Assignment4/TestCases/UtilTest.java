package Assignment4.TestCases;

import Assignment3.Util.Util;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UtilTest {
    @Test
    public void shouldExit() throws Exception {
        assertTrue(Util.shouldExit("exit"));
        assertFalse(Util.shouldExit("google.com"));
        assertFalse(Util.shouldExit(null));
    }

    @Test
    public void shouldExit1() throws Exception {
        assertTrue(Util.shouldExit(0));
        assertTrue(Util.shouldExit(-1));
        assertFalse(Util.shouldExit(5));
    }

}