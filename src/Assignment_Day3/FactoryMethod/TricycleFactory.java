package Assignment_Day3.FactoryMethod;

/**
 * @author Manish Goyal
 * Class TricycleFactory which implements CycleFactory Interface and contains method which
 * return an object of class Tricycle
 */
public class TricycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
