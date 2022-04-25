package LittleProgramms;

public class DogBeagle extends Dog {
    public String lovedFood;

    public DogBeagle(String name,  String eyeColor, int weight, boolean appreciatesOtherDogs,  String lovedFood){
         super(name, eyeColor,weight,appreciatesOtherDogs);

        this.lovedFood = lovedFood;
    }

    @Override
    public void bark() {
        //eat();
        super.bark();
        super.bark();

    }

}
