package variablesrevision;

public class VariableManipulation {
    public static void main(String[] args) {

        int x = 40;
        int y = 6;

        int result = x + y;
        System.out.println("addition of x and y is: " + result);

        result = x - y;
        System.out.println("subtraction of x and y is: " + result);

        result = x * y;
        System.out.println("multiply of x and y is: " + result);

        double divide=(double)x/y;
        System.out.println("division of x and y is: " +divide);

        int result1=9;

        result1++;
        System.out.println("increament number is: "+result1);

        result1--;
        System.out.println("decreament number is: "+result1);

        int number=11;

        number++;
        System.out.println("increament number is: "+number);

        number--;
        System.out.println("decreament number is: "+number);

        number--;
        System.out.println("decreament number is: "+number);

        x=9;
        y=5;

        x+=y;
        System.out.println("addition of x and y is :"+x);
        x-=y;
        System.out.println("subtraction of x and y is:"+x);
        x*=y;
        System.out.println("multiply of x and y is: "+x);

        x/=y;

        System.out.println("division of x and y is: "+x);



        }
}
