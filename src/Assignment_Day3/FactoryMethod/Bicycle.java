package Assignment_Day3.FactoryMethod;

/**
 * @author Manish Goyal
 * Class Bicycle which implements Cycle Interface and define body of its two method
 */
public class Bicycle implements Cycle {

    @Override
    public void speed() {
        System.out.println("Speed of Bicycle is great!!");
    }

    @Override
    public void ride() {
        System.out.println("Please ride this Bicycle");
    }
}
