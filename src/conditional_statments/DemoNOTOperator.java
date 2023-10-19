package conditional_statments;

public class DemoNOTOperator {

    public static void main(String[] args) {

        int age=19;
        // age>=18
        // should not age<18
        if( !(age<18)){
            System.out.println("Eligible for Voting...");

        }else {
            System.out.println("Not Eligible for Voting...");
        }

        if(age%2==0){
            System.out.println("Age is Even number...");
        }else {
            System.out.println("Age is Odd number...");
        }

        if( age%2!=0){
            System.out.println("Age is odd number...");
        }else {
            System.out.println("Age is even number...");
        }

        if(!(age%2==0)){
            System.out.println("Age is odd number...");
        }else {
            System.out.println("Age is even number...");
        }


    }
}
