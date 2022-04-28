package Musikinstrumente;

public abstract class Instrument {
    protected int lautstaerke;
   // protected String name;

    public Instrument (int l){
        lautstaerke = l;
    }
    public abstract int play();
}
