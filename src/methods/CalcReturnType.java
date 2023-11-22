package methods;

public class CalcReturnType {

    public int addition(int a, int b) {

        int result = a + b;

        return result;
    }

    public static void main(String[] args) {
        CalcReturnType obj = new CalcReturnType();
        int result = obj.addition(23, 12);
        System.out.println("Addition is: " + result);

    }
}
