package function_method;
import java.util.Scanner;

public class CalcIExit {
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

    public static void main(String[] args) {
        boolean condition=true;

        while (true) {
            System.out.println("This is while loop");

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter number b: ");
            int b = sc.nextInt();
            CalcIExit obj = new CalcIExit(); //
            System.out.println("Enter 1for add,2for sub, 3for multi, 4for divide");
            System.out.println("Enter your choice");
            int choice = sc.nextInt(); //
            if (choice == 1) {
                System.out.println("Addition: " + obj.add(a, b));
            } else if (choice == 2) {
                System.out.println("Sub: " + obj.sub(a, b));
            } else if (choice == 3) {
                System.out.println("Multi: " + obj.multi(a, b));
            } else {
                System.out.println("Divide: " + obj.division(a, b));

            }
            System.out.println("For exit y or continue press any key");
            Scanner scannerInput= new Scanner(System.in);
            String inputString=scannerInput.nextLine();
            if(inputString.equals("y")){
                condition=false;
            }

        }


    }

}
