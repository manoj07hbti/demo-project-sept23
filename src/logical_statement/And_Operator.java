package logical_statement;

public class And_Operator {
    public static void main(String[] args) {

        //if(Condition1 && Condition2
        /* 1-True && True= True */
        int age=19;
        String city="Tundla";
        if(age>=18 && city=="Tundla") {
            System.out.println("candidate is eligible for voting....");
        }
        else {
            System.out.println("not eligible for voting");
        }

    }
}
