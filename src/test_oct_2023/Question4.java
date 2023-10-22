package test_oct_2023;

public class Question4 {
    public static void main(String[] args) {

        String nationality = "India";
        String state = "Maharashtra";
        if (nationality == "India") {
            if (state == "Maharashtra") {
                System.out.println("Nationality is..." + nationality + " and " + "State is..." + state);
            } else {
                System.out.println("Nationality is..." + nationality + "state is not Maharashtra...");
            }
        } else {
            System.out.println("Person belongs to other Nation and State...");

        }

    }
}
