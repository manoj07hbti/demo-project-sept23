package test_27_nov_2023;

import java.util.Scanner;

public class CalculatorScanner {

    //Write a calculator App with Scanner;
    //ask user for choice : 10 for addition 20 for subtraction , 30 - for multiply and 40 for divide;
    // Scanner Calculator;
    // Addition;

    public int Addition(int a, int b) {

        return a + b;
    }
    // sub;

    public int Subtraction(int a, int b) {

        return a - b;
    }
    // multiplication;

    public int Multiplication(int a, int b) {

        return a * b;
    }
    // divide;

    public double divide(int a, int b) {

        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner obj1 = new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a = obj1.nextInt();

        System.out.println("Please enter value of b: ");
        int b = obj1.nextInt();

        System.out.println("Please enter 10 add, 20 sub, 30 multiply, 40 divide: ");
        System.out.println("Please your choice: ");
        int choice = obj1.nextInt();

        CalculatorScanner obj2 = new CalculatorScanner();
        // Add;
        if (choice == 10) {
            System.out.println("Addition is: " + obj2.Addition(a, b));
            // Sub;
        } else if (choice == 20) {
            System.out.println("Subtraction is: " + obj2.Subtraction(a, b));
            // Multiply;
        } else if (choice == 30) {
            System.out.println("Multiplication is: " + obj2.Multiplication(a, b));
            // divide;
        } else if (choice==40) {
            System.out.println("divide is: " + obj2.divide(a, b));
        }


    }
}
