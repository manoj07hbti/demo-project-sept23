package variables1;

public class Variable_manipulation_Assignment {

    public static void main(String[] args) {

        int a=20;
        int b=6;
        int result=a+b;
        System.out.println("addition of a and b :"+result);

        result=a-b;
        System.out.println("subtraction of a & b :"+result);
        result=a*b;
        System.out.println("multiplication of a & b :"+result);
       result=a/b;
        System.out.println("division of a with b :"+result);
        double divide=(double) a/b; //we need to do type casting to find actual result
        System.out.println("divide of a with b :"+divide);




    }



}
