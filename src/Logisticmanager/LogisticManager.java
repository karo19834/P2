package Logisticmanager;

import java.util.ArrayList;

public class LogisticManager {

    private ArrayList <Movable> manager;

    public LogisticManager() {
        manager = new ArrayList<>();
    }


    public void add( Movable m){
        manager.add(m);
    }


    public void moveAll ( String destination){
        for (Movable m : manager){
            m.move(destination);
        }
    }
}
