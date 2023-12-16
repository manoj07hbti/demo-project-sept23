package model;

import java.util.Objects;

public class Engineer {
    String EngineerName ;
    int EngineerAge;
    String EngineerDegree;
    String EngineerSpecialization;
    int EngineerYearsOfExperience;

    public Engineer(String engineerName, int engineerAge, String engineerDegree, String engineerSpecialization, int engineerYearsOfExperience) {
        EngineerName = engineerName;
        EngineerAge = engineerAge;
        EngineerDegree = engineerDegree;
        EngineerSpecialization = engineerSpecialization;
        EngineerYearsOfExperience = engineerYearsOfExperience;
    }

    public Engineer(String reem, int engineerAge, String btech) {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return EngineerAge == engineer.EngineerAge && EngineerYearsOfExperience == engineer.EngineerYearsOfExperience && Objects.equals(EngineerName, engineer.EngineerName) && Objects.equals(EngineerDegree, engineer.EngineerDegree) && Objects.equals(EngineerSpecialization, engineer.EngineerSpecialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(EngineerName, EngineerAge, EngineerDegree, EngineerSpecialization, EngineerYearsOfExperience);
    }

    public String getEngineerName() {
        return EngineerName;
    }

    public void setEngineerName(String engineerName) {
        EngineerName = engineerName;
    }

    public int getEngineerAge() {
        return EngineerAge;
    }

    public void setEngineerAge(int engineerAge) {
        EngineerAge = engineerAge;
    }

    public String getEngineerDegree() {
        return EngineerDegree;
    }

    public void setEngineerDegree(String engineerDegree) {
        EngineerDegree = engineerDegree;
    }

    public String getEngineerSpecialization() {
        return EngineerSpecialization;
    }

    public void setEngineerSpecialization(String engineerSpecialization) {
        EngineerSpecialization = engineerSpecialization;
    }

    public int getEngineerYearsOfExperience() {
        return EngineerYearsOfExperience;
    }

    public void setEngineerYearsOfExperience(int engineerYearsOfExperience) {
        EngineerYearsOfExperience = engineerYearsOfExperience;
    }
}
