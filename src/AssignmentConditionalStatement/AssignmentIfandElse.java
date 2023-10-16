package AssignmentConditionalStatement;

public class AssignmentIfandElse {
    public static void main(String[] args)
    {
        int Marks = 75;

        if (Marks >= 60)
        {
            System.out.println("Congratulations You acquired First Division");
        }
        else
        {
            System.out.println("Not First Division");
        }
        Marks = 30;
        if (Marks < 33)
        {
            System.out.println("You have not cleared the exam");
        }
        else
        {
            System.out.println("You have cleared the exam");
        }

        double Price = 5000;
        if (Price >= 5000)
        {
            System.out.println("The Product is Very costly");
        }
        else
        {
            System.out.println("The Price of the product is Average");
        }
        String Country = "India";
        if (Country == "India")
        {
            System.out.println("You are a Proud Indian");
        }
        else
        {
            System.out.println("you are not an Indian");
        }

    }

}

