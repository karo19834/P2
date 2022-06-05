package Uebung_5.HousePlan;

public class Door extends RoomOpening{

   private Room r1;
   private Room r2;

    public Door(double posx, double posy, double width, double height, Room r1, Room r2) {
        super(posx, posy, width, height);
        this.r1 = r1;
        this.r2 = r2;
    }
}
