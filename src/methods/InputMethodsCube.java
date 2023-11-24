package methods;

public class InputMethodsCube {

    public void cube(int number) {
        System.out.println("Cube of number are " + number * number * number);

    }

    //write a method to check Prime number : 9
    public void primenumber(int number, boolean isPrime) {

        if (number % 2 == 0) {
            System.out.println("Number is divisible ...");
            isPrime = false;
        }
        if (isPrime) {
            System.out.println("Number is Prime Number: " + number);
        } else {
            System.out.println("Number is NOT a Prime  Number: " + number);
        }
    }

    //write a methods to calculator
    public void add(int a, int b) {
        int result = a + b;

        System.out.println("Addition is : " + result);

    }

    public void substract(int a, int b) {
        int result = a - b;
        System.out.println("Substraction is " + result);
    }

    public void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiply is " + result);
    }

    public void divide(int a, int b) {

        double result = (double) a / b;

        System.out.println("Division is :" + result);
    }

    public void factorial(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;

        }
        System.out.println("Factorial is: " + fact);
    }
    public void percentage(int a,int b){

        double result=(double)a*b/100;
        System.out.println("Percentage is : "+result);
    }

    public static void main(String[] args) {
        InputMethodsCube obj = new InputMethodsCube();
        obj.cube(2);
        obj.cube(3);
        obj.primenumber(9, true);
        obj.add(2, 3);
        obj.divide(15, 4);
        obj.substract(10, 5);
        obj.multiply(5, 6);
        obj.factorial(5);
        obj.factorial(12);
        obj.percentage(10,200);
    }
}
