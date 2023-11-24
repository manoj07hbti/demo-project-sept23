package scanner;

import java.util.Scanner;

public class CalciAppLoop
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Choose an operation (+, -, *, /): ");
            scanner.nextLine();
            String operation = scanner.nextLine();

            double result = 0.0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.println("Do you want to continue? (yes/no): ");
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
    }
}

