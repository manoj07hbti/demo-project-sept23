package test_22_oct_2023;

public class Votingapp {
    public static void main(String[] args) {
        String city = "pune";
        int age = 19;
        if (age >= 18 && city == "pune") {
            System.out.println("candidate is eligible for voting in pune");
        } else {
            System.out.println("candidate is not eligible for voting in pune");
        }
    }
}
