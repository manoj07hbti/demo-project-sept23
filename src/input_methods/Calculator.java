package input_methods;

import methods.CalculatorApp;

public class Calculator {

     // Calculator;
    // Addition;

    public void addition(int a, int b){

        int result=a+b;

        System.out.println("Sum of given number is : "+result);
    }

    // Sub;

    public void Subtraction(int a, int b){

        int result=a-b;

        System.out.println("Sum of given number is : "+result);
    }

    // Multiplication;

    public void Multiplication(int a, int b){

        int result=a*b;

        System.out.println("Sum of given number is : "+result);
    }

    // division;

    public void division(int a, int b){

        double result=(double)a/b;

        System.out.println("Sum of given number is : "+result);
    }

    public static void main(String[] args) {

        Calculator obj= new Calculator();

        obj.addition(10,2);
        obj.Subtraction(50,10);
        obj.Multiplication(2,5);
        obj.division(2,18);
    }

}
