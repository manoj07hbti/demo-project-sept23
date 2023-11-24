package scanner;

import java.util.Scanner;

public class CalciApp {

    public int add(int p, int q) {

        return p + q;
    }

    public int sub(int p, int q) {

        return p - q;
    }

    public int multi(int p, int q) {

        return p * q;
    }

    public double divide(int p, int q) {

        return (double) p / q;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of p: ");
        int p = scanner.nextInt();
        System.out.println("Please enter value of q: ");
        int q = scanner.nextInt();

        System.out.println("Please enter 1 for Addition, 2 for Subtraction, 3 for Multiply and 4 for Divide");
        System.out.println("Please enter your choice: ");
        int choice = scanner.nextInt();

        CalciApp obj = new CalciApp();
        if (choice == 1) {
            System.out.println("Addition is: " + obj.add(p, q));
        } else if (choice == 2) {
            System.out.println("Sub is: " + obj.sub(p, q));
        } else if (choice == 3) {
            System.out.println("Multiply is: " + obj.multi(p, q));
        } else {
            System.out.println("Divide is: " + obj.divide(p, q));
        }


    }
}