package loops;

public class Do_While {
    public static void main(String[] args) {
        // Table of 5 using While Loop

        int number = 5;
        int i = 1;
        do {
            System.out.println(number + " x " + i + " = " + number * i);
            i++;
        } while (i <= 10);


        //Table of 10
        number = 10;
        i = 1;
        do {
            System.out.println(number + " x " + i + " = " + number * i);
            i++;
        } while (i <= 10);


        // Write a code to find even and odd no. b/w 1 to 100

        i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " ...is even number");
            } else {
                System.out.println(i + " ...is odd number");
            }
            i++;
        } while (i <= 100);


    }
}