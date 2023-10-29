package assignment_loops;

public class AssignmentForLoop
{
    public static void main(String[] args)
    {

        int x=10;
        int y=5;
        String Table5= "Mlutiplication Table of 5";
        String Table10="Multiplication Table of 10";

//1     Multiplication Table of 10
        System.out.println(Table10);
        for (int i=1; i<=10; i++)
        {

            System.out.println(x + " X " + i + " = "+ x*i);
        }

        System.out.println("----------------------------------------------------------------------------");
//2.    Multiplication Table of 10
        System.out.println(Table5);
        for (int i=1; i<=10; i++)
        {

            System.out.println(y + " X " + i + " = "+ y*i);
        }

    }
}
