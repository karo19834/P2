package Uebung3EventCalender;

import java.util.ArrayList;
import java.util.HashMap;

public class EventCalender {

    private ArrayList<Event> events = new ArrayList<>();


    public void add(Event e){
        events.add(e);
    }

    public Event getByTitle(String title){
        for ( Event e: events ) {
            if ( e.getTitle().equals(title)){
                return e;
            }
        }
        return null;
    }

    public ArrayList<Event> getByOrt(String ort) {
        ArrayList<Event> impreza= new ArrayList<>();
        for ( Event e : events) {
            if ( e.getOrt().equals(ort)){
                impreza.add(e);
            }
        }
        return impreza;
    }

    public ArrayList<Event> getByEintrittsPreis(double min, double max) {
        ArrayList<Event> impreza= new ArrayList<>();
        for ( Event e : events) {
            if ( e.getPrice()>= min && e.getPrice()<= max){
                impreza.add(e);
            }
        }
        return impreza;
    }

    public Event getMostExpensiveByOrt( String ort){
        double max= Double.MIN_VALUE;
        Event maxi = null;
        for ( Event e: getByOrt(ort)) {
            if ( e.getPrice()> max){
                max= e.getPrice() ;
                maxi =e;
            }
        }
        return maxi;
    }
    public double getAvgPreisByOrt(String ort){
        ArrayList<Event> eventsForOrt = getByOrt(ort);

        if (eventsForOrt.isEmpty()){
            return 0;
        }

        double sum= 0;
        for (Event e: eventsForOrt) {
            sum += e.getPrice();
        }
        return sum / eventsForOrt.size();
    }

    public HashMap<String, Integer> getCountEventsByOrt(){

        HashMap<String,Integer> map =new HashMap<>();

        for (Event e: events) {
            Integer ilosc = map.get(e.getOrt());
            if (ilosc ==null){
                ilosc=1;
            } else {
                ilosc++;
            }
            map.put(e.getOrt(), ilosc);
        }
        return map;
    }

    public HashMap<String, Double> getSumPriceEventsByOrt(){

        HashMap<String,Double> map =new HashMap<>();

        for (Event e: events) {
            Double suma = map.getOrDefault(e.getOrt(),0.0);
            suma += e.getPrice();
            map.put(e.getOrt(), suma);
        }
        return map;
    }

    @Override
    public String toString() {
        return "EventCalender{" +
                "events=" + events +
                '}';
    }
}
