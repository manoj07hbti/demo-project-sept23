package sunday_test;

public class Array {
    public static void main(String[] args) {
        int number[] = {7, 4, 51, 45, 3, 67, 89, 93, 43};
        int max = number[0];
        for (int i=1;i<number.length; i++){
            if(number[i]>max){
                max=number[i];
            }
        }
        System.out.println("maximum number: "+max);
        int min=number[0];
        for (int i=1;i<number.length; i++){
            if(number[i]<min){
                min=number[i];
            }
        }
        System.out.println("minimum value: "+ min);


    }
}