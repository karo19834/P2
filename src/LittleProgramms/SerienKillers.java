package LittleProgramms;

import java.util.HashSet;

public class SerienKillers {
    public static void main(String[] args) {
        HashSet<String> serialNickNames = new HashSet<>();

        serialNickNames.add("Ted Bundy");
        serialNickNames.add("Hannibal Lecter");
        serialNickNames.add("Zodiac Killer");

        for( String s : serialNickNames){
            System.out.println(s);
        }
        System.out.println(serialNickNames.add("Ted Bundy"));
        System.out.println(serialNickNames.add("Edmund Kemper"));
        System.out.println(serialNickNames.add("Jack the Ripper"));
        for( String s : serialNickNames){
            System.out.println(s);
        }
        HashSet<String> americanSerialKiller = new HashSet<>();

        americanSerialKiller.add( "Ted Bundy");
        americanSerialKiller.add( "Edmund Kemper");
        americanSerialKiller.add( "Hannibal Lecter");


        serialNickNames.retainAll(americanSerialKiller);

        System.out.println("------------");

        for( String s : serialNickNames){
            System.out.println(s);
        }
    }
}
