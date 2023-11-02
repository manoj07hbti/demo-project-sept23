package loops_working.DoWhileLoop_Assign;

public class EvenOdd_Number {
    public static void main(String[] args) {

        int i = 1;

        do {
            if (i % 2 == 0) {
                System.out.println("This is Even " + i);
            } else {
                System.out.println("This is odd........ " + i);

            }
            i++;
        } while (i <= 100);


    }
}
