package Uebung_5.Getraenke;

import java.util.ArrayList;

public class Coctail extends Getraenk{

    protected ArrayList<Fluessigkeit> bestandteile;

    public Coctail(String name, ArrayList<Fluessigkeit> bestandteile) {
        super(name);
        this.bestandteile = bestandteile;
    }

    private double ileAlkoholu(){
        double suma=0;
        for (Fluessigkeit f:bestandteile) {
            suma += f.getAlkoholProzent()* f.getMenge();
        }
        return suma;
    }

    @Override
    public boolean brennt() {
        return ileAlkoholu()/mengeInMl()>0.3;
    }

    @Override
    int getAnzahlZutaten() {
        return bestandteile.size();
    }

    @Override
    boolean beinhaltetAlkohol() {
        return ileAlkoholu()>0;
    }

    @Override
    double mengeInMl() {
        double suma=0;
        for (Fluessigkeit f:bestandteile) {
            suma += f.getMenge();
        }
        return suma;
    }
}
