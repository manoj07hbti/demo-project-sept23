package condition_statment;

public class DemoNotOperator {
    public static void main(String[] args) {
        int age=19; // age>0 and <18:child
        if(!(age<18)){
            System.out.println("yor are child");
        } else{
            System.out.println("yor are not child");
        } age=40; //age>=18 and <=40:young
        if(!(age<=40)){
            System.out.println("young");

        } else{
            System.out.println("not young");

        } age =61;
        if(!(age>=60)){
            System.out.println("old age");
        } else{
            System.out.println("not old age");
        }
    }
}
