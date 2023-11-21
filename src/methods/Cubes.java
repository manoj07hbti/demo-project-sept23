package methods;

public class Cubes {
    public void cube(int number) {
        System.out.println("Cube of a number is: " + number * number * number);
    }

    public static void main(String[] args) {
        Cubes obj = new Cubes();
        obj.cube(5);
        obj.cube(10);
    }
}
