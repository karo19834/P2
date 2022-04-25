package LittleProgramms;

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
    }

}
