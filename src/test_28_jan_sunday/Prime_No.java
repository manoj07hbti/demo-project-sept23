package test_28_jan_sunday;

import java.util.Scanner;

public class Prime_No {

    public void checkPrimeNo() {
        int i, count;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int number = scanner.nextInt();
        System.out.println("Prime numbers b/w 1 to " + number + " are ");

        for (int j = 2; j <= number; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        Prime_No obj=new Prime_No();
        obj.checkPrimeNo();
    }

}
