package test_27_nov_2023;

public class Question2 {

    public static void main(String[] args) {

        // int Array Number;
        // Advance loop;

        int number[] = {7, 4, 51, 45, 3, 67, 89, 93, 43};

        int max= number[0];

        for(int i=0; i<number.length; i++){

            if(i==4){
                continue;
            }

            System.out.println(" Print max number " + number[i]);


        }




    }
}
