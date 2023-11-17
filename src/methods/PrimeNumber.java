package methods;

public class PrimeNumber {
    //write a method to check Prime number
    public void primeNumber() {
        int count = 0;
        int number = 3;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " Prime number");
        } else {
            System.out.println(number + " Not a Prime number");
        }
    }
    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        obj.primeNumber();
    }
}
