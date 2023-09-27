package company.employees;

public class EmployeeByHour extends Employee implements Comparable<EmployeeByHour>{
    private float hour;
    private int salaryInHour;

    public EmployeeByHour(String name, float hour, int salaryInHour) {
        super(name);
        this.hour = hour;
        this.salaryInHour = salaryInHour;
        this.nalog = 0.15f;
    }

    public EmployeeByHour(){
        super();
    }

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public int getSalaryInHour() {
        return salaryInHour;
    }

    public void setSalaryInHour(int salaryInHour) {
        this.salaryInHour = salaryInHour;
    }

    @Override
    public Float takeSalary() {
        return hour*salaryInHour;
    }

    @Override
    public int compareTo(Employee o) {
        EmployeeByHour employee = (EmployeeByHour) o;
        return this.hour > employee.hour?1:-1;
    }
}
