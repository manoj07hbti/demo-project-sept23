package nov26_test;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no.");
        int number = scanner.nextInt();
        int num, temp, total = 0;
        num = number;
        while (num != 0) {
            temp = num % 10;
            total = total + temp * temp * temp;
            num = num / 10;
        }
        if (total == number) {
            System.out.println(" yes this is  Armstrong ");
        } else {
            System.out.println("No this is not Armstrong");
        }
    }
}

