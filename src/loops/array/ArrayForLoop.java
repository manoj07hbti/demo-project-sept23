package loops.array;

public class ArrayForLoop {
    public static void main(String[] args) {
        String[] countries = {"India", "UK", "Pakistan", "Srilanka", "Korea", "Afghanistan", "Nepal", "China"};
        for (int i = 0; i < 8; i++) {
            System.out.println("Printing countries: " + countries[i]);
        }

        int[] distance = {25, 50, 35, 60, 75, 20, 30, 80};
        for (int i = 0; i < 8; i++) {
            System.out.println("Printing distance: " + distance[i]);
        }

        double[] Salary = {1000, 200000, 5000, 15000, 8500, 99000};
        for (int i = 0; i < 6; i++) {
            System.out.println("Printing Salary: " + Salary[i]);
        }
    }
}


