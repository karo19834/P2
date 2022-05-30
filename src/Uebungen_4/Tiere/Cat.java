package Uebungen_4.Tiere;

public class Cat extends Animal{
    protected String name;

    public void walk() {
        System.out.println("Kotki chodza ");
    }

    @Override
    public void makeNoise() {
        System.out.println("Kotki miaucza ");
    }

    public String getName() {
        return name;
    }

    public Cat(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                ", name='" + name + '\'' +
                '}';
    }
}
