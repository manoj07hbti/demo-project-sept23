package scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        //Create Object of Scanner class
        Scanner scanner= new Scanner(System.in);

        // Reading String data
        System.out.println("Please enter user name : ");
        String name= scanner.nextLine();// it used to read String input value and return same value
        System.out.println("You have entered :"+name);

        System.out.println("Please enter Age :");
        int age= scanner.nextInt(); // it reads integer value and return the same
        System.out.println("You have entered Age: "+age);

        System.out.println("Please Enter salary :");
        double salary= scanner.nextDouble();// reads decimal values...
        System.out.println("You have entered salary : "+salary);
    }
}
