package collection.hashmap;

import java.util.HashMap;

public class Hashmap_StringKey_DoubleValue {
    public void creatMap(){
        HashMap<String,Double> productCost=new HashMap<>();

        productCost.put("Iphone",125000.78);
        productCost.put("Led",45000.67);
        productCost.put("Refrigerator",18000.56);
        productCost.put(null,23000.34);

        System.out.println("Cost of Iphone: "+productCost.get("Iphone"));
        System.out.println("Cost of Led: "+productCost.get("Led"));
        System.out.println("Cost of Refrigerator: "+productCost.get("Refrigerator"));
        System.out.println("Cost of Iphone: "+productCost.get("Iphone"));
        System.out.println("Cost of Iphone: "+productCost);

    }

    public static void main(String[] args) {
        Hashmap_StringKey_DoubleValue obj=new Hashmap_StringKey_DoubleValue();
        obj.creatMap();
    }
}
