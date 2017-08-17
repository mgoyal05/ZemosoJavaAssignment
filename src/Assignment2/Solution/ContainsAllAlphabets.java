package Assignment2.Solution;

/**
 * @author Manish Goyal
 * A class to containsAll
 */
public class ContainsAllAlphabets {

    /**
     * A method to check whether the inputString contains all Alphabets
     * @param inputString A string Argument based on input by user
     */
    public void containsAll(String inputString){
        if(inputString == null) {
            System.out.println("Error!!!");
            return;
        }
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
        if(Integer.bitCount(setBit) == 26){
            System.out.println("Voila!!! It contains all the Alphabets.");
            System.out.println("Please enter your string(or type 'exit' to exit):");
        } else {
            System.out.println("Sorry... Please try again(or type 'exit' to exit) :");
        }
    }
}

//Space-Complexity      O(l) where l is the length of the input string
//Time-Complexity       O(l) where l is the length of the input string
