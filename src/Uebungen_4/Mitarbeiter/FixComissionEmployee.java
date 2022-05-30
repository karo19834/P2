package Uebungen_4.Mitarbeiter;

public class FixComissionEmployee extends Employee {

    protected double additionalCommision;

    public FixComissionEmployee(String lastName, String firstName,
                                String departmend, double baseSalary, double additionalCommision) {
        super(lastName, firstName, departmend, baseSalary);
        this.additionalCommision = additionalCommision;
    }

    @Override
    public double getFullSalary() {
        return baseSalary + additionalCommision;
    }


}
