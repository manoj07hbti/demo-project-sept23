package test_24_dec_2023;

import model.Doctor;
import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    // 1 Write a method which will create List of 10 Students and students will have name roll no,marks and  branch;

    public ArrayList<Student> createStudentList() {

        // CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<Student> StudentArrayList = new ArrayList<>();

        // Create Student data;

        Student student1 = new Student("Shiv", 1, 65, "Commerce");
        Student student2 = new Student("Eleven", 2, 55, "Computer Science");
        Student student3 = new Student("Will", 3, 75, "Mechanical Engineering");
        Student student4 = new Student("Mike", 4, 60, "Electrical Engineering");
        Student student5 = new Student("Lucas", 5, 50, "Electronics and Communication");
        Student student6 = new Student("Dustin", 6, 90, "Civil Engineering");
        Student student7 = new Student("Steve", 7, 85, "Telecommunications Engineering");
        Student student8 = new Student("Nancy", 8, 80, "Chemical Engineering");
        Student student9 = new Student("Billy", 9, 95, "Telecommunications Engineering");
        Student student10 = new Student("Hopper", 10, 10, "Aeronautical Engineering");

        StudentArrayList.add(student1);
        StudentArrayList.add(student2);
        StudentArrayList.add(student3);
        StudentArrayList.add(student4);
        StudentArrayList.add(student5);
        StudentArrayList.add(student6);
        StudentArrayList.add(student7);
        StudentArrayList.add(student8);
        StudentArrayList.add(student9);
        StudentArrayList.add(student10);

        return createStudentList();
    }

    public static void main(String[] args) {

        StudentArrayList obj = new StudentArrayList();
        ArrayList<Student> students = obj.createStudentList();

        // Find out all students with branch CS.

        for(Student var : students){

            if(var.getBranch().equals("CS")){

                System.out.println("Printing CS branch student: " + var.getName() + " Roll No: " + var.getRollno() + " Marks: " + var.getMarks() + " Branch: " + var.getBranch());
            }
        }

        // for loop;

        for (int rollNo = 3; rollNo <= 7; rollNo++) {
            System.out.println("Student Roll No: " + rollNo);
        }

        for (int i = 0; i < students.size(); i++) {

            System.out.println("Printing Student Array List using for loop: " + students.get(i).getName() + " Roll No: " + students.get(i).getRollno() + " Marks: " + students.get(i).getMarks() + "Branch: " + students.get(i).getBranch());
        }
        // while loop;

        int a = 0;
        while (a < students.size()) {

            System.out.println("Printing Student Array List using While loop: " + students.get(a).getName() + " Roll No: " + students.get(a).getRollno() + " Marks: " + students.get(a).getMarks() + "Branch: " + students.get(a).getBranch());
            a++;
        }
        // Advance for loop;

        for (Student var : students) {

            System.out.println("Printing Student Array List using advance for loop: " + var.getName() + " Roll No: " + var.getRollno() + " Marks: " + var.getMarks() + " Branch: " + var.getBranch());
        }
        // do while loop;

        a = 0;
        do {
            System.out.println("Printing Student Array List using do while loop: " + students.get(a).getName() + " Roll No: " + students.get(a).getRollno() + " Marks: " + students.get(a).getMarks() + "Branch: " + students.get(a).getBranch());
            a++;
        } while (a < students.size());

    }
}
