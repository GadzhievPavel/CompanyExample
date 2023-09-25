import company.Company;
import company.employees.Employee;
import company.employees.EmployeeByHour;
import company.employees.StaffMember;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmployeeByHour employee = new EmployeeByHour("Ivan",20,200);
        StaffMember staffMember = new StaffMember("Oleg",40000);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(staffMember);

        Company company = new Company(employees);

        System.out.println(company.calcSalary());
    }
}
