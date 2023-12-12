package model;

import java.util.Objects;

public class Doctor {
    String name;
    String specialization;
    String dept;
    int yearsOfExperience;

    public Doctor(String name, String specialization, String dept, int yearsOfExperience) {
        this.name = name;
        this.specialization = specialization;
        this.dept = dept;
        this.yearsOfExperience = yearsOfExperience;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return yearsOfExperience == doctor.yearsOfExperience && Objects.equals(name, doctor.name) && Objects.equals(specialization, doctor.specialization) && Objects.equals(dept, doctor.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specialization, dept, yearsOfExperience);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}


