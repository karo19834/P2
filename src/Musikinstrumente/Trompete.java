package Musikinstrumente;

public class Trompete extends Instrument{
    public  Trompete(int l){
        super(l);
    }

    @Override
    public int play() {
        System.out.println("Trompete spiellt fruuufruuuu");
        return lautstaerke ++;
    }
}
