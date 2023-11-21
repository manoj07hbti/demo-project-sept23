package methods;

public class Calculator {
    //add
    public void addition(int a, int b) {
        int result = a + b;
        System.out.println("Sum of given number is : " + result);
    }

    //sub
    public void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction of given number is : " + result);
    }

    //multiplication
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of given number is : " + result);
    }

    //divide
    public void division(int a, int b) {
        double result = (double) a / b;
        System.out.println("Dividation of given number is : " + result);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.addition(2, 8);
        obj.subtraction(9, 3);
        obj.multiplication(12, 5);
        obj.division(33, 8);
    }
}
