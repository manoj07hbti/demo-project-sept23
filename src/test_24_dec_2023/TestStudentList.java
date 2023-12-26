package test_24_dec_2023;

import model.StudentModelClass;

import java.util.ArrayList;

public class TestStudentList {
    public ArrayList<StudentModelClass> createstudentlist() {
        ArrayList<StudentModelClass> studentArrayList = new ArrayList<>();

        StudentModelClass student1 = new StudentModelClass("Anil kapoor", 1, 23, "CS");
        StudentModelClass student2 = new StudentModelClass("Alia bhatt", 2, 45, "CS");
        StudentModelClass student3 = new StudentModelClass("britney Spears", 3, 35, "ECE");
        StudentModelClass student4 = new StudentModelClass("Dolly Bindra", 4, 64, "CS");
        StudentModelClass student5 = new StudentModelClass("Evelyn Sharma", 5, 87, "EEE");
        StudentModelClass student6 = new StudentModelClass("Firoz Khan", 6, 34, "CS");
        StudentModelClass student7 = new StudentModelClass("Ranbir Kapoor", 7, 78, "ECE");
        StudentModelClass student8 = new StudentModelClass("Salman Khan", 8, 56, "EEE");
        StudentModelClass student9 = new StudentModelClass("Shahrukh Khan", 9, 15, "ECE");
        StudentModelClass student10 = new StudentModelClass("Tripti Dimri", 10, 6, "CS");

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

        TestStudentList obj = new TestStudentList();
        ArrayList<StudentModelClass> students = obj.createstudentlist();


        //PRINTING ALL STUDENTS USING WHILE LOOP, DO WHILE LOOP, AND ADVANCE FOR LOOP.

        //ADVANCE FOR LOOP

        System.out.println("PRINTING STUDENT LIST USING ADVANCE FOR LOOP");
        for (StudentModelClass var : students) {
            System.out.println(" Name is " + var.getName() + " Roll Number is " + var.getRollnumber() + " Marks are " + var.getMarks() + " Branch is " + var.getBranch());

        }
        System.out.println("***********************************************************************************************************************************");


        //While Loop

        System.out.println("PRINTING STUDENT LIST USING WHILE LOOP");
        int i = 0;
        while (i < students.size()) {
            System.out.println(" Name is " + students.get(i).getName() + " Roll Number is " + students.get(i).getRollnumber() + " Marks are " + students.get(i).getMarks() + " Branch is " + students.get(i).getBranch());

            i++;
        }

        System.out.println("***********************************************************************************************************************************");

        // Do while Loop

        System.out.println("PRINTING STUDENT LIST USING DO WHILE LOOP");

        int j = 0;
        do {
            System.out.println(" Name is " + students.get(j).getName() + " Roll Number is " + students.get(j).getRollnumber() + " Marks are " + students.get(j).getMarks() + " Branch is " + students.get(j).getBranch());

            j++;
        }
        while (j < students.size());

        System.out.println("***********************************************************************************************************************************");


        // PRINTING ALL STUDENTS WITH BRANCH "CS"

        System.out.println("PRINTING ALL STUDENTS WITH BRANCH CS");
        for (StudentModelClass var : students) {
            if (var.getBranch().equals("CS")) {
                System.out.println("Name: " + var.getName() + " Belongs to  " + var.getBranch());
            }
        }
        System.out.println("***********************************************************************************************************************************");


        // PRINTING ALL STUDENTS BETWEEN ROLL NUMBER 3 TO 7

        System.out.println("PRINTING ALL STUDENTS BETWEEN ROLL NUMBER 3 TO 7");
        for (StudentModelClass var : students) {
            if (var.getRollnumber() >= 3 && var.getRollnumber() <= 7) {
                System.out.println(var.getName() + "Roll number " + var.getRollnumber());
            }
        }
        System.out.println("***********************************************************************************************************************************");


        // PRINTING STUDENTS WITH HIGHEST AND LOWEST MARKS

        System.out.println("PRINTING STUDENTS WITH HIGHEST AND LOWEST MARKS");
        StudentModelClass max = students.get(0);
        StudentModelClass min = students.get(0);

        for (StudentModelClass var : students) {
            if (var.getMarks() > max.getMarks()) {
                max = var;
            }
            if (var.getMarks() < min.getMarks()) {
                min = var;
            }
        }

        System.out.println("Student with highest marks " + max.getName() + "marks" + max.getMarks());
        System.out.println("Student with lowest marks " + min.getName() + "Marks " + min.getMarks());

    }
}
