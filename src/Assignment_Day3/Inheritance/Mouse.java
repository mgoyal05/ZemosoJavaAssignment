package Assignment_Day3.Inheritance;

public class Mouse extends Rodent {

    @Override
    public String behaviour() {
        return"small rounded ears, a body-length scaly tail and a high breeding rate.";
    }

    @Override
    public String getFamily() {
        return "Muridae";
    }

    public Mouse() {
        System.out.println("This class is about Mouse");
    }

    public Mouse(int lifeSpan, int mass) {
        super(lifeSpan, mass);
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "family='" + this.getFamily() + '\'' +
                ", lifeSpan=" + this.getLifeSpan() +
                ", mass=" + this.getMass() +
                ",  behaviour='" + this.behaviour() + '\'' +
                '}';
    }

    public static void main(String[] args){
        Mouse sampleObject = new Mouse(5,40);
        System.out.println(sampleObject.toString());
    }
}
