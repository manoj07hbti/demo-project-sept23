package test_nov27_2023;

//Write a calculator App with Scanner and ask user for choice : 2 for addition 4 for subtraction , 6 - for multiply and 8 for divide

import java.util.Scanner;


public class Calculator {
    public int add(int x, int y) {

        return x + y;
    }

    public int sub(int x, int y) {

        return x - y;
    }

    public int multi(int x, int y) {

        return x * y;
    }

    public double divide(int x, int y) {

        return (double) x / y;
    }

    public static void main(String[] args) {

        boolean condition = true;
        while (condition) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter value of x: ");
            int a = scanner.nextInt();
            System.out.println("Please enter value of y: ");
            int b = scanner.nextInt();

            System.out.println("Please enter 2 for Addition, 4 for Subtraction, 6 for Multiply and 8 for Divide");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();

            Calculator obj = new Calculator();
            if (choice == 2) {
                System.out.println("Addition is: " + obj.add(a, b));
            } else if (choice == 4) {
                System.out.println("Sub is: " + obj.sub(a, b));
            } else if (choice == 6) {
                System.out.println("Multiply is: " + obj.multi(a, b));
            } else if (choice==8){
                System.out.println("Divide is: " + obj.divide(a, b));
            } else {
                System.out.println("Please enter a valid method");
            }


            System.out.println("Do you want to Exit ? press Y to exit or press any key to continue...");
            Scanner scannerInput = new Scanner(System.in);
            String inputString = scannerInput.nextLine();
            if (inputString.equals("Y")) {
                condition = false;
            }
        }
    }
}