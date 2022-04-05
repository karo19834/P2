package LittleProgramms;


import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employees; //= new ArrayList<>(); ---->

    public EmployeeManager() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public Employee findByEmpNumber(int number) {
       for( Employee empi : employees){
           if( empi.getEmpNumber()== number){
               return empi;
           }
       }
       return null;
    }

    public ArrayList<Employee> findByDepartament(String departament) {

        ArrayList<Employee> erg = new ArrayList<>();
        for ( Employee e : employees){
            if ( e.getDepartament().equals(departament)){
                erg.add(e);
            }
        }
        return erg;
    }

    public Employee findByMaxSalary() {
            Employee highestE = null;
            double highestSalary = 0; // oder -1

            for( Employee e : employees){
                if ( e.getSalary() > highestSalary){
                    highestSalary = e.getSalary();
                    highestE = e;
                }
            }
            return highestE;
    }
}

