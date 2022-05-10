package LittleProgramms;

import java.util.ArrayList;
import java.util.Collections;

public class DogParty {
    public static void main(String[] args) {
        Dog scooby = new Dog ("ScoobyDoo", "black",40, true);

        System.out.println(scooby);
        scooby.bark();

//        Dog hund = new Dog();
//        hund.bark();

        DogBeagle beagle = new DogBeagle(" Hansi ", "blue", 23, false, "Alles");
        System.out.println(beagle);
        beagle.bark();

        ArrayList<Dog> doggy = new ArrayList<>();
        doggy.add(scooby);
        doggy.add(beagle);

        System.out.println(doggy);
        Collections.sort(doggy);
        System.out.println(doggy);

    }



}
