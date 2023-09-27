import company.Company;
import company.HandlerArray;
import company.MyArray;
import company.employees.Employee;
import company.employees.EmployeeByHour;
import company.employees.StaffMember;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyArray<Integer> integerMyArray = new MyArray<>(100);
        HandlerArray<Integer> integerHandlerArray = new HandlerArray<Integer>() {
            @Override
            public Integer randomObject() {
                return Integer.valueOf((int) (Math.random()*100));
            }
        };
        integerMyArray.fillArray(integerHandlerArray);
        System.out.println(integerMyArray);
        Integer i = integerMyArray.maxItem(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });


        System.out.println(i);

        MyArray<EmployeeByHour> employeeByHourMyArray = new MyArray<>(3);
        employeeByHourMyArray.maxItem(new Comparator<EmployeeByHour>() {
            @Override
            public int compare(EmployeeByHour o1, EmployeeByHour o2) {
                return o1.compareTo(o2);
            }
        })
//        EmployeeByHour employee = new EmployeeByHour("Ivan",20,200);
//        StaffMember staffMember = new StaffMember("Oleg",40000);
//
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(employee);
//        employees.add(staffMember);
//
//        Company company = new Company(employees);
//
//        company.findMax(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Employee employee1 = null;
//                if(o1 instanceof Employee){
//                    employee1 = (Employee) o1;
//                }
//
//                Employee employee2 = (Employee) o2;
//
//                return employee1.compareTo(employee2);
//            }
//        });
//        System.out.println(company.calcSalary());
//        ArrayList<Integer> integers = new ArrayList(){};
//        integers.add(5);
//        integers.add(12);
//        integers.add(8);
//        MyArray<Integer> array = new MyArray<>(integers);
//        Integer integer = array.findMax(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        System.out.println(integer);
//
//        ArrayList<Employee> employees = new ArrayList<>();
//        employees.add(new StaffMember("Ivan",2));
//        employees.add(new StaffMember("Oleg",3));
//        employees.add(new StaffMember("Pavel",5));
//
//        MyArray<Employee> employeeMyArray = new MyArray<>(employees);
//
//        Employee employee = employeeMyArray.findMax(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        System.out.println(employee);
    }
}
