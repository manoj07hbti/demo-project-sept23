package model;

public class Doctor {

    String name;
    String department;
    String degree;

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
