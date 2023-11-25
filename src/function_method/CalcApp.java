package function_method;

import java.util.Scanner;

public class CalcApp {
    public int add(int a, int b){
        return a+b;
    } public int sub(int a, int b){
        return a-b;
    } public int multi(int a, int b){
        return a*b;
    } public double divide(int a,int b){
        return (double)a/b;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a=scanner.nextInt();
        System.out.println("Enter value of b: ");
        int b=scanner.nextInt();
        CalcApp obj= new CalcApp();
      int result=  obj.add(a,b);
        System.out.println("Addition: "+result);
        result=obj.sub(a,b);
        System.out.println("sub: "+result);
        result=obj.multi(a,b);
        System.out.println("Multi is: "+ result);
        double division=obj.divide(a,b);
        System.out.println("Division: "+division);

    }

    }



