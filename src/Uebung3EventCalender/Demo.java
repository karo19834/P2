package Uebung3EventCalender;

public class Demo {
    public static void main(String[] args) {

        Event e1 = new Event("Technoparty", "Graz", 340.50);
        Event e2 = new Event("Discopolo", "Wien", 240.70);
        Event e3 = new Event("Reggae", "Graz", 178.70);
        Event e4 = new Event("Hansi", "Graz", 520.00);
        Event e5 = new Event("Disco", "Wien", 220.50);
        Event e6 = new Event("Mystery", "Klagenfurt", 123.40);
        Event e7 = new Event("Kinderparty", "Wien", 120.50);
        Event e8 = new Event("Tanzen", "Klagenfurt", 450.40);

        EventCalender ec = new EventCalender();

        ec.add(e1);
        ec.add(e2);
        ec.add(e3);
        ec.add(e4);
        ec.add(e5);
        ec.add(e6);
        ec.add(e7);
        ec.add(e8);
        System.out.println(ec);

        System.out.println(ec.getByTitle("Tanzen"));
        System.out.println(ec.getByOrt("Graz"));
        System.out.println(ec.getByEintrittsPreis(300.0, 500.0));
        System.out.println(ec.getMostExpensiveByOrt("Wien"));
        System.out.println(ec.getAvgPreisByOrt("Klagenfurt"));
        System.out.println(ec.getCountEventsByOrt());
        System.out.println(ec.getSumPriceEventsByOrt());

    }
}
