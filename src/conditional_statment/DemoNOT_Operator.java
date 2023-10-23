package conditional_statment;

public class DemoNOT_Operator {

    public static void main(String[] args ){

     //voting System age  check out condition
        int  age =19;
      // age >=18
         // should not age <18

        if ( !(age<18)){
        System.out.println("Eligible for voting ");
    } else{
            System.out.println(" Not Eligible for voting ") ;
        }

 // even and odd number find for NOT Operator

        if(age%2==0){
            System.out.println(" Age is even number ");
        }else{
            System.out.println("Age number is odd " );
        }

        if(age%2!=0){
            System.out.println(" Age is even number ");
        }else{
            System.out.println("Age number is odd " );
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
