package conditional_statement;

public class Example_Nestedif {

    public static void main(String[] args) {
        int number=-4;
        if(number>0){

            if(number%3==0){
                System.out.println(number+" number is divisible");
            }else{
                System.out.println(number+" number is not divisible");
            }
        }else{
            System.out.println("please enter the number is greater then 0");
        }
    }
}
