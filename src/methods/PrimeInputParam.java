package methods;

public class PrimeInputParam {
    public void primenumber(int number) {

        boolean prime = true;
        for (int a = 2; a < number; a++) {
            if (number % a == 0) {
                 prime = false;
            }

        }
        if(prime){
            System.out.println("This is prime number: "+number);
        }else{
            System.out.println("This number is not prime number: "+number);
        }

    }

    public static void main(String[] args) {
        PrimeInputParam obj=new PrimeInputParam();
        obj.primenumber(8);
        obj.primenumber(58);
        obj.primenumber(11);
    }
}
