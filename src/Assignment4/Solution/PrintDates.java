package Assignment4.Solution;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintDates {

    /**
     * Return the allowable date range for the KYC form date
     * @param signupDate Calendar Input
     * @param currDate Calender Input
     */
    public void print(Calendar signupDate, Calendar currDate){

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Calendar startDate = (Calendar) signupDate.clone();
        startDate.set(Calendar.YEAR, currDate.get(Calendar.YEAR));
        startDate.add(Calendar.DATE,-30);

        Calendar endDate = (Calendar) signupDate.clone();
        endDate.set(Calendar.YEAR, currDate.get(Calendar.YEAR));
        endDate.add(Calendar.DATE,30);

        if(startDate.before(currDate)){
            System.out.print(formatter.format(startDate.getTime()) + " ");

            if(endDate.before(currDate)){
                System.out.println(formatter.format(endDate.getTime()));
            }
            else {
                System.out.println(formatter.format(currDate.getTime()));
            }
        }else {
            startDate.add(Calendar.YEAR, -1);
            endDate.add(Calendar.YEAR,-1);
            System.out.println(formatter.format(startDate.getTime()) + " " + formatter.format(endDate.getTime()));
        }
    }
}