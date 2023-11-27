package test_nov27_2023;

//Write a method to find the Prime number between any given number range, it should ask the user Please enter the start number : Please enter the end number to Find the Prime Number and print all those prime number.
import java.util.Scanner;
public class PrimeNumber {

    public static void PrimeNumbersRange(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= number) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the start number: ");
        int start = scanner.nextInt();

        System.out.print("Please enter the end number: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        PrimeNumbersRange(start, end);
    }
}

