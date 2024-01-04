package model;

public class Student {
    public Student(String name, int rollNumber, int marks, String section) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.section = section;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    String name;
    int rollNumber;
    int marks;
    String section;
}
