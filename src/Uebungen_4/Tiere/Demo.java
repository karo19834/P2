package Uebungen_4.Tiere;

public class Demo {
    public static void main(String[] args) {

        Frog f = new Frog("Zielony", 2);
        Cat c = new Cat("Bialy",2,"");
        Dog d = new Dog("Czarny", 3,"");
        Lion l = new Lion("Brazowy", 4);

//        Frog quaxi = new Frog("Czerwony",5);
//        Animal quxiAsAnimal = (Animal) quaxi;
//
        Cat kotek = new Cat("Czarny", 2, "Kicia");
        Animal kotekAsAnimal = (Animal) kotek;


        System.out.println(((Cat)kotekAsAnimal).getName());


    }
}
