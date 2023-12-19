package model;

public class Engineer {
    String name;
    String branch;
    String college;
    int age;

    public Engineer(String name, String branch, String college, int age) {
        this.name = name;
        this.branch = branch;
        this.college = college;
        this.age = age;
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

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
