package collection.hashmap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {

    public void createMap(){
        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap <String, Integer> hashMapIndex= new HashMap<>();
     // Adding data to hashMap:  put(key,Value);
        hashMapIndex.put("JRE",1);
        hashMapIndex.put("JVM",3);
        hashMapIndex.put("JDK",5);
        hashMapIndex.put("JDK",50);
        hashMapIndex.put(null,100);
    // how to read data:  get(key)

        System.out.println("Printing page number for JVM: " +hashMapIndex.get("JVM"));
        System.out.println("Printing page number for JDK: " +hashMapIndex.get("JDK"));

        System.out.println("Printing Map hashMapIndex: "+hashMapIndex);
        // How to iterate HashMap
        // we will use keySet()  to get all the key from hashMap as Set
       Set<String> keys=  hashMapIndex.keySet();
       for(String var : keys){

           System.out.println("printing map using loop: "+hashMapIndex.get(var));
       }

    }

    public void createCourseMap(){

        HashMap<Integer, String> course= new HashMap<>();
        course.put(1,"Java");
        course.put(2,"Spring Boot");
        course.put(3,"Cloud");
        course.put(4,"Microservices");
        course.put(3,"AWS");
        course.put(null,"Spring");

        System.out.println(course.get(3));
        System.out.println("Printing Map course: "+course);

       Set<Integer> keys= course.keySet();

       for(Integer var: keys){
           System.out.println("Printing map using loop : "+course.get(var));
       }
    }

    public static void main(String[] args) {
        DemoHashMap obj = new DemoHashMap();
        obj.createMap();
        obj.createCourseMap();
    }
}
