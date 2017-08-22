package Assignment1.Main;

import Assignment1.Solution.FileList;
import Assignment1.Utils.Utils;

import java.io.*;
import java.util.*;

//A java program to search through the home directory and look for files that match a regular expression.
public class Main {

    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );                    //Scanner to take input
        FileList fileList = new FileList ();

        //An Array of file to store absolute path of each file or folder
        File[] path = new File("/home/zemoso").listFiles();

        System.out.println ( "Please Enter regular expression :" );

        String inputRegex = sc.nextLine ( );
        //This loop will continue to take input until user types exit in the command window
        while ( ! Utils.shouldExit ( inputRegex ) ) {
            fileList.printList ( path,inputRegex );
            System.out.println ( "Please Enter next regular expression or else enter 'exit' to exit" );
            inputRegex = sc.nextLine ();
        }
    }
}