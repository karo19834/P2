package Musikinstrumente;

import java.util.ArrayList;

public class Orchester {

    public ArrayList<Instrument> orchester;

    public Orchester(){
        orchester = new ArrayList<>();
    }

    public void addInstrumente (Instrument i){
        orchester.add(i);
    }

    public int playAll(){
        int l = 0;
        for (Instrument i : orchester){
            l = l + i.play();
        }
        return l;
    }
}
