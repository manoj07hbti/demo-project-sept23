package demo_variables;

public class Square {
    public static void main(String[] args) {
         int x=3;
         int result=x*x;
         System.out.println("Square of 3=" +result);
         x=4;
        System.out.println("Square of 4="+x*x);
        x=5;
        System.out.println("Square of 5="+ x*x);
        x=5;
        System.out.println("Square of 5="+ x*x);
        x=6;
        System.out.println("Square of 6="+x*x);
        // There are cubes of 2, 3, 4 and 5
        x=2;
        result=x*x*x;
        System.out.println("Cube of 2="+result );
        x=3;
        System.out.println("Cube of 3="+x*x*x);
        x=4;
        System.out.println("Cube of 4="+x*x*x);
        x=5;
        System.out.println("Cube of 5="+x*x*x);
        x=6;
        System.out.println("Cubes of 6="+x*x*x);


        // now i am calculating some percentage related question
        // if a =230 and b=400% then calculate percent
        //Syntax= number*percentage/100
        double a, b, percentage;
        a=230;
        b=400;
        double percent=(double)a*b/100;
        System.out.println("Percentage="+percent+"%");
        a=17;
        b=65;
        percent=(double)a*b/100;
        System.out.println("percent="+percent+"%");

        // addition of number
        x=9;
       int y=23;
       int add =x+y;
       System.out.println("add="+add);
       x=76;
       y=45;
       int subtraction=x-y;
       System.out.println("Subtraction="+subtraction);
       x=75;
       y=8;
       subtraction=x-y;
       System.out.println("Sub="+subtraction);
       x=8;
       y=9;
       int multi=x*y;
       System.out.println("Multi="+multi);
       x=6;
       y=4;
       multi=x*y;
       System.out.println("Multi="+multi);
       x=67;
       y=5;
       double divide=(double)x/y;
       System.out.println("Divide="+divide);
       x=20;
       y=6;
      divide=(double)x/y;
      System.out.println("divide="+divide);
      x=97;
      y=5;
      int division=x/y;
      System.out.println("Division="+division);












    }
}
