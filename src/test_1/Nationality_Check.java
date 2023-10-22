package test_1;

public class Nationality_Check {
    public static void main(String[] args) {
        String nationality = "indian";
        String state = "Maharastra";
        if (nationality == "indian") {
            if (state == "Maharastra") {
                System.out.println("person is from Maharastra in india");
            }
            else {
                System.out.println("person is not from india ");
            }
        }
    }
}