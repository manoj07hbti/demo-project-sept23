package model;

public class Doctor {

    String name;
    String workTime;
    int age;

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
