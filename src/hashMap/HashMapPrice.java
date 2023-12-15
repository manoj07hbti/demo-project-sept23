package hashMap;

import java.util.HashMap;

public class HashMapPrice {
    public void priceHashMap(){
        HashMap<String,Double>hashMapIndex=new HashMap<>();
        hashMapIndex.put("book",450.50);
        hashMapIndex.put("car",7898689.98);
        hashMapIndex.put("laptop",78000.99);
        hashMapIndex.put("Mobile",54000.99);
        System.out.println("Printing book price: "+hashMapIndex.get("book"));
        System.out.println("Printing car price: "+hashMapIndex.get("car"));
        System.out.println("Price of laptop: "+hashMapIndex.get("laptop"));
        System.out.println("Price of Mobile:"+hashMapIndex.get("Mobile"));
        System.out.println("Printing all price of product are: "+ hashMapIndex);
    }

    public static void main(String[] args) {
        HashMapPrice obj=new HashMapPrice();
        obj.priceHashMap();
    }
}
