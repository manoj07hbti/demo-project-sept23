package AssignmentOperators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int Marks = 80;
        String Stream = "Science";

        //1.True && True = True

        if (Marks >= 60 && Stream == "Science")
            System.out.println("Congratulations your data is correct");
        else
        {
            System.out.println("Your data is Incorrect");
        }

        //2. True && False = False

        Marks = 80;
        Stream = "Commerce";
        if (Marks >= 60 && Stream == "Science")
            System.out.println("Congratulations your data is correct");
        else
        {
            System.out.println("Your data is Incorrect");
        }

        //3. False && True = False

        Marks = 55;
        Stream = "Science";
        if (Marks >= 60 && Stream == "Science")

            System.out.println("Congratulations your data is correct");
        else
        {
            System.out.println("Your data is Incorrect");
        }

        //4. False && False = False

        Marks=55;
        Stream= "Commerce";
                if(Marks>=60 && Stream=="Science")
                    System.out.println("Congratulations your data is correct");
                else
                {
                    System.out.println("Your data is incorrect");
                }
    }
}
