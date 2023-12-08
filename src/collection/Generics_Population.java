package collection;

import java.util.ArrayList;

public class Generics_Population {

    public ArrayList<Long> createIntegerList(){

        ArrayList<Long> population  = new ArrayList<>();
        population.add(34000000000L);
        population.add(4500000000L);
        population.add(780000000000L);

        for(int i=0;i<population.size();i++){
            System.out.println("Printing Population using For loop: " + population.get(i));
        }


        int j=0;
        while(j<population.size()){
            System.out.println("Printing population using while loop:"+population.get(j));
            j++;
        }

        int k=0;
        do{
            System.out.println("Printing population using do while loop:"+population.get(k));
            k++;
        } while(k<population.size());

        for(Long var : population){
            System.out.println("Printing population using Advance For loop: " +var);
        }


        return population;
    }

    public static void main(String[] args) {
        Generics_Population obj =new Generics_Population();
        System.out.println("Printing Population: "+obj.createIntegerList());
    }
}
