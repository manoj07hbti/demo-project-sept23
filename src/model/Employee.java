package model;

public class Employee {

    String name;
    int salary;
    String section;

    // Parameterized constructor;

    public Employee(String name, int salary, String section) {
        this.name = name;
        this.salary = salary;
        this.section = section;
    }

    // Getter and setter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
