package loop_training.array;

public class Assignment_Do_While_Loop_Array {

    public static void main(String[] args) {

        String countries[] = {"India", "Nepal", "Srilanka", "Russia", "Usa", "England", "afganistan"};
        int a = 0;
        do {
            System.out.println("printing country name: " + countries[a]);
            a++;
        }
        while (a < countries.length);

        int distance[]={100,500,600,700,1000,900};
        int b=0;

        do{
            System.out.println("printing distance in km: "+distance[b]);
            b++;

        }while(b<distance.length);

        double salary[]={7852.2,987456.2,741258.02,963258.0,456123,05};
        int c=0;

        do{
            System.out.println("printing salary in rupees: "+salary[c]);
            c++;
        }while(c<salary.length);
    }
}
