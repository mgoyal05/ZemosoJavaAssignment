package Assignment3.Util;

/**
 * @author Manish Goyal
 */
public class Util {

    /**
     * A method which returns true if input is null or exit case insensitive
     * @param input A string argument which is checked whether it contains exit
     * @return true if null or exit(case insensitive)
     */
    public static boolean showExit(String input){
        if(input == null){
            return true;
        }
        input = input.toLowerCase();
        if(input.contains("exit")){
            return true;
        }
        return false;
    }

    //It will return true if input has non positive value
    public static boolean showExit(int input){
        return input < 0;
    }
}
