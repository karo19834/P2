package LittleProgramms;

import java.util.HashMap;

public class BankApp {
    public static void main(String[] args) {

        Account nummer1 = new Account( "Hansi Hinteregger", " AT09 2345 7654 2949", "SPREBGZH");
        Account nummer2 = new Account( "Dieter Bohlen", " AT09 5612 7654 5670", "SPREBGZH");
        Account nummer3 = new Account( "Larissa Müller", " AT09 9000 7654 4367", "SPREBGZH");

        nummer1.add( 2000.0);
        nummer2.add(12000.45);
        nummer3.add( 100.23);
        System.out.println( nummer1.getBalance());
        System.out.println( nummer2.getBalance());
        System.out.println( nummer3.getBalance());

        System.out.println( "-------------------------------------------");

        nummer1.deposit( 2001.0);
        nummer2.deposit( 2000.0);
        nummer3.deposit(34);
        System.out.println( nummer1.getBalance());
        System.out.println( nummer2.getBalance());
        System.out.println( nummer3.getBalance());

        System.out.println("-------------------------------------------");

        Account[] array = new Account[] { nummer1,nummer2,nummer3};

        for ( int i=0; i< array.length; i++){
            System.out.println( array[i].getBalance());
        }

        for (Account a : array ){
            System.out.println(a.getBalance());
        }


        System.out.println( nummer1);
        System.out.println( nummer2);
        System.out.println( nummer3);

        HashMap<String, Account> bank = new HashMap<>();

        bank.put("Hansi Hinteregger", nummer1);
        bank.put("Dieter Bohlen", nummer2);
        bank.put("Larissa Müller", nummer3);

        System.out.println( bank.containsKey( "Hansi Hinteregger"));
        System.out.println( bank.get("Dieter Bohlen"));
        //iterieren(anders)
        for(String owner : bank.keySet()){
            System.out.println(owner);
            System.out.println(bank.get(owner));
        }


    }
}
