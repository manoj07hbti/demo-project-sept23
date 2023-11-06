package array;

public class BreakAndContinue {

    public static void main(String[] args) {

        // Print Months;
        // Break;
        // For Loop;

        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

               for(int i=0; i<months.length; i++){

                   System.out.println(" Print Months " + months[i]);

                   if( i==9){
                       break;
                   }
               }
        // Print Marks of Student;
        // continue;
        // For Loop;

        int marks[] = {65, 70, 75, 55, 33, 85, 50};

               for(int i=0; i<marks.length; i++){

                   if(i==4){
                       continue;
                   }

                   System.out.println(" Print Marks of Student " + marks[i]);


               }
    }
}
