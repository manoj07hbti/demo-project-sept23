package class_and_object;

public class Student_Param {

    String name;

    String schoolname;
    String classname;
    int age;

    public Student_Param(String name, String schoolname, String classname, int age) {
        this.name = name;
        this.schoolname = schoolname;
        this.classname = classname;
        this.age = age;
    }

    public static void main(String[] args) {

        Student_Param student=new Student_Param("Deepak","Aps","High school",15);

        System.out.println("Student name: "+student.name+", School name: "+student.schoolname);

        Student_Param student1=new Student_Param("atharv","st.jhons","1st",8);

        System.out.println("Student name: "+student1.name+", School name: "+student1.schoolname+", Class: "+student1.classname);

        Student_Param student2=new Student_Param("Arjun","Christ the king","nursary",4);

        System.out.println("Student name:"+student2.name+" School name: "+student2.schoolname+" Class: "+student2.classname+" Age: "+student2.age);
    }

}
