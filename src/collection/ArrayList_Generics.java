package collection;

import java.util.ArrayList;

public class ArrayList_Generics {

    public ArrayList<String> arrayliststring(){

        ArrayList<String> list=new ArrayList<>();

        list.add("india");
        list.add("australia");
        list.add("china");
        list.add("russia");

        return list;

    }
    public ArrayList <Long> arraylistlong(){
        ArrayList<Long> population=new ArrayList<>();
        population.add(44679432L);
        population.add(10000000L);
        population.add(620000000L);

        return population;

    }
    public ArrayList<Double> arrayListdouble(){
        ArrayList<Double> salary=new ArrayList<>();
        salary.add(5000.25);
        salary.add(62222.01);
        salary.add(85236.58);

        return salary;



    }


    public static void main(String[] args) {
        ArrayList_Generics obj=new ArrayList_Generics();
        ArrayList<String> output=obj.arrayliststring();
        ArrayList<Long> count=obj.arraylistlong();
        ArrayList<Double> account=obj.arrayListdouble();



        for(String var:output){
            System.out.println("printing with advance for loop: "+var);
        }
        for(int a=0;a<output.size();a++){
            System.out.println("printing with for loop: "+output.get(a));
        }
        int b=0;
        while (b<output.size()){
            System.out.println("printing with while loop: "+output.get(b));
            b++;
        }
        int c=0;
        do{
            System.out.println("printing with do while loop: "+output.get(c));
            c++;
        }while(c<output.size());

        for(Long var:count){
            System.out.println("Advance for loop population : "+var);
        }
        for(int i=0;i<count.size();i++){
            System.out.println("for loop population: "+count.get(i));
        }
        int a=0;
        while(a<count.size()){
            System.out.println("while loop population: "+count.get(a));
            a++;
        }
        int x=0;
        do{
            System.out.println("do while loop population: "+count.get(x));
            x++;
        }while (x<count.size());
        for(Double var:account){
            System.out.println("salary with advance for loop: "+var);
        }
        for(int f=0;f<account.size();f++){
            System.out.println("salary with for loop: "+account.get(f));
        }
        int g=0;
        while(g<account.size()){
            System.out.println("salry with while loop: "+account.get(g));
            g++;
        }
        int h=0;
        do{
            System.out.println("salary with do while loop: "+account.get(h));
            h++;
        }while(h<account.size());



    }





}
