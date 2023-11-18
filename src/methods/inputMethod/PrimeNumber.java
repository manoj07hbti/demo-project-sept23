package methods.inputMethod;

public class PrimeNumber {
    public void primeNum(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " its a prime number");
        } else {
            System.out.println(number + " its not a prime number");
        }
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.primeNum(7);
        obj.primeNum(9);
    }
}
