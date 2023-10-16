package manipulation;

public class VariableManipulation {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int result = a + b;
        System.out.println("Addition of a and b is :" + result);
        result = a - b;
        System.out.println("Subtraction is: " + result);
        result = a * b;
        System.out.println("Multi is :" + result);

        result = a / b;

        System.out.println("Division is: " + result);

        double divide = (double) a / b;  // we need to do type casting
        System.out.println("Division with double variable: " + divide);
        a = 1;
        b = 0;
        System.out.println(a / b);

    }
}
