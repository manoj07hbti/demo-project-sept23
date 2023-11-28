package nov26_test;

import java.util.Scanner;
public class CalculatorApp {

    // write a calculator App with Scanner ask user for choice: 11 for addition 22 for substraction, 33 - for multiply
    // and 44 for divide

    public int add(int a, int b){

        return a+b;
    }
    public int sub(int a, int b){

        return a-b;
    }
    public int multi(int a, int b){

        return a*b;
    }
    public double divide(int a, int b){

        return (double) a/b;
    }
    public static void main(String[] args) {
        boolean condition = true;
        while (condition) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter value of a: ");
            int a = scanner.nextInt();
            System.out.println("Please enter value of b: ");
            int b = scanner.nextInt();

            System.out.println("Please enter 11 for Addition, 22 for Subtraction, 33 for Multiply and 44 for Divide");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();

            CalculatorApp obj = new CalculatorApp();
            if (choice == 11) {
                System.out.println("Addition is: " + obj.add(a, b));

            } else if (choice == 22) {

                System.out.println("Sub is: " + obj.sub(a, b));
            } else if (choice == 33) {

                System.out.println("Multi is: " + obj.multi(a, b));
            } else if (choice == 44) {

                System.out.println("Divide is: " + obj.divide(a, b));
            }

            System.out.print("Do you want to continue? (y/n): ");
            String option = scanner.next();
            if (option.equals("n")) {
                condition = false;
                }
            }
        }}


