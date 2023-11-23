package input_methods;

public class ReturntypeCalculator {

    // Calculator;
    // Addition;

    public int addition(int a, int b){

        int result=a+b;

        return result;

    }

    // Sub;

    public int Subtraction(int a, int b){

        int result=a-b;

        return result;

    }

    // Multiplication;

    public int Multiplication(int a, int b){

        int result=a*b;

        return result;

    }

    // division;

    public float division(int a, int b){

        double result=(double)a/b;

        return (float) result;

    }

    public static void main(String[] args) {

        ReturntypeCalculator obj= new ReturntypeCalculator();

        int result1= obj.addition(10,2);

        System.out.println("Sum of given number is  " + result1);

        int result2= obj.Subtraction(50,10);

        System.out.println("Sum of given number is  " + result2);

        int result3= obj.Multiplication(2,5);

        System.out.println("Sum of given number is  " + result3);

        int result4= (int)obj.division(4,2);

        System.out.println("Sum of given number is  " + result4);
    }
}
