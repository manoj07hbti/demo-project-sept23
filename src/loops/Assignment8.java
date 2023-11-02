package loops;

public class Assignment8 {
    public static void main(String[] args) {
        //While loop
        //table of 5 using while loop
        int number = 5;
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
                System.out.println("An even number " + i);
            } else {
                System.out.println("An odd number " + i);
            }
            i++;
        }


        //Write a code to check whether a given number is prime number or not :
        //Prime number-Any number which is not divisible by any other number except 1 and itself.
        int count=0;
        number = 7;
        for (i=1;i<=number;i++){
            if (number % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("its a prime number");
        }else {
            System.out.println("its not a prime number");
        }


        //do while loop
        //table of 5 using do while loop
        number = 5;
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

