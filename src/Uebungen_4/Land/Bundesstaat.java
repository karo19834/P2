package Uebungen_4.Land;

import java.util.ArrayList;

public class Bundesstaat extends  Land{

    private ArrayList<Land> laender = new ArrayList<>();

    public void add (Land l){
        laender.add(l);
    }

    @Override
    public double getBruttoSozialProdukt() {
        double suma=0;
        for (Land l: laender) {
            suma += l.getBruttoSozialProdukt();
        }
        return suma;
    }
}


