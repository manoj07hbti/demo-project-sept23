package collection;

import java.util.ArrayList;

public class DemoArrayList {
    public void ArrayList(){
        ArrayList list= new ArrayList();
        list.add("rahul");
        list.add("agra");
        list.add(77);
        list.add("St. jones");
        list.add("India");
        list.add("java");
        list.add("hello world");
        list.add(70);
        list.add("Town");
        System.out.println("Print list of elements"+ list);
        System.out.println("Printing 2nd index data: "+list.get(2));
        System.out.println("Printing 3rd index data: "+list.get(3));
        // by for loop
        for(int i=0; i<list.size(); i++){
            System.out.println("Print all index: "+list.get(i));
        } int j=0; // by while loop
        while(j<list.size()){
            System.out.println("Printing by while loop"+ list.get(j));
            j++;
        }  // by advance loop
         for(Object var: list){
            System.out.println("by advance loop: "+ var);
        }
    }

    public static void main(String[] args) {
        DemoArrayList obj=new DemoArrayList();
        obj.ArrayList();
    }
}
