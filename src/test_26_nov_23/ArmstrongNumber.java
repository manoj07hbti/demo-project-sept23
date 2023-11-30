package test_26_nov_23;

import java.util.Scanner;

public class ArmstrongNumber {
    //Write a method to check if the given number is Armstrong or not, ask the user to enter this number.
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        int rem;

        while (number > 0) {
            rem = number % 10;
            sum = (sum + rem*rem*rem);
            number = number / 10;
        }
        return originalNumber == sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
