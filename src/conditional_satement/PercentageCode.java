package conditional_satement;

public class PercentageCode {

    public static void main(String[] args) {


        //Wrtie a code to check % of Student
        //  1. percentage >=33 and <60  : Second division
        //  2. percentage >=60 and <75: First Division
        //  3. percentage >75 : GOld Madelist

        int percentage =30;
        if(percentage>=33){
            if (percentage<60){
                System.out.println("Candidate has passed with second division");
            }
        }else{
            System.out.println("Candidate has not clear the exam");
        }
        percentage =70;
        if(percentage>=60){
            if(percentage<75){
                System.out.println("Candidate has passed with First division");
            }
        }else{
            System.out.println("Candidate has passed exam with second division");
        }
        percentage =80;
        if(percentage>75){
            System.out.println("Candidate has passed exam with Gold Medallist");
        }else{
            System.out.println("Candidate has passed with First division");
        }
    }
}
