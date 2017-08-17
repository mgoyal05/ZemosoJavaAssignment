package Assignment3.AveragePingTime;

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

    /**
     * Method to find the median of some specific no of time
     * @param ipAddress IPAddress to ping
     * @param packets   no of times after process should stop sending packets
     */
    public void ping (String ipAddress, int packets){
        try{
            String command ="ping -c "+ packets + " " + ipAddress;
            Process p = Runtime.getRuntime().exec(command);

            //String for storing line output and arrayList for time for each ping
            String line;
            List<Integer> timeArray = new ArrayList<>();
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));

            //will continue printing line and fetching time for each until it shows some error
            while ((line = input.readLine()) != null) {
                    System.out.println(line);
                    Matcher matcher = Pattern.compile("time=(.*) ms").matcher(line);
                    if(matcher.find()){
                        timeArray.add(Integer.parseInt(matcher.group(1)));
                        System.out.println(Integer.parseInt(matcher.group(1)));
                    }
            }
            Collections.sort(timeArray);
            int size = timeArray.size();

            //Median will be average of two if size is even
            if(size % 2 == 0)
                System.out.println("The median time is : " + (timeArray.get(size/2) + timeArray.get(size / 2 - 1)) / 2);
            else
                System.out.println("The median time is : " + timeArray.get(size/2));
            input.close();
        }
        catch(Exception e){}
    }

}