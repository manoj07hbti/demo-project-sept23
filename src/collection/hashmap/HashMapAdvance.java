package collection.hashmap;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAdvance {


    public static void main(String[] args) {

        //SYNTAX :  HashMap <Datatype_key, Value_datatype> = new HashMap<>();

        // AGRA, DPS , JNU
        // ListOfStudent
        HashMap<String, ArrayList<Student>> arrayListHashMap= new HashMap<>();

        // we need to create data of Students

        Student student1= new Student("Raj",1,"CS");
        Student student2= new Student("Mukesh",2,"IT");
        Student student3= new Student("Mohit",3,"CS");

        // we need to add this data to Student list

        ArrayList<Student> studentArrayList= new ArrayList<>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        arrayListHashMap.put("AGRA",studentArrayList);

        Student student4= new Student("Raj",10,"CS");
        Student student5= new Student("Mukesh",11,"IT");
        Student student6= new Student("Mohit",12,"CS");

        ArrayList<Student> dpsList= new ArrayList<>();
        dpsList.add(student4);
        dpsList.add(student5);
        dpsList.add(student6);

        arrayListHashMap.put("DPS",dpsList);

        Student student7= new Student("Raj",100,"CS");
        Student student8= new Student("Mukesh",101,"IT");
        Student student9= new Student("Mohit",102,"CS");

        ArrayList<Student>jnuList= new ArrayList<>();
        jnuList.add(student7);
        jnuList.add(student8);
        jnuList.add(student9);
        arrayListHashMap.put("JNU",jnuList);


        //Q-1 print only those who are from AGRA college

        for(String key : arrayListHashMap.keySet()){

            if(key.equals("AGRA")){

                ArrayList<Student> list= arrayListHashMap.get(key);

                for(Student var: list){

                    System.out.println("Name: "+var.getName() +" Roll No: "+var.getRollNo()+" Section:"+var.getSection());
                }

            }

        }
//Q-2 print only those who are from AGRA college
        for(String key : arrayListHashMap.keySet()){

            if(key.equals("DPS")){

                ArrayList<Student> list= arrayListHashMap.get(key);

                for(Student var: list){

                    System.out.println("Name: "+var.getName() +" Roll No: "+var.getRollNo()+" Section:"+var.getSection());
                }

            }

        }


        //Q3- print only those candidates who belongs to CS dept

        for(String key : arrayListHashMap.keySet()){

               ArrayList<Student> list= arrayListHashMap.get(key);

                for(Student var: list) {

                    if (var.getSection().equals("CS")) {
                        System.out.println("**************** Printing only CS Student ******************");
                        System.out.println("Name: " + var.getName() + " Roll No: " + var.getRollNo() + " Section:" + var.getSection());
                    }

                }



        }

    }
}
