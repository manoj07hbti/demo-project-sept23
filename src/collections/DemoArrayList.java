package collections;

import java.util.ArrayList;
public class DemoArrayList
{
    public void createArrayList(){
        ArrayList list=new ArrayList();
        list.add("Rohan");
        list.add("Modi");
        list.add("Genius");
        list.add(44.99);
        list.add(12345);
        list.add(919191);
        list.add("java");
        list.add("Manoj");
        list.add(4.5);
        list.add(9.00);
        list.add("shiv");
        list.add("tannu");
        list.add(54321);
        list.add("deepak");
        list.add(99.99132);
        list.add("zameer");
        list.add(123);
        list.add(123456);
        list.add("shubham");
        list.add(113.54311);
        System.out.println("Printing list: "+list);
        System.out.println("Before Delete: ");

        //for Loop
        for(int i=0; i<list.size();i++){
            System.out.println("Printing list data with loop: "+list.get(i) +" at Index: "+i);
        }

        //While Loop
        int k=0;
        while (k<list.size()){
            System.out.println("Printing list using while loop: "+list.get(k)+" at Index: "+k);
            k++;
        }

        //Do-While Loop
        int j=0;
        do {
            System.out.println("Printing list using do-while loop: " + list.get(j)+" at Index: "+j);
            j++;
        }while (j< list.size());


        // Advanced for Loop :  for(Datatype var: array/collection) { BODY }
        for(Object var: list){
            System.out.println("Printing using Advanced loop: "+var);
        }

        // deleting data from ArrayList :  list.remove(INDEX);
        System.out.println("After Delete:");
        list.remove(10);
        for(int i=0; i<list.size();i++){
            System.out.println("Printing list data with loop: "+list.get(i) +" at Index: "+i);
        }

        k = 0;
        while (k<list.size()){
            System.out.println("Printing list using while loop: "+list.get(k)+" at Index: "+k);
            k++;
        }


        j=0;
        do {
            System.out.println("Printing list using do-while loop: " + list.get(j)+" at Index: "+j);
            j++;
        }while (j< list.size());


        for(Object var: list){
            System.out.println("Printing using Advanced loop: "+var);
        }



    }
    public static void main(String[] args) {
        DemoArrayList obj= new DemoArrayList();
        obj.createArrayList();
    }
}
