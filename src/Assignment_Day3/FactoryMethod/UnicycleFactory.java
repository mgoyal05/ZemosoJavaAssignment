package Assignment_Day3.FactoryMethod;

/**
 * @author Manish Goyal
 * Class TricycleFactory which implements CycleFactory Interface and define body of its method
 */
public class UnicycleFactory implements CycleFactory {

    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
