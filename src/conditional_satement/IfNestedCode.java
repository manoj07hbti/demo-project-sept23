package conditional_satement;

public class IfNestedCode {

    public static void main(String[] args) {

        //marks>=60 && section ==SCIENCE
        //write a code which tell which student got 60% marks in scince stream?
        //with all 4 scenario
        int marks = 75;
        String section = "Science";
        if (marks >= 60 && section == "Science") {
            System.out.println("Student got 60% or more than 60% in science stream");
        } else {
            System.out.println("Student not get 60% Marks in science stream");
        }

//TRUE && FALSE= FALSE
        section = "English";
        if (marks >= 60 && section == "Science") {
            System.out.println("Student got 60% or more than 60% in science stream");
        } else {
            System.out.println("Student not get 60% Marks in science stream");
        }
//3. FALSE && TRUE= FALSE
        marks = 50;
        section = "Science";
        if (marks >= 60 && section == "Science") {
            System.out.println("Student got 60% or more than 60% in science stream");
        } else {
            System.out.println("Student not get 60% Marks in science stream");
        }

//4.   FALSE && FALSE= FALSE
        marks = 40;
        section = "Hindi";
        if (marks >= 60 && section == "Science") {
            System.out.println("Student got 60% or more than 60% in science stream");
        } else {
            System.out.println("Student not get 60% Marks in science stream");
        }
    }}