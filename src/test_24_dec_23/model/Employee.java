package test_24_dec_23.model;

import java.util.Objects;

public class Employee {
    String Name;
    double Salary;
    String city;
    String department;

    public Employee(String name, double salary, String city, String department) {
        Name = name;
        Salary = salary;
        this.city = city;
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(Salary, employee.Salary) == 0 && Objects.equals(Name, employee.Name) && Objects.equals(city, employee.city) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Salary, city, department);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
