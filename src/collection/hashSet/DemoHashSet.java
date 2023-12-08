package collection.hashSet;

import java.util.HashSet;

public class DemoHashSet {
    public HashSet<String> createStringHashSet() {
        HashSet<String> countryName=new HashSet<>();
        countryName.add("India");
        countryName.add("Australia");
        countryName.add("Egypt");

        return countryName;
    }
    public HashSet<Long> createLongHashSet() {
        HashSet<Long> population = new HashSet<>();
        population.add(50000000L);
        population.add(120000L);
        population.add(450000L);

        return population;


    }
    public HashSet<Double> createDoubleHashSet(){
        HashSet<Double> salary = new HashSet<>();
        salary.add(500.0);
        salary.add(120.54);
        salary.add(4500.0099);

        return salary;
    }

    public static void main(String[] args) {
        DemoHashSet obj=new DemoHashSet();

        HashSet<String> countryName=obj.createStringHashSet();
        System.out.println("Printing CountryName : " +countryName );
        for (Object var : countryName) {
            System.out.println("Printing using Advanced loop: " + var);
        }


        HashSet<Long>  population=obj.createLongHashSet();
        System.out.println("Printing Population  : " +population);
        for (Object var : population) {
            System.out.println("Printing using Advanced loop: " + var);
        }



        HashSet<Double> salary=obj.createDoubleHashSet();
        System.out.println("Printing Salary      : " + salary);
        for (Object var : salary) {
            System.out.println("Printing using Advanced loop: " + var);
        }
    }
}

