package test_28_jan_23;

import java.util.Scanner;

public class PrimeNumber {
    public void primeNum(){
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean isPrime(int number) {
        // 0 and 1 are not prime
        if (number == 0 || number == 1) {
            return false;

        }
        // 2 is a prime number
        if (number == 2) {
            return true;
        }
        for (int i = 2;  i< number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumber obj=new PrimeNumber();
        System.out.print("Prime numbers between " + 1 + " and " + 20 + ":  " );
        obj.primeNum();
    }
}
