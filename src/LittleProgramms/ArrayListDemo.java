package LittleProgramms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Osterhase> mauritius = new ArrayList<>();// erste collection

        Osterhase karl = new Osterhase("Karl von Karligen",1000, HasenReligion.EXTRA_BUNTE_OSTEREIER);
        Osterhase karla = new Osterhase("Karla Kolumna", 111, HasenReligion.ZUR_HEILIGEN_KAROTTE);
        Osterhase uschi = new Osterhase( "Uschi mit den langen Ohren",7777,HasenReligion.LANGE_OHREN_ZEUGEN);

        // fügen hinten elemente hinzu
        mauritius.add(karl);
        mauritius.add(karla);
        mauritius.add(uschi);

        //alle durchlaufen
        for ( int h=0; h< mauritius.size(); ++h){
            System.out.println(mauritius.get(h));
        }



        //an welche stelle ist karla
        System.out.println( mauritius.indexOf(karla));

        //Iterator verwenden
        Iterator<Osterhase> iter = mauritius.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //karl redet ganzen tg nur von der jagd und wird aus insel gejagt
        //entfernen objekt aus collection
        mauritius.remove(karl);
        System.out.println("-------------------------------------------------------");

        //ist karl wirklich weg?
        for ( Osterhase oh: mauritius){  //recht daten die wir durchgehen möchten, links eine neue hilfsvariable (index)
            System.out.println(oh);
        }
    }
}
