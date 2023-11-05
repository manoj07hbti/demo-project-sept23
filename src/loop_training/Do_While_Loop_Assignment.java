package loop_training;


public class Do_While_Loop_Assignment {
    public static void main(String[] args) {
        //Print table of 5 and 10 using for and while loop

        int num=5;
        int a=1;
        do{
            System.out.println(num+" x "+a+" = "+num*a);
            a++;
        }while(a<=10);

        int number=10;
        int b=1;

        do{
            System.out.println(number+" x "+b+" = "+number*b);
            b++;
        }while(b<=10);

        //Print all even number between 1 to 100 using do and while
        //Print all odd number between 1 to 100  using do and while
        int c=1;
        do{
            if(c%2==0){
                System.out.println(c+" No is even number");

            }else{
                System.out.println(c+" No is odd number");

            }
            c++;
        }while(c<=100);

        int d=100;
        do{
            if(d%2==0){
                System.out.println(d+" No is even number");
            }else{
                System.out.println(d+" No is odd number");
            }
            d--;
        }while(d>=1);


        //Write a code to check whether a given number is prime number or not :


        int prime=5;
        do{
            if(prime%2==0){
                System.out.println("No is prime number");
            }else{
                System.out.println("No is not prime number");
            }
            prime++;
        }while(prime==0);



    }
}
