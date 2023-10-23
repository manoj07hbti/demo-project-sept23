package Test_22Oct_Sunday;

public class Test5 {
    public static void main(String[] args) {


        int a = 2;
        int b = 4;
        System.out.println("Before swapping:"+a+" "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The numbers are swapped:"+a +" " + b);
    }
}