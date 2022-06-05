package Uebungen_4.Konto;

import org.w3c.dom.ls.LSOutput;

public class Demo {
    public static void main(String[] args) {

    SparKonto sk = new SparKonto("Karolina");
    Konto k = new Konto("Anna");
    JugendGiroKonto jgk = new JugendGiroKonto("Hansi", 0.0,500.0);
    GiroKonto gk = new GiroKonto("Helene", 1000);

        System.out.println(sk.auszahlen(4000));

    }

}
