package class_and_object.Method_Function;

public class EvenOdd_Method {

    public void checkEvenOdd() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ...is even number");
            } else {
                System.out.println(i + " ...is odd number");
            }
        }


    }

    public static void main(String[] args) {

        EvenOdd_Method obj= new EvenOdd_Method();
        obj.checkEvenOdd();
    }
}
