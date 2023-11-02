package loops_working;

public class DemoPrimeNumber {

    public static void main(String[] args) {

        int number=7;
        boolean isPrime=true;

        for(int i=2; i<number; i++){

            if(number%i==0){
              isPrime=false;

            }
        }

        if(isPrime){
            System.out.println("Number is Prime Number: "+number);
        }else {
            System.out.println("Number is NOT a Prime Number: "+number);
        }

    }
}
