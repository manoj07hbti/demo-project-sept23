package class_and_object.Method_Function;

public class Calculator {

    int a = 48;
    int b = 23;
    int result = a + b;

    public void addition() {
        System.out.println("Addition: " + result);
    }


    public void substaction() {

         result=a-b;
         System.out.println("Substraction: " + result);
    }

    public void multiplication(){
        result=a*b;
        System.out.println("Multiplication: "+result);
    }


    public void Division(){
        double result=(double) a/b;
        System.out.println("Division: "+result);
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.addition();
        obj.substaction();
        obj.multiplication();
        obj.Division();
    }

}
