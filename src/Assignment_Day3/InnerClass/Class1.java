package Assignment_Day3.InnerClass;

/**
 * @author Manish Goyal
 * A class to show method and complexities to Inherit from inner class
 */
public class Class1 {

    //Default Constructor
    public Class1() {
        System.out.println("First Enclosing class object must be initialised");
    }

    public class InnerClass1 {

        public InnerClass1(int sampleInt) {
            System.out.println("Non-Default Constructor of Parent Class with sample Integer " + sampleInt);
        }
    }
}
