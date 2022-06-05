package Uebung_5.HousePlan;

public class BalconyDoor extends  Door{

    private boolean tiltable;

    public BalconyDoor(double posx, double posy, double width, double height, Room r1,  boolean tiltable) {
        super(posx, posy, width, height, r1, null);
        this.tiltable = tiltable;
    }
}
