package Assignment_Day4;
import java.util.Scanner;

/**
 * @author Manish Goyal
 * A class to illustrate Error handling and creating user-defined Exception in Java
 */

//User-Define Class inherited from super-class Exception
class Exception1 extends Exception {

    public Exception1(String sampleString) {
        super(sampleString);
    }
}

class Exception2 extends Exception {

    public Exception2(String sampleString) {
        super(sampleString);
    }
}

//Non-Default constructor to take string argument when initialising the class
class Exception3 extends Exception {

    public Exception3(String sampleString) {
        super(sampleString);
    }
}

public class ExceptionTest {

    //A static method which uses 'throws' keyword to declare possible Exception which it can throw
    public static void methodException(int exceptionNumber) throws Exception1,Exception2, Exception3 {

        if(exceptionNumber == 3){
            throw new Exception3("This is the first exception");
        }
        if(exceptionNumber == 2){
            throw new Exception2("This is the second exception");
        }
        if(exceptionNumber == 1){
            throw new Exception1("This is the third exception");
        }
        else{
            throw new NullPointerException("This is Null Pointer Exception");
        }
    }

    public static void main(String[] args) {

        //Scanner to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type which Exception Number(0-3) you want:");
        int sampleNumber = sc.nextInt();

        //try and catch block to handle exception in method 'methodExecution'
        try {
            methodException(sampleNumber);
        }
        catch (Exception2 | Exception1 |Exception3 e){
            System.out.println(e);                          //It will display other details also.
            System.out.println(e.getMessage());             //It will just display the string message wh
        }
        //It will execute in any case even if program throws some Error/Exception except if Program exits before only.
        finally {
            System.out.println("Final Block will execute even if this method catches Exception!!");
        }

    }
}
