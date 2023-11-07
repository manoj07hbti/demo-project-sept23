package conditionals;

public class If_elseif {
    public static void main(String[] args) {
        //Write a code to check % of object.Student
        int percentage = 70;
        if (percentage >= 33 && percentage <= 60) {
            System.out.println("Second division");
        } else if (percentage > 60 && percentage < 75) {
            System.out.println("First Division");

        } else if (percentage > 75) {
            System.out.println("GOld Medallist");
        } else {
            System.out.println("fail");
        }

        //Write a code to check Age group
        int age=14;
        if(age>0 || age<18){
            System.out.println("child");
        }else if(age>=18 || age<=40){
            System.out.println("young");
        }else if(age>=60){
            System.out.println("old age");
        }
        else{
            System.out.println("please enter the valid age");
        }

        //number which is not divisible by 3.
        int number=5;
        if(number%3!=0){
            System.out.println(number+" is not divisible by 3");
        }else{
            System.out.println(number+" is divisible by 3");
        }


    }
}
