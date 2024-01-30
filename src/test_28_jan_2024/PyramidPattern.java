package test_28_jan_2024;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the Pattern: ");
        int rows = scanner.nextInt();

        // Printing the pyramid pattern
        for (int i = 0; i < rows; i++) {
            // Printing spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for (int k = 0; k <= i * 2; k++) {
                System.out.print("*");
            }

            // Moving to the next line
            System.out.println();
        }

        scanner.close();
    }
}
