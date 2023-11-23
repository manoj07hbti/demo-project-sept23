package methods;

public class CheckPrimeNumber {

       // Check Prime Number;

       public void CheckPrimeNumber(){

             int number= 8;
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

    public static void main(String[] args) {

           CheckPrimeNumber obj= new CheckPrimeNumber();

           obj.CheckPrimeNumber();
    }
}
