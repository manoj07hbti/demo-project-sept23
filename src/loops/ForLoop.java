package loops;

public class ForLoop {
    public static void main(String[] args) {
        //table of 5 using for loop
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }

        //table of 10 using for loop
        number = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " X " + i + " = " + number * i);
        }

        //Print all even and odd number between 1 to 100 using for  loop
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("even number " + i);
            } else {
                System.out.println("odd number " + i);
            }
        }
    }
}
