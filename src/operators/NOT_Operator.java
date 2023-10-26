package operators;

public class NOT_Operator {
    // code for voting
    // age>=18   or    should not age<18      same statement
    public static void main(String[] args) {
        int age = 34;
        if (!(age < 18)) {
            System.out.println("you are eligible for voting...");
        } else {
            System.out.println("you are not eligible for voting.....");
        }
    }
}