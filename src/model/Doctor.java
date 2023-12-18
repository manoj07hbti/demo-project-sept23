package model;

import java.util.Objects;

public class Doctor {

    String name;
    String department;
    String degree;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(name, doctor.name) && Objects.equals(department, doctor.department) && Objects.equals(degree, doctor.degree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, degree);
    }

    public Doctor(String name, String department, String degree) {
        this.name = name;
        this.department = department;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }


}
