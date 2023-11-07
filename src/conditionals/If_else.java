package conditionals;

public class If_else {
    public static void main(String[] args) {
        //if statements
        int marks = 75;
        if (marks >= 60) {
            System.out.println("first division");

            marks = 25;
            if (marks < 33) {
                System.out.println("not cleared exam");
            }

            int price = 6789;
            if (price > 5000) {
                System.out.println("costly product");
            }

            price = 4567;
            if (price < 5000) {
                System.out.println("average price product");
            }

            String country = "India";
            if (country == "India") {
                System.out.println("You are indian");
            }

            country = "America";
            if (country == "India") {
                System.out.println("You are not an indian");
            }

            //if and else
            marks = 65;
            if (marks >= 60) {
                System.out.println("first division");
            } else {
                System.out.println("not first division");
            }

            marks = 40;
            if (marks < 33) {
                System.out.println(" not cleared exam");
            } else {
                System.out.println(" cleared exam");
            }

            price = 2000;
            if (price > 5000) {
                System.out.println("costly product");
            } else {
                System.out.println("average price");
            }

            country = "India";
            if (country == "India") {
                System.out.println("You are indian");
            } else {
                System.out.println("You are not an indian");
            }
        }
    }
}