package conditional;

public class DemoSwitchStatements {
    public static void main(String[] args) {
        int month = 11;
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
        int a = 4;
        int b = 6;
        a = a + b;

        b = a - b;
        a = a - b;
        System.out.println("after swap a is " + a);
        System.out.println("after swap b is " + b);

        //2) By Multiplication and Division
        a = 5;
        b = 5;
        a = a * b;

        b = a / b;
        a = a / b;
        System.out.println("after swap a is " + a);
        System.out.println("after swap b is " + b);

    }


}
