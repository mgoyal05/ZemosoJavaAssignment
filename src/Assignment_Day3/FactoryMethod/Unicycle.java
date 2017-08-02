package Assignment_Day3.FactoryMethod;

/**
 * @author Manish Goyal
 * Class Unicycle which implements Cycle Interface and define body of its two method
 */
public class Unicycle implements Cycle {

    @Override
    public void speed() {
        System.out.println("Speed of Unicycle is great!!");
    }

    @Override
    public void ride() {
        System.out.println("Please ride this Unicycle");
    }
}
