package model;

public class StudentModelClass {
    String name;
    int rollnumber;
    int marks;
    String branch;

    public StudentModelClass(String name, int rollnumber, int marks, String branch) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.marks = marks;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
