package loop_training;

public class While_Loop_Assignment {
    public static void main(String[] args) {

        //Print table of 5 and 10 using for and while loop

        int num = 5;
        int a = 1;

        while (a <= 10) {
            System.out.println(num + " x " + a + " = " + num * a);
            a++;
        }

        int table = 10;
        int b = 1;

        while (b <= 10) {
            System.out.println(table + " x " + b + " = " + table * b);
            b++;
        }

        int number = 13;
        int c = 1;

        while (c <= 10) {
            System.out.println(number + " x " + c + " = " + number * c);
            c++;
        }

        //Print all even number between 1 to 100 using for and while
        //Print all odd number between 1 to 100  using for and while
        int no = 1;
        while (no <= 100) {
            if (no % 2 == 0) {
                System.out.println("this no is even number " + no);
            } else {
                System.out.println("this no is odd number " + no);

            }
            no++;
        }

        int use=5;

        while(use>=1){
            if(use%2==0){

                System.out.println("this no is even number " + use);
            }else {
                System.out.println("this no is odd number " + use);
            }use--;
        }

        //Write a code to check whether a given number is prime number or not :

        int prime=8;

        while(prime%2==0){
            if(prime==0){
                System.out.println("No is prime number");
            }else{
                System.out.println("No is not prime number");
            }prime++;

        }



    }

}
