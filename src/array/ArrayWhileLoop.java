package array;

public class ArrayWhileLoop {

    public static void main(String[] args) {

        //  String Array Country;
        //  While Loop;

        String country[] = {"India", "Australia", "China", "Japan", "Germany", "US"};

        int i = 0;

        while (i < country.length) {

            System.out.println(" Printing country while loop " + country[i]);
            i++;
        }
        // int Array Number;
        // While loop;

        int number[] = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        i = 0;

        while (i < number.length) {

            System.out.println(" Printing number while loop " + number[i]);
            i++;
        }
        // double array Salary;
        // While loop;

        double salary[] = {15500.25, 20500.35, 25500.45, 30500.55, 35500.50, 40500.55, 45500.65};

        i = 0;

        while (i < salary.length) {

            System.out.println(" Printing salary while loop " + salary[i]);
            i++;
        }
    }
}
