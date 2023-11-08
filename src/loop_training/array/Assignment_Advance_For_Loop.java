package loop_training.array;

public class Assignment_Advance_For_Loop {
    public static void main(String[] args) {

        String countries[] = {"India", "Nepal", "Srilanka", "Russia", "Usa", "England", "afganistan"};


        for (String count : countries) {
            System.out.println("printing country name: " + count);
        }

        int distance[]={456,123,789,963,85,65};

        for(int km : distance){
            System.out.println("printing distance in km: "+km);
        }

        double salary[]={10022.20,30000.02,50000.50,80000.06,70000.06};

        for(double rup : salary){
            System.out.println("printing salary in rupees: "+rup);
        }
    }
}
