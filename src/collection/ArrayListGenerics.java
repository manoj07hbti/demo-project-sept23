package collection;

import java.util.ArrayList;

public class ArrayListGenerics {

    public ArrayList<String> createStringList() {

        // Create ArrayList Generics;
        // SYNTAX :  CollectionName <Datatype> objName = new CollectionName<>();
        // 1. String list : CountryName;

        ArrayList<String> list = new ArrayList<>();
        list.add("India");
        list.add("China");
        list.add("United States");
        list.add("Indonesia");
        list.add("Pakistan");

        // for loop;

        for (int i = 0; i < list.size(); i++) {

            System.out.println("Printing Generics using for loop: " + list.get(i));
        }
        // while loop;

        int a = 0;
        while (a < list.size()) {

            System.out.println("Printing Generics using while loop: " + list.get(a));
            a++;
        }
        // Advance for loop;

        for (String var : list) {

            System.out.println("Printing Generics using advance for loop: " + var);
        }
        // do while loop;

        a = 0;
        do {
            System.out.println("Printing Generics using do while loop: " + list.get(a));
            a++;
        } while (a < list.size());

        return list;
    }
    // Create ArrayList Generics;
    // 2.CountryPopulation : Long

    public ArrayList<Long> createLongList() {

        // Create ArrayList Generics;
        // 2.CountryPopulation : Long;

        ArrayList<Long> list = new ArrayList<>();
        list.add(1428627663L);
        list.add(1425671352L);
        list.add(339996563L);
        list.add(277534122L);
        list.add(240485658L);

        // for loop;

        for (int i = 0; i < list.size(); i++) {

            System.out.println("Printing Generics using for loop: " + list.get(i));
        }
        // while loop;

        int a = 0;
        while (a < list.size()) {

            System.out.println("Printing Generics using while loop: " + list.get(a));
            a++;
        }
        // Advance for loop;

        for (Long var : list) {

            System.out.println("Printing Generics using advance for loop: " + var);
        }
        // do while loop;

        a = 0;
        do {
            System.out.println("Printing Generics using do while loop: " + list.get(a));
            a++;
        } while (a < list.size());

        return list;
    }
    public ArrayList<Double> createDoubleList() {

        // Create ArrayList Generics;
        // 3. Salary:Double;

        ArrayList<Double> list = new ArrayList<>();
        list.add(40000.45);
        list.add(45000.50);
        list.add(50000.55);
        list.add(55000.60);
        list.add(60000.65);

        // for loop;

        for (int i = 0; i < list.size(); i++) {

            System.out.println("Printing Generics using for loop: " + list.get(i));
        }
        // while loop;

        int a = 0;
        while (a < list.size()) {

            System.out.println("Printing Generics using while loop: " + list.get(a));
            a++;
        }
        // Advance for loop;

        for (Double var : list) {

            System.out.println("Printing Generics using advance for loop: " + var);
        }
        // do while loop;

        a = 0;
        do {
            System.out.println("Printing Generics using do while loop: " + list.get(a));
            a++;
        } while (a < list.size());

        return list;

    }
    public static void main(String[] args) {

        ArrayListGenerics obj = new ArrayListGenerics();
        // Output 1;
        ArrayList<String> output1 = obj.createStringList();
        System.out.println("Printing Output1: " + output1);
        // Output 2;
        ArrayList<Long> output2 = obj.createLongList();
        System.out.println("Printing Output2: " + output2);
        // Output 3;
        ArrayList<Double> output3 = obj.createDoubleList();
        System.out.println("Printing Output3: " + output3);
    }
}
