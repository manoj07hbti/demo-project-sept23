package test_24_dec_2023;
import model.StudentParam;

import java.util.ArrayList;

public class DemoStudent_List {


    public ArrayList<StudentParam> createStudentList() {
        //1- list of 10 student with Name, RollNo, marks, branch
        ArrayList<StudentParam> studentArrayList = new ArrayList<>();
        StudentParam student1 = new StudentParam("Raj", 1, 75, "CS");
        StudentParam student2 = new StudentParam("Amit", 2, 64, "civil");
        StudentParam student3 = new StudentParam("Farhan", 3, 59, "Electrical");
        StudentParam student4 = new StudentParam("Salam", 4, 78, "Mechanical");
        StudentParam student5 = new StudentParam("Rahul", 5, 86, "IT");
        StudentParam student6 = new StudentParam("Kabir", 6, 72, "Electronics");
        StudentParam student7 = new StudentParam("Asif", 7, 90, "CS");
        StudentParam student8 = new StudentParam("Ajay", 8, 67, "Mechanical");
        StudentParam student9 = new StudentParam("Amir", 9, 40, "CS");
        StudentParam student10 = new StudentParam("Ravi", 10, 37, "Mechanical");


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

        DemoStudent_List obj = new DemoStudent_List();
        ArrayList<StudentParam> students = obj.createStudentList();
        // 2- Student with CS branch
        for (StudentParam var : students) {
            if (var.getBranch().equals("CS")) {
                System.out.println("Name: " + var.getName() + " " + "Roll no: " + var.getRollNo() + " " + "Marks: " + var.getMarks() + " " + "Branch: " + var.getBranch());
            }
        }

        StudentParam max = students.get(0);
        StudentParam min = students.get(0);

        for (StudentParam var : students) {
            if (var.getMarks() > max.getMarks()) {
                max = var;
            }
            if (var.getMarks() < min.getMarks()) {
                min = var;
            }
        }
        System.out.println("Student with highest marks: " + max.getName() + " " + "marks:" + max.getMarks());
        System.out.println("Student with lowest marks: " + min.getName() + " " + "marks:" + min.getMarks());

// 3- Student with highest and lowest marks


        //4-Student between RollNo 3 to 7
        System.out.println("Students between RollNo 3 to 7 ");
        for (StudentParam var : students) {
            if (var.getRollNo() >= 3 && var.getRollNo() <= 7) {
                System.out.println(var.getName() + " " + "RollNo: " + var.getRollNo());
            }
        }
        // 5-Printing student with While loop, do while loop and Advance loop
//a-while Loop
        int i = 0;
        while (i < students.size()) {
            System.out.println("Name: " + students.get(i).getName() + " " + "RollNo:" + students.get(i).getRollNo() + " " + students.get(i).getMarks() + " " + students.get(i).getBranch());
            i++;
        }
//b-do while
        int j=0;
        do {
            System.out.println("Name: " + students.get(j).getName() + " " + "RollNo:" + students.get(j).getRollNo() + " " + students.get(j).getMarks() + " " + students.get(j).getBranch());
            j++;
        } while (j < students.size());

//c-Advance for Loop
        for (StudentParam var:students){
            System.out.println("Name: "+var.getName()+" "+"RollNo: "+var.getRollNo()+" "+"marks: "+var.getMarks()+" "+"branch: "+var.getBranch());
        }



}

}





