package Musikinstrumente;

public class Geige extends  Instrument{
    public Geige (int l){
        super(l);
    }

    @Override
    public int play() {
        System.out.println("Geige spiellt grrrwrrrrggg");
        return lautstaerke;
    }
}
