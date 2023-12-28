package dec24_test;
import model.Student;
import java.util.ArrayList;

public class StudentList {

    public ArrayList<Student> createStudentList() {
        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student("Mohit", 1, 23, "CS");
        Student student2 = new Student("Akash", 2, 45, "IT");
        Student student3 = new Student("shyam", 3, 35, "CS");
        Student student4 = new Student("nikhil", 4, 64, "CS");
        Student student5 = new Student("Rohit", 5, 87, "CS");
        Student student6 = new Student("Rampal", 6, 34, "CS");
        Student student7 = new Student("Kali", 7, 78, "IT");
        Student student8 = new Student("Pooja", 8, 56, "CS");
        Student student9 = new Student("Manish", 9, 76, "CS");
        Student student10 = new Student("Vishal", 10, 85, "CS");

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
        StudentList obj = new StudentList();
        ArrayList<Student> students = obj.createStudentList();

       for(Student var: students){
           if (var.getBranch().equals("CS")){
              System.out.println("Printing name: " + var.getName() + " " + "RollNo:" + var.getRollno() + " " +" Marks:" + var.getMarks() + " " + "Branch:" + var.getBranch());
    }
       }
      for(int i = 0; i <students.size(); i++){
           System.out.println("Printing name: " + students.get(i).getName() + " " + "RollNo:" + students.get(i).getRollno() + " " +" Marks:" + students.get(i).getMarks() + " " + "Branch:" + students.get(i).getBranch());

       }
        int i =0;
        while(i<students.size()){
            System.out.println("Printing name: " + students.get(i).getName() + " " + "RollNo:" + students.get(i).getRollno() + " " +" Marks:" + students.get(i).getMarks() + " " + "Branch:" + students.get(i).getBranch());
            i++;
        }
        i =0;
        do {
            System.out.println("Printing name: " + students.get(i).getName() + " " + "RollNo: " + students.get(i).getRollno() + " " + "Marks: " + students.get(i).getMarks() + " " + "Branch: " + students.get(i).getBranch());
            i++;
        }  while (i < students.size());
        }
}





