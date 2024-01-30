package test_28_jan_sunday;

import java.util.Scanner;

public class Factorial {
    public void factorialNo() {

        Scanner scanner=new Scanner(System.in);
        int nunber=scanner.nextInt();
       long fact=1;
       for (int i=1;i<=nunber;i++){
           fact=fact*i;
       }
        System.out.println("Factorial of number is: "+fact);
    }

    public static void main(String[] args) {
        Factorial obj=new Factorial();
        obj.factorialNo();
    }
}