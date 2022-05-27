package PegelVerwaltung;

public class WasserApp {
    public static void main(String[] args) {

        Wasserstand w1 = new Wasserstand(12,"Mur","Graz",2.3,3.5, 300 );
        Wasserstand w2 = new Wasserstand(11,"Donau","Wien",5.8,9.7, 600 );
         WasserstandManager wm = new WasserstandManager();
         wm.addStand(w1);
         wm.addStand(w2);
        System.out.println(wm);

       //System.out.println(wm.findById(11));
        System.out.println(wm.findAllByGewaesser("Mur"));




    }
}
