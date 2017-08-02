package Assignment_Day3.Inheritance;

public class Hamster extends Rodent{

    @Override
    public String behaviour() {
        return"a body-length scaly tail and a high breeding rate.";
    }

    @Override
    public String getFamily() {
        return "Roboskvie";
    }

    public Hamster() {
        System.out.println("This class is about Hamster");
    }

    public Hamster(int lifeSpan, int mass) {
        super(lifeSpan, mass);
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "family='" + this.getFamily() + '\'' +
                ", lifeSpan=" + this.getLifeSpan() +
                ", mass=" + this.getMass() +
                ",  behaviour='" + behaviour() + '\'' +
                '}';
    }

    public static void main(String[] args){
        Hamster sampleObject = new Hamster(6,120);
        System.out.println(sampleObject.toString());
    }
}
