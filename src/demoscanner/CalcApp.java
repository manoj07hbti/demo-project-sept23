package demoscanner;

import java.util.Scanner;

public class CalcApp {
    public int add(int a, int b){

        return a+b;
    }
    public int sub(int a, int b){

        return a-b;
    }
    public int multi(int a, int b){

        return a*b;
    }
    public double divide(int a, int b){

        return (double) a/b;
    }
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a=scanner.nextInt();
        System.out.println("Please enter value of b: ");
        int b=scanner.nextInt();

        System.out.println("Please enter 1 for Addition, 2 for Subtraction, 3 for Multiply and 4 for Divide");
        System.out.println("Please enter your choice: ");
        int choice= scanner.nextInt();

        CalcApp obj= new CalcApp();
        if(choice==1){
            System.out.println("Addition is: "+obj.add(a,b));
            // call addition
        }else if (choice==2){
            // call sub
            System.out.println("Sub is: "+obj.sub(a,b));
        }else if(choice==3){
            //call multi
            System.out.println("Multiply is: "+obj.multi(a,b));
        } else {
            // call divide
            System.out.println("Divide is: "+obj.divide(a,b));
        }
    }
}