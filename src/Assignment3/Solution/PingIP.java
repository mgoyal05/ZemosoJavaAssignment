package Assignment3.Solution;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Manish Goyal
 * It takes the IP Address and no of times to ping and results the median of the total times.
 */
public class PingIP {

    private final List<Double> timeArray;
    private final Pattern pattern;

    public PingIP(){
        timeArray = new ArrayList<>();
        pattern = Pattern.compile("time=(.*) ms");
    }

    /**
     * Method to find the median of some specific no of time
     * @param ipAddress IPAddress to ping
     * @param packets   no of times after process should stop sending packets
     */
    public void medianPingTime(String ipAddress, int packets){
        try{
            String command ="ping -c "+ packets + " " + ipAddress;
            Process p = Runtime.getRuntime().exec(command);

            //String for storing line output and arrayList for time for each ping
            String line;
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

            //will continue printing line and fetching time for each until it shows some error
            try{
                while ((line = input.readLine()) != null) {
                    Matcher matcher = pattern.matcher(line);
                    if(matcher.find()){
                        timeArray.add(Double.parseDouble(matcher.group(1)));
                    }
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
            Collections.sort(timeArray);
            int size = timeArray.size();

            //Median will be average of two if size is even
            if(size % 2 == 0)
                System.out.println("The median time is : " + (timeArray.get(size/2) + timeArray.get(size / 2 - 1)) / 2);
            else
                System.out.println("The median time is : " + timeArray.get(size/2));
            timeArray.clear();
            input.close();
        }
        catch(Exception e){
            System.out.println("Invalid IP address!!!, Please Try Again\n"+ e.toString());
        }
    }

}