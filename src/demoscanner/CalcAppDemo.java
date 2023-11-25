package demoscanner;

import java.util.Scanner;

public class CalcAppDemo {
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
        boolean choice = true;
        while (choice == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter value of a: ");
            int a = scanner.nextInt();
            System.out.println("Please enter value of b: ");
            int b = scanner.nextInt();

            System.out.println("Please enter type of operation you want to perform +,-,*,/: ");
            String operation = scanner.next();

            CalcApp obj = new CalcApp();
            switch (operation) {
                case "+":
                    System.out.println("Addition is: " + obj.add(a, b));
                    break;
                case "-":
                    System.out.println("Sub is: " + obj.sub(a, b));
                    break;
                case "*":
                    System.out.println("Multiply is: " + obj.multi(a, b));
                    break;
                case "/":
                    System.out.println("Divide is: " + obj.divide(a, b));
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
            System.out.println("Do you want to continue , enter y/n: ");
            String option = scanner.next();
            if (option.equals("y")) {
                System.out.println("Lets begin the program again");
                choice = true;
            } else {
                System.out.println("Program ends");
                choice = false;
            }
        }
    }
}

