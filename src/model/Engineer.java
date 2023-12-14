package model;

import java.util.Objects;

public class Engineer {

    String name;
    String company;
    Double salary;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return age == engineer.age && Objects.equals(name, engineer.name) && Objects.equals(company, engineer.company) && Objects.equals(salary, engineer.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company, salary, age);
    }

    public Engineer(String name, String company, Double salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
