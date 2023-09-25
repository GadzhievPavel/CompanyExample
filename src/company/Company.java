package company;

import company.employees.Employee;

import java.util.ArrayList;

public class Company {
    ArrayList<Employee> employees;

    public Company(){

    }

    public Company(ArrayList<Employee> employees){
        this.employees = employees;
    }

    public Float calcSalary(){
        Float sum = 0.0f;
        for (Employee employee : employees){
            sum+=employee.takeSalary();
        }
        return sum;
    }
}