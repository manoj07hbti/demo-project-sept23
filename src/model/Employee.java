package model;

public class Employee {
    String employeeName;
    int employeeId;
    int employeeAge;
    double employeeSalary;

    public Employee(String employeeName, int employeeId, int employeeAge, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}

