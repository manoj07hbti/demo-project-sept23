package conditional_statement;

public class Demo_not_operater {
    public static void main(String[] args) {
        int num=3;
        if(num%3!=0){
            System.out.println("this number is not divisible by 3");
        }else{
            System.out.println("this number is divisible by 3");
        }num=36;
        if(num%6!=0){
            System.out.println("this number is not divisible by 6");
        }else{
            System.out.println("this number is divisible by 6");
        }num=80;
        if(!(num%4==0)){
            System.out.println("this number is divisible by 4");
        }else{
            System.out.println("this number is not divisible by 4");
        }
    }
}
