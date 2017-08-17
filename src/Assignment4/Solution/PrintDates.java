package Assignment4.Solution;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PrintDates {

    /**
     * Return the allowable date range for the KYC form date
     * @param signupDate Calendar Input
     * @param currDate Calender Input
     * @return Returns String output as range of KYC form dates
     */
    public String print(Calendar signupDate, Calendar currDate){

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        StringBuilder rangeOutput = new StringBuilder();
        Calendar startDate = (Calendar) signupDate.clone();
        startDate.set(Calendar.YEAR, currDate.get(Calendar.YEAR));
        startDate.add(Calendar.DATE,-30);

        Calendar endDate = (Calendar) signupDate.clone();
        endDate.set(Calendar.YEAR, currDate.get(Calendar.YEAR));
        endDate.add(Calendar.DATE,30);

        if(startDate.before(currDate)){
            rangeOutput.append(formatter.format(startDate.getTime()));

            if(endDate.before(currDate)){
                rangeOutput.append(" ").append(formatter.format(endDate.getTime()));
            }
            else {
                rangeOutput.append(" ").append(formatter.format(currDate.getTime()));
            }
        }else {
            startDate.add(Calendar.YEAR, -1);
            endDate.add(Calendar.YEAR,-1);
            rangeOutput.append(" ").append(formatter.format(startDate.getTime()));
            rangeOutput.append(" ").append(formatter.format(endDate.getTime()));
        }
        return rangeOutput.append("\n").toString();
    }
}