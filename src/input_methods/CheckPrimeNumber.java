package input_methods;

public class CheckPrimeNumber {

       //  write a method to check Prime number : 9;

       public void CheckPrimeNumber(int number){

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

              obj.CheckPrimeNumber(9);
       }
}
