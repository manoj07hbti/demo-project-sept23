package methods.inputMethod;

public class CubeOfNumber {
    public void cube(int number) {
        System.out.println("Cube of a number is: " + number * number * number);
    }

    public static void main(String[] args) {
        CubeOfNumber obj = new CubeOfNumber();
        obj.cube(3);
        obj.cube(14);
    }
}
