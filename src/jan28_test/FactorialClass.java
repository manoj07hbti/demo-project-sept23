package jan28_test;
import java.util.Scanner;
public class FactorialClass {

    // Write a code to make factorial of number

    public static void main(String[] args) {

       int number, var =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number");
        number=scanner.nextInt();

        for(int i =1; i<=number; i++){
            var = var*i;
        }
        System.out.println("Printing the factorial " +var);
    }
}


