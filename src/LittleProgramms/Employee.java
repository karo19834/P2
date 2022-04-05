package LittleProgramms;

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
}
