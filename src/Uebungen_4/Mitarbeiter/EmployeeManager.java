package Uebungen_4.Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

    protected ArrayList<Employee> empList = new ArrayList<>();

    public double calcTotalSalary(){
        double sum=0;
        for ( Employee e: empList) {
            sum += e.getFullSalary();
        }
        return sum;
    }

    public HashMap<String, Double> getSalaryByDepartment(){
        HashMap<String, Double> wynik = new HashMap<>();

        for (Employee e:empList) {
            Double suma = wynik.getOrDefault(e.getDepartmend(),(double)0) + e.getFullSalary();
            wynik.put(e.getDepartmend(), suma);
        }
        return wynik;
    }
}
