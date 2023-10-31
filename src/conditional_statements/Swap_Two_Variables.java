package conditional_statements;

public class Swap_Two_Variables {
    public static void main(String[] args) {
        // Method 1 using addition and substraction
        int a = 3;
        int b = 5;
        System.out.println("Before Swapping:a=" + a + " " + "b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping:a=" + a + " " + "b=" + b);


// Method 2 of swapping using multiplication and division
        a = 2;
        b = 4;
        System.out.println("Before Swapping:a=" + a + " " + "b=" + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("After Swapping:a=" + a + " " + "b=" + b);



//Method 3 using Bitwise operator
        a=7;
        b=9;
        System.out.println("Before Swapping:a=" + a + " " + "b=" + b);
        a=a^b;
        b=b^a;
        a=b^a;
        System.out.println("After Swapping:a=" + a + " " + "b=" + b);




    }
}






