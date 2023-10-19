package conditional_statements;

public class AndOperator {
    public static void main(String[] args) {
        int marks=80;
        String section="Science";
        if(marks>=60 && section== "Science") {
            System.out.println("Student got 60% marks in science stream");

        }else{
            System.out.println("Student not got 60% marks in science stream");
        }



        marks=85;
        section="arts";
        if(marks>=60 && section== "Science") {
            System.out.println("Student got 60% marks in science stream");

        }else{
            System.out.println("Student not got 60% marks in science stream");
        }




        marks=58;
        section="Science";
        if(marks>=60 && section== "Science") {
            System.out.println("Student got 60% marks in science stream");

        }else{
            System.out.println("Student not got 60% marks in science stream");
        }





        marks=51;
        section="arts";
        if(marks>=60 && section== "Science") {
            System.out.println("Student got 60% marks in science stream");

        }else{
            System.out.println("Student not got 60% marks in science stream");
        }
    }

}


