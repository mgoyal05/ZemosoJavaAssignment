package Assignment_Day3.Interface;

/**
 * @author Manish Goyal
 * A Combined Interface of three interfaces(Professor, Staff, Student) acting as
 * superinterface of this interface(CombinedInterface)
 */
public interface CombinedInterface extends Professor, Student, Staff {

    void combinedInterfaceMethod();
}
