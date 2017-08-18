package Assignment4.Solution;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class KYC_Dates {

    private final Calendar signupDate;
    private final Calendar currDate;

    public KYC_Dates(){
        signupDate = Calendar.getInstance();
        currDate = Calendar.getInstance();
    }

    /**
     * A Method to extract two dates from string separated by space
     * @param date String argument contains dates separated by space
     * @throws ParseException Throws Error when string have invalid format
     */
    public void stringToDates(String date) throws ParseException {
        String[] dates =date.split(" ",2);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        signupDate.setTime(formatter.parse(dates[0]));
        currDate.setTime(formatter.parse(dates[1]));
    }

    /**
     * Returns range of KYC form dates as a string(If exists unless 'No Range')
     * @param input String parameter which contains dates separated by space
     * @throws ParseException
     */
    public void range(String input) throws ParseException {
        stringToDates(input);

        //Start date of First signup anniversary
        Calendar firstStartDate = (Calendar) signupDate.clone();
        firstStartDate.add(Calendar.YEAR,1);
        firstStartDate.add(Calendar.DATE, -30);

        if(signupDate.after(currDate) || firstStartDate.after(currDate)){
            System.out.println("No Range\n");
        }else {
            PrintDates rangeOfDates = new PrintDates();
            rangeOfDates.print(signupDate, currDate);
        }
    }
}
