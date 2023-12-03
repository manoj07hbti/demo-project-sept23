package test_nov27_2023;

import java.util.Scanner;

    public class ArmstrongNumber {

        public static boolean isArmstrong(int num) {
            int originalNumber, remainder, result = 0, n = 0;

            originalNumber = num;

            // Count number of digits
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++n;
            }

            originalNumber = num;

            // Calculate the sum of cubes of individual digits
            while (originalNumber != 0) {
                remainder = originalNumber % 10;
                result += (remainder * remainder * remainder);
                originalNumber /= 10;
            }

            // Check if the given number is equal to the sum of cubes of its digits
            return result == num;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            if (isArmstrong(number)) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }