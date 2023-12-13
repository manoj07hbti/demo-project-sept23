package model;

import java.util.Objects;

public class Doctor {

    String name;
    String workTime;
    int age;

    // we need to override hashcode and equals method to create hashcode based on our logic;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return age == doctor.age && Objects.equals(name, doctor.name) && Objects.equals(workTime, doctor.workTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, workTime, age);
    }

    // parameterized constructor;

    public Doctor(String name, String workTime, int age) {
        this.name = name;
        this.workTime = workTime;
        this.age = age;
    }

    // Getter and setter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
