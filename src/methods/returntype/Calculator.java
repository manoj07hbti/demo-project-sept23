package methods.returntype;

public class Calculator {
    //add
    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    //sub
    public int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    //multiplication
    public int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    //divide
    public double division(int a, int b) {
        double result = (double) a / b;
        return result;
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println("Sum of given number is : " + obj.addition(2,5));
        System.out.println("Difference of given number is : " + obj.subtraction(9, 3));
        System.out.println("Multiplication of given number is : " +  obj.multiplication(12, 5));
        System.out.println("Division of given number is : " + obj.division(33, 8));
    }
}
