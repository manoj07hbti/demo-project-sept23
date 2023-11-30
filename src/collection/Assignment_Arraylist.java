package collection;

import java.util.ArrayList;

public class Assignment_Arraylist {

    public void demoarraylist(){
        //Create one Arraylist object and add 20 elements

        ArrayList list=new ArrayList();

        list.add(12);
        list.add(36);
        list.add(152);
        list.add(612);
        list.add(182);
        list.add(212);
        list.add(92);
        list.add(82);
        list.add(17);
        list.add(123);
        list.add(5);
        list.add(8);
        list.add(71);
        list.add(7);
        System.out.println("printing"+list);

        System.out.println("printing: "+list.get(5));

        for(int i=0;i< list.size();i++){
            System.out.println("printing: "+list.get(i));
        }
        int j=0;
        while (j< list.size()){
            System.out.println("printing with while loop: "+list.get(j));
            j++;

        }
        int k=0;
        do{
            System.out.println("printing with do while loop: "+list.get(k));
            k++;
        }while (k< list.size());

        for(Object var:list){
            System.out.println("printing with advance for loop: "+var);
        }
        list.remove(4);
        for (int i=0;i<list.size();i++){
            System.out.println("printing after using remove: "+list.get(i));
        }
        list.remove(5);
        int p=0;
        while(p< list.size()){
            System.out.println("printing after using remove object: "+list.get(p));
            p++;
        }
        list.remove(6);
        int e=0;
        do{
            System.out.println("printing with do while loop: "+list.get(e));
            e++;
        }while(e< list.size());
        list.remove(9);
        for(Object var:list){
            System.out.println("printing with advance loop: "+var);
        }





    }


    public static void main(String[] args) {
        Assignment_Arraylist obj=new Assignment_Arraylist();
        obj.demoarraylist();
    }
}
