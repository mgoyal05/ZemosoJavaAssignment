package Assignment_Day5;
import java.util.regex.Pattern;

/**
 * @author Manish Goyal
 * A class to illustrate use of Regular Expression
 */
public class RegexExample {
    public static void main(String[] args) {

        /*'[A-Z]' will ensure that first letter should be capital
          '.' ensures that next character can be of any input
          '*' Matches zero or more occurrences of this pattern.
          '\\.' ensures that it should always end with period
         */
        System.out.println("A Sample sentence to show application of regex.".matches("[A-Z].*\\."));
    }
}
