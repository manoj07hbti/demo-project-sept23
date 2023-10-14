package conditional_statments;

public class DemoIfAndElse {

    public static void main(String[] args) {

        int age = 17;
        // code using only if condition
     /*   if(age>=18){
            System.out.println("Welcome to Voting System");
        }
        if(age<18){
            System.out.println("you are not eligible for Voting as your age is less than 18 Year");
        }*/
        // code using if and else
        if (age >= 18) {
            System.out.println("Welcome to Voting System");
        } else {
            System.out.println("you are not eligible for Voting as your age is less than 18 Year");
        }

        String city = "Pune";
        if (city == "Pune") {
            System.out.println("Candidate is from Pune");
        } else {
            System.out.println("Candidate is NOT from Pune");
        }


    }
}
