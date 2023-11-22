package methods;

public class DemoReturnType {

    public int makeSquare(int number) {

        int result = number * number;

        return result;
    }

    public String welcomeMessage(String name) {
        String welcome = "Welcome to return type concept of Java...";

        return welcome + name;
    }

    public boolean voting(int age, String city) {

        if (age >= 18 && city.equals("Pune")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        DemoReturnType obj = new DemoReturnType();
        int output = obj.makeSquare(3);
        System.out.println("Make square output is " + output);
        System.out.println("Output: " + obj.makeSquare(10));

        String result = obj.welcomeMessage("Rahul");
        System.out.println(result);
        System.out.println("Printing message: " + obj.welcomeMessage("Mukesh"));

        boolean flag = obj.voting(12, "Pune");
        if (flag) {
            System.out.println("Eligible for voting....");
        } else {
            System.out.println("Eligible for voting....");
        }
    }
}
