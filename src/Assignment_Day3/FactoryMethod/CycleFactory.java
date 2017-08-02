package Assignment_Day3.FactoryMethod;

/**
 * @author Manish Goyal
 * Interface CycleFactory which will act like a link between classes containing
 * Cycle Ineterface and classes containing CycleFacoty Interface
 */
public interface CycleFactory {

     Cycle getCycle();
}
