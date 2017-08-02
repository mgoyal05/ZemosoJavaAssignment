package Assignment_Day3.InnerClass;

/**
 * @author Manish Goyal
 * A class to show method and complexities to Inherit from inner class
 */
public class Class2 {

    //If Class1 not initialised than it will display ERROR!! NO ENCLOSING INSTANCE OF TYPE IN THE SCOPE
    public class InnerClass2 extends Class1.InnerClass1 {
        /*
        A Explicit Default Constructor needs to be initialised so as to get reference
        to the enclosing class object of Class1 because without initialising subclass don't
        know with which class it should extends to.
         */
        InnerClass2(Class1 sampleClass1){
            sampleClass1.super(5);                       //Initialising enclosing class Constructor
            System.out.println("This is InnerClass2 Constructor");
        }
    }

    public static void main(String[] args){

        Class2 sampleClass2 = new Class2();

        /*Along with Class2 Object Class1 Object must also be created which will be the argument in
          Class2Inside constructor
         */
        Class1 sampleClass1= new Class1();                      //Default constructor will be initialised first.
        InnerClass2 sampleInnerClass2 = sampleClass2.new InnerClass2(sampleClass1);
    }
}
