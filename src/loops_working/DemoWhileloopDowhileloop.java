package loops_working;

public class DemoWhileloopDowhileloop {
    public static void main(String[] args) {
        //While loop
        //table of 5 using while loop
        int number = 8;
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " X " + i + " = " + number * i);
            i++;
        }


        //table of 10 using while loop
        number = 10;
        i = 1;
        while (i <= 10) {
            System.out.println(number + " X " + i + " = " + number * i);
            i++;
        }


        //Print all even and odd number between 1 to 100 using while loop
        i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println("Even number " + i);
            } else {
                System.out.println("Odd number " + i);
            }
            i++;
        }




        //do while loop
        //table of 5 using do while loop
        number = 8;
        i = 1;
        do {
            System.out.println(number + " X " + i + " = " + number * i);
            i++;
        } while (i <= 10);


        //table of 10 using do while loop
        number = 10;
        i = 1;
        do {
            System.out.println(number + " X " + i + " = " + number * i);
            i++;
        } while (i <= 10);


        //Print all even and odd number between 1 to 100 using do while loop
        i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println("number is even " + i);
            } else {
                System.out.println("number is odd " + i);
            }
            i++;
        } while (i <= 100);

    }
}
