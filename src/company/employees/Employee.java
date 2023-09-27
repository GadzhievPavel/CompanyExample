package company.employees;

abstract public class Employee implements Comparable<Employee>{
    protected String name;
    protected float nalog;
    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getNalog() {
        return nalog;
    }

    public void setNalog(float nalog) {
        this.nalog = nalog;
    }

    public Float takeSalary(){
        return null;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
