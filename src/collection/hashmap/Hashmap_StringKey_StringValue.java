package collection.hashmap;

import java.util.HashMap;

public class Hashmap_StringKey_StringValue {
    public void createMap(){
        HashMap<String ,String> writersName=new HashMap<>();

        writersName.put("Geetanjali","Rabindranath Tagore");
        writersName.put("Made In India","Amitabh Kant");
        writersName.put("Just Aspire","Ajai Chowdhry");

        System.out.println("Book writer Made In India: "+writersName.get("Made In India"));
        System.out.println("Book writer Just Aspire: "+writersName.get("Just Aspire"));
    }

    public static void main(String[] args) {
        Hashmap_StringKey_StringValue obj=new Hashmap_StringKey_StringValue();
        obj.createMap();
    }
}
