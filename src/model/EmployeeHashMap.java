package model;

public class EmployeeHashMap {

    String name;
    double salary;
    String city;
    String Dept;

    //

    public EmployeeHashMap(String name, double salary, String city, String dept) {
        this.name = name;
        this.salary = salary;
        this.city = city;
        Dept = dept;
    }
    //


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
