package conditional_satement;

import java.lang.management.OperatingSystemMXBean;

public class IfElseCode {

    public static void main(String[] args) {

        //Assignement:

        // 1. write a code which can find even and odd numbers which is greater than 0.
        //   2. write a code which can check any number divisible by 3 and greater than 0.

        int number = 3;
        if (number > 0) {

            if (number % 2 == 0) {
                System.out.println("IF Number divide by 2 then its even....");

            } else {
                System.out.println("If number not divide by 2 then its odd....");
            }
        } else {
            System.out.println("If number is less than 0 its not comes under even and odd...");
        }

        number = -2;
        if (number > 0) {
            if (number % 3 == 0) {
                System.out.println("Number is divisible by 3.....");
            } else {
                System.out.println("Number is NOT divisible by 3.......");

            }
        } else {
            System.out.println("If Number is less than 0.....");
        }

    }
}