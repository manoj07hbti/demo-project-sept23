package methods;

public class OddEvenMethods {

    //write a code to find even and odd number between 1 to 100;

    public void OddEvenMethods(){
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println("This is a Even Number : "+i);
                } else {
                    System.out.println("This is a Odd Number : "+i);
                }
            }
}

    public static void main(String[] args) {
        OddEvenMethods obj = new OddEvenMethods();
        obj.OddEvenMethods();

    }

    }
    //
    //write a method to check Prime number



