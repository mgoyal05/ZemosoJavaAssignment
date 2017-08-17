package Assignment2.Test;

import Assignment2.Solution.ContainsAllAlphabets;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsAllAlphabetsTest {

    private ContainsAllAlphabets sample;

    @Before
    public void setUp() throws Exception {
       sample  = new ContainsAllAlphabets();
    }

    @Test
    public void containsAll() throws Exception {
        sample.containsAll("hello");
        sample.containsAll(null);
        sample.containsAll("Pack my box with five dozen liquor jugs.");
    }

}