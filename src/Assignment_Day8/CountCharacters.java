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

    /**
     * Takes FileInputStream file and convert it into a buffered reader and than finally to character array containing
     * characters of the given file
     * @param file A FileInputStream file which have byte-oriented data
     * @return Array of characters found in the given file
     * @throws IOException
     */
    public static char[] fileRead(FileInputStream file) throws IOException {

        //Lets an application read primitive Java data types from input stream 'file'.
        DataInputStream dis = new DataInputStream(file);

        //Reads text from a character-input stream(converted by class 'InputStreamReader').
        BufferedReader br = new BufferedReader(new InputStreamReader(dis));
        String Contents = "";
        String str = "";
        while ((Contents = br.readLine()) != null) {
            str += Contents;
        }

        //Creates Array of characters
        return str.toCharArray();
    }

    /**
     * Creates Map with Key as 'Character' and value as 'Integer to store no. of times each
     * key comes in the sentence. TreeMap is used to store the keys in sorted order.
     *
     * @param charArray A Array of Characters obtained from the Input text file.
     * @return A Sorted Map with Characters and their respective Occurences.
     */
    public static Map createMap(char[] charArray) {

        Map<Character, Integer> charCounter = new TreeMap<Character, Integer>();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (charCounter.containsKey(ch)) {
                charCounter.put(ch, charCounter.get(ch) + 1);
            } else {
                charCounter.put(ch, 1);
            }
        }
        return charCounter;
    }

    public static void main(String[] args) throws IOException {

        if (args.length > 0) {

            //Creates a FileInputStream by opening a connection to file (Obtained from args[0]) and reads byte-oriented Data.
            FileInputStream file = new FileInputStream(args[0]);

            char[] charArray = fileRead(file);

            Map<Character, Integer> charCounter = createMap(charArray);

            //PrintStream provides methods to write data to FileOutputStream which is an output stream used for writing data to a file
            PrintStream out = new PrintStream(new FileOutputStream("/home/zemoso/IdeaProjects/ZemosoJavaAssignment/src/Assignment_Day8/output.txt"));
            System.setOut(out);

            //Output will be stored as a text file in the output location as mentioned in FileOutputStream
            System.out.println(charArray);
            System.out.println("Character   Occurrence");
            for (Character key : charCounter.keySet()) {
                System.out.println(key + "\t\t" + charCounter.get(key));
            }
        } else {
            throw new FileNotFoundException();
        }
    }
}
