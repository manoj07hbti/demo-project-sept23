package array;

public class DemoArray {
    public static void main(String[] args) {
        String[] countries = {"India", "Pakistan", "China","Srilanka","Afghanistan", "Nepal"};
        for (String var : countries) {
            System.out.println("Printing Array in Advanced for Loop..." + var);
        }

        int[] distance = {10, 20, 30, 40, 50, 60, 70, 80};
        for (int var : distance) {
            System.out.println("Printing Array in Advanced for Loop..." + var);
        }

        double[] Salary = {500, 2000.00, 1500.00, 15000, 8500};
        for (double var : Salary) {
            System.out.println("Printing Array in Advanced for Loop..." + var);
        }
    }
}
