package methods;

public class Primenumber {
    public void primeNumber() {
        int number = 98;
        boolean prime = true;
        for (int a = 2; a < number; a++) {

            if (number % a == 0) {
                prime = false;
            }
        }
        if (prime) {
            System.out.println("number is prime number");

        } else {
            System.out.println("number is not prime number");
        }


    }

    public static void main(String[] args) {
        Primenumber obj = new Primenumber();
        obj.primeNumber();
    }

}
