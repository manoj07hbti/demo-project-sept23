package loops_working;

public class DemoLoop {

    public static void main(String[] args) {


       /* System.out.println("Hello World...");
        System.out.println("Hello World...");
        System.out.println("Hello World...");
        System.out.println("Hello World...");
        System.out.println("Hello World...");*/

// INCREMENT FOR LOOP ...
     /*   SYNTAX: for (start_condition; conditional_expression; increment){
            //CODE
        }       */

        for(int i=1; i<=5 ; i++){

            System.out.println("Hello World..."+i);
        }

// DECREMENT FOR LOOP ... SYNTAX: for (start_condition; conditional_expression; decrement){
//                                        //CODE
//                                      }

         for(int j=5; j>0; j--){

             System.out.println("Hello World using decrement for loop..."+j);
         }

    }
}
