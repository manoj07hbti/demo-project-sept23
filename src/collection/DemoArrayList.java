package collection;

import java.util.ArrayList;

public class DemoArrayList {

      // write a method to create Arraylist

    public void createArrayList(){

        ArrayList list= new ArrayList();

        // adding data to ArrayList obj.add(data);
        list.add("Java");    //INDEX 0
        list.add("Spring");  //INDEX 1
        list.add("Spring Boot");//INDEX 2
        list.add("Microservices");//INDEX 3
        list.add(33);// INDEX 4
        list.add(23);// INDEX 5
        System.out.println("Printing list: "+list);

        //READING data from list  obj.get(INDEX);
        System.out.println("Printing 3rd index data "+list.get(3));
        System.out.println("Printing 4rd index data "+list.get(4));

        // Reading all data from list
        for(int i=0; i<list.size();i++){
            System.out.println("Printing list data with loop: "+list.get(i) +" at Index: "+i);
        }
        int j=0;
        while (j<list.size()){
            System.out.println("Printing list using while loop: "+list.get(j));
            j++;
        }

        // Advanced for Loop :  for(Datatype var: array/collection) { BODY }
        System.out.println("Before Delete: ");
        for(Object var: list){

            System.out.println("Printing using Advanced loop: "+var);
        }

        // deleting data from ArrayList :  list.remove(INDEX);
        System.out.println("After Delete:");
       list.remove(2);
        for(int i=0; i<list.size();i++){
            System.out.println("Printing list data with loop: "+list.get(i) +" at Index: "+i);
        }


    }


    public static void main(String[] args) {

        DemoArrayList obj= new DemoArrayList();
        obj.createArrayList();
    }
}
