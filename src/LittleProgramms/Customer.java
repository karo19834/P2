package LittleProgramms;

import java.util.ArrayList;

public class Customer extends Person{

    private  int customerNumber;
    private ArrayList<Adress> addresses ;


    public  Customer (int customerNumber, String firstName, String lastName){
        super(firstName, lastName);
        this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();

    }

    public void addAdress ( Adress a){
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber=" + customerNumber +
                ", addresses=" + addresses +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
