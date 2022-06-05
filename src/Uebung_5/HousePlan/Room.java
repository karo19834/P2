package Uebung_5.HousePlan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Room {

    private RoomType typPomieszczenia;
    private double area;
    private Map<Orientation, List<RoomOpening>> openings = new HashMap<>();

    public Room(RoomType typPomieszczenia, double area) {
        this.typPomieszczenia = typPomieszczenia;
        this.area = area;
    }

    public  void addOpening(Orientation o, RoomOpening ro ){
        List<RoomOpening> temp = openings.get(o);
        if (temp== null){
            temp = new ArrayList<>();
            temp.add(ro);
            openings.put(o, temp);
        }else{
            temp.add(ro);
        }
    }

    public RoomType getTypPomieszczenia() {
        return typPomieszczenia;
    }

    public double getArea() {
        return area;
    }

    public Map<Orientation, List<RoomOpening>> getOpenings() {
        return openings;
    }
}
