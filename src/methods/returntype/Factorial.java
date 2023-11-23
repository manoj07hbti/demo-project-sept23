package methods.returntype;

public class Factorial {
    public int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("Factorial of the number is: " + obj.factorial(5));
    }
}
