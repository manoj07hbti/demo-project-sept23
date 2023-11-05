package loops_working;

public class DemoBreak {

    public static void main(String[] args) {

        for(int i=0; i<10; i++){

            System.out.println("This is for loop ..."+i);

            if(i==3){
                break;
            }
        }

        int j=0;
        while (j<5){

            System.out.println("While loop "+j);
            j++;

            if(j==4){
                break;
            }
        }


    }
}
