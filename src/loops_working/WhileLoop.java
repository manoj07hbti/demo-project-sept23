package loops_working;

public class WhileLoop {

    public static void main(String[] args) {

        // Print table of 5 and 10 using while loop;
        // increment while loop;

        int number=5;
        int x=1;

        while(x<=10){

            System.out.println(number + " X " +x+ " = " +number*x);
            x++;
        }
        // 10 table;

        number=10;
        int y=1;

        while(y<=10){

            System.out.println(number + " X " +y+ " = " +number*y);
            y++;
        }


    }
}
