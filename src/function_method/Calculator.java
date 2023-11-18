package function_method;

public class Calculator {
    public void addition(){

        int a =13;
        int b=19;
        int sum=a+b;
        System.out.println("Addition of ab is:"+ sum);
    }
    public void subtraction(){


        int a=13;
        int b=19;
        int subtraction=b-a;
        System.out.println("subtraction of given number is :"+subtraction);
    }
    public void multi(){
        int a=13;
        int b=19;
        int multi=a*b;
        System.out.println("Multiply of given number is :"+multi);

    } public void division(){
        int a=23;
        int b=12;
        double division=(double)a/b;
        System.out.println("division of given number:"+division);
    }
    public void percentage(){
        int a=23;
        int b=12;
        double percentage=(double)a*b/100;
        System.out.println("percent of this: "+percentage);

    }

    public static void main(String[] args) {
        Calculator objcalculator=new Calculator();
        objcalculator.addition();
        objcalculator.subtraction();
        objcalculator.multi();
        objcalculator.division();
        objcalculator.percentage();
    }
}
