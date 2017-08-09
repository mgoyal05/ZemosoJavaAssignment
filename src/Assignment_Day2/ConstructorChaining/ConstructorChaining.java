package Assignment_Day2.ConstructorChaining;

/**
 * @author Manish Goyal
 * To show the concept of Calling a constructor from the another constructor of same class which is
 * also known as <b>Constructor chaining.</b>
 */
public class ConstructorChaining {

    //Initialising two variables required for Student Data
    private int stuID;
    private String stuName;

    /**
     * Overloaded constructor calling Second constructor by using keyword this() which must always be
     * the first statement.
     * @param ID  A integer argument to declare StudID
     */
    public ConstructorChaining(int ID) {
        this(ID,"NewStudent");                       //Default Name as "NewStudent"
    }

    /**
     * Second Overloaded constructor with 2 arguments
     * @param ID A integer argument to declare StudID
     * @param str  A String argument to declare name of the student
     */
    public ConstructorChaining(int ID, String str) {
        stuID = ID;
        stuName = str;
    }

    //Method to print the fields of the object of class StudentData.
    private void printStudentData(){
        System.out.printf("Student ID: %d\n", this.stuID);
        System.out.printf("Student Name: %s\n", this.stuName);
    }

    public static void main(String[] args){

        //Creating two objects using both constructors
        ConstructorChaining sampleObj1 = new ConstructorChaining(1001);
        ConstructorChaining sampleObj2 = new ConstructorChaining(1002, "Manish Goyal");
        sampleObj1.printStudentData();
        sampleObj2.printStudentData();
    }
}