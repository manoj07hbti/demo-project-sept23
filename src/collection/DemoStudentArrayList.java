package collection;

import model.Student;

import java.util.ArrayList;

public class DemoStudentArrayList {
    public ArrayList<Student> createStudentList(){
        ArrayList<Student>studentArrayList=new ArrayList<>();
        Student student1=new Student("jai",2,"IT");
        Student student2=new Student("raj",3,"cs");
        Student student3=new Student("pari",5,"ac");
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        return studentArrayList;
    }

    public static void main(String[] args) {
        DemoStudentArrayList obj=new DemoStudentArrayList();
         ArrayList<Student>student=   obj.createStudentList();
         for(int i=0; i<student.size(); i++){
             System.out.println("printing student: "+student.get(i).getName()+ " rollNo: "+student.get(i).getRollNO());
         }
    }
}
