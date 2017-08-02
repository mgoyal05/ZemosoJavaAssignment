package Assignment_Day3.Inheritance;

abstract public class Rodent {

    private String family;
    private int lifeSpan;
    private int mass;
    public abstract String behaviour();

    public Rodent() {
        System.out.println("An example to show inheritance");
    }

    public Rodent(int lifeSpan, int mass) {
        this.lifeSpan = lifeSpan;
        this.mass = mass;
    }

    public String getFamily() {
        return this.family;
    }

    public int getLifeSpan() {
        return this.lifeSpan;
    }

    public int getMass() {
        return mass;
    }

    public static void main(String[] args){
        Rodent[] arrayOfRodent = {new Gerbil(), new Mouse(5,40), new Hamster(3,120)} ;
        for( Rodent i : arrayOfRodent){
            System.out.println(i.toString());
        }
    }
}
