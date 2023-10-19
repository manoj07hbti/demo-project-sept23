package conditional_statement;

public class If_And_Else {
    public static void main(String[] args) {
        int age = 16;
        if (age > 18) {
            System.out.println("candidate is eligible for voting");
        } else {
            System.out.println("candidate is not eligible for voting as age is not above 18 ");
        }
    }
}