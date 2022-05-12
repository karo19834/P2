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
        for (int i = 0; i < wasserStand.size(); i++) {
            if ( wasserStand.contains(id)){
                return wasserStand.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "WasserstandManager{" +
                "wasser=" + wasserStand +
                '}';
    }
}
