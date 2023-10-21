package conditional;

public class DemoNestedIf {
    public static void main(String[] args) {

        int num = 6;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " This is an even number");
            } else {
                System.out.println(num + " This is an odd number");
            }
        } else {
            System.out.println(" Number > zero");
        }


        num = 9;
        if (num > 0) {
            if (num % 3 == 0) {
                System.out.println(num + " This num divisible by 3");
            } else {
                System.out.println(num + " This num is not divisible by 3");
            }
        } else {
            System.out.println(" Number > zero");
        }


        // Operator(&&)

        // 1.TRUE && TRUE = TRUE
        int nums = 85;
        String subject = "Maths";
        if (nums >= 60 && subject == "Maths") {
            System.out.println(" Going for Maths");
        } else {
            System.out.println(" Going for Arts");
        }

        //2.TRUE && FALSE= FALSE
        nums = 55;
        subject = "Maths";
        if (nums >= 50 && subject == "Arts") {
            System.out.println(" Going for Maths");
        } else {
            System.out.println(" Going for Arts");
        }

        //3. FALSE && TRUE= FALSE
        nums = 45;
        subject = "Science";
        if (nums >= 60 && subject == "Science") {
            System.out.println(" Going for Maths");
        } else {
            System.out.println(" Going for ARTS");
        }

        //4.FALSE && FALSE= FALSE
        nums = 100;
        subject = "MATHS";
        if (nums <= 60 && subject == "Arts") {
            System.out.println(" Going for Maths");
        } else {
            System.out.println(" Going for Arts");
        }
    }

}
