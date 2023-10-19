package revision2;

public class AndOperator {

    public static void main(String[] args) {

        // TRUE && TRUE = TRUE     1*1= 1;

        int marks = 60;
        String section = "Science";

        if(marks >=60 && section == "Science"){

            System.out.println( " Student science stream ");
        }else{

            System.out.println(" Student not science stream ");
        }

        // TRUE && FALSE= FALSE    1*0= 0;

        marks = 60;
        section = "Maths";

        if(marks >= 60 && section == "Science"){

            System.out.println(" Student science stream ");
        }else{

            System.out.println(" Student not science stream ");
        }
        //  FALSE && TRUE= FALSE    0*1= 0;

        marks = 59;
        section = "Science";

        if(marks >= 60 && section == "Science" ){

            System.out.println(" Student science stream ");
        }else{

            System.out.println(" Student not science stream ");
        }
        //  FALSE && FALSE= FALSE   0*0= 0;

        marks = 59;
        section = "Commerce";

        if(marks >=60 && section == "Science"){

            System.out.println(" Student science stream ");
        }else{

            System.out.println(" Student not science stream ");
        }
    }
}
