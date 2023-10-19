package conditional_statement;

public class Nested_If {
    public static void main(String[] args) {
        int num = 22;
        if (num > 0) {
            if (num % 5 == 0) {
                System.out.println("number is divisible by 5");
            } else {
                System.out.println("number is not divisible by 5");
            }
        }
    }
}