package collection;

import java.util.ArrayList;

public class Array_List {

    // Print by simple method and form arrray list
    public void createArrayList() {
        ArrayList list = new ArrayList();
        list.add("JAVA");
        list.add("Class");
        list.add("Service");
        list.add("Provider");
        list.add("Assignment");
        list.add("Collection");
        list.add(89);
        list.add(78);
        list.add(98);
        list.add(89.78);
        list.add(87.67);
        list.add("Framework");
        list.add("Percentage");
        list.add("Factorial");
        list.add("Calculator");
        list.add("Method");
        list.add("Cube");


        System.out.println("Printing list: " + list);

        // By For Loop

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Printing List: " + list.get(i));
        }

        // By While Loop

        int j=0;
        while(j< list.size()){
            System.out.println("Printing List: " + list.get(j));
            j++;
        }

        // By Do While Loop
        j=0;

        do{

            System.out.println("Printing List: " + list.get(j));
            j++;
        }while(j< list.size());

        // By Advanced for Loop

        for(Object var: list){
            System.out.println("Printing List: "+var);
        }
        list.remove(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Printing List: " + list.get(i));
        }

    }


    public static void main(String[] args) {
        Array_List obj=new Array_List();
        obj.createArrayList();
    }

}
