package Assignment_Day3.FactoryMethod;

/**
 *
 */
public class CyclesMain {

    /**
     * A Static Method to call the methods of an object based on the CycleFactory's subInterface which is called
     * @param factory A CycleFactory Argument which creates an object of Interface type cycle
     */
    public static void callCycle(CycleFactory factory){

        //Based on which CycleFactory subInterface is the argument, that type of object will be initialised even though the method is same
        Cycle sampleCycle = factory.getCycle();
        sampleCycle.ride();
        sampleCycle.speed();
    }

    public static void main(String[] args){

        /*
        By Upcasting the subclasses to act as their superInterface, different code will be
        executed for the same method Isolating completely from the implementation of interface.
        This method of designing code is known as 'Assignment_Day3.FactoryMethod Method'.
         */
        callCycle(new UnicycleFactory());               //Will execute methods of class Unicycle
        callCycle(new BicycleFactory());                //Will execute methods of class Bicycle
        callCycle(new TricycleFactory());               //Will execute methods of class Tricycle
    }
}
