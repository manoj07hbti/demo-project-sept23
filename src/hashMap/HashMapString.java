package hashMap;

import java.util.HashMap;

public class HashMapString {
    public void citiesHashMap(){
        HashMap<String,String>hashMapInput=new HashMap<>();
        hashMapInput.put("pune","agra");
        hashMapInput.put("agra","tdl");
        hashMapInput.put("fzd","aligarh");
        hashMapInput.put("dli","guru");
        System.out.println("printing cities name: "+hashMapInput);
    }

    public static void main(String[] args) {
        HashMapString obj=new HashMapString();
        obj.citiesHashMap();
    }
}
