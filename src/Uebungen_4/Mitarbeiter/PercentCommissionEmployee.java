package Uebungen_4.Mitarbeiter;

public class PercentCommissionEmployee extends Employee {

    protected double percentCommission;

    public PercentCommissionEmployee(String lastName, String firstName, String departmend, double baseSalary, double percentCommission) {
        super(lastName, firstName, departmend, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullSalary() {

        return baseSalary+percentCommission* baseSalary/100;
    }
}
