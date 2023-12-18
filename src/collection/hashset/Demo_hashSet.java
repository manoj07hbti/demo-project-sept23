package collection.hashset;

import java.util.HashSet;

public class Demo_hashSet {

    public HashSet<String> createhashset(){

        HashSet<String> country=new HashSet<>();
        country.add("India");
        country.add("Austrailia");
        country.add("Russia");
        country.add("India");
        country.add("Austrailia");
        country.add("Russia");
        return country;
    }
    public HashSet<Integer> createinthashset(){
        HashSet<Integer> marks=new HashSet<>();
        marks.add(100);
        marks.add(35);
        marks.add(40);
        marks.add(76);
        marks.add(70);
        marks.add(80);
        return marks;
    }
    public HashSet<Double> createdoublehashset(){
        HashSet<Double> salary=new HashSet<>();
        salary.add(100000.50);
        salary.add(15064.65);
        salary.add(25045.65);
        return salary;
    }

    public static void main(String[] args) {
        Demo_hashSet obj=new Demo_hashSet();
        HashSet<String> output=obj.createhashset();
        HashSet<Integer> output1=obj.createinthashset();
        HashSet<Double> output2=obj.createdoublehashset();

        for(String var:output){
            System.out.println("printing country name: "+var);
        }
        for(Integer var:output1){
            System.out.println("printing marks: "+var);
        }
        for(Double var:output2){
            System.out.println("printing salary:"+var);
        }


    }


}
