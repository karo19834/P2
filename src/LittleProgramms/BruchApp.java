package LittleProgramms;

public class BruchApp {
    public static void main(String[] args) {

        Bruch fraktion = new Bruch( 8,10);
        Bruch b2 = new Bruch(1,2);
        Bruch b3 = new Bruch( 2,5);

        System.out.println( fraktion.getNumerator());
        System.out.println( ( fraktion.getDenominator()));


        System.out.println( fraktion.toDezimal());

        fraktion.print();

        fraktion.multiplicate(b2).print();

        fraktion.multiplicate(b2,b3).print();

        fraktion.add(b2).print();

        System.out.println(Bruch.getNrFraction());





    }
}
