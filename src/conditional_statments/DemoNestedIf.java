package conditional_statments;

public class DemoNestedIf {

    public static void main(String[] args) {

        int number=20;

        if(number>0){

            if(number%5 ==0){
                System.out.println(number +" Number is divisible by 5");
            }else {
                System.out.println(number +" Number is not divisible by 5");

            }
        }else {
            System.out.println("Please enter number which is greater than 0...");
        }


    }
}
