package loops_working.assignments;

public class Assignment_forLoop {
    public static void main(String[] args) {


        // write a code check number is divisible by 7

        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.println("Divisible by 7  = " + i);
            }else{
                System.out.println("Not divisible by 7  = "  + i);
            }
        }


    }
}
