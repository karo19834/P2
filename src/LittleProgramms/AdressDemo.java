package LittleProgramms;

public class AdressDemo {
    public static void main(String[] args) {
        Adress a1 = new Adress ("Papierfabrikgasse 9/7","8045", "Graz","AT" );
        Adress a2 = new Adress("Neugasse 4", "7865","Market", "AT");

        Customer c1 = new Customer(1, "Gerard", "Edlinger");
        Customer c2 = new Customer(2, "Maria", "Schlecker");

        c1.addAdress(a1);
        c2.addAdress(a2);

        System.out.println(c1);
        System.out.println(c2);
        c2.doSomething();
    }

}
