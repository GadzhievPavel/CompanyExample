package company.employees;

abstract public class Employee {
    protected String name;

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

    public Float takeSalary(){
        return null;
    }
}
