package conditional;

public class DemoIfandElse {
    public static void main(String[] args) {
        int marks = 65;
        if (marks >= 60) {
            System.out.println("1st Division...");

            marks = 20;
            if (marks < 33) {
                System.out.println("Fail...");
            }

            int price = 6222;
            if (price > 5500) {
                System.out.println("Costly Product...");
            }

            price = 4000;
            if (price < 5000) {
                System.out.println("Cheap Product...");
            }

            String country = "Nepal";
            if (country == "Nepal") {
                System.out.println("You are a Nepalian...");
            }

            country = "INDIA";
            if (country == "Nepalian") {
                System.out.println("You are not an India");
            }

            //if and else

            int num = 65;
            if (num >= 60) {
                System.out.println("1st division...");
            } else {
                System.out.println("Not in 1st division...");
            }

            num = 50;
            if (num > 33) {
                System.out.println("Passed...");
            } else {
                System.out.println("Failed...");
            }

            price = 3500;
            if (price > 5000) {
                System.out.println("Costly Product...");
            } else {
                System.out.println("Cheap Product...");
            }

            country = "India";
            if (country == "India") {
                System.out.println("You are an Indian...");
            } else {
                System.out.println("You are not an Indian...");
            }
        }
    }
}

