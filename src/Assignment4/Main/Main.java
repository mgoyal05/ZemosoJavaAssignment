package Assignment4.Main;

import Assignment4.Solution.KYC_Dates;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        KYC_Dates results = new KYC_Dates();

        System.out.println("Please enter number of inputs");
        int noOfInputs = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < noOfInputs; i++){
            String s = sc.nextLine();
            results.range(s);
        }
    }
}
