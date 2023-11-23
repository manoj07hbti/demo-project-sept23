package methods;

public class CalculatorApp {

       // CalculatorApp;
       // Addition;

       public void addition(){

         int a=20;
         int b=30;
         int result=a+b;

         System.out.println("Sum of given number is : "+result);
     }

      // Sub;

       public void Subtraction(){

         int a=10;
         int b=40;
         int result=a-b;

           System.out.println("Sum of given number is : "+result);
       }

      // Multiplication;

       public void Multiplication(){

         int a=50;
         int b=100;
         int result=a*b;

           System.out.println("Sum of given number is : "+result);
       }

     // division;

       public void division(){

         int a=10;
         int b=9;
         double result=(double)a/b;

           System.out.println("Sum of given number is : "+result);
       }

    public static void main(String[] args) {

         CalculatorApp obj= new CalculatorApp();

         obj.addition();
         obj.Subtraction();
         obj.Multiplication();
         obj.division();
    }







}
