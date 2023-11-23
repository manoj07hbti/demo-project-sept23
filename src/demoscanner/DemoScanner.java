package demoscanner;

import java.util.Scanner;

public class DemoScanner {
    public String name(String name){
        return name;
    }
    public int age(int age) {
        return age;
    }
    public String city(String city){
        return city;
    }
    public int mobileNumber(int number){
        return number;
    }
    public double salary(int salary) {
        return salary;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your personal Information");
        System.out.println("enter your Name: ");
        String name=sc.nextLine();
        System.out.println("your Age: ");
        int age=sc.nextInt();
        System.out.println("enter your City: ");
        String city=sc.nextLine();
        System.out.println("your Phn Number: ");
        int phnNum=sc.nextInt();
        System.out.println("your Salary: ");
        double salary=sc.nextDouble();
        System.out.println("Thankyou");
        DemoScanner obj=new DemoScanner();
    }
}
