package revision2;

public class VariablesManipulation {

    public static void main(String[] args) {

        // SYNTAX : Datatype varName;
        // Manipulation;

        int x = 20;
        int y = 30;

        int result = x + y;
        System.out.println(" Addition of x and y is : " + result);

        result = x - y;
        System.out.println(" Subtraction of x and y is : " + result);

        result = x * y;
        System.out.println(" Multiplication of x and y is : " + result);

        double devide = (double) x / y;
        System.out.println(" devision of x and y is : " + devide);

        // Square of number;

        int a = 10;

        result = a * a;
        System.out.println(" Square of number a is : " + result);

        // Cube of number;

        result = a * a * a;
        System.out.println(" Cube of number a is : " + result);

        // Calculate percentage;

        int c = 5000;
        int d = 20;

        double result2 = (double) c * d / 100;
        System.out.println(" Calculate percentage of number c and d / 100 is : " + result2);


    }
}
