package test_22_oct_23;

public class Ques5 {
    public static void main(String[] args) {
        //write a code to swap two numbers a and b without using any third variable.
        // swapping the variables a and b, we have an operator (^) without using a third variable.
        int a=1;
        int b=2;
        a=a^b;  //stores the value of both a and b in a.
        b=a^b; //stores the original value of a in b.
        a=a^b; //stores the original value of b in a.
        System.out.println("after swap a is "+a);
        System.out.println("after swap b is "+b);
        }
    }
