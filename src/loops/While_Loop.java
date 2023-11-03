package loops;

public class While_Loop {
    public static void main(String[] args) {
        // Table of 5 using While Loop

        int number = 5;
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + number * i);
            i++;
        }


        //Table of 10

        number=10;
        i=1;
        while(i<=10){
            System.out.println(number+" x "+i+" = "+number*i);
            i++;
        }



        // Write a code to find even and odd no. b/w 1 to 100


        i=1;
        while(i<=100){
            if(i%2==0){
                System.out.println(i+" ...is even number");
            }else{
                System.out.println(i+" ...is odd number");
            }i++;
        }









    }
}
