package AssignmentConditionalStatement;

public class AssignmentNestedIfandElse
{
    public static void main(String[] args)
    {
        int Number=54546;
        if (Number>0)
        {
            if (Number % 2==0)
            {
                System.out.println("The given Number is even number");
            }
            else
            {
                System.out.println("The given number is odd number");
            }

        }
        else
        {
            System.out.println("Please enter number greater than zero (0).....");
        }

        Number=54322;
        if(Number>0)
        {
            if (Number % 3==0)
            {
                System.out.println(Number+ " is divisible by 3");
            }
            else
            {
                System.out.println(Number+ " is not divisible by 3");
            }
        } else
           {
                System.out.println("Please enter a Number greater than zero (0)");
           }



    }
}
