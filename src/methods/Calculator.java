package methods;

public class Calculator {
    //add
    public void addition() {

        int a = 65;
        int b = 97;

        int result = a + b;

        System.out.println("Sum of given number is : " + result);
    }
    //sub
    public void subtract(){
        int a =43;
        int b =55;
        int sub = a-b;

        System.out.println("Subtract of given number is : "+sub);
    }
    //divide
    public void divide(){
        int a =99;
        int b =10;
        double divide = (double) a/b;

        System.out.println("Division of given numbers : "+divide);
    }

    //multi
    public void multiply(){
        int a = 10;
        int b = 20;
        int multiply = a*b;
        System.out.println("Multiply of given numbers : "+multiply);
    }

    // percentage number * pecentage/100
 public void percentage(){
     double Percentage = 50;
     int a =200;

    double percentage = (double) 200 * 50 / 100;
     System.out.println("Percentage of given number : "+percentage);

 }

    public static void main(String[] args) {
        methods.Calculator obj = new methods.Calculator();
        obj.addition();
        obj.subtract();
        obj.divide();
        obj.multiply();
        obj.percentage();
    }
}
