package methods.returntype;

public class CubeOfNumber {
    public int cube(int number) {
        int result=number * number * number;
        return result;
    }

    public static void main(String[] args) {
        CubeOfNumber obj = new CubeOfNumber();
        System.out.println("Cube of a number is: " +obj.cube(3));

    }
}

