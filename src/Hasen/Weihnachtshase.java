package Hasen;

public class Weihnachtshase extends Hase{



    public Weihnachtshase(String name){
        super(name);
    }

    public void verteileGeschenke(){
        System.out.println(name +" verteilt Geschenke");
    }

    @Override
    public void hoppeln() {
        System.out.println(name +" hoppelt durch Schnee");
    }
}
