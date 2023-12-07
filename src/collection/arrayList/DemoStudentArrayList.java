package collection.arrayList;



import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoStudentArrayList {

    // I want to ask user to input data for Student and user should have choice to stop entering the data.
    public Student createStudent(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter Name of Student..");
        String name= scanner.nextLine();
        System.out.println("Please enter RollNo of Student..");
        int rollNo= scanner.nextInt();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("Please enter section of Student..");
        String section= scanner1.nextLine();

        Student student=new Student(name,rollNo,section);

        return student;
    }


   public ArrayList<Student> createStudentList(){
//CollectionName <Datatype> objName = new CollectionName<>();
       ArrayList<Student> studentArrayList= new ArrayList<>();// we have created variable of Student arraylist

       // create Student data
       Student student1= new Student("Raj",1,"CS");
       Student student2= new Student("Mukesh",2,"IT");
       Student student3= new Student("Mohit",3,"CS");

       studentArrayList.add(student1);
       studentArrayList.add(student2);
       studentArrayList.add(student3);

  return studentArrayList;
   }


    public static void main(String[] args) {

        DemoStudentArrayList obj = new DemoStudentArrayList();
        ArrayList<Student> studentArrayList= new ArrayList<>();

     /*   for(int i=0; i<students.size(); i++){

            System.out.println("Printing Student data in Loop: " +students.get(i).getName() +" RollNo: "+students.get(i).getRollNo()+" Section: "+students.get(i).getSection());
        }

        for(Student var: students){

            System.out.println(var.getName()+" roll No: "+var.getRollNo()+" Section: "+var.getSection());
        }
    }*/

        String choice="Y";
        Scanner scanner= new Scanner(System.in);
        while (choice.equals("Y")){
         Student student= obj.createStudent(); // we will get new Student which is entered by User
         studentArrayList.add(student);

            System.out.println("Do you want to add more Students ? Press Y to continue or any key to exit...");
            String newChoice=scanner.nextLine();
            choice=newChoice;
        }

        for (Student var: studentArrayList){
            System.out.println("You have entered dat : "+ var.getName()+" roll No: "+var.getRollNo()+" Section: "+var.getSection());
        }

    }


}
