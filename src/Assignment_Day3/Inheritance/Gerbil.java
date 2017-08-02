package Assignment_Day3.Inheritance;
public class Gerbil extends Rodent{

    @Override
    public String behaviour() {
        return"Gerbils are social animals, and live in groups in the wild.";
    }


    @Override
    public String getFamily() {
        return "Muridae";
    }

    public Gerbil() {
        System.out.println("This class is about Gerbil");
    }

    public Gerbil(int lifeSpan, int mass) {
        super(lifeSpan, mass);
    }



    @Override
    public String toString() {
        return "Gerbil{" +
                "family='" + this.getFamily() + '\'' +
                ", lifeSpan=" + this.getLifeSpan() +
                ", mass=" + this.getMass() +
                ",  behaviour='" + behaviour() + '\'' +
                '}';
    }

    public static void main(String[] args){
        Gerbil sampleObject = new Gerbil(4,20);
        System.out.println(sampleObject.toString());
    }
}
