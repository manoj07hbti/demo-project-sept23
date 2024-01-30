package test_28_jan_2024;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int number= 5;
        int Factorial= 1;

        for(int i=1; i<=number; i++){
            Factorial*= i;
        }
        System.out.println("Factorial of " + number + " is: " + Factorial);
    }
}
