package methods;

public class Calculator {
    //add
    public void addition() {
        int a = 8;
        int b = 5;
        int result = a + b;
        System.out.println("Sum of given number is : " + result);
    }

    //sub
    public void subtraction() {
        int a = 8;
        int b = 5;
        int result = a - b;
        System.out.println("Difference of given number is : " + result);
    }

    //multiplication
    public void multiplication() {
        int a = 8;
        int b = 5;
        int result = a * b;
        System.out.println("Multiplication of given number is : " + result);
    }

    //divide
    public void division() {
        double a = 8;
        double b = 5;
        double result = a / b;
        System.out.println("Division of given number is : " + result);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}

