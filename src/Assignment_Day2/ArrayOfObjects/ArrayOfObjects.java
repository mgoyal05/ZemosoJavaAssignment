package Assignment_Day2.ArrayOfObjects;

/**
 * @author Manish Goyal
 * A class to create an array of object which are than initialised with string argument
 */
public class ArrayOfObjects {

    //A constructor with a string argument and print the same on the screen.
    ArrayOfObjects(String sampleStr){
        System.out.println(sampleStr);
    }

    public static void main(String [] args){

        /**
         * Here each new array cell gets a new instance of the class and hence its constructor is called with their
         * specified string argument and the string gets printed on the screen
         */
        ArrayOfObjects[] arrayOfClass = new ArrayOfObjects[10];
        for(int i = 0; i < 10; i++){
            arrayOfClass[0] = new ArrayOfObjects("Sample test - " + (i + 1));
        }
    }
}