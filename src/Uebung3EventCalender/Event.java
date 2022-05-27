package Uebung3EventCalender;

public class Event {

    private String title;
    private String ort;
    private double price;

    public Event(String title, String ort, double price) {
        this.title = title;
        this.ort = ort;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", ort='" + ort + '\'' +
                ", price=" + price +
                '}';
    }
}
