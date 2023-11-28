package test_26_nov_23;

import java.util.Scanner;

public class CalcApp {
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
        boolean decision = true;
        while (decision == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter value of a: ");
            int a = scanner.nextInt();
            System.out.println("Please enter value of b: ");
            int b = scanner.nextInt();

            System.out.println("Please enter 3 for Addition, 6 for Subtraction, 9 for Multiply and 12 for Divide");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();

            CalcApp obj = new CalcApp();
            if (choice == 3) {
                System.out.println("Addition is: " + obj.add(a, b));
                // call addition

            } else if (choice == 6) {
                // call sub
                System.out.println("Sub is: " + obj.sub(a, b));
            } else if (choice == 9) {
                //call multi
                System.out.println("Multi is: " + obj.multi(a, b));
            } else if (choice == 12) {
                // call divide
                System.out.println("Divide is: " + obj.divide(a, b));
            }

            System.out.print("Do you want to continue? (y/n): ");
            String option = scanner.next();
            if (option.equals("y")) {
                System.out.println("okay lets calculate again");
                decision = true;
            } else {
                System.out.println("Program ended. Thank you!");
                decision = false;
            }
        }
    }
}

