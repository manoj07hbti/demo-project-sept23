package collection.hashmap;

import java.util.HashMap;

public class Hashmap_IntKey_StringValue {
    public void createMap(){
        HashMap<Integer,String> studentsRank=new HashMap<>();

        studentsRank.put(1,"Shyam");
        studentsRank.put(2,"Sohan");
        studentsRank.put(3,"Ram");

        System.out.println("Student secured First position: "+studentsRank.get(1));
        System.out.println("Student secured Second position: "+studentsRank.get(2));
        System.out.println("Student secured Third position: "+studentsRank.get(3));
    }

    public static void main(String[] args) {
        Hashmap_IntKey_StringValue obj=new Hashmap_IntKey_StringValue();
        obj.createMap();
    }
}
