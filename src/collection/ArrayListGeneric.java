package collection;

import java.util.ArrayList;

public class ArrayListGeneric {
    public ArrayList<String>StringList(){
        ArrayList<String>list=new ArrayList<>();
        list.add("Rahul");
        list.add("St.Jones");
        list.add("Agra");

        return list;

    } public ArrayList<Integer>IntList(){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(44);
        list.add(65);
        list.add(60);
        return list;

    } public ArrayList<Double>DoubleList(){
        ArrayList<Double>list=new ArrayList<>();
        list.add(89.54);
        list.add(890.564);
        list.add(56897.566);
        return list;
    }

    public static void main(String[] args) {
        ArrayListGeneric obj=new ArrayListGeneric();
        ArrayList<String>output=obj.StringList();
        System.out.println("Printing output: "+ output);
        ArrayList<Integer>result=obj.IntList();
        System.out.println("Printing result: "+ result);
        ArrayList<Double>result2=obj.DoubleList();
        System.out.println("Printing double:"+result2);
        for(int i=0; i<2; i++){
            System.out.println("Printing string: "+output+result+result2);
            int j=0;
            for(String var: output){
                System.out.println("Printing by advance loop: "+output);
            }
        }
    }
}
