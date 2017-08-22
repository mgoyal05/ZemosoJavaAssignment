package Assignment1.Solution;

import Assignment1.Utils.Utils;
import Assignment3.Util.Util;

import java.io.File;
import java.util.regex.Pattern;

public class FileList {

    private static Pattern pattern;
    private StringBuilder printAddress;

    public FileList(){
        printAddress = new StringBuilder (  );
    }

    /**
     * Recursively go to each folder and check whether file name matches with pattern
     * @param path list of all the file and folder inside given path
     */
    public void printListRecursion ( File[] path) {
        //Enhanced for loop for each File in the path array
        for (File file : path) {
            if(file.isDirectory ()){
                File[] indivPath = file.listFiles ();
                printListRecursion ( indivPath);
            }

            //Returns true if the string 'str' contains the given pattern 'regex'
            else if(file.isFile ()) {

                //It will run if the absolute file path matches with the inputRegex or user has hit enter
                if (pattern.matcher ( file.getAbsolutePath ( ) ).matches ( )) {
                    printAddress.append ( file.getAbsolutePath ( )).append ("\n" );
                }
            }
        }
    }

    /**
     * Call a recursive method to look for files that match a regular expression.
     * @param path Input argument of array of files at given path
     * @param inputRegex Input regex expression to be matched
     */
    public void printList(File[] path , String inputRegex) {
            pattern = Pattern.compile ( inputRegex );

            printListRecursion ( path );
            System.out.println ( printAddress.toString ( ) );
            printAddress.delete ( 0 , printAddress.length ( ) );
    }
}
