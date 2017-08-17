package Assignment3.Test;

import Assignment3.Solution.PingIP;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PingIPTest {

    private PingIP pingIP;

    @Before
    public void setUp() throws Exception {
        pingIP = new PingIP();
    }

    @Test
    public void medianPingTime() throws Exception {
        pingIP.medianPingTime("google.com", 2);
        pingIP.medianPingTime(null, 2);
        pingIP.medianPingTime("google.com", -1);
    }

}