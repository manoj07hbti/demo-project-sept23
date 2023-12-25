package test_24_dec_23;

import test_24_dec_23.model.Student;

import java.util.ArrayList;

public class StudentList {
    public ArrayList<Student> createStudentlist() {
        ArrayList<Student> studentArrayLists = new ArrayList<>();

        Student student1 = new Student("priya", 1, 21, "CS");
        Student student2 = new Student("neha", 8, 68, "EC");
        Student student3 = new Student("Alen", 2, 92, "IT");
        Student student4 = new Student("Boby", 3, 85, "CS");
        Student student5 = new Student("Evan", 4, 60, "EC");
        Student student6 = new Student("Christy", 5, 95, "CS");
        Student student7 = new Student("Diya", 6, 72, "IT");
        Student student8 = new Student("Firoz", 7, 88, "CS");
        Student student9 = new Student("Honey", 9, 75, "CS");
        Student student10 = new Student("Ishu", 10, 80, "IT");

        studentArrayLists.add(student1);
        studentArrayLists.add(student2);
        studentArrayLists.add(student3);
        studentArrayLists.add(student4);
        studentArrayLists.add(student5);
        studentArrayLists.add(student6);
        studentArrayLists.add(student7);
        studentArrayLists.add(student8);
        studentArrayLists.add(student9);
        studentArrayLists.add(student10);


        return studentArrayLists;
    }


    public static void main(String[] args) {
        StudentList obj = new StudentList();
        ArrayList<Student> students = obj.createStudentlist();

        //Find out all students with branch CS.
        for (Student var : students) {
            System.out.println("Students with branch CS:");
            if (var.getBranch().equals("CS")) {
                System.out.println("Name: " + var.getName() + " Branch: " + var.getBranch());

            }
        }
        //Find out student with highest and lowest marks.
        Student max = students.get(0);
        Student min = students.get(0);
        for (Student var : students) {
            if (var.getMarks() > max.getMarks()) {
                max = var;
                System.out.println("Student with highest marks: " + max.getName() + " Marks: " + max.getMarks());
            }
            if (var.getMarks() < min.getMarks()) {
                min = var;
                System.out.println("Student with lowest marks: " + min.getName() + " Marks: " + min.getMarks());
            }
        }
        // Find out and print all students between roll no 3 to 7.
        System.out.println("Students with roll no between 3 and 7:");
        for (Student var : students) {
            if (var.getRollno() >= 3 && var.getRollno() <= 7) {
                System.out.println(var.getName() + " Roll No: " + var.getRollno());
            }

        }
        //Print all students with while loop, do while and advance.
        System.out.println("Printing all students with while loop:");
        int i = 0;
        while (i < students.size()) {
            System.out.println(" Name: " + students.get(i).getName() + " Rollno: " + students.get(i).getRollno() + " Marks: " + students.get(i).getMarks() + " Branch: " + students.get(i).getBranch());
            i++;
        }

        System.out.println("Printing all students with do-while loop:");

        int j = 0;
        do {
            System.out.println(" Name: " + students.get(i).getName() + " Rollno: " + students.get(i).getRollno() + " Marks: " + students.get(i).getMarks() + " Branch: " + students.get(i).getBranch());
            j++;
        } while (j < students.size());

        System.out.println("Printing all students with Advance loop:");
        for (Student var : students) {
            System.out.println(" Name: " + var.getName() + " Rollno: " + var.getRollno() + " Marks: " + var.getMarks() + " Branch: " + var.getBranch());
        }
    }
}



