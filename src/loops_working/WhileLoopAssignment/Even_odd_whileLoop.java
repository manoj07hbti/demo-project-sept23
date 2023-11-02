package loops_working.WhileLoopAssignment;

public class Even_odd_whileLoop {
    public static void main(String[] args) {
        // using while Loop


        //Print all even number between 1 to 100 using  while Loop

        int i = 1;
        while (i <= 100) {

            if (i % 2 == 0) {
                System.out.println(" This is even number " + i);
            }
            //  Print all odd number between 1 to 100  using  while Loop

            else {
                System.out.println(" This is odd number ..........." + i);
            }
            i++;
        }


    }
}
