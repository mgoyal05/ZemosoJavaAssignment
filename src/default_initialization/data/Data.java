package default_initialization.data;

/**
 * @author Manish
 * Data class to explain the difference between local and instance variable initialisation
 */
public class Data {
    /**
     * Uninitialised member variable are declared
     */
    private int sampleInt;
    private char sampleChar;

    /**
     * <p>Method to print char and int member variable of Data object</p>
     */
    public void printVariable() {
        System.out.println(sampleInt + sampleChar);         //Instance variable need not to be initialise
    }

    /**
     * Method to print two local variables created inside method
     */
    public void printLocal() {
        int localInt;
        char localChar;

        //System.out.println(localInt+localChar);           //ERROR!!!
        /**
         * LOCAL VARIABLES NEED TO BE INITIALISED BEFORE USE BUT NOT INSTANCE VARIABLE AS
         * WITH THEM WE DON'T KNOW IN WHICH SEQUENCE THEY WILL BE CALLED SO TO AVOID ANY
         * ERROR IT IS ASSIGNED DEFAULT VALUES.
         */
    }

    public static void main(String[] args) {
        Data obj = new Data();
        obj.printVariable();

        obj.printLocal();
    }
}
