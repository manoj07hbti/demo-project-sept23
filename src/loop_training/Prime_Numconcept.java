package loop_training;

public class Prime_Numconcept {
    public static void main(String[] args) {
        int num = 8;
        boolean prime = true;

        for (int a = 2; a < num; a++) {

            if (num % a == 0) {
                prime = false;

            }

        }if (prime) {
            System.out.println("No is prime number");
        } else {
            System.out.println("No is not prime number");
        }
    }
}
