package Uebung_5.HousePlan;

public class Window extends  RoomOpening{

    private boolean canBeOpened;

    public Window(double posx, double posy, double width, double height, boolean canBeOpened) {
        super(posx, posy, width, height);
        this.canBeOpened = canBeOpened;
    }

}
