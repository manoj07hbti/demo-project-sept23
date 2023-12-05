package collection.arrayList;



import model.Student;

import java.util.ArrayList;

public class DemoStudentArrayList {

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
        ArrayList<Student> students=obj.createStudentList();

        for(int i=0; i<students.size(); i++){

            System.out.println("Printing Student data in Loop: " +students.get(i).getName() +" RollNo: "+students.get(i).getRollNo()+" Section: "+students.get(i).getSection());
        }

        for(Student var: students){

            System.out.println(var.getName()+" roll No: "+var.getRollNo()+" Section: "+var.getSection());
        }
    }
}
