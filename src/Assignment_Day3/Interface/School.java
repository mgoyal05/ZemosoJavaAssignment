package Assignment_Day3.Interface;

/**
 * @author Manish Goyal
 * A School class which implements the subinterface of three superinterfaces and also act
 * as a subclass of ConcreteClass
 */
public class School extends ConcreteClass implements CombinedInterface {

    //Body of all the methods of Interfaces
    @Override
    public void subject() {
        System.out.println("Subject taught by professor");
    }

    @Override
    public void experience() {
        System.out.println("Experience of Professor");
    }

    @Override
    public void strength() {
        System.out.println("Strength of Class");
    }

    @Override
    public void section() {
        System.out.println("Section of class");
    }

    @Override
    public void name() {
        System.out.println("Name of Student");
    }

    @Override
    public void age() {
        System.out.println("Age of Student(in Years)");
    }

    @Override
    public void combinedInterfaceMethod() {
        System.out.println("This interface is used to combine other three interface");
    }
}
