package Assignment4.TestCases;

import Assignment4.Solution.KYC_Dates;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KYC_DatesTest {

    private KYC_Dates kyc_dates;

    @Before
    public void setUp() throws Exception{
        kyc_dates = new KYC_Dates();
    }
    @Test
    public void stringToDates() throws Exception {
        try{
        kyc_dates.stringToDates("hello");
        kyc_dates.stringToDates("22-12-2012 02-12-2014");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void range() throws Exception {
    }

}