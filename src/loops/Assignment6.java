package loops;

public class Assignment6 {
    public static void main(String[] args) {
        int month = 10;
        switch (month) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month entered");
        }
        //Swapping Variables in 3 ways:
        //1) By Addition
        int a = 3;
        int b = 5;
        a = a + b;   //a=3+5=8  (a=8)

        b = a - b;   //b=8-5=3   (b=3)
        a = a - b; //a=8-3=5    (a=5)
        System.out.println("after swap a is " + a);
        System.out.println("after swap b is " + b);

        //2) By Multiplication and Division
        a = 3;
        b = 5;
        a = a * b;   //a=3*5=15  (a=15)

        b = a / b;  //b=15/5=3   (b=3)
        a = a / b; //a=15/3=5    (a=5)
        System.out.println("after swap a is " + a);
        System.out.println("after swap b is " + b);

        //3) By Bitwise operator(^)
        a = 3;
        b = 5;
        a = a ^ b;  //a=3^5=5   (a=5)

        b = a ^ b; //b=5^3=3    (b=3)
        a = a ^ b; //a=5^3=5    (a=5)
        System.out.println("after swap a is " + a);
        System.out.println("after swap b is " + b);
    }
}


