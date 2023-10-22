package test_coding;

import java.io.PrintStream;

public class FirstTest {

    public static void main(String[] args) {

        //Write a code to identify number which is not divisible by 3
        int n = 5;
        System.out.println("Enter the number");

        if (n % 3 == 0) {
            System.out.println("Number is divisible by 3");

        } else {
            System.out.println("Number is not divisible by 3");
        }

        //write a code to check eligible voter in Pune

        int age = 19;
        String city = "Pune";
        if (age >= 18 && city == "Pune") {
            System.out.println("Candidate is eligible for voting in pune");
        } else {
            System.out.println("Candidate not belongs to Pune");
        }
        //
        //Write a code to find percentage of given number example: 5% of 500

        double Marks = 500;
        int a = 500;
        int b = 5;
        Marks = (double) 500 * 5 / 100;
        System.out.println("Printing percentage of vishal: " + Marks);
        //
        //write a code to check if any given number is  even or odd number

        int number = 4;
        if (number % 2 == 0) {
            System.out.println("The number is belongs to an even number");
        } else {
            System.out.println("The number belong to odd number");
        }
        //
        //write a code to check person nationality , if nationality is India then check state should be Maharashtra then print both Nationality and state and if person is from different nation it should print that as well in else part.

        String Nationality = "Indian";
        String State = "Maharashtra";

        if (Nationality == "Indian") {
            if (State == "Maharashtra") {
                System.out.println("You are an " + Nationality + " and you belong to " + State);

            } else {
                System.out.println("You are not belongs to" + State);
            }
        } else {
            System.out.println("You are not belongs to India");
        }
        //write a code to swap two numbers a and b without using any third variable.

        a = 6543;
        b = 8765;

        System.out.println("Printing the variable = " + a);
        System.out.println("Printing the variable = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Exchange the variable a and b");
        System.out.println("Printing variable a after using  = " + a);
        System.out.println("Printing variable b after using = " + b);
    }
}
