package test_1;

public class Voting_In_Pune {
    public static void main(String[] args) {
        int age = 32;
        String city = "pune";
        if (age >= 18 && city == "pune") {
            System.out.println("candidate is eligible for voting");
        } else {
            System.out.println("candidate is not eligible for voting");
        }
    }
}