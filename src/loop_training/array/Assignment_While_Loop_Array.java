package loop_training.array;

public class Assignment_While_Loop_Array {

    public static void main(String[] args) {
        String countries[]={"India", "Nepal", "Srilanka", "Russia", "Usa", "England", "afganistan"};
        int a=1;
        while(a<countries.length){
            System.out.println("printing city name: "+countries[a]);
            a++;
        }

        int distance[]={85,96,45,100,65,55};
        int b=1;

        while(b<distance.length){
            System.out.println("prnting distance in km: "+distance[b]);
            b++;
        }

        double salary[]={50000.56,8500.5,96000.85,96631.1,100000};
        int c=1;

        while(c<salary.length){
            System.out.println("printing salary in rupees: "+salary[c]);
            c++;
        }
    }
}
