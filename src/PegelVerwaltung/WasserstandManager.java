package PegelVerwaltung;

import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList<Wasserstand> wasserStand = new ArrayList<>();

    public WasserstandManager(ArrayList<Wasserstand> wasser) {
        this.wasserStand = wasser;
    }

    public WasserstandManager() {

    }

    public void addStand ( Wasserstand w){
        wasserStand.add(w);
    }

    public Wasserstand findById ( int id){

        for ( Wasserstand w: wasserStand) {
            if ( w.getId() == id){
                return w;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser( String gewaesserName){
        ArrayList<Wasserstand> gewaesser= new ArrayList<>();
        for ( Wasserstand w: wasserStand) {
            if ( w.getGewaesserName().equals(gewaesserName)){
                gewaesser.add(w);
            }
        }
        return gewaesser;
    }

//    public Wasserstand findLastWasserstand(String gewaesserName){
//
//    }



    @Override
    public String toString() {
        return "WasserstandManager{" +
                "wasser=" + wasserStand +
                '}';
    }
}
