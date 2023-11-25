package function_method;
import java.util.Scanner;

public class CalcNewApp {
    public int add(int a, int b){
        return a+b;
    } public int sub(int a, int b){
        return a-b;
    }public int multi(int a, int b){
        return a*b;
    }  public double divide(int a, int b){
        return (double)a/b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a =sc.nextInt();
        System.out.println("Enter number b: ");
        int b =sc.nextInt();
        CalcNewApp obj=new CalcNewApp();
        System.out.println("Enter 1 for addition, 2 for sub, 3 for multi, 4 for divide ");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("Add: "+obj.add(a,b));

        } else if(choice==2){
            System.out.println("Sub: "+obj.sub(a,b));

        }else if(choice==3){
            System.out.println("Multi: "+obj.multi(a,b));


        }else{
            System.out.println("divide: "+obj.divide(a,b));

        }
    }
}
