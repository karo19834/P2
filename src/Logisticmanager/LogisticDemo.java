package Logisticmanager;

public class LogisticDemo {
    public static void main(String[] args) {
        Car c1 = new Car("VW Golf", "blue",200);
        Shirt s1 = new Shirt("Nike", 42, " pink");

        LogisticManager lm1 = new LogisticManager();

        lm1.add(c1);
        lm1.add(s1);
        lm1.add(new Shirt("Hansiwear", 40, "snowwhite"));

        lm1.moveAll("Schladming");


    }
}
