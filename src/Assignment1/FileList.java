package Assignment1;
import java.util.regex.*;
import java.io.*;
import java.util.*;

//A java program to search through the home directory and look for files that match a regular expression.
public class FileList {

    private static Pattern pattern;

    /**
     * Returns true if the string 'str' contains the given pattern 'regex'
     * @param str A String Argument
     * @param regex A regular Expression in string format
     * @return True if string satisfy the condition or else false.
     */
    public static boolean match(String str, String regex){
        pattern = Pattern.compile(regex);
        return pattern.matcher(str).matches();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);                    //Scanner to take input
        String inputRegex;                                      //String for Regular Expression

        //A String Builder to store the path of each file in string format
        StringBuilder list = new StringBuilder();
        System.out.println("Please Enter regular expression(or press enter to print All)");

        //This loop will continue to take input until user types exit in the command window
        while (!(inputRegex = sc.nextLine()).equals("exit")) {

            //An Array of file to store absolute path of each file or folder
            File[] path = new File("/home/zemoso").listFiles();

            //Enhanced for loop for each File in the path array
            for (File file : path) {

                //It will run if the absolute file path matches with the inputRegex or user has hit enter
                if (match(file.getAbsolutePath(), inputRegex) || inputRegex.length() == 0) {
                    list.append(file.getAbsolutePath() + "\n");
                }
                //Printing the list
                System.out.println(list.toString());
                System.out.println("Please Enter next regular expression or else enter 'exit' to exit");
            }
        }
    }
}