package assignment_loops;

public class AssignmentDoWhile {
    public static void main(String[] args) {
        int number = 5;
        int i = 1;

        // Multiplication Table of 5
        System.out.println("Multiplication Table of 5:");

        while (i <= 10) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
            i++;

        }
        // Multiplication Table of 10
        int number2 = 10;
        int j = 1;

        System.out.println("Multiplication Table of 10:");

        while (j <= 10) {
            int result = number2 * j;
            System.out.println(number2 + " x " + j + " = " + result);
            j++;


        }
        // To print all even number between 1 to 100 using while loop

        int a = 1;

        System.out.println("Even numbers between 1 and 100 :");

        while (a <= 100) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a++;
        }


        // To print all odd number between 1 to 100 using while loop
        int b = 1;

        System.out.println("Odd numbers between 1 and 100:");

        while (b <= 100) {
            if (b % 2 != 0) {
                System.out.println(b);
            }
            b++;
        }



        // To check if nay given number is prime or not

        int x = 8;
        boolean isPrime = true;

        for (int k = 2; k < x; k++) {

            if (x % k == 0) {
                isPrime = false;

            }
        }

        if (isPrime) {
            System.out.println("Number is Prime Number: " + x);
        } else {
            System.out.println("Number is NOT a Prime Number: " + x);
        }

    }
}
