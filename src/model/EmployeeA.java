package model;

public class EmployeeA {

    String name;
    Double salary;
    String city;
    String dept;

    // Parameterized constructor;

    public EmployeeA(String name, Double salary, String city, String dept) {
        this.name = name;
        this.salary = salary;
        this.city = city;
        this.dept = dept;
    }
    // Getter and setter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
