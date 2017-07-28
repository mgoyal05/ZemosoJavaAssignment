package Assignment_Day2.ConstructorChaining;

/**
 * @author Manish Goyal
 * A StudentData class is a example to show the concept of Calling a constructor from
 * the another constructor of same class which is also known as <b>Constructor chaining.</b>
 */
public class ConstructorChaining {

    //Initialising three variables required for Student Data
    private int stuID;
    private String stuName;
    private int stuAge;

    //First constructor with integer argument for StuID and default values for other variables
    public ConstructorChaining(int ID) {
        stuID = ID;
        stuName = "NewStudent";             //Default Name
        stuAge = 18;                        //Minimum age
    }

    /**
     * Second Constructor which is calling the first one by using the concept of 'Constructor
     * chaining'. In order to call the first constructor this() must always be the first statement
     * otherwise compiler will show error
     * @param num1 A integer argument to declare StudID
     * @param str  A String argument to declare name of the student
     * @param num2 A integer argument to declare Age of student
     */
    public ConstructorChaining(int num1, String str, int num2) {
        this(num1);                         //This statement is calling the constructor which have single integer argument
        stuName = str;
        stuAge = num2;
    }

    //Method to print the fields of the object of class StudentData.
    private void printStudentData(){
        System.out.printf("Student ID: %d\n", this.stuID);
        System.out.printf("Student Name: %s\n", this.stuName);
        System.out.printf("Student Age: %d\n\n", this.stuAge);
    }

    public static void main(String[] args){
        ConstructorChaining sampleObj1 = new ConstructorChaining(1001);
        ConstructorChaining sampleObj2 = new ConstructorChaining(1002, "Manish Goyal", 21);
        sampleObj1.printStudentData();
        sampleObj2.printStudentData();
    }
}