package Musikinstrumente;

public class Klarinette extends  Instrument{
    public Klarinette (int l){
        super(l);
    }

    @Override
    public int play() {
        System.out.println("Klarinette spiellt dzyyyndzyyyn");
        return lautstaerke++;
    }
}
