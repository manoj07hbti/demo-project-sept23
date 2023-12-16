package collection.hashmap;

public class HashMap {


    public void createIntegerStringMap() {

        // 1. Create a hashMap of integer key and String value;

        // HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        java.util.HashMap<Integer, String> hashMapIndex = new java.util.HashMap<>();

        // Adding data to hashMap:  put(key,Value);

        hashMapIndex.put(1, "One");
        hashMapIndex.put(2, "Two");
        hashMapIndex.put(3, "Three");
        hashMapIndex.put(4, "Four");
        hashMapIndex.put(5, "Five");

        // how to read data:  get(key);

        System.out.println("Printing hashMap of integer key and String value: " + hashMapIndex.get(1));
    }
    // 2. Create a hashMap of String key and String value;

    public void createStringStringMap() {

        java.util.HashMap<String, String> hashMapIndex = new java.util.HashMap<>();

        hashMapIndex.put("Key 1 ", "Value 1 ");
        hashMapIndex.put("Key 2 ", "Value 2 ");
        hashMapIndex.put("Key 3", "Value 3 ");
        hashMapIndex.put("Key 4 ", "Value 4 ");
        hashMapIndex.put("Key 5 ", "Value 5 ");


        System.out.println("Printing hashMap of String key and String value : " + hashMapIndex.get("Key 1 "));
    }
    // 3. Create a hashMap of String key and Double value;

    public void createStringDoubleMap() {

        java.util.HashMap<String, Double> hashMapIndex = new java.util.HashMap<>();

        hashMapIndex.put("One", 40000.35);
        hashMapIndex.put("Two", 45000.40);
        hashMapIndex.put("Three", 50000.45);
        hashMapIndex.put("Four", 55000.50);
        hashMapIndex.put("Five", 60000.55);

        System.out.println("Printing hashMap of String key and Double value: " + hashMapIndex.get("One"));
    }

    public static void main(String[] args) {

        HashMap obj = new HashMap();
        obj.createIntegerStringMap();
        obj.createStringStringMap();
        obj.createStringDoubleMap();
    }
}