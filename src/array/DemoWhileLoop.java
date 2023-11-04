package array;

public class DemoWhileLoop {
    public static void main(String[] args) {
        String[] countries = {"India", "Pakistan", "China","Srilanka","Afghanistan", "Nepal"};
        int i = 0;
        while (i < 6) {
            System.out.println("Printing countries: " + countries[i]);
            i++;
        }

        int[] distance = {10, 20, 30, 40, 50, 60, 70, 80};
        i = 0;
        while (i < 8) {
            System.out.println("Printing distance: " + distance[i]);
            i++;
        }

        double[] Salary = {500, 2000.00, 1500.00, 15000, 8500};
        i = 0;
        while (i < 5) {
            System.out.println("Printing Salary: " + Salary[i]);
            i++;
        }
    }
}
