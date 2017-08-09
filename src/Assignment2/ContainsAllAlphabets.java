package Assignment2;

import java.util.Scanner;

/**
 * @author Manish Goyal
 * A class to containsAll
 */
public class ContainsAllAlphabets {

    /**
     * A method to check whether the inputString contains all Alphabets
     * @param inputString A string Argument based on input by user
     * @return true if contains all Alphabets
     */
    public static boolean containsAll(String inputString){

        //To take into account each alphabet
        int setBit = 0;

        //Left shift is performed for each letter and than not repeated one's position are marked in setBit by OR.
        for(char alphabet : inputString.toCharArray()) {
            int ASCII_Code = Character.toUpperCase(alphabet);
            if (ASCII_Code >= 'A' && ASCII_Code <= 'Z') {
                int left = 1 << (ASCII_Code - 'A');
                setBit = setBit|left;                               //Changes to 1 if 'left' contains new letter
            }
        }

        //If all alphabets are present, setBit will have all 26 bit position as 1
        return (Integer.bitCount(setBit) == 26);
    }

    public static void main(String[] args) {

        System.out.println("Please enter your string :");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();                         //Example "Pack my box with five dozen liquor jugs."

        if (containsAll(inputString)) {
            System.out.println("Voila!!! It contains all the Alphabets");
        }
        else{
            System.out.println("Sorry... Please try again");
        }
    }
}

//Space-Complexity      O(l) where l is the length of the input string
//Time-Complexity       O(l) where l is the length of the input string
