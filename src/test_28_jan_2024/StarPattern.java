package test_28_jan_2024;
import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();

        // Loop through the rows
        for (int i = 1; i <= rows; i++) {
            // Loop to print '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing '*' in each row
            System.out.println();
        }
    }
}
