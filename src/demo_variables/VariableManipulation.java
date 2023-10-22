package demo_variables;

public class VariableManipulation {

    public static void main(String[] args) {

        int a=100;
        int b=3;

       int result= a+b;

       System.out.println("Addition of a and b is :"+result);
       result=a-b;
       System.out.println("Subtraction is: "+result);
       result=a*b;
       System.out.println("Multi is :"+result);

       result=a/b;

       System.out.println("Division is: "+result);

        double divide=(double) a/b;  // we need to do type casting
        System.out.println("Division with double variable: "+divide);

        result=a*b/100;
        System.out.println("percentage "+result);

        int z=10;
       int square=z*z;
        System.out.println("square of z is " +square);

        square=z*z*z;

        System.out.println("qube of z is "+square);




    }
}
