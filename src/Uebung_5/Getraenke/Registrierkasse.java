package Uebung_5.Getraenke;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Registrierkasse {

    private  ArrayList<Getraenk> getraenke = new ArrayList<>();
    static int verkaufteGetraenke;


    public void verkauft(Getraenk g){
        getraenke.add(g);
        ++verkaufteGetraenke;
    }

    public void printGetraenkeSortiertNachAnzahlZutaten(){
        getraenke.sort(new AnzahlZutatenComparator().reversed());
        for (Getraenk g:getraenke) {
            System.out.println(g);
        }
    }

    public void printGetraenkeSortiertNachMl(){
        getraenke.sort(new Comparator<Getraenk>() {
            @Override
            public int compare(Getraenk o1, Getraenk o2) {
                return Double.compare(o1.mengeInMl(),o2.mengeInMl());
            }
        });
    }
    public HashMap<Integer, ArrayList<Getraenk>> getGetraenkeAufgeteiltNachZutaten(){

        HashMap<Integer, ArrayList<Getraenk>> mapa = new HashMap<>();
        ArrayList<Getraenk> temp;

        for (Getraenk g : getraenke) {
            temp= mapa.get(g.getAnzahlZutaten());
            if (temp==null){
                temp= new ArrayList<>();
                temp.add(g);
                mapa.put(g.getAnzahlZutaten(), temp);
            }else{
                temp.add(g);
            }
        }
        return mapa;
    }

    public static int getVerkaufteGetraenke() {
        return verkaufteGetraenke;
    }

    @Override
    public String toString() {
        return "Registrierkasse{" +
                "getraenke=" + getraenke +
                '}';
    }
}

class AnzahlZutatenComparator implements Comparator<Getraenk>{

    @Override
    public int compare(Getraenk o1, Getraenk o2) {
        return o1.getAnzahlZutaten()-o2.getAnzahlZutaten();
    }
}

