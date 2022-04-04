package LittleProgramms;

public class Osterhase {

    private static int haeschenZaehler =1;
    private int anzahlVersteckeEier;
    private String name;
    private  int haeschenNummer;
    private  HasenReligion persoenlicheGlaube;

    public Osterhase(String name, int anzahlVersteckteEier, HasenReligion glaube){
        this.name = name;
        this.anzahlVersteckeEier= anzahlVersteckteEier;
        haeschenNummer=haeschenZaehler++; // jeder hase muss eigene nummer haben
        persoenlicheGlaube = glaube;
    }

    public int getHaeschenNummer() {
        return haeschenNummer;
    }

    public Osterhase (String name){
        this.name = name;
        this.anzahlVersteckeEier=0;
         haeschenNummer=haeschenZaehler++;
         persoenlicheGlaube = HasenReligion.LANGE_OHREN_ZEUGEN;
     }


    //    public void aendereAnzahlEier( int anzahlVersteckteEier) {
//        if (anzahlVersteckteEier >= 0) {
    // anzahlVersteckteEier -> parameter
    // lokale variable mit gleichen namen werden bevorzugt
    // this referenz zeigt auf die aktuelle instanz

//            this.anzahlVersteckeEier = anzahlVersteckteEier;

    // methoden überladen, unterschied anzahl parameter
    // soll osterhasse dutzend eier verstecken
//        }
//    }

    public int getAnzahlVersteckeEier() {
        return anzahlVersteckeEier;
    }

    public void setAnzahlVersteckeEier(int anzahlVersteckeEier) {
        if (anzahlVersteckeEier >= 0) {
            this.anzahlVersteckeEier = anzahlVersteckeEier;
        }
    }

    public void aendereAnzahlEier() {
        anzahlVersteckeEier = 12;
    }

    //    public int gibMirAnzahlDerVerstecktenEier(){
//        return anzahlVersteckeEier;
//    }
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " versteckt " + anzahlVersteckeEier + " viele Eier und glaubt an:"+ persoenlicheGlaube;


    }
}



