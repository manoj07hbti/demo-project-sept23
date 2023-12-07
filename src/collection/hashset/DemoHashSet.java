package collection.hashset;

import revision.Demo;

import java.util.HashSet;

public class DemoHashSet {


    public  HashSet<String>  createStringHashSet(){

        //CollectionName <Datatype> objName = new CollectionName<>();

        HashSet <String> course= new HashSet<>();

        course.add("java");
        course.add("Spring");
        course.add("Cloud");
        course.add("Microservices");
        course.add("java");
        course.add("Cloud");
        course.add("java");
        course.add("Spring");
        course.add("Cloud");
        course.add("Microservices");
        course.add("java");
        course.add("Cloud");

      return course;
    }

    public static void main(String[] args) {
        DemoHashSet obj= new DemoHashSet();
        HashSet<String> output=  obj.createStringHashSet();

        for(String var: output){

            System.out.println("Printing HashSet: "+var);
        }

    }

}
