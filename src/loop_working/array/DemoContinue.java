package loop_working.array;

public class DemoContinue { // using continue statement to skip 33
    public static void main(String[] args) {
        int marks[]= {56,76,87,33,98,67,40};

        for(int i=0; i<7; i++) {
            if (i == 3) {
                continue;

            }
            System.out.println("printing:"+marks[i]);
            //using break statement for executing till 33
        } for(int i=0; i<7; i++){
            if(i==3){
                break;
            }
            System.out.println("printing:"+marks[i]);
        }


    }
}
