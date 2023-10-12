package demo_variables;

public class RevisionManipulation {


    public static void main(String[] args) {

        int a=10;
        int b=3;

        int result= a+b;
        System.out.println("Addition of a and b is : "+result);

        result= a-b;
        System.out.println("Subtraction of a and b is: "+result);

        result=a*b;
        System.out.println("Multiplication of a and b is :"+result);

       double divide=(double) a/b;
        System.out.println("Division of a and b is : "+divide);

        // increment or decrement operator

        int number=3;

        number++;
        System.out.println("Number after increment operator: "+number);

        number--;
        System.out.println("Number after decrement operator: "+number);

        a=8;
        b=2;

        a+=b; // a=a+b;
        System.out.println("Printing a: "+a);

        a-=b; //a=a-b
        System.out.println("Printing after - a "+a);

        a/=b;// a=a/b;
        System.out.println("After divide a: "+a);

    }
}
