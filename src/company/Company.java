package company;

import company.employees.Employee;

import java.util.ArrayList;
import java.util.Comparator;

public class Company {
    ArrayList<Employee> employees;

    public Company() {

    }

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public Float calcSalary() {
        Float sum = 0.0f;
        for (Employee employee : employees) {
            sum += employee.takeSalary();
        }
        return sum;
    }

    public Employee findMax(Comparator comparator) {
        int i = comparator.compare(employees.get(0), employees.get(employees.size() - 1));
        Employee res = null;
        switch (i) {
            case -1:
                res = employees.get(0);
                break;
            case 0:
                break;
            case 1:
                res = employees.get(employees.size() - 1);
                break;
        }
        return res;
    }
}
