package test_26_nov_23;

import java.util.Scanner;

public class Palindrome {
    //Write a method to check if the number is Palindrome or not, ask the user to enter this number.
    public static boolean isPalindrome(int number) {
        int originalNum = number;
        int reversedNum = 0;

        while (number > 0) {
            int rem = number % 10;
            reversedNum = (reversedNum * 10) + rem;
            number = number / 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
