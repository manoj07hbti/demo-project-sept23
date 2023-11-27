package methods;

public class CalculaterInputParam {

    public void addition(int a,int b){
        int result =a+b;
        System.out.println("addition number is: "+result);
    }
    public void subtraction(int a,int b){
        int result =a-b;
        System.out.println("subtraction number is: "+result);
    }
    public void multiplication(int a,int b){
        int result =a*b;
        System.out.println("multiplication number is: "+result);
    }
    public void division(int a, int b){
        double result=(double)a/b;
        System.out.println("division number is: "+result);
    }

    public static void main(String[] args) {
        CalculaterInputParam obj=new CalculaterInputParam();
        obj.addition(4,6);

    }
}
