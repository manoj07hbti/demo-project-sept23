package test_27_nov_monday;

import java.util.Scanner;

public class Scanner_Cal {
    public double percentage(int a, int b) {

        double c = (double) a * b / 100;
        return c;
    }
    public int add(int a, int b) {

        return a + b;
    }

    public int sub(int a, int b) {

        return a - b;
    }

    public int multi(int a, int b) {

        return a * b;
    }

    public double divide(int a, int b) {

        return (double) a / b;
    }

    public static void main(String[] args) {
        boolean condition = true;
        while (condition) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter value of a: ");
            int a = scanner.nextInt();
            System.out.println("Please enter value of b: ");
            int b = scanner.nextInt();

            System.out.println("Please enter 1 for Percentage, 5 for Addition, 10 for Substraction ,15 for multiply and 20 for Divide");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();

            Scanner_Cal obj = new Scanner_Cal();
            if (choice == 1) {
                System.out.println("Percentage is: " + obj.percentage(a, b));

            } else if (choice == 5) {

                System.out.println("Addition is: " + obj.add(a, b));
            } else if (choice == 10) {

                System.out.println("Substraction is: " + obj.sub(a, b));
            } else if (choice == 15) {

                System.out.println("Multiply is: " + obj.multi(a, b));
            } else if (choice == 20) {
                System.out.println("Divide is: " + obj.divide(a, b));
            }
            System.out.println("Do you want to Exit ?Press Z to exit or Press any key to continue.");
            Scanner scannerInput = new Scanner(System.in);
            String inputString = scannerInput.nextLine();
            if (inputString.equals("Z")) {
                condition = false;
            }

        }



    }
}





