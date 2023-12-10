package collection.hashset;

import java.util.HashSet;

public class HashSet_Integer {
    public HashSet<Integer> createIntegerHashSet() {
        HashSet<Integer> marks=new HashSet<>();
        marks.add(78);
        marks.add(86);
        marks.add(87);
        marks.add(78);
        marks.add(86);
        marks.add(96);
        return marks;
    }

    public static void main(String[] args) {
        HashSet_Integer obj=new HashSet_Integer();
        HashSet<Integer> result=obj.createIntegerHashSet();

        for(Integer var:result){
            System.out.println("Printing marks: "+var);
        }
    }
}
