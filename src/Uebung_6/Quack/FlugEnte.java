package Uebung_6.Quack;

import org.w3c.dom.ls.LSOutput;

public class FlugEnte extends Ente{

    protected  double gewichtFedern;

    public FlugEnte(String name, double gewicht, double gewichtFedern) {
        super(name, gewicht);
        this.gewichtFedern = gewichtFedern;
    }

    public double getGewichtFedern() {
        return gewichtFedern;
    }

    public void setGewichtFedern(double gewichtFedern) {
        this.gewichtFedern = gewichtFedern;
    }

    @Override
    public int getFullWeight() {
        return (int)Math.round(gewicht+gewichtFedern);
    }

    @Override
    public String makeNoise() {
        return "Kwa kwa latam";
    }

    @Override
    public String toString() {
        return "FlugEnte{" +
                "name='" + name + '\'' +
                ", gewicht=" + gewicht +
                ", gewichtFedern=" + gewichtFedern +
                '}';
    }
}
