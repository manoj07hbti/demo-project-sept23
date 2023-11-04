package array;

public class ArrayAdvanceLoop {

    public static void main(String[] args) {

        // String Array Country;
        // Advance For Loop;

        String country[] = {"India", "Australia", "China", "Japan", "Germany", "US"};

        for (String var : country) {

            System.out.println(" Printing country in advance loop " + var);
        }
        // int Array Number;
        // Advance loop;

        int number[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        for (int var : number) {

            System.out.println(" Printing number in advance loop " + var);
        }
        // double array Salary;
        // Advance loop;

        double salary[] = {15500.25, 20500.35, 25500.45, 30500.55, 35500.50, 40500.55, 45500.65};

        for (double var : salary) {

            System.out.println(" Printing salary in advance loop " + var);
        }
    }
}
