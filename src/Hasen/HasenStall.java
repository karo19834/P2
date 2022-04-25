package Hasen;

import java.util.ArrayList;

public class HasenStall {
    private ArrayList<Hase> all;

    public HasenStall (){
        all = new ArrayList<>();
    }

    public void addHase (Hase h){
        all.add(h);
    }

    public void hoppelAll(){
        for ( Hase h : all){
            h.hoppeln();
        }
    }
}
