package sunday_dec_test;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {
    public ArrayList<Student>student() {
        ArrayList<Student> studentList = new ArrayList<>();
// by mistake i wrote section instead of branch

        Student student1 = new Student("A", 33, 56, "Rose");
        Student student2 = new Student("B", 32, 56, "Lilly");
        Student student3 = new Student("C", 31, 56, "Tulip");
        Student student4 = new Student("D", 30, 56, "Jasmine");
        Student student5 = new Student("E", 39, 56, "Daisy");
        Student student6 = new Student("F", 35, 56, "Marigold");
        Student student7 = new Student("G", 23, 56, "Lavender");
        Student student8 = new Student("H", 43, 56, "Lotus");
        Student student9 = new Student("I", 21, 56, "Bluebell");
        Student student10 = new Student("J", 11, 56, "Sunflower");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        return studentList;

    }

    public static void main(String[] args) {
        StudentArrayList obj=new StudentArrayList();
        obj.student();
        ArrayList<Student>student=obj.student();
        for(int i=0;i<student.size(); i++){
            System.out.println("student info: "+student.get(i).getName()+" Roll no: "+student.get(i).getRollNumber()+" marks: "+student.get(i).getMarks()+" section: "+student.get(i).getSection());
        }


    }
}




