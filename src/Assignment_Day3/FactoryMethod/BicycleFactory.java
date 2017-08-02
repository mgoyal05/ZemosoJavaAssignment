package Assignment_Day3.FactoryMethod;

/**
 * @author Manish Goyal
 * Class BicycleFactory which implements CycleFactory Interface and define body of its method
 */
public class BicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}
