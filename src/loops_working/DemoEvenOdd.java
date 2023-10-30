package loops_working;

public class DemoEvenOdd {
    public static void main(String[] args) {

        //Print all even and odd number between 3 to 100 using for  loop
        for (int i = 3; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("even number " + i);
            } else {
                System.out.println("odd number " + i);
            }

        }

    }
}