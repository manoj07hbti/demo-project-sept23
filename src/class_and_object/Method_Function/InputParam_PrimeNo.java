package class_and_object.Method_Function;

public class InputParam_PrimeNo {

    public void checkPrimeNo(int number){
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

        InputParam_PrimeNo obj= new InputParam_PrimeNo();
        obj.checkPrimeNo(5);
        obj.checkPrimeNo(17);
    }

}

