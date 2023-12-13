package model;

import java.util.Objects;

public class Engineer {

    String name;
    String course;
    int year;

    // we need to override hashcode and equals method to create hashcode based on our logic;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return year == engineer.year && Objects.equals(name, engineer.name) && Objects.equals(course, engineer.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course, year);
    }

    // parameterized constructor;

    public Engineer(String name, String course, int year) {
        this.name = name;
        this.course = course;
        this.year = year;
    }

    // Getter and setter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
