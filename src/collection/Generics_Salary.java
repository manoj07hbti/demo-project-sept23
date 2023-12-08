package collection;

import java.util.ArrayList;

public class Generics_Salary {
    public ArrayList<Double> createDoubleList() {

        ArrayList<Double> salary = new ArrayList<>();

        salary.add(98000.56);
        salary.add(89000.86);
        salary.add(88000.46);

        for(int i=0;i<salary.size();i++){
            System.out.println("Printing Population using For loop: " + salary.get(i));
        }

        int j=0;
        while(j<salary.size()){
            System.out.println("Printing population using while loop:"+salary.get(j));
            j++;
        }

        int k=0;
        do{
            System.out.println("Printing population using do while loop:"+salary.get(k));
            k++;
        } while(k<salary.size());

        for(Double var : salary){
            System.out.println("Printing population using Advance For loop: " +var);
        }

        return salary;
    }

    public static void main(String[] args) {
        Generics_Salary obj = new Generics_Salary();
        System.out.println("Printing Salary: " + obj.createDoubleList());
    }

}




