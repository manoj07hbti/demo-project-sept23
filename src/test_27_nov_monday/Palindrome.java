package test_27_nov_monday;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no.");
        int number= scanner.nextInt();
        int rev=0;
        int temp=number;
        while(number>0){
            rev=rev*10;
            rev=rev+number%10;
            number=number/10;

        }if(rev==temp){
            System.out.println("Number is palindrome");

        }else{
            System.out.println("Number is not palindrome");
        }
    }
}
