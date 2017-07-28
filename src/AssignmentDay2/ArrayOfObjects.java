package AssignmentDay2;

/**
 * @author Manish Goyal
 * ArrayOfObject class is to create an array of object which are than initialised with string argument
 */
public class ArrayOfObjects {

    //Two instance variables name and age are initialised
    private String name;
    private int age;

    //A constructor with argument string for field name and print the name on the screen
    ArrayOfObjects(String sampleStr){
        System.out.println(sampleStr);
        this.name = sampleStr;
        this.age = 18;
    }

    public static void main(String [] args){

        /**
         * A array of 10 elements of this class are created and than they are not initialised
         * so now constructor for each object is called with their specific string arguments
         * and the string is succesfully gets printed on the screen
         */
        ArrayOfObjects[] arrayOfClass = new ArrayOfObjects[10];
        for(int i = 0; i < 10; i++){
            arrayOfClass[0] = new ArrayOfObjects("Sample test - " + (i + 1));
        }
    }
}