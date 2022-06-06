package Uebung_5.HousePlan;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class House {

    public   Map<RoomType, List<Room>> rooms;


    public void addRoom(Room r){
        RoomType rt = r.getTypPomieszczenia();
        if (rooms.containsKey(rt)){
            rooms.get(rt).add(r);
        }else{
            List<Room> temp = new ArrayList<>();
            temp.add(r);
            rooms.put(rt, temp);
        }
    }
    public double getWindowAreaFacingOrientation(Orientation o){
        double totalArea=0;
        for ( List<Room> lr:rooms.values()) {
            for ( Room r: lr) {
                for (RoomOpening ro:r.getOpenings().get(o)) {
                    if (ro instanceof Window ){
                        totalArea += ro.getHeight() * ro.getWidth();
                    }
                }
            }
        }
        return totalArea;
    }

//    public int getNumberOfOpeningsInRoomType(RoomType r){
//
//    }
//
//    public List<Room> getAllConnectedRooms(Room r){
//
//    }
}
