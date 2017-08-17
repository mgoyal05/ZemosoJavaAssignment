package Assignment2.Main;

import Assignment2.Solution.ContainsAllAlphabets;
import Assignment2.Util.Util;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContainsAllAlphabets method = new ContainsAllAlphabets();

        System.out.println("Please enter your string :");
        String inputString = sc.nextLine();                         //Example "Pack my box with five dozen liquor jugs."

        while (!Util.shouldExit(inputString)) {
            method.containsAll(inputString);
            inputString = sc.nextLine();
        }
    }
}

//Space-Complexity      O(l) where l is the length of the input string
//Time-Complexity       O(l) where l is the length of the input string
