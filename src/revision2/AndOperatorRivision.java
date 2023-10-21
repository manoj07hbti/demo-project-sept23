package revision2;

public class AndOperatorRivision {

    public static void main(String[] args) {

        // 1. percentage >=33 and <60  : Second division;

        int percentage = 61;


        if(percentage >=33 && percentage <60){

            System.out.println(" 2nd div... ");

        }else{

            System.out.println(" 1st div... ");
        }
        // 2. percentage >=60 and <75: First Division;

        percentage =76;

        if(percentage >=60 && percentage <75){

            System.out.println(" 1st div... ");

        }else{

            System.out.println(" 2nd div... ");
        }

        // 3. percentage >75 : GOld Madelist;

        percentage = 76;

        if (percentage >75 ){

            System.out.println(" Gold Medalist ");

        }else{

            System.out.println(" silver Medalist");
        }
    }
}
