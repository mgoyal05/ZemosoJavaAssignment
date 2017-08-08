package Assignment_Day8;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Manish Goyal
 * A class which takes path of input file name as command line argument and
 * counts the occurrence of all the different characters.
 */
public class CountCharacters {

    public static void main(String[] args) throws Exception {

        //Creates a FileInputStream by opening a connection to file (Obtained from args[0]) and reads byte-oriented Data.
        FileInputStream file = new FileInputStream(args[0]);

        //Lets an application read primitive Java data types from input stream 'file'.
        DataInputStream dis = new DataInputStream(file);

        //Reads text from a character-input stream(converted by class 'InputStreamReader').
        BufferedReader br = new BufferedReader(new InputStreamReader(dis));
        String Contents="";
        String str="";
        while ((Contents = br.readLine()) != null) {
            str+=Contents;
        }

        //Creates Array of characters
        char[] charArray = str.toCharArray();

        /*Created Map with Key as 'Character' and value as 'Integer to store
          no. of times each key comes in the sentence. TreeMap is used to store the
          keys in sorted order.
         */
        Map<Character, Integer> charCounter = new TreeMap<Character, Integer>();
        for(int i = 0; i < str.length(); i++){
            char ch = charArray[i];
            if(charCounter.containsKey(ch)){
                charCounter.put(ch,charCounter.get(ch)+1);
            }
            else {
                charCounter.put(ch,1);
            }
        }

        //PrintStream provides methods to write data to FileOutputStream which is an output stream used for writing data to a file
        PrintStream out = new PrintStream(new FileOutputStream("/home/zemoso/IdeaProjects/ZemosoJavaAssignment/src/Assignment_Day8/output.txt"));
        System.setOut(out);

        //Output will be stored as a text file in the output location as mentioned in FileOutputStream
        System.out.println(str);
        System.out.println("Character   Occurrence");
        for (Character key : charCounter.keySet()){
            System.out.println(key + "\t\t" + charCounter.get(key));
        }
    }
}
