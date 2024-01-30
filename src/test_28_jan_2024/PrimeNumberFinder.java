package test_28_jan_2024;
import java.util.Scanner;

public class PrimeNumberFinder
{

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number of the range: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the Last Number of the range: ");
        int lastNumber = scanner.nextInt();

        System.out.println("Prime numbers between " + firstNumber + " and " + lastNumber + " are:");
        for (int num = firstNumber; num <= lastNumber; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }


}

