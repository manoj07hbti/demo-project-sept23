package conditional_statment.condition_all_assignment;

public class Assignment_Nestedif {

    public static void main(String[] args) {

        // Write a code which can check any number divisible by 3 abd greater than 0

        int number = 64;

        if (number < 0) {

            if (number % 3 == 0) {

                System.out.println("  This number is divisible by 3");
            } else {
                System.out.println("  This number is not divisible by 3");

            }

        } else {
            System.out.println("Please enter number greater than 0");

        }

        // Write a code which can find even and odd number which is greater than 0

        //even number = 2,4,6,8,10............
        // odd number = 3,5,7,9,11,13,15...............

        number = 0;

        if (number > 0) {

            if (number % 2 == 0) {

                System.out.println(" This  is even number ");
            }
            else{ System.out.println(" This  is  not even number ");

            }

        } else {
            System.out.println(" Please enter number which is greater than 0");
        }


    }


}
