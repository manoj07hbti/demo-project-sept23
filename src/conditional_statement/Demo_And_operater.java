package conditional_statement;

public class Demo_And_operater {

    public static void main(String[] args) {
        double marks=66;
        String section="Science";

// 1.   TRUE && TRUE = TRUE

        if(marks>=60 && section=="Science"){
            System.out.println("student is eligible for first division in science");

        }else{
            System.out.println("student is not eligible for first division in science");
        }
//2.TRUE && FALSE= FALSE

        section="math";

        if(marks>=60 && section=="Science"){
            System.out.println("student is eligible for first division in science");

        }else{
            System.out.println("student is not eligible for first division in science");
        }
// 3.   FALSE && TRUE= FALSE
        marks=40;

        if(marks>=60 && section=="Science"){
            System.out.println("student is eligible for first division in science");

        }else{
            System.out.println("student is not eligible for first division in science");
        }
// 4.   FALSE && FALSE= FALSE
        marks=50;
        section="math";

        if(marks>=60 && section=="Science"){
            System.out.println("student is eligible for first division in science");

        }else{
            System.out.println("student is not eligible for first division in science");
        }

    }

}
