package test_28_jan_2024;

public class Pattern {

    public void printPattern(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Pattern obj= new Pattern();
        obj.printPattern(5);
    }
}
