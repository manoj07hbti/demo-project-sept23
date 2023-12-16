package collection.hashmap;

import model.Student;

import java.util.HashMap;
import java.util.Set;

public class DemoStudentHashMap {

    public void createStudentMap(){

        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap <Integer, Student> students= new HashMap<>();

        // create Student data
        Student student1= new Student("Raj",1,"CS");
        Student student2= new Student("Mukesh",2,"IT");
        Student student3= new Student("Mohit",3,"CS");

        students.put(1,student1);
        students.put(2,student2);
        students.put(3,student3);

       Set<Integer> keys= students.keySet();
        for(Integer var: keys){

            System.out.println("Printing student data: "+students.get(var).getName()+" Roll no:"+students.get(var).getRollNo()+" Section:"+students.get(var).getSection());
        }
    }

    public static void main(String[] args) {
        DemoStudentHashMap obj= new DemoStudentHashMap();
        obj.createStudentMap();
    }


}
