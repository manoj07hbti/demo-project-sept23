package loop_working;

public class WhileLoop {

    public static void main(String[] args) {

        // Using While Loop;

        int i=1;
        while(i<=100){
            if (i % 2 == 0) {
                System.out.println(i + " ...is even number");
            } else {
                System.out.println(i + " ...is odd number");
            }
            i++;
        }
        i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " ...is even number");
            } else {
                System.out.println(i + " ...is odd number");
            }
            i++;
        }while (i <= 100);
    }
}
