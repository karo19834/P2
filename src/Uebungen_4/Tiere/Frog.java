package Uebungen_4.Tiere;

public class Frog extends Animal{

    @Override
    public void walk() {
        System.out.println("Zabki skacza ");
    }

    @Override
    public void makeNoise() {
        System.out.println("Zabki robia rere kum kum ");
    }

    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public String toString() {
        return "Frog{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
