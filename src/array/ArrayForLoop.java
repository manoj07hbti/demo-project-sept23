package array;

public class ArrayForLoop {

    public static void main(String[] args) {

        // String Array Country;
        // For Loop;

        String country[] = {"India", "Australia", "China", "Japan", "Germany", "US"};

        for (int i = 0; i < country.length; i++) {

            System.out.println(" Printing country for loop " + country[i]);
        }
        // int Array Number;
        // For loop;

        int number[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        for (int i = 0; i < number.length; i++) {

            System.out.println(" Printing number for loop " + number[i]);
        }
        //  double array Salary;
        //  For loop;

        double salary[] = {15500.25, 20500.35, 25500.45, 30500.55, 35500.50, 40500.55, 45500.65};

        for (int i = 0; i < salary.length; i++) {

            System.out.println(" Printing salary for loop " + salary[i]);
        }
    }
}
