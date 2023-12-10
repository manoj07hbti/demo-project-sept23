package collections.hashset;

import java.util.HashSet;
public class AssignmentHashset
{
    public HashSet<String> createStringHashset(){
        HashSet <String> brand= new HashSet<>();

        brand.add("Louis Vuitton");
        brand.add("Coco Channel");
        brand.add("Prada");
        brand.add("Jimmy Choo");
        brand.add("Coco Channel");
        brand.add("Prada");
        brand.add("Louis Vuitton");
        brand.add("Adidas Originals");

        return brand;
    }

    public HashSet <Integer> createintHashset(){
        HashSet <Integer> establishment = new HashSet<>();

        establishment.add(1827);
        establishment.add(1911);
        establishment.add(1829);
        establishment.add(1918);
        establishment.add(1827);
        establishment.add(1911);
        establishment.add(1947);
        establishment.add(123450);

        return establishment;
    }
    public HashSet<Double> createDoubleHashset(){
        HashSet <Double> averagePrice = new HashSet<>();
        averagePrice.add(1999.99);
        averagePrice.add(2999.99);
        averagePrice.add(1399.999);
        averagePrice.add(189531.21515);
        averagePrice.add(1999.99);
        averagePrice.add(2999.99);
        averagePrice.add(1399.999);
        averagePrice.add(189531.21515);

        return averagePrice;
    }

    public static void main(String[] args) {

        AssignmentHashset obj=new AssignmentHashset();


        HashSet<String> brand= obj.createStringHashset();
     for(String var: brand){
         System.out.println("Printing String Hashset of given " +var);
     }


     HashSet<Integer> establishment= obj.createintHashset();
     for(int var: establishment){
         System.out.println("Printing Int Hashset of given " + var);
     }


     HashSet<Double> averagePrice= obj.createDoubleHashset();
     for (double var: averagePrice){
         System.out.println("Printing double hashset of given "+ var);
     }
    }
}