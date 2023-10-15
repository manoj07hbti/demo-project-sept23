package demo_variables;

public class Addition {
    public static void main(String[] args) {
        int x = 24;
        int y = 5;
        int c = x + y;
        System.out.println("Addition is: " + c);
        int d = x - y;
        System.out.println("Substraction is: " + d);
        int e = x * y;
        System.out.println("Multiply is: " + e);
        double f = (double) x / y; // This is typecasting;
        System.out.println("Division is: " + f);
    }
}