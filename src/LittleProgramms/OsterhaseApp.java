package LittleProgramms;

public class OsterhaseApp {
    public static void main(String[] args) {
        Osterhase dieter = new Osterhase("Dieter ( aka Hansi)", 77 );
        Osterhase marla = new Osterhase("Marla");

        System.out.println(marla.getName());
        System.out.println( marla.getAnzahlVersteckeEier());

//        dieter.setAnzahlVersteckeEier(5);
//        dieter.setName( "Dieter ( formerly Hansi)");
        System.out.println( dieter.getAnzahlVersteckeEier());

        dieter.aendereAnzahlEier();
        System.out.println( dieter.getAnzahlVersteckeEier());
        System.out.println( dieter.getName());

        // möchte ein ei dazu
        dieter.setAnzahlVersteckeEier(dieter.getAnzahlVersteckeEier()+1);
        System.out.println( dieter.getAnzahlVersteckeEier());


    }
}
