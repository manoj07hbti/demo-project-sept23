package methods;

public class CubeInputParam {

    public void cube(int number) {
        System.out.println("Cube is: " + number * number * number);
    }

    public static void main(String[] args) {
        CubeInputParam obj = new CubeInputParam();
        obj.cube(10);
    }
}
