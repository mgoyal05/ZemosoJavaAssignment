package Assignment4.Main;

import Assignment4.Solution.KYC_Dates;
import Assignment4.Util.Util;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Initializes all the necessary classes of the solution
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        KYC_Dates results = new KYC_Dates();

        System.out.println("Please enter number of inputs");
        int noOfInputs = sc.nextInt();
        sc.nextLine();

        if (!Util.shouldExit(noOfInputs)) {
            String stringDate = sc.nextLine();
            results.range(stringDate);
            
            for (int i = 0; i < noOfInputs-1 && !Util.shouldExit(stringDate); i++) {
                stringDate = sc.nextLine();
                results.range(stringDate);
            }
        }
    }
}
