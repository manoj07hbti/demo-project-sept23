package collection;

import java.util.ArrayList;

public class ArrayListGenerics {
    public ArrayList<String> createStringList() {
        //SYNTAX :  CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<String> countryName = new ArrayList<>();
        countryName.add("India");
        countryName.add("Australia");
        countryName.add("Egypt");

        return countryName;
    }

    public ArrayList<Long> createIntList() {
        ArrayList<Long> population = new ArrayList<>();

        population.add(50000000L);
        population.add(120000L);
        population.add(450000L);

        return population;
    }

    public ArrayList<Double> createDoubleList() {
        ArrayList<Double> salary = new ArrayList<>();

        salary.add(500.0);
        salary.add(120.54);
        salary.add(4500.0099);

        return salary;
    }

    public static void main(String[] args) {
        ArrayListGenerics obj = new ArrayListGenerics();


        ArrayList<String> countryName=obj.createStringList();
        System.out.println("Printing CountryName : " + countryName);
        for (int i = 0; i < countryName.size(); i++) {
            System.out.println("Printing list data with loop: " + countryName.get(i));
        }
        int k = 0;
        while (k < countryName.size()) {
            System.out.println("Printing list using while loop: " + countryName.get(k));
            k++;
        }
        int j = 0;
        do {
            System.out.println("Printing list using do-while loop: " + countryName.get(j));
            j++;
        } while (j < countryName.size());


        for (Object var : countryName) {
            System.out.println("Printing using Advanced loop: " + var);
        }



        ArrayList<Long>  population=obj.createIntList();
        System.out.println("Printing Population  : " +population);


        for (int i = 0; i < population.size(); i++) {
            System.out.println("Printing list data with loop: " + population.get(i));
        }
        k = 0;
        while (k < population.size()) {
            System.out.println("Printing list using while loop: " + population.get(k));
            k++;
        }
        j = 0;
        do {
            System.out.println("Printing list using do-while loop: " + population.get(j));
            j++;
        } while (j < population.size());


        for (Object var : population) {
            System.out.println("Printing using Advanced loop: " + var);
        }



        ArrayList<Double> salary=obj.createDoubleList();
        System.out.println("Printing Salary      : " + salary);

        for (int i = 0; i < salary.size(); i++) {
            System.out.println("Printing list data with loop: " + salary.get(i));
        }
        k = 0;
        while (k < salary.size()) {
            System.out.println("Printing list using while loop: " + salary.get(k));
            k++;
        }
        j = 0;
        do {
            System.out.println("Printing list using do-while loop: " + salary.get(j));
            j++;
        } while (j < salary.size());


        for (Object var : salary) {
            System.out.println("Printing using Advanced loop: " + var);
        }
    }
}
