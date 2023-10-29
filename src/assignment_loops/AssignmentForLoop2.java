package assignment_loops;

public class AssignmentForLoop2
{
    public static void main(String[] args)
    {

        System.out.println("To find all even and odd numbers between 0 to 100");

        for (int i=0; i<=100; i++)
        {
            if(i % 2 == 0){
                System.out.println(i+ " is even Number between 0 to 100");
            }
        }
        System.out.println("-------------------------------------------------");
        for (int i=0; i<=100; i++)
        {
            if(i % 2 != 0)
            {
                System.out.println(i+ " is Odd number between 0 to 100");
            }

        }

    }
}
