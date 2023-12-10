package collection.hashset;

import java.util.HashSet;

public class HashSet_Double {

    public HashSet<Double> createDoubleHashSet(){
        HashSet<Double> salary = new HashSet<>();
        salary.add(98000.67);
        salary.add(89000.78);
        salary.add(78000.67);
        salary.add(98000.67);
        salary.add(89000.78);
        salary.add(78000.67);
        salary.add(88000.78);
        return salary;

    }

    public static void main(String[] args) {
        HashSet_Double obj =new HashSet_Double();
        HashSet<Double> output=obj.createDoubleHashSet();

        for(Double var:output){
            System.out.println("Printing salary: "+var);
        }
    }
}