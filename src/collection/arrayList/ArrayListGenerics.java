package collection.arrayList;

import java.util.ArrayList;

public class ArrayListGenerics {

    public ArrayList<String> createStringList(){
   //SYNTAX :  CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Spring Boot");
        //list.add(33); Generics is providing compile time safety to avoid other datatype
        //System.out.println("Printing List: "+list);
        return list;
    }

    public ArrayList<Integer> createIntList(){
        ArrayList<Integer> list= new ArrayList<>();

        list.add(213);
        list.add(12);
        list.add(45);
        //list.add(23.45);

        return list;
    }

    public static void main(String[] args) {
        ArrayListGenerics obj= new ArrayListGenerics();
        ArrayList<String> output=obj.createStringList();
        System.out.println("Printing output: "+output);

       System.out.println("Printing Integer list: "+obj.createIntList());
    }

}
