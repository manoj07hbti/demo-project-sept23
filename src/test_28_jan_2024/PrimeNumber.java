package test_28_jan_2024;

public class PrimeNumber {

    public static void main(String[] args) {

        int number=10;
        boolean isPrime=true;

        for(int i=2; i<number; i++){

            if(number%i==0){
                System.out.println("Number is divisible ...");
                isPrime=false;
                break;

            }
        }

        if(isPrime){
            System.out.println("Number is Prime Number: "+number);
        }else {
            System.out.println("Number is NOT a Prime Number: "+number);
        }
    }
}
