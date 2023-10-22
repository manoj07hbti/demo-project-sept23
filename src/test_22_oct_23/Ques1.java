package test_22_oct_23;

public class Ques1 {
    public static void main(String[] args) {
        //write a code to check eligible voter in Pune
        int age = 19;
        String city = "Pune";
        if (age >= 18 && city == "pune") {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }

    }
}
