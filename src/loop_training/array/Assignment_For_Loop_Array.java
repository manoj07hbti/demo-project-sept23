package loop_training.array;

public class Assignment_For_Loop_Array {
    public static void main(String[] args) {
        String countries[] = {"India", "Nepal", "Srilanka", "Russia", "Usa", "England", "afganistan"};

        System.out.println(countries[0]);

        //try with for_loop

        for (int a = 0; a < countries.length; a++) {
            System.out.println(a + " printing country name " + countries[a]);


        }
        int distance[] = {64, 58, 69, 87, 96, 32, 100};

        for (int b = 1; b < distance.length; b++) {
            System.out.println("printing distance area " + distance[b]);
        }

        double salary[] = {80747.25, 100078.05, 96381.25, 176852.05, 180251.25};

        for (int c = 1; c < salary.length; c++) {

            System.out.println("printing salary in rupees " + salary[c]);
        }


    }


}
