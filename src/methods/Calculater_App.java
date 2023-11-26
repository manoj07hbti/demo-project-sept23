package methods;

public class Calculater_App {

    public void addition() {
        int a = 12;
        int b = 14;
        int result = a + b;
        System.out.println("Addition number is : " + result);
    }

    public void subtraction() {
        int a = 2;
        int b = 8;
        int result = a - b;
        System.out.println("subtraction number is: " + result);

    }

    public void multiplication() {
        int a = 8;
        int b = 9;
        int result = a * b;
        System.out.println("multiplication number is: " + result);
    }

    public void division() {
        int a = 85;
        int b = 5;
        double result = (double) a / b;
        System.out.println("division number is: " + result);
    }
    public void percentage(){
        int a=10;
        int b=10;
        double result=(double)a*b/100;
        System.out.println(" percentage of number is: "+result);
    }

    public static void main(String[] args) {
        Calculater_App obj = new Calculater_App();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
        obj.percentage();
    }
}
