package sunday_test;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number, arm=0, rem, c;
        System.out.println("Enter the number: ");
        number=sc.nextInt();
        c=number;
        while(number>0){
            rem=number%10;
            arm=(rem*rem*rem)+arm;
            number=number/10;
        } if(c==arm) {
            System.out.println("armstrong number");
        } else{
            System.out.println("not armstrong");
        }
    }
}
