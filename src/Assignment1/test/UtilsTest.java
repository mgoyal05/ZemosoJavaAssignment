package Assignment1.test;

import Assignment1.Solution.FileList;
import Assignment1.Utils.Utils;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * utility file to perform common tasks throughout the program
 */
public class UtilsTest {
    private File[] path;

    @Before
    public void setUp() throws Exception {
        path = new File("/home/zemoso/Manish").listFiles();
    }

    @Test
    public void shouldExit() throws Exception {
        assertTrue( Utils.shouldExit("exit"));
        assertFalse(Utils.shouldExit(null));
        assertFalse(Utils.shouldExit("don't exit"));
    }

}