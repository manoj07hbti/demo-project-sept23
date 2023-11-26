package methods;

public class EvenAndOdd {
    public void numberEvenOdd() {

        for (int a = 1; a <= 100; a++)

            if (a % 2 == 0) {
                System.out.println(a + " is even number ");
            } else {
                System.out.println(a + " is odd number ");
            }
    }

    public static void main(String[] args) {
        EvenAndOdd obj = new EvenAndOdd();
        obj.numberEvenOdd();
    }
}
