package Uebung_5.HousePlan;

public class HouseDoor extends Door{

    private boolean  securityDoor;

    public HouseDoor(double posx, double posy, double width, double height, Room r1,  boolean securityDoor) {
        super(posx, posy, width, height, r1, null);
        this.securityDoor = securityDoor;
    }
}
