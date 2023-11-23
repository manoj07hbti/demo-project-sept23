package methods.returntype;

public class SquareOfNumber {
    public int square(int number) {
        int result = number * number;
        return result;
    }

    public static void main(String[] args) {
        SquareOfNumber obj = new SquareOfNumber();
        System.out.println("Square of a number is: " + obj.square(5));

    }
}

