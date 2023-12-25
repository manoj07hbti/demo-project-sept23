package test_24_dec_2023;

import test_24_dec_2023.model.Student;

import java.util.ArrayList;

public class DemoStudent {

    public static ArrayList<Student> studentlist() {

        ArrayList<Student> arrayList = new ArrayList<>();
        Student student1 = new Student("Deepak", 1, 80, "IT");
        Student student2 = new Student("Arjun", 2, 56, "CS");
        Student student3 = new Student("Atharv", 3, 90, "CIVIL");
        Student student4 = new Student("Khusbu", 4, 40, "IT");
        Student student5 = new Student("Ashwani", 5, 60, "CS");
        Student student6 = new Student("Akash", 6, 59, "CIVIL");
        Student student7 = new Student("Piyush", 7, 70, "IT");
        Student student8 = new Student("Prajjwal", 8, 50, "CS");
        Student student9 = new Student("Pooja", 9, 58, "CIVIL");
        Student student10 = new Student("Arti", 10, 78, "CS");

        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);
        arrayList.add(student7);
        arrayList.add(student8);
        arrayList.add(student9);
        arrayList.add(student10);

        return arrayList;


    }

    public static void main(String[] args) {
        DemoStudent obj = new DemoStudent();
        ArrayList<Student> students = obj.studentlist();


        //Print all student with while loop ,do while loop and advance for loop.
        int i = 0;
        while (i <students.size()) {
            System.out.println("*************while loop*****************");
            System.out.println("Student: " + students.get(i).getName() + ",rollno: " + students.get(i).getRollno() + ",marks: " + students.get(i).getMarks() + ",Branch: "+students.get(i).getBranch());
            i++;
        }

        int a=0;
        do {
            System.out.println("*************do while loop*****************");
            System.out.println("Student: " + students.get(a).getName() + ",rollno: " + students.get(a).getRollno() + ",marks: " + students.get(a).getMarks() + ",Branch: "+students.get(a).getBranch());
            a++;
        }while(a<students.size());

        for (Student var:students){
            System.out.println("*************advance loop*****************");

            System.out.println(" Student name: " + var.getName() + ",rollno: " + var.getRollno() + ",marks: " + var.getMarks() + ",Branch: " + var.getBranch());
        }

        //Find out all student with branch cs
        for (Student keys : students) {
            if (keys.getBranch().equals("CS")) {
                System.out.println("****************printing Student data************************");
                System.out.println(" Student name: " + keys.getName() + ",rollno: " + keys.getRollno() + ",marks: " + keys.getMarks() + ",Branch: " + keys.getBranch());
            }
        }
        //Find out student with highest and lowest marks.
        Student highest = students.get(0);
        Student lowest = students.get(0);


        for (Student keys : students) {
            if (keys.getMarks() > highest.getMarks()) {
                highest = keys;
                System.out.println("****************highest marks***********************");
                System.out.println("printing marks:" + keys.getName() + ",rollno: " + keys.getRollno() + ",marks: " + keys.getMarks());
            }
            if (keys.getMarks() < lowest.getMarks()) {
                lowest = keys;
                System.out.println("****************lowest marks***********************");
                System.out.println("printing marks: " + keys.getName() + ",rollno: " + keys.getRollno() + ",marks: " + keys.getMarks());
            }

        }
        //Find out and print all student between 3 to 7 roll no.
        for (Student keys : students) {
            if (keys.getRollno() >= 3 && keys.getRollno() <= 7) {
                System.out.println("*******************Student between 3 to 7 roll no*******************");
                System.out.println("Student: " + keys.getName() + ",rollno: " + keys.getRollno() + ",marks: " + keys.getMarks() + ",Branch: " + keys.getBranch());
            }
        }



    }


}
