package model;

public class Doctor {
    String Name;
    String Dept;
    int age;

    public Doctor(String name, String dept, int age) {
        Name = name;
        Dept = dept;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
