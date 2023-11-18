package methods.inputMethod;

public class Factorial {
    public void factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.factorial(4);
        obj.factorial(6);
    }
}
