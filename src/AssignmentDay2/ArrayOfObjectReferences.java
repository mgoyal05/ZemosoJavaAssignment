package AssignmentDay2;

/**
 * @author Manish Goyal
 * ArrayOfObjectReferences class is to create an array of object which are not yet initialised
 */
public class ArrayOfObjectReferences {

    //Two instance variables name and age are initialised
    private String name;
    private int age;

    //A constructor with argument string for field name and print the name on the screen
    ArrayOfObjectReferences(String sampleStr){
        System.out.println(sampleStr);
        this.name = sampleStr;
        this.age = 18;
    }

    public static void main(String [] args){

        /**
         * A array of 10 elements of this class are created but as they are not initialised
         * therefore the constructor is not called and nothing gets printed on the screen
         */
        ArrayOfObjectReferences[] arrayOfClass = new ArrayOfObjectReferences[10];
    }
}
