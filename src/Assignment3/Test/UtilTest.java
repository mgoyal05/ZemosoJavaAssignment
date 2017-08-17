package Assignment3.Test;

import org.junit.jupiter.api.Test;

import static Assignment3.Util.Util.showExit;
import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void test() throws Exception {
        assertTrue(showExit("eXiT"));
        assertTrue(showExit(null));
    }

    @org.junit.Test
    public void showExit1() throws Exception {
        assertTrue(showExit(-1));
        assertFalse(showExit(2));
    }

}