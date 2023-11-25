package scanner;

    import java.util.Scanner;

    public class ScientificCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double result = 0.0;

            while (true) {
                System.out.println("Scientific Calculator Menu:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Square Root");
                System.out.println("6. Power");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                if (choice == 7) {
                    System.out.println("Exiting...");
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        double num2 = scanner.nextDouble();
                        result = num1 + num2;
                        break;
                    case 2:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = num1 - num2;
                        break;
                    case 3:
                        System.out.print("Enter first number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter second number: ");
                        num2 = scanner.nextDouble();
                        result = num1 * num2;
                        break;
                    case 4:
                        System.out.print("Enter numerator: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter denominator: ");
                        num2 = scanner.nextDouble();
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                    case 5:
                        System.out.print("Enter number to find square root: ");
                        num1 = scanner.nextDouble();
                        if (num1 >= 0) {
                            result = Math.sqrt(num1);
                        } else {
                            System.out.println("Cannot find square root of a negative number.");
                        }
                        break;
                    case 6:
                        System.out.print("Enter base number: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter exponent: ");
                        num2 = scanner.nextDouble();
                        result = Math.pow(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                }

                System.out.println("Result: " + result);
                System.out.println();
            }

            scanner.close();
        }
    }

