package jan28_test;

import java.util.Scanner;

import static nov26_test.PrimeNumber.isPrime;

public class PrimeNumber {
 //write a code to check prime number between 1 to 20.
    public static void main(String[] args) {
    int start;
    int end;
    int i;
    int j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start numbers");
        start=scanner.nextInt();
        System.out.println("Enter the End Number");
        end=scanner.nextInt();
        for(i =start; i<=end; i++){
            for(j =2; j<=i; j++){

                if(i%j==0)
                 break;
            }
            if(i==j)
                System.out.println( "Printing the prime numbers : " + j + " " );
        }
    }
    }



