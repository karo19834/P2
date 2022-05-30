package Uebungen_4.Tiere;

public class Dog extends  Animal{

    protected String name;

    public void walk() {
        System.out.println("Pieski chodza ");
    }

    @Override
    public void makeNoise() {
        System.out.println("Pieski szczekaja ");
    }

    public Dog(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                ", name='" + name + '\'' +
                '}';
    }
}
