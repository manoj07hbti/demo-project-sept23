package array;

public class ArrayDoWhileLoop {

    public static void main(String[] args) {

        // String Array Country;
        // Do While Loop;

        String country[] = {"India", "Australia", "China", "Japan", "Germany", "US"};

        int i = 0;

        do {

            System.out.println(" Printing country do while loop " + country[i]);
            i++;
        } while (i < country.length);

        // int Array Number;
        // Do While loop;

        int number[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        i = 0;

        do {

            System.out.println(" Printing number do while loop " + number[i]);
            i++;
        } while (i < number.length);

        // double array Salary;
        // Do While loop;

        double salary[] = {15500.25, 20500.35, 25500.45, 30500.55, 35500.50, 40500.55, 45500.65};

        i = 0;

        do {

            System.out.println(" Printing salary do while loop " + salary[i]);
            i++;
        } while (i < salary.length);
    }
}
