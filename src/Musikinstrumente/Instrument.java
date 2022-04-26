package Musikinstrumente;

public abstract class Instrument {
    public int lautstaerke;

    public Instrument (int l){
        lautstaerke = l;
    }
    public abstract int play();
}
