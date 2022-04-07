package LittleProgramms;

import java.util.Objects;

public class Employee {
    private int empNumber;
    private String name;
    private double salary;
    private String departament;

    public Employee(int empNumber, String name, double salary, String departament) {
        this.empNumber = empNumber;
        this.name = name;
        this.salary = salary;
        this.departament = departament;
    }

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartament() {
        return departament;
    }


    public boolean comparteDepartment( Employee e){
        if( this.departament.equals(e.departament)){
            return true;
        }
        return false;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", departament='" + departament + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber && Objects.equals(departament, employee.departament);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empNumber, departament);
    }
}
