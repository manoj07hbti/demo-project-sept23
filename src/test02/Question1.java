package test02;

import scanner.CalcApp;

import java.util.Scanner;

public class Question1 {

//Write a calculator App with Scanner
//ask user for choice :3 for percentage, 5 for addition 10 for subtraction , 15 - for multiply and 20 for divide

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

            System.out.println("Please enter 5 for Addition, 10 for Subtraction, 15 for Multiply and 20 for Divide");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();

            CalcApp obj = new CalcApp();
            if (choice == 5) {
                System.out.println("Addition is: " + obj.add(a, b));
                // call addition
            } else if (choice == 10) {
                // call sub
                System.out.println("Sub is: " + obj.sub(a, b));
            } else if (choice == 15) {
                //call multi
                System.out.println("Multiply is: " + obj.multi(a, b));
            } else {
                // call divide
                System.out.println("Divide is: " + obj.divide(a, b));

                System.out.println("Do you want to Exit ? press Y to exit or press any key to continue...");
                Scanner scannerInput = new Scanner(System.in);
                String inputString = scannerInput.nextLine();
                if (inputString.equals("Y")) {
                    condition = false;
                }
            }
        }
    }
}
