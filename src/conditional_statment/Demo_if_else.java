package conditional_statment;

public class Demo_if_else {


    public static void main(String[] args) {


        int age = 17;
        // code using only if condition
        /*   if(age<18){

        System.out.println(" welcome to voting system "):}

        if(age<18){

        System.out.println(" you are not eligible for voting as your age is less than18 year "):}
         */
        // code using if and else

        if (age >= 18) {


            System.out.println("welcome to voting system");
        } else{
            System.out.println(" you are not eligible for voting as your age is  less than 18 years");

                 }

        String city = "Pune";
        if (city == "Pune") {
            System.out.println("Candidate is from Pune");
        } else {
            System.out.println("Candidate is NOT from Pune");
        }







        }


    }
