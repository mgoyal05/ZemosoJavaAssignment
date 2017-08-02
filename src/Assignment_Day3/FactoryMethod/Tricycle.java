package Assignment_Day3.FactoryMethod;

/**
 * @author Manish Goyal
 * Class Tricycle which implements Cycle Interface and define body of its two method
 */
public class Tricycle implements Cycle {

    @Override
    public void speed() {
        System.out.println("Speed of Tricycle is great!!");
    }

    @Override
    public void ride() {
        System.out.println("Please ride this Tricycle");
    }
}
