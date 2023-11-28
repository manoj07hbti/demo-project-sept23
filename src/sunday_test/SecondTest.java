package sunday_test;
import java.util.Scanner;
public class SecondTest {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        return (double) a / b;
    }

    public double percent(int a, int b) {
        return (double) a * b / 100;
    }

    public static void main(String[] args) {
        boolean condition = true;
        while (condition) {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number a: ");
            System.out.println("Enter number b: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            SecondTest obj=new SecondTest();
            System.out.println("4 for addition, 8 for subtraction, 12 for multiply, and 16 for divide");
            System.out.println("Enter user choice");
            int choice=sc.nextInt();
            if(choice==4){ System.out.println("Addition: "+obj.add(a,b));

            } else if(choice==8){
                System.out.println("Subtraction: "+ obj.sub(a,b));
            } else if(choice==12){
                System.out.println("Multiply: "+obj.multi(a,b));
            } else{
                System.out.println("Divide: "+obj.division(a,b));
            }
            System.out.println(" Y for exit and press any for continue");
            Scanner input=new Scanner(System.in);
            String scInt=input.nextLine();
            if(scInt.equals("y")){
                condition=false;
            }

        }
    }
}