package Assignment2.Util;

/**
 * @author Manish Goyal
 */
public class Util {

    /**
     * A method which returns true if input is null or exit case insensitive
     * @param input A string argument which is checked whether it contains exit
     * @return true if null or exit(case insensitive)
     */
    public static boolean shouldExit(String input){
        if(input == null){
            return false;
        }
        input = input.toLowerCase();
        return input.equals("exit");
    }
}
