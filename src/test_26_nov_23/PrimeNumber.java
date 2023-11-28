package test_26_nov_23;

import java.util.Scanner;

public class PrimeNumber {
    /*Write a method to find the Prime number between any given number range,
    it should ask the user Please enter the start number : Please enter the end number
    to Find the Prime Number and print all those prime number.
     */
    public static void primeNum(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    // function which checks whether a number is Prime or Not
    // If the number is prime, it returns true. Else, it returns false.
    public static boolean isPrime(int number) {
        // 0 and 1 are neither prime nor composite numbers
        if (number == 0 || number == 1) {
            return false;

        }
        // 2 is a prime number
        if (number == 2) {
            return true;
        }
        // every composite number has a prime factor
        // less than or equal to its square root.
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter start value
        System.out.print("Please enter the start number: ");
        int start = sc.nextInt();


        // Ask user to enter end value
        System.out.print("Please enter the end number: ");
        int end = sc.nextInt();


        // Print display message
        primeNum(start,end);



    }
}

