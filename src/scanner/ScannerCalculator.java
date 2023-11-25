package scanner;

import java.util.Scanner;

public class ScannerCalculator {

    // Scanner Calculator;
    // Addition;
    public int Addition(int a, int b) {

        return a + b;
    }

    // Subtraction;
    public int Subtraction(int a, int b) {

        return a - b;
    }

    // Multiplication;
    public int Multiplication(int a, int b) {

        return a * b;
    }

    // Division;
    public double Divide(int a, int b) {

        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a = obj1.nextInt();

        System.out.println("Please enter value of b: ");
        int b = obj1.nextInt();

        System.out.println("Please enter 1 add, 2 sub, 3 multiply, 4 divide: ");
        System.out.println("Please your choice: ");
        int choice = obj1.nextInt();

        ScannerCalculator obj2 = new ScannerCalculator();
            // Call Addition;
        if (choice == 1) {
            System.out.println("Addition is: " + obj2.Addition(a, b));
            // Call Subtraction;
        } else if (choice == 2) {
            System.out.println("Subtraction is: " + obj2.Subtraction(a, b));
            // Multiplication;
        } else if (choice == 3) {
            System.out.println("Multiplication is: " + obj2.Multiplication(a, b));
            // Division;
        } else {
            System.out.println("Division is: " + obj2.Divide(a, b));
        }

    }
}
