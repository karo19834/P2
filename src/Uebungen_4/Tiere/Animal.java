package Uebungen_4.Tiere;

public  class Animal {

    protected  String color;
    protected int countEyes;

    public void walk() {
    }
    public void makeNoise(){

    }


    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountEyes() {
        return countEyes;
    }

    public void setCountEyes(int countEyes) {
        this.countEyes = countEyes;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
