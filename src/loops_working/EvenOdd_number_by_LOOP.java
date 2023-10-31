package loops_working;

public class EvenOdd_number_by_LOOP {
    public static void main(String[] args) {

        //   Print all even and odd number between 1 to 100 using for loop

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("This is  even number ..." + i);
            } else {
                System.out.println(" This is odd number " + i);
            }

        }


    }
}
