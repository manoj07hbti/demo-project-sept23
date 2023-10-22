package Test_22_OCT_2023;

import jdk.jfr.Percentage;

import java.sql.SQLOutput;

public class Test22October2023
{
    public static void main(String[] args) {

      //1. WRITE A CODE TO CHECK ELIGIBLE VOTER IN PUNE

        int age = 18;
        String City = "Pune";

        if (age >= 18 && City == "Pune") {
            System.out.println("You are Eligible to Vote in Pune");
        } else {
            System.out.println("You are not Eligible to vote in Pune");
        }
        System.out.println("--------------------------------------------------------------------");


        //2. WRITE A CODE TO FIND PERCENTAGE OF GIVEN NUMBER (eg- 5% of 500)

        int GivenNumber=1124;
        double percentage=10.0;

        double OutputPercent= percentage/100*GivenNumber;

        System.out.println("The " + percentage+ "% of " + GivenNumber + " is " +OutputPercent);

        System.out.println("--------------------------------------------------------------------");


        //3.WRITE A CODE TO CHECK IF ANY GIVEN NUMBER IS ODD OR EVEN

        int Number=13456;
        if (Number>0) {
            if (Number % 2 == 0) {
                System.out.println("The Given Number is Even Number");
            } else {
                System.out.println("The Given Number is Odd Number");
            }
        } else{
            System.out.println("Please enter a valid Number");
        }
        System.out.println("--------------------------------------------------------------------");
        //4. WRITE A CODE TO CHECK PERSON NATIONALITY, IF IT IS INDIA THEN CHECK STATE SHOULD BE MAHARASHTRA THEN
        //    PRINT BOTH NATIONALITY AND STATE AND IF PERSON IS FROM DIFF NATION IT SHOULD PRINT THAT AS WELL IN
        //    ELSE PART

        String Nationality= "Indian";
        String State="Maharashtra";

        if(Nationality=="Indian") {
            if (State == "Maharashtra")
            {
                System.out.println("Your Nationality is " + Nationality + " & you belong to " + State);

            } else {
                System.out.println("Your Nationality is " + Nationality + " & you don't belong to maharashtra  ");

            }
        }
        else{
                System.out.println("You are from a Different Nation");
            }

        System.out.println("--------------------------------------------------------------------");

    //5. WRITE A CODE TO SWAP TWO NUMBERS A AND B WITHOUT USING ANY THIRD VARIABLE

    int a =54321;
    int b =12345;

        System.out.println("The given Number Before swapping");
        System.out.println("A = " +a);
        System.out.println("B = " +b);

        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println("The given Numbers after swapping");
        System.out.println("A = " +a);
        System.out.println("B = " +b);

        System.out.println("--------------------------------------------------------------------");
    }
}
