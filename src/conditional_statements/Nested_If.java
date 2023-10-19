package conditional_statements;

public class Nested_If {
    public static void main(String[] args) {
        int number=4;
        if(number>0){
            if(number%2==0)
            {
                System.out.println(number+" Number is even no.");
            }else {
                System.out.println(number+" Number is odd no. ");
            }
        }else{
            System.out.println("Number is not greater than 0");
        }



         number=9;
        if(number>0){
            if(number%3==0){
                System.out.println(number+" Number is divisible by 3");
            }else{
                System.out.println(number+" Number is not divisible by 3");
            }
        }else{
            System.out.println(number+" Number is not greater than 0");
        }

    }
}
