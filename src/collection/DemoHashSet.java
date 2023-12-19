package collection;

import java.util.HashSet;

public class DemoHashSet {
    public HashSet<String>createStringHashSet(){
        HashSet<String>course=new HashSet<>();
        course.add("Rahul");
        course.add("Nitin");
        course.add("rahul");
        course.add("prakash");
        course.add("neha");
        return course;
    }

    public static void main(String[] args) {
        DemoHashSet obj=new DemoHashSet();
        HashSet<String>output=obj.createStringHashSet();
        for(String var: output){
            System.out.println("print hashset: "+ var);
        }
    }
}
