package Variables;

public class DemoAdvanceVariables {
    public static void main(String[] args) {

        int x = 100;
        int y = 3;
        int add = x + y;

        System.out.println("Addition of x and y..." + add);

        int sub = x - y;
        System.out.println("Subtraction of x and y..." + sub);

        int multi = x * y;

        System.out.println("Multiplication of x and y..." + multi);

        double divide = (double) x / y;

        System.out.println("Dividation of x and y..." + divide);

        int a = 2;
        int squre = a * a;

        System.out.println("Square of a..." + squre);

        int b = 5;
        int cube = b * b * b;

        System.out.println("Cube of b..." + cube);

        int p = 50;
        double percentage = (double) p * 10 / 100;

        System.out.println("Percantage of 100..." + percentage);

        a=10;
        b=3;
        a+=b;
        System.out.println("PRINT RESULT ADD..."+a);

        a-=b;
        System.out.println("PRINT RESULT SUB..."+a);

        a*=b;
        System.out.println("PRINT RESULT MULTI..."+a);

        a/=b;
        System.out.println("PRINT RESULT DIVIDE..."+a);
    }
}
