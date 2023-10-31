package loop_working;

public class OddEvenLoop {

    public static void main(String[] args) {

        // Print all even and odd number between 1 to 100 using for

     //  Print even numbers
        for (int i=0; i<=100; i++)
        {
            if(i % 2 == 0){
                System.out.println(i+ " is even Number between 0 to 100");
            }
        }
        // Print Odd numbers
        for (int i=0; i<=100; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i+ " is Odd number between 0 to 100");
            }}
    }
}
