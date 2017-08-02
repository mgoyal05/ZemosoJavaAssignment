package Assignment_Day3.Interface;

public class InterfaceTest {

    /**
     *
     * @param sampleProf A Professor argument to execute its two method defined in its interface
     */
    public void methodOne(Professor sampleProf){
        sampleProf.experience();
        sampleProf.subject();
    }

    /**
     *
     * @param sampleStaff
     */
    public void methodTwo(Staff sampleStaff){
        sampleStaff.section();
        sampleStaff.strength();
    }

    /**
     *
     * @param sampleStudent
     */
    public void methodThree(Student sampleStudent){
        sampleStudent.age();
        sampleStudent.name();
    }

    /**
     *
     * @param CI
     */
    public void methodFour(CombinedInterface CI){
        CI.combinedInterfaceMethod();
    }

    public static void main(String[] args){

        //Sample Object of class InterfaceTest
        InterfaceTest sampleObj = new InterfaceTest();

        //Sample Object of class School
        School sampleObjMainClass = new School();

        /*All four Methods of class InterfaceTest are executed by taking argument of class
          School(Upcasting)
         */
        sampleObj.methodOne(sampleObjMainClass);
        sampleObj.methodTwo(sampleObjMainClass);
        sampleObj.methodThree(sampleObjMainClass);
        sampleObj.methodFour(sampleObjMainClass);

        //Method of base class is called by using the principle of inheritance
        sampleObjMainClass.printParentClass();
    }
}
