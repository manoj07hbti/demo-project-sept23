package conditional_statement;

public class Demo_Andoperater {
    public static void main(String[] args) {

        double percentage=75;
        if(percentage>=33 && percentage<60){

            System.out.println("student get second division");

        }else{
            System.out.println("student not get second division");

        }percentage=74;
        if(percentage>=60 && percentage<75){

            System.out.println("student get first division");

        }else{
            System.out.println("student not get first division");

        }percentage=88;
        if(percentage>=75){

            System.out.println("student get gold medlist division");

        }else{
            System.out.println("student not get gold medlist division");
        }



        }

}
