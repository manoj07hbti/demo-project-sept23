package loop_training;

public class Odd_Even_by_Forloop {

    public static void main(String[] args) {


        for (int a = 1; a <= 100; a++) {

            if (a % 2 == 0) {
                System.out.println("this is even number " + a);
            } else {
                System.out.println("this is odd number  " + a);
            }

        }

    }
}
