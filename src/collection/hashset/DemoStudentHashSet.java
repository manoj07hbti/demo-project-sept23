package collection.hashset;

import model.Student;

import java.util.HashSet;

public class DemoStudentHashSet {

    public HashSet <Student>  createStudentSet(){

        //CollectionName <Datatype> objName = new CollectionName<>();

        HashSet <Student> studentHashSet = new HashSet<>();

        // we need to create Student data by creating student object
        Student student1= new Student("Raj",1,"CS");

        System.out.println("Printing hashcode pf student1: "+student1.hashCode());

        Student student2= new Student("Mukesh",2,"IT");
        System.out.println("Printing hashcode of student2: "+student2.hashCode());

        Student student3= new Student("Mohit",3,"CS");
        System.out.println("Printing hashcode of student3: "+student3.hashCode());

        Student student4= new Student("Raj",1,"CS");
        System.out.println("Printing hashcode of student4: "+student4.hashCode());

        Student student5= new Student("Mukesh",2,"IT");
        System.out.println("Printing hashcode of student5: "+student5.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);


        return  studentHashSet;
    }

    public static void main(String[] args) {

        DemoStudentHashSet obj= new DemoStudentHashSet();

        HashSet <Student> students= obj.createStudentSet();

        for(Student var: students){

            System.out.println("Printing HashSet : "+var.getName() +" "+var.getRollNo()+" "+var.getSection());
        }
    }
}
