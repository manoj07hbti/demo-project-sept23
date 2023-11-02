package loops.array;

public class ArrayWhileLoop {
    public static void main(String[] args) {
        String[] countries = {"India", "UK", "Pakistan", "Srilanka", "Korea", "Afghanistan", "Nepal", "China"};
        int i = 0;
        while (i < 8) {
            System.out.println("Printing countries: " + countries[i]);
            i++;
        }

        int[] distance = {25, 50, 35, 60, 75, 20, 30, 80};
        i = 0;
        while (i < 8) {
            System.out.println("Printing distance: " + distance[i]);
            i++;
        }

        double[] Salary = {1000, 200000, 5000, 15000, 8500, 99000};
        i = 0;
        while (i < 6) {
            System.out.println("Printing Salary: " + Salary[i]);
            i++;
        }

    }
}
