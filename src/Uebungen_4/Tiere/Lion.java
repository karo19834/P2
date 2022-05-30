package Uebungen_4.Tiere;

public class Lion extends Animal{

    public void roar(){
        System.out.println("Lwy rycza ");
    }

    public void walk() {
        System.out.println("Lwy biegaja ");
    }

    @Override
    public void makeNoise() {
        System.out.println("Lwy miaucza ");
    }

    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
