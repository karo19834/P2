package Hasen;

public class HaseApp {
    public static void main(String[] args) {

        Hase h = new Hase("Kalinka");
        Weihnachtshase wh = new Weihnachtshase("Berta");
        Osterhase oh = new Osterhase("Macci");
        HasenStall hs = new HasenStall();

        wh.fressen();
        oh.schlafen();
        h.hoppeln();
        oh.versteckeOstereier();
        wh.verteileGeschenke();
        wh.hoppeln();

        Hase hase1 = wh;
        hase1.hoppeln();

        Osterhase oster2 = (Osterhase) hase1;


        hs.addHase( h);
        hs.addHase(wh);
        hs.addHase(oh);

        hs.hoppelAll();


    }
}

