package loops_working;

public class DemoWhileLoop {

    public static void main(String[] args) {

           /* SYNTAX:  while (condition){
                                     //code
                                     increment/decrement;
                                   }
        */

        int i = 0;
        while (i < 5) {
            System.out.println(" Hello world " + i);
            i++;

        }


        while (i > 0) {
            System.out.println("Decrement While Loop.." + i);
            i--;
        }


        int number = 3;
        int j = 1;
        while (j <= 10) {
            System.out.println(number + "x" + j + "=" + number * j);
            j++;
        }


    }
}
