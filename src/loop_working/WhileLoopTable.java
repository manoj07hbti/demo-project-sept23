package loop_working;

public class WhileLoopTable {

    public static void main(String[] args) {

      //  Using While Loop and print table of 5 and 10;
       int number = 5;
        int j=1;
        while (j<=10){
            System.out.println(number +" X " +j+" = " +number*j);
            j++;
        }
        number =10;
        j=1;
        while (j<=10){
            System.out.println(number +" X " +j+" = " +number*j);
            j++;
        }

    //  Print even numbers
        for (int i=0; i<=100; i++)
    {
        if(i % 2 == 0){
            System.out.println(i+ " is even Number between 0 to 100");
        }
    }
    // Print Odd numbers
        for ( int i=0; i<=100; i++)
    {
        if(i % 2 != 0)
        {
            System.out.println(i+ " is Odd number between 0 to 100");
        }}
}   }


