package conditional_statements;

public class Revision_And {
    public static void main(String[] args) {


        int percentage = 86;
        if (percentage >= 33 && percentage < 60) {
            System.out.println("Second Division");
        }
        if(percentage>=60 && percentage<75){
            System.out.println("First Division");
        }
        if(percentage>75){
            System.out.println("Gold Medalist");
        }

    }
}
