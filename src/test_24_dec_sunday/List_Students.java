package test_24_dec_sunday;


import model.Student;
import test_27_nov_monday.Array;

import java.util.ArrayList;

public class List_Students {

    public ArrayList<Student> createStudentList() {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student("Rohan", 1, 23, "CS");
        Student student2 = new Student("Sohan", 2, 45, "CS");
        Student student3 = new Student("Rohit", 3, 35, "IT");
        Student student4 = new Student("Shyam", 4, 64, "CS");
        Student student5 = new Student("Ram", 5, 87, "ME");
        Student student6 = new Student("Vikas", 6, 34, "CS");
        Student student7 = new Student("Raman", 7, 78, "IT");
        Student student8 = new Student("Kohli", 8, 56, "CS");
        Student student9 = new Student("Siraj", 9, 67, "CE");
        Student student10 = new Student("Jadeja", 10, 79, "CS");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);
        studentArrayList.add(student5);
        studentArrayList.add(student6);
        studentArrayList.add(student7);
        studentArrayList.add(student8);
        studentArrayList.add(student9);
        studentArrayList.add(student10);

        return studentArrayList;

    }

    public static void main(String[] args) {
        List_Students obj = new List_Students();
        ArrayList<Student> students = obj.createStudentList();
        for (Student var : students) {
            if (var.getBranch().equals("CS")) {
                System.out.println("Printing name: " + var.getName() + " " + "RollNo: " + var.getRollNo()
                        + " " + "Marks: " + var.getMarks() + " " + "Branch: " + var.getBranch());
            }
        }



        int i = 0;
        while (i < students.size()) {
            System.out.println("Printing name: " + students.get(i).getName() + " " + "RollNo: " + students.get(i).getRollNo()
                    + " " + "Marks: " + students.get(i).getMarks() + " " + "Branch: " + students.get(i).getBranch());
            i++;
        }


         i=0;
        do {
            System.out.println("Printing name: " + students.get(i).getName() + " " + "RollNo: " + students.get(i).getRollNo()
                    + " " + "Marks: " + students.get(i).getMarks() + " " + "Branch: " + students.get(i).getBranch());
            i++;
        } while (i < students.size());

        for (Student var :students){
            System.out.println("Printing name: " + var.getName() + " " + "RollNo: " + var.getRollNo()
                    + " " + "Marks: " + var.getMarks() + " " + "Branch: " + var.getBranch());

        }

        for ( i=3;i<6;i++) {
            System.out.println("Printing name: " + students.get(i).getName() + " " + "RollNo: " + students.get(i).getRollNo()
                    + " " + "Marks: " + students.get(i).getMarks() + " " + "Branch: " + students.get(i).getBranch());

        }
    }
    }

