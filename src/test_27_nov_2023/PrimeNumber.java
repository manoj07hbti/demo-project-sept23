package test_27_nov_2023;

import java.util.Scanner;

public class PrimeNumber {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter start no value: ");
        int b=scanner.nextInt();
        System.out.println("please enter last no value: ");
        int c=scanner.nextInt();

        for(int a=b;a<=c;a++){
            boolean prime=true;
            for(int d=2;d<a;d++){
                if(a%d==0){
                    prime=false;

                }
            }
            if(prime){
                System.out.println("this is a prime no: "+a);
            }else {
                System.out.println("this is not prime no: "+a);
            }

        }







    }



}
