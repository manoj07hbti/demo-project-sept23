package methods;

public class EvenOdd {
    //write a code to find even and odd number between 1 to 100
    public void evenOdd() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("The number is Even: " + i);
            } else {
                System.out.println("The number is Odd: " + i);
            }
        }
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.evenOdd();
    }
}
