package Assignment_Day3.Upcast_Downcast;

/**
 * @author Manish Goyal
 * Assignment_Day3.FactoryMethod.Cycle class to test some cases for upcasting and downcasting
 */
public class Cycle {

    public static void main(String[] args){

        //Initialising and declaring objects of their respective subclasses
        Bicycle sampleBicycle = new Bicycle();
        Unicycle sampleUnicycle = new Unicycle();
        Tricycle sampleTricycle = new Tricycle();

        //Upcasting them to an array of superclass Assignment_Day3.FactoryMethod.Cycle
        Cycle[] arrayOfCycle = {sampleUnicycle, sampleBicycle, sampleTricycle};

        /**
         * CALLING BALANCE METHOD ON EACH ELEMENT PRODUCES ERROR AS EACH ELEMENT IS UPCASTED
         * SO THEY WILL EXECUTE METHODS ONLY WHICH ARE PRESENT IN SUPER-CLASS.
         */
        //arrayOfCycle[0].balance_Unicycle();
        //arrayOfCycle[1].balance_Bicycle();
        //arrayOfCycle[2].balance_Tricycle();
        ((Unicycle)arrayOfCycle[0]).balance_Unicycle();
        ((Bicycle)arrayOfCycle[1]).balance_Bicycle();

        /**
         * CALLING BALANCE METHOD FOR TRICYCLE WILL ALSO PRODUCE ERROR AS THIS ELEMENT IS
         * DOWNCASTED TO ACT AS A OBJECT OF TRICYCLE AND THERE IS NO METHOD CALLED "BALANCE_TRICYCLE".
         */
        //((Tricycle)arrayOfCycle[2]).balance_Tricycle();

    }

}
