package test_28_jan_23;

public class Factorial {
    public int fac(int n){
       if (n==0||n==1){
           return 1;

        }else {
           return n*fac(n-1);
       }

    }
    public static void main(String[] args) {
        Factorial obj=new Factorial();
        System.out.println("Factorial of a number is: " + obj.fac(4));

    }
}
