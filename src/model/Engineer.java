package model;

import java.util.Objects;

public class Engineer
{
String name;
String branch;
int rollno;
int year;
double cgpa;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return rollno == engineer.rollno && year == engineer.year && Double.compare(cgpa, engineer.cgpa) == 0 && Objects.equals(name, engineer.name) && Objects.equals(branch, engineer.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, branch, rollno, year, cgpa);
    }

    public Engineer(String name, String branch, int rollno, int year, double cgpa) {
        this.name = name;
        this.branch = branch;
        this.rollno = rollno;
        this.year = year;
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
