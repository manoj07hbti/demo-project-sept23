package Array;

public class AssignmentArray {
    public static void main(String[] args) {

        String country[] = {"India", "America", "Japan", "Korea", "China", "Germany", "Australia", "North Korea", "France", "South Africa"};
        double salary[] = {40131, 50515, 60123, 80220, 50168, 100000, 80111, 91111, 711111};
        int distance[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


        //Printing Array with For loop

        for (int i = 0; i < country.length; i++) {
            System.out.println("Printing country array: " + country[i]);
        }
        for (int j = 0; j < salary.length; j++) {
            System.out.println("Printing salary array: " + salary[j]);
        }
        for (int k = 0; k < distance.length; k++) {
            System.out.println("Printing distance Array : " + distance[k]);
        }


        // Printing Array with Advanced for loop
        for (String var : country) {
            System.out.println("Printing country Array ..." + var);
        }
        for (double vari : salary) {
            System.out.println("Printing salary Array ..." + vari);
        }
        for (int varia : distance) {
            System.out.println("Printing distance array..." + varia);

        }

        //Printing Array with While loop
        int z = 0;
        while (z < country.length) {
            System.out.println("Printing country array using while loop...." + country[z]);
            z++;
        }
        int y = 0;
        while (y < salary.length) {
            System.out.println("Printing salary array using while loop..." + salary[y]);
            y++;
        }
        int zz = 0;
        while (zz < distance.length) {
            System.out.println("Printing distance array usuing while loop..." + distance[zz]);
            zz++;
        }

        //Printing array using Do- while loop

        int p = 0;
        do {
            System.out.println("Printing country array using do while loop..." + country[p]);
            p++;
        } while (p < country.length);

        int q = 0;
        do {
            System.out.println("Printing country array using do while loop..." + salary[q]);
            q++;
        } while (q < salary.length);

        int r = 0;
        do {
            System.out.println("Printing country array using do while loop..." + distance[r]);
            r++;
        } while (r < country.length);

    }
}