package loops_working;

public class DemoContinue {

    public static void main(String[] args) {


        for(int i=0; i<5; i++){

            if(i==2){
                continue;
            }
            System.out.println("Executing code..."+i);

        }

        for(int i=1; i<=10; i++){

            if(i==3){
                continue;
            }
            if(i%2==0){
                System.out.println("Even Number "+i);
            }else {
                System.out.println("Odd Number "+i);
            }

        }


    }
}
