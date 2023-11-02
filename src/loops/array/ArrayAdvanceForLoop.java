package loops.array;

public class ArrayAdvanceForLoop {
    public static void main(String[] args) {
        String[] countries = {"India", "UK", "Pakistan", "Srilanka", "Korea", "Afghanistan", "Nepal", "China"};
        for (String var : countries) {
            System.out.println("Printing Array in Advanced for Loop..." + var);
        }

        int[] distance = {25, 50, 35, 60, 75, 20, 30, 80};
        for (int var : distance) {
            System.out.println("Printing Array in Advanced for Loop..." + var);
        }

        double[] Salary = {1000, 200000, 5000, 15000, 8500, 99000};
        for (double var : Salary) {
            System.out.println("Printing Array in Advanced for Loop..." + var);
        }
    }
}
