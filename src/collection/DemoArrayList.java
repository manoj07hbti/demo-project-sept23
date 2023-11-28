package collection;

import java.util.ArrayList;

public class DemoArrayList {
    public void createArrayList(){
        ArrayList list=new ArrayList();
        list.add("Variable");
        list.add("Conditionals");
        list.add("For loop");
        list.add(2.44);
        list.add(65);
        list.add("While loop");
        list.add("Do While loop");
        list.add(4333);
        list.add(4.5);
        list.add(9.00);
        list.add("Break And Continue");
        list.add("Object And Class");
        list.add(5000);
        list.add("Array");
        list.add(89.3553232);
        list.add("Constructor");
        list.add(100);
        list.add(3);
        list.add("Method");
        list.add(345.67);
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










