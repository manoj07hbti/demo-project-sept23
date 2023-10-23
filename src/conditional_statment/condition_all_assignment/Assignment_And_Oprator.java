package conditional_statment.condition_all_assignment;

public class Assignment_And_Oprator {


    public static void main(String[] args) {

        //  Write a code which tell which student  got 60%  marks in science stream ?
        // with all 4 scenario
//  scenario 1

        int marks = 60;

        String section = "Science";

        // if (condition1 && condition2 )

        // 1 scenario=  TRUE 1 && TRUE 2  = TRUE

        if (marks>= 60 && section=="Science"){

            System.out.println("  Student has passed with First division");

        } else{
            System.out.println("  Student has not passed with First division");

        }

        // 2 scenario True && false = false

        section = " Arts";
        if (marks >= 60 && section == "science") {

            System.out.println("  Student has passed with First division");
        } else {
            System.out.println("  Student has not passed with First division");

        }
// 3 scenario false && true = false

        marks = 56;
        if (marks >= 60 && section == "science") {

            System.out.println("  Student has passed with First division");

        } else {
            System.out.println("  Student has not passed with First division");

        }
        // 4 scenario false && false = false

        marks = 57;

        section = "Arts";
        if (marks >= 60 && section == "science") {
            System.out.println("  Student has passed with First division");
        } else {
            System.out.println("  Student has not passed with First division");

        }





















    }
}
