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
     * Returns range of KYC form dates as a string
     * @param input String parameter which contains dates separated by space
     * @return String which contains range of the given input(If exists unless 'No Range')
     * @throws ParseException
     */
    public void range(String input) throws ParseException {
        stringToDates(input);

        //Start date of First signup anniversary
        Calendar firstStartDate = (Calendar) signupDate.clone();
        firstStartDate.add(Calendar.YEAR,1);
        firstStartDate.add(Calendar.DATE, -30);

        //Return No Range if signupDate is in future or first anniversary is after current date
        if(signupDate.after(currDate) || firstStartDate.after(currDate)){
            System.out.println("No Range\n");
            return;
        }

        else {
            PrintDates rangeOfDates = new PrintDates();
            System.out.println(rangeOfDates.print(signupDate, currDate));
            return;
        }
    }
}