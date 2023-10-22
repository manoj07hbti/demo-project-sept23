package test_22_oct_2023;

public class Swap_numbers {
    public static void main(String[] args) {
        int x=30;
        int y=20;

        x=x+y;// When 30+20 is equal to 50
        System.out.println("addition of x and y is "+x);

        y=x-y;//when 50-20 is equal to 30
        System.out.println("subtraction of x and y is "+y);

        x=x-y;//when 50-30 is equal to 20
        System.out.println("subtraction of x and y is "+x);

        System.out.println("the value of x is "+x);

        System.out.println("the value of y is "+y);

    }
}
