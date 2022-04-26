package Musikinstrumente;

public class Demo {
    public static void main(String[] args) {

        Gitarre git = new Gitarre(3);
        Klarinette kla = new Klarinette(5);
        Trompete t = new Trompete(8);
        Geige g = new Geige(2);
        Orchester o = new Orchester();

        o.addInstrumente(git);
        o.addInstrumente(kla);
        o.addInstrumente(t);
        o.addInstrumente(g);


        System.out.println(o.playAll());
    }
}
