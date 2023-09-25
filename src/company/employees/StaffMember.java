package company.employees;

public class StaffMember extends Employee{
    private int salary;

    public StaffMember(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public StaffMember(){
        super();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public Float takeSalary() {
        return Float.valueOf(salary);
    }
}
