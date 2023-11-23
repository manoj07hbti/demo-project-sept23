package methods.returntype;

public class PrimeNumber {
    public boolean primeNumber(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();
        boolean result = obj.primeNumber(8);
        if (result) {
            System.out.println("Its a prime number");
        } else {
            System.out.println("Its not a prime number");
        }
    }
}


