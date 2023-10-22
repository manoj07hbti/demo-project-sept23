package AssignmentOperators;

public class AssignmentOrOperator {
    public static void main(String[] args) {
        double Percentage = 59;

        if (Percentage > 75 && Percentage < 100) {
            System.out.println("Student is Gold Medalist");
        } else if (Percentage <= 75 && Percentage >= 60) {
            System.out.println("Student got First division");
        } else if (Percentage < 60 && Percentage >= 33) {
            System.out.println("Student got Second division");
        } else {
            System.out.println("Student got failed");
        }

        //2.)  Write a code to check Age Group

        int age = 1;

        if (age>=60 )
        {
            System.out.println("The person falls in Old age Catagory");
        } else if (age>60 || age>=40) {
            System.out.println("The Person falls in adult catagory");
        } else if (age>40 || age>=18) {
            System.out.println("The person falls in Teenage catagory");
        } else if (age<18) {
            System.out.println("The person is an Infant");
        } else{
            System.out.println("please enter a valid age");
        }

        // 3.)  Write a code to  identify number which is not divisible by 3

        int Number= 554421;
        int Divisor =3;
        if(Number%Divisor !=0){
            System.out.println("The Number is not divisible by "+ Divisor);
        } else {
            System.out.println("The Number is divisible by " +Divisor);
        }
    }
}