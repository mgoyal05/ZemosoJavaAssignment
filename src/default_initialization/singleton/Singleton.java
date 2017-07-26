package default_initialization.singleton;

/**
 * @author Manish
 * Singleton class to print and initialise string
 */
public class Singleton {
    /**
     * Instance String member variable is declared
     */
    private String nonStaticString;

    /**
     * <p>A Static Method to initialise string and create a sample object of the class</p>
     * @param sampleString A string argument to initialise member variable of Singleton object
     * @return A object of the class Singleton.
     */
    public static Singleton initialiseString(String sampleString) {

        // nonStaticString = sampleString;                  //ERROR!!!

        /** NON-STATIC VARIABLE CAN NOT BE ACCESSED FROM STATIC CONTEXT AS A METHOD
         *  WILL NOT BE ABLE TO DECIDE WHICH OBJECT'S INSTANCE VARIABLE IT SHOULD TAKE SO EITHER -
         *  A) THE VARIABLE HAS TO BE MADE STATIC OR
         *  B) AN OBJECT INSIDE THE METHOD CAN BE DECLARED SO THAT METHOD KNOWS
         *    WHICH OBJECT'S INSTANCE VARIABLE IT SHOULD TAKE.
         */
        Singleton sampleObj = new Singleton();
        return sampleObj;
    }

    /**
     * <p>A Non-Static Method to print string member variable of class</p>
     */
    public void printString() {
        System.out.println(nonStaticString);               //As Instance variable can be accessed by any method inside class.
    }

    public static void main(String[] args) {
        Singleton newObj = Singleton.initialiseString("String to be Printed!!");

        newObj.printString();
    }
}