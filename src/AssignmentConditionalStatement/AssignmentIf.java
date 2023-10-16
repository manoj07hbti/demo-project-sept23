package AssignmentConditionalStatement;

public class AssignmentIf {
    public static void main(String[] args) {
        int Marks = 75;
        String Division = "First Division";

        if (Marks >= 60) {
            System.out.println("Congratulations you acquired " + Division);
            Marks = 30;
            if (Marks < 33) {
                System.out.println("Unfortunately You have not cleared Exam");
            }
        }
        int Price = 5000;
        if (Price == 5000) {
            System.out.println("The product displayed is very costly");
            Price = 3200;
            if (Price < 5000) {
                System.out.println("The Product displayed Price is Average");
            }
        }

        String Country = "India";
        if (Country == "India") {
            System.out.println("You are a Proud Indian");

            Country = "Germany";
            if (Country == "Germany") {
                System.out.println("You are not an Indian");
            }
        }
    }
}
