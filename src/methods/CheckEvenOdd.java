package methods;

public class CheckEvenOdd {

       // write a code to find even and odd number between 1 to 100;

       public void CheckEvenOdd(){

              int number=18;

              if(number%2==0){

                     System.out.println("Number is even " + number);

              }else{

                     System.out.println("Number is odd " + number);
              }
       }

       public static void main(String[] args) {

              CheckEvenOdd obj= new CheckEvenOdd();

              obj.CheckEvenOdd();
       }
}
