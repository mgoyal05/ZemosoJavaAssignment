package Assignment_Day2.ArrayOfObjectReferences;

/**
 * @author Manish Goyal
 * A class which creates an array of object which are not initialised
 */
public class ArrayOfObjectReferences {

    //Default constructor
    ArrayOfObjectReferences() {
        System.out.println("An Example to show when object is initialised");
    }

    //A constructor with a string aargument and print the same on the screen
    ArrayOfObjectReferences(String sampleStr){
        System.out.println(sampleStr);
    }

    public static void main(String [] args){

        //As class is not initialised so its constructors is not called and hence nothing gets printed
        ArrayOfObjectReferences[] arrayOfClass = new ArrayOfObjectReferences[10];
    }
}
