package class_and_object.Method_Function;

public class PrimeNo_Method {

    public void checkPrimeNo(){
        int number=5;
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

    public static void main(String[] args) {

        PrimeNo_Method obj= new PrimeNo_Method();
        obj.checkPrimeNo();
    }

    }

