package LittleProgramms;

public class SameNotSame {
    public static void main(String[] args) {
        DogBeagle b = new DogBeagle("Doggo","black",17,true, "Spaghetti");

        System.out.println( b.getClass());
        System.out.println(DogBeagle.class);

        if(b.getClass().equals(DogBeagle.class)){
            System.out.println( "The same");
        }
        Object obj = b;
        System.out.println(obj.getClass());

        if(b instanceof DogBeagle){
            System.out.println("yep");
        }
        if(b instanceof Dog){
            System.out.println("yep");
        }
        if(obj instanceof Dog){
            System.out.println("yep");
        }


    }
}
