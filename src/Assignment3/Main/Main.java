package Assignment3.Main;

import Assignment3.AveragePingTime.PingIP;
import Assignment3.Util.Util;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String IPAddress;
        int count;
        PingIP pingIP = new PingIP();
        Scanner sc = new Scanner(System.in);

        System.out.println("Plz enter th IP Address followed by no. of times you want to ping ");
        IPAddress = sc.next();
        count = sc.nextInt();

        //will continue to take inputs till user type exit
        while (!Util.showExit(IPAddress) && !Util.showExit(count)) {
            pingIP.ping(IPAddress, count);
            System.out.println("Plz enter th IP Address");
            IPAddress = sc.next();
            System.out.println("Please enter the number of times you want to ping");
            count = sc.nextInt();
        }
    }
}
