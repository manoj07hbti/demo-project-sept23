package conditional_statment;

public class Assignment_if {

    public static void main(String[] args) {

        int marks = 60;

        if (marks >= 60) {

            System.out.println("  first division  ");

            marks = 33;

            if (marks <= 33) {
                System.out.println("  not clear exam");


            }
            int price = 5000;

            if (price >= 5000) {

                System.out.println("product is costly");

                price = 4999;
                System.out.println(" Average price product ");

            }
            String countryName = "India";

            if (countryName == "India") {

                System.out.println(" you are indian  ");

                countryName = "NEPAL";

                System.out.println("you are not indian");

            }

        }


    }


}
