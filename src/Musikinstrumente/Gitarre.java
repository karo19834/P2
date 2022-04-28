package Musikinstrumente;

public class Gitarre extends Instrument{
    public Gitarre (int l){
        super(l);
    }

    @Override
    public int play() {
        System.out.println("Gitarre spiellt srututututu");
        return lautstaerke;
    }

}
