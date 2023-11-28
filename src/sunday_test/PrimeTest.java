package sunday_test;
import java.util.Scanner;
public class PrimeTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter start number a:  ");
        int a=sc.nextInt();
        System.out.println("Enter last number b: ");
         int b=sc.nextInt();
        System.out.println("Prime number: ");
        while(a<b){
            int flag=0;
            for(int i=2; i<=a/2; i++){
                if (a % i == 0) {
                    flag=1;
                    break;

                }
            } if(flag==0){
                System.out.println(a+"");
            } a++;

        }
    }
}
