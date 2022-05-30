package Uebungen_4.Mitarbeiter;

public class Employee {
    protected String lastName;
    protected String firstName;
    protected String departmend;
    protected  double baseSalary;



    public Employee(String lastName, String firstName, String departmend, double baseSalary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.departmend = departmend;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary(){
        return baseSalary;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDepartmend() {
        return departmend;
    }

    public void setDepartmend(String departmend) {
        this.departmend = departmend;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", departmend='" + departmend + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
