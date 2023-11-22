package class_and_object.Method_Function;

public class InputParam_Calculator {

    public void addition(int a, int b) {
       int result=a+b;
        System.out.println("Addition: " + result);
    }


    public void substaction(int a, int b) {

        int result=a-b;
        System.out.println("Substraction: " + result);
    }

    public void multiplication(int a,int b){
      int result=a*b;
        System.out.println("Multiplication: "+result);
    }


    public void Division(int a, int b){
        double result=(double) a/b;
        System.out.println("Division: "+result);
    }

    public static void main(String[] args) {
        InputParam_Calculator obj = new InputParam_Calculator();
        obj.addition(4,2);
        obj.addition(3,5);
        obj.substaction(49,25);
        obj.substaction(5,2);
        obj.multiplication(15,26);
        obj.multiplication(25,46);
        obj.Division(48,22);
        obj.Division(28,2);
    }

}


