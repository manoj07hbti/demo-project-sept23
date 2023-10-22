public class Test_22oct {

    public static void main(String[] args) {

        //  write a code to check eligible voter in Pune
        // we are using this statement AND OPERATOR

        int age = 19;

        String city = "Pune";

        if (age >= 18 && city == "Pune") {

            System.out.println(" Candidate is eligible for voting in pune ");

        } else {
            System.out.println("Candidate is not eligible for voting in pune");
        }


        //  we are using if else condition
        age = 17;
        if (age >= 18) {


            System.out.println("welcome to voting system");
        } else {
            System.out.println(" you are not eligible for voting as your age is  less than 18 years");

        }

        city = "Pune";
        if (city == "Pune") {
            System.out.println("Candidate is from Pune");
        } else {
            System.out.println("Candidate is NOT from Pune");
        }


        // Write a code to find percentage of given number example: 5% of 500

        int number = 500;
        double percentage = 5;

        double result = (percentage / 100) * number;

        System.out.println("percentage value : " + result);


        //write a code to check if any given number is  even or odd number

        number = 12;

        if (number % 2 == 0) {
            System.out.println(" This is even ");
        } else {
            System.out.println(" This is odd");
        }
        number = 7;
        if (number % 2 == 0) {
            System.out.println(" This is even ");
        } else {
            System.out.println(" This is odd ");
        }

        //write a code to check person nationality ,
        // if nationality is India then check state should be Maharashtra then print both Nationality and state and
        //  if person is from different nation it should print that as well in else part.

        // in this statement we are using OR OPERATOR


        String Nationality = "INDIAN";

        String StateName = "Maharashtra";

        // if( condition1 || condition2)

        if (Nationality == "INDIAN" && StateName == "Maharashtra") {
            System.out.println("Person is indian and belongs to Maharashtra");
        } else {
            System.out.println("Person is not indian and he does not  belong  to Maharashtra");

        }

        // we are using  AND OPERATOR

        Nationality = "Nepal";
        StateName = "Maharashtra";

        if (Nationality == "Indian" && StateName == "Maharashtra") {
            System.out.println("Person is indian and belongs to Maharashtra");
        } else {
            System.out.println("Person is not indian and he does not  belong  to Maharashtra");
        }


        //  write a code to swap two numbers a and b without using any third variable

        int x = 25;
        int y = 35;
        System.out.println(" before swapping number " + x + "=" + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println(" after swapping number " + x + "=" + y);


    }


}
