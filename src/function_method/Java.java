package function_method;

import java.util.Scanner;

public class Java {
    public double div( int a , int b){
        return (double)a/b;
    } public int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a");
        int a=input.nextInt();
        System.out.println("enter b");
        int b=input.nextInt();
        int result=a+b;
        Java obj=new Java();

        System.out.println("1 for add , 2for divide");
        System.out.println("enter number");
        int choice=input.nextInt();
        if(choice==1){
            System.out.println("add:"+obj.add(a,b));
        } else{
            System.out.println("divide: "+obj.div(a,b));
        }
    }
}
