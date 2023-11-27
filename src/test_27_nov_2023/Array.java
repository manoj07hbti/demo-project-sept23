package test_27_nov_2023;

public class Array {

    public static void main(String[] args) {
        int number[]={7,4,51,45,3,67,89,93,43};

        int largest=number[0];
        int smallest=number[0];

        for(int a=0;a<number.length;a++){
            if(number[a]>largest){
                largest=number[a];

            }else if(number[a]<smallest){
                smallest=number[a];

            }

        }
        System.out.println("this number is large number"+largest);
        System.out.println("this number is small number"+smallest);
    }
}
