package Assignment3.Main;

import Assignment3.Solution.PingIP;
import Assignment3.Util.Util;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String IPAddress;
        int count = -1;
        PingIP pingIP = new PingIP();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter th IP Address followed by no. of times you want to ping ");
        IPAddress = sc.next();
        if(!Util.shouldExit(IPAddress)) {
            count = sc.nextInt();
        }

        //will continue to take inputs till user type exit
        while (!Util.shouldExit(IPAddress) && !Util.shouldExit(count)) {
            pingIP.medianPingTime(IPAddress, count);
            System.out.println("Please enter th IP Address");
            if(!Util.shouldExit(IPAddress)) {
                IPAddress = sc.next();
                System.out.println("Please enter the number of times you want to ping");
            }
            count = sc.nextInt();
        }
    }
}