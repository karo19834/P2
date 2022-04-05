package LittleProgramms;

import java.util.Arrays;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Hansi", 10000, "Musik");
        Employee e2 = new Employee(2, "Susi", 5000, "Marketing");
        Employee e3 = new Employee(3, "Anton", 3000, "Musik");

        EmployeeManager mgr = new EmployeeManager();
        mgr.addEmployee( e1);
        mgr.addEmployee(e2);
        mgr.addEmployee(e3);

        System.out.println(mgr.findByEmpNumber(3));
        System.out.println(mgr.findByDepartament("Musik"));
        System.out.println(mgr.findByMaxSalary());

    }
}
