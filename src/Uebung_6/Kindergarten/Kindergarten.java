package Uebung_6.Kindergarten;

import java.util.ArrayList;

public class Kindergarten {

    private String klasse;
    private ArrayList<Kind> kinder;

    public Kindergarten(String klasse ) {
        this.klasse = klasse;
        this.kinder = new ArrayList<>();
    }

    public void addKind (Kind k){
        kinder.add(k);
    }

    public ArrayList<Kind> sortAlphabetical(){
        kinder.sort(new AlphabeticalComparator());
        return kinder;
    }

    public ArrayList<Kind> sortAge(){
        kinder.sort(new AgeComparator());
        return kinder;
    }

    public String getKlasse() {
        return klasse;
    }

    public ArrayList<Kind> getKinder() {
        return kinder;
    }

    @Override
    public String toString() {
        return "Kindergarten{" +
                "klasse='" + klasse + '\'' +
                ", kinder=" + kinder +
                '}';
    }
}
