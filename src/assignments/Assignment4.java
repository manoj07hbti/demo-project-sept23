package assignments;

public class Assignment4 {
    public static void main(String[] args) {
        //even and odd numbers which is greater than 0
        int num = 4;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + " Its is an even number");
            } else {
                System.out.println(num + " Its is an odd number");
            }
        } else {
            System.out.println("please enter number greater than zero");
        }

        //number divisible by 3 abd greater than 0.
        num = 8;
        if (num > 0) {
            if (num % 3 == 0) {
                System.out.println(num + " Its divisible by 3");
            } else {
                System.out.println(num + " Its not divisible by 3");
            }
        } else {
            System.out.println("please enter number greater than zero");
        }


        //AND Operator(&&)
        // if(condition1 && condition2)

        // 1.TRUE && TRUE = TRUE
        int marks = 75;
        String stream = "Science";
        if (marks >= 60 && stream == "Science") {
            System.out.println("you are promoted to Science section");
        } else {
            System.out.println("you are promoted to Arts section");
        }

        //2.TRUE && FALSE= FALSE
        marks = 75;
        stream = "Arts";
        if (marks >= 60 && stream == "Science") {
            System.out.println("you are promoted to Science section");
        } else {
            System.out.println("you are promoted to Arts section");
        }

        //3. FALSE && TRUE= FALSE
        marks = 40;
        stream = "Science";
        if (marks >= 60 && stream == "Science") {
            System.out.println("you are promoted to Science section");
        } else {
            System.out.println("you are promoted to Arts section");
        }

        //4.FALSE && FALSE= FALSE
        marks = 40;
        stream = "Commerce";
        if (marks >= 60 && stream == "Science") {
            System.out.println("you are promoted to Science section");
        } else {
            System.out.println("you are promoted to Arts section");
        }
    }
}

