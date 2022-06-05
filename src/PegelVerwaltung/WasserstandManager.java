package PegelVerwaltung;

import java.util.ArrayList;

public class WasserstandManager {

    private ArrayList<Wasserstand> wasserStaende = new ArrayList<>();



    public void addStand ( Wasserstand w){
        wasserStaende.add(w);
    }

    public Wasserstand findById ( int id){

        for ( Wasserstand w: wasserStaende) {
            if ( w.getId() == id){
                return w;
            }
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser( String gewaesserName){
        ArrayList<Wasserstand> gewaesser= new ArrayList<>();
        for ( Wasserstand w: wasserStaende) {
            if ( w.getGewaesserName().equals(gewaesserName)){
                gewaesser.add(w);
            }
        }
        return gewaesser;
    }

    public Wasserstand findLastWasserstand(String gewaesserName){
        int wynik=-1;
        Wasserstand ws= null;
        for ( Wasserstand w: findAllByGewaesser(gewaesserName)) {
            if ( w.getZeitpunkt() > wynik){
                wynik = w.getZeitpunkt();
                ws= w;
            }
        }
        return ws;
    }

    public ArrayList<Wasserstand> findForAlarmierung(){
        ArrayList<Wasserstand> alarmy = new ArrayList<>();
        for (Wasserstand w : wasserStaende) {
            if (w.getMessWert() >= w.getMessWertFuerAlarmierung()){
                alarmy.add(w);
            }
        }
        return alarmy;
    }

    public double calcMittlererWasserstand(String gewaesserName, String ort){
        double suma =0;
        int ilosc=0;
        for ( Wasserstand w: wasserStaende) {
            if ( w.getGewaesserName().equals(gewaesserName) && w.getOrt().equals(ort)){
                suma += w.getMessWert();
                ++ilosc;
            }
        }
        return suma/ilosc;
    }

    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String gewaesserName, String ort){
        ArrayList<Wasserstand> result = new ArrayList<>();
        for (Wasserstand w : wasserStaende) {
            if (w.getGewaesserName().equals(gewaesserName)
                    && w.getOrt().equals(ort)
                    && w.getZeitpunkt()>= von
                    && w.getZeitpunkt() <=bis){
                result.add(w);
            }
        }
        return result;
    }



    @Override
    public String toString() {
        return "WasserstandManager{" +
                "wasser=" + wasserStaende +
                '}';
    }
}
