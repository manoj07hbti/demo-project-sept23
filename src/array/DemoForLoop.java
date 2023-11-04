package array;

public class DemoForLoop {
    public static void main(String[] args) {
        String[] countries = {"India", "Pakistan", "China","Srilanka","Afghanistan", "Nepal"};
        for (int i = 0; i < 6; i++) {
            System.out.println("Printing countries: " + countries[i]);
        }

        int[] distance = {10, 20, 30, 40, 50, 60, 70, 80};
        for (int i = 0; i < 8; i++) {
            System.out.println("Printing distance: " + distance[i]);
        }

        double[] Salary = {500, 2000.00, 1500.00, 15000, 8500};
        for (int i = 0; i < 5; i++) {
            System.out.println("Printing Salary: " + Salary[i]);
        }
    }
}
