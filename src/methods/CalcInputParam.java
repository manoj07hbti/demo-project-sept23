package methods;

import java.sql.SQLOutput;

public class CalcInputParam {

    public void add(int a,int b){
        int result=a+b;

        System.out.println("Addition is : "+result);

    }

    public void divide(int a, int b){

        double result= (double) a/b;

        System.out.println("Division is :"+result);
    }
    public static void main(String[] args) {

        CalcInputParam obj= new CalcInputParam();
        obj.add(12,3);
        obj.add(23,12);

        obj.divide(4,2);
        obj.divide(3,2);
        obj.divide(10,3);

    }
}
