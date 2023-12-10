package collection.hashset;

import java.util.HashSet;

public class DemoHashSet_String {

    public HashSet<String> createStringHashSet(){
        HashSet<String > subject=new HashSet<>();
        subject.add("English");
        subject.add("Math");
        subject.add("Science");
        subject.add("Hindi");
        subject.add("Math");
        subject.add("Science");


        return subject;

    }

    public static void main(String[] args) {
        DemoHashSet_String obj= new DemoHashSet_String();
        HashSet<String> output=obj.createStringHashSet();

        for(String var:output){
            System.out.println("Printing subject name: "+var);
        }

    }
}
