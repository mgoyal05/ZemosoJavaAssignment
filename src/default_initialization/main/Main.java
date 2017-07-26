package default_initialization.main;

import default_initialization.data.Data;
import default_initialization.singleton.Singleton;

/**
 * @author Manish
 * Main class to show how to call classes from other packages
 */

public class Main {

    public static void main(String[] args) {
        Data dataObj = new Data();

        /* Methods of Data class */
        dataObj.printLocal();
        dataObj.printVariable();

        //Singleton class object created using static method.
        Singleton singletonObject = Singleton.initialiseString("Sample string for Singleton class");

        /* Method of Singleton class */
        singletonObject.printString();
    }
}