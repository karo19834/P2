package Uebung_6.Quack;

import java.util.*;

public class EntenHausen {

    private ArrayList<Ente> alleEnten;

    public EntenHausen(ArrayList<Ente> alleEnten) {
        this.alleEnten = new ArrayList<>();
    }

    public void addEnte(Ente e){
        alleEnten.add(e);
    }

    public Map<Integer, List<Ente>> getGruppierteEnten(){
        Map<Integer, List<Ente>> mapa = new HashMap<>();
        mapa.put(100, new LinkedList<>());
        mapa.put(200, new LinkedList<>());
        mapa.put(300, new LinkedList<>());
        for ( Ente e: alleEnten) {
            if ( e.getFullWeight()<=100){
                mapa.get(100).add(e);
            }else if( e.getFullWeight()>100 && e.getFullWeight()<=200){
                mapa.get(200).add(e);
            }else {
                mapa.get(300).add(e);
            }
        }
        return mapa;
    }

    public ArrayList<Ente> getAlleEnten() {
        return alleEnten;
    }

    public void setAlleEnten(ArrayList<Ente> alleEnten) {
        this.alleEnten = alleEnten;
    }

    @Override
    public String toString() {
        return "EntenHausen{" +
                "alleEnten=" + alleEnten +
                '}';
    }
}
