package Uebung_5.Getraenke;

public abstract class Getraenk implements  Brennbar{

    protected String name;

    abstract int getAnzahlZutaten();
    abstract boolean beinhaltetAlkohol();
    abstract double mengeInMl();

    public Getraenk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Getraenk{" +
                "name='" + name + '\'' +"ilosc skladnikow"+
                getAnzahlZutaten()+ "alkohol"+ beinhaltetAlkohol()+"palacy"+ brennt()+
                '}';
    }
}
