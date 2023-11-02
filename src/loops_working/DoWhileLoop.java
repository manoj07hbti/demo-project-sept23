package loops_working;

public class DoWhileLoop {

    public static void main(String[] args) {

        // Print table of 5 and 10 using Do while loop;

        int number=5;
        int x=1;

        do{

            System.out.println(number + " X " +x+ " = " +number*x);
            x++;

        }while(x<=10);

        // table 10;

        number=10;
        x=1;

        do{

            System.out.println(number + " X " +x+ " = " +number*x);
            x++;

        }while(x<=10);
    }
}
