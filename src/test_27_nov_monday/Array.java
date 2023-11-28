package test_27_nov_monday;

public class Array {
    public static void main(String[] args) {

        int value[] = {7, 4, 51, 45, 3, 67, 89, 93, 43};
        int max = value[0];
        int min = value[0];

        for (int i = 1; i < value.length; i++) {
            if(value[i]>max){
                max=value[i];
            }
            if(value[i]<min){
                min=value[i];
            }
            System.out.println("Max value is: "+max);
            System.out.println("Min value is: "+min);

        }
    }
}