package loops.array;

public class ArrayDoWhileLoop {
    public static void main(String[] args) {
        String[] countries = {"India", "UK", "Pakistan", "Srilanka", "Korea", "Afghanistan", "Nepal", "China"};
        int i = 0;
        do {
            System.out.println("Printing countries:" + countries[i]);
            i++;
        } while (i < 8);

        int[] distance = {25, 50, 35, 60, 75, 20, 30, 80};
        i = 0;
        do {
            System.out.println("Printing distance: " + distance[i]);
            i++;
        } while (i < 8);

        double[] Salary = {1000, 200000, 5000, 15000, 8500, 99000};
        i = 0;
        do {
            System.out.println("Printing Salary: " + Salary[i]);
            i++;
        } while (i < 6);


    }
}
