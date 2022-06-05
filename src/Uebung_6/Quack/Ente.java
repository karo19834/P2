package Uebung_6.Quack;

public abstract class Ente implements  Comparable<Ente>{

    protected String name;
    protected double gewicht;

    public Ente(String name, double gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    @Override
    public int compareTo(Ente o) {
        return this.getFullWeight()-o.getFullWeight();
    }

    public abstract  int getFullWeight();

    public abstract  String makeNoise();

    @Override
    public String toString() {
        return "Ente{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}
