package hashMap;

import java.util.HashMap;

public class DemoHashMap {
    public void createMap(){
        HashMap<String,Integer>hashMapIndex=new HashMap<>();
        hashMapIndex.put("jvm",1);
        hashMapIndex.put("jre",2);
        hashMapIndex.put("jdk",3);
        hashMapIndex.put("python",4);
        System.out.println(hashMapIndex.get("jvm"));
        System.out.println(hashMapIndex.get("jre"));
        System.out.println(hashMapIndex.get("jdk"));
        System.out.println(hashMapIndex.get("python"));
    }

    public static void main(String[] args) {
        DemoHashMap obj= new DemoHashMap();
        obj.createMap();
    }
}
