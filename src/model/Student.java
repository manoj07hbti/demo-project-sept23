package model;

public class Student {
    String Name;
    int rollNO;
    String Section;

    public Student(String name, int rollNO, String section) {
        Name = name;
        this.rollNO = rollNO;
        Section = section;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNO() {
        return rollNO;
    }

    public void setRollNO(int rollNO) {
        this.rollNO = rollNO;
    }

    public String getSection() {
        return Section;
    }

    public void setSection(String section) {
        Section = section;
    }
}
