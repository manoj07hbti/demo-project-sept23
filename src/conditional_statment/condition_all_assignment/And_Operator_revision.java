package conditional_statment.condition_all_assignment;

public class And_Operator_revision {


    public static void main(String[] args) {

        //Wrtie a code to check % of Student
        // 1. percentage >=33 and <60  : Second division
        //  2. percentage >=60 and <75: First Division
        //3. percentage >75 : GOld MadeList

        int marks =45;

        // marks =33 and <60 : second division

        if (marks>=33 && marks<60) {
            System.out.println("second division ");
        }else {
            System.out.println(" First division ");
        }
      marks=65;
        if(marks>60 && marks<75){
             System.out.println("First division");
        }else{
            System.out.println(" second division");
        }
        marks=78;

        if( marks>=75 && marks<100){
            System.out.println( "Gold MadeList");
        } else{
            System.out.println("First division");
        }

       // Write a code to check Age group
       // 1. age >0 and <18  : Child
       // 2. age >=18  and <=40 : Young
      //  3. age >=60 : Old Age

        int age=6;

       if(age>0 && age<18){
           System.out.println("Child");
       }else{
           System.out.println("Young");
       }
        age=39;

       if(age>=18 && age<=40){
           System.out.println("YOUNG");
       }else{
           System.out.println("Child");
       }
       age=56;

       if(age>=40 && age<=60){
           System.out.println("old age");
       }else{
           System.out.println("young");
       }
























    }


}