package scanner;

import java.util.Scanner;

public class DemoScanner
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter the username: ");
        String username= scanner.nextLine();
        System.out.println("Username Accepted");

        System.out.println("please enter password: " );
        String password= scanner.nextLine();
        System.out.println("Password Accepted");

        System.out.println("Please enter percentage: ");
        double percentage=scanner.nextDouble();
        System.out.println("Qualified Percentage: ");

        System.out.println("Please enter salary in rupees:");
        double salary=scanner.nextDouble();
        System.out.println("You are valid for income tax regime");

        System.out.println("please enter any integer value");
        int value= scanner.nextInt();
        System.out.println("value accepted");

    }
}
