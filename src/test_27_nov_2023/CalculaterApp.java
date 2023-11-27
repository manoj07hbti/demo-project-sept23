package test_27_nov_2023;

import java.util.Scanner;

public class CalculaterApp {

    public double percentage(int a, int b) {
        return (double) a * b / 100;
    }

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("please enter the value of a: ");
        int a = obj.nextInt();
        System.out.println("please enter the value of b: ");
        int b = obj.nextInt();

        System.out.println("please enter 1 for percentage,5 for addition,10 for subtraction,15 for multiplication,20 for division");
        System.out.println("please enter your choice: ");
        int choice = obj.nextInt();

        CalculaterApp obj1 = new CalculaterApp();
        if (choice == 1) {
            System.out.println("Percentage is: " + obj1.percentage(a, b));

        } else if (choice == 5) {
            System.out.println("Addition is: " + obj1.addition(a, b));
        } else if (choice == 10) {
            System.out.println("subtraction is: " + obj1.subtraction(a, b));
        } else if (choice == 15) {
            System.out.println("multiplication is: " + obj1.multiplication(a, b));
        } else if (choice == 20) {
            System.out.println("division is: " + obj1.division(a, b));
        }

    }

}
