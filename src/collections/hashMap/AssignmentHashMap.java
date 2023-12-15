package collections.hashMap;

import java.util.HashMap;

public class AssignmentHashMap
{
    public void createmap()
    {
        HashMap<String,Integer> physicsBook = new HashMap<>();
        physicsBook.put("Electrostatics",1);
        physicsBook.put("Energy", 9);
        physicsBook.put("Hysteresis", 39);
        physicsBook.put("Volume" ,51);

        System.out.println("Electrostatics is at " +physicsBook.get("Electrostatics") +" Page Number");
        System.out.println("Energy is at "+physicsBook.get("Energy")+ " Page Number");
        System.out.println("Hysteresis is at "+ physicsBook.get("Hysteresis") +" Page Number");
        System.out.println("Volume is at " +physicsBook.get("Volume") + " Page Number");

        System.out.println("Printing PhysicsBook Map"+physicsBook);
    }

    public void createStudentmap()
    {
        HashMap<String, String> studentcityidentification =new HashMap<>();
        studentcityidentification.put("Rahul","Pune");
        studentcityidentification.put("Rohan","Bundi");
        studentcityidentification.put("Sneha","Mumbai");
        studentcityidentification.put("Deepika","Delhi");


        System.out.println("Rahul Belongs to "+studentcityidentification.get("Rahul"));
        System.out.println("Rohan Belongs to "+studentcityidentification.get("Rohan"));
        System.out.println("Sneha Belongs to "+studentcityidentification.get("Sneha"));
        System.out.println("Deepika Belongs to "+studentcityidentification.get("Deepika"));

        System.out.println("Printing studentcityidentification Map"+studentcityidentification);
    }


    public void createPricemap(){
        HashMap<String,Double> foodprice=new HashMap<>();
        foodprice.put("Pasta", 199.99);
        foodprice.put("Beagles", 359.59);
        foodprice.put("Caviar",515.49);
        foodprice.put("Bread",25.15);

        System.out.println("lilac hotel serves Pasta at "+foodprice.get("Pasta")+" Rupees");
        System.out.println("lilac hotel serves Beagles at "+foodprice.get("Beagles")+" Rupees");
        System.out.println("lilac hotel serves Caviar at "+foodprice.get("Caviar")+" Rupees");
        System.out.println("lilac hotel serves Bread at "+foodprice.get("Bread")+" Rupees");

        System.out.println("Printing foodprice Map"+foodprice);
    }
    public static void main(String[] args) {
        AssignmentHashMap obj = new AssignmentHashMap();
        obj.createmap();
        obj.createStudentmap();
        obj.createPricemap();
    }
}
