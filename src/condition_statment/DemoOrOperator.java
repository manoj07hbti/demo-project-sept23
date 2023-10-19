package condition_statment;

import com.sun.deploy.security.SelectableSecurityManager;

public class DemoOrOperator {
    public static void main(String[] args) { //percent>=33and<60:second division
        int percent=32;
        if(percent>=33 && percent<60){
            System.out.println("first divi..");
        } else{
            System.out.println("second divi..");
        }  percent=67; //percent>=60 and <75: first division
        if(percent>=60 && percent<75){
            System.out.println("first divi..");
        } else{
            System.out.println("second divi..");
        } percent=85; // percent>75gold medalist
        if(percent>75||percent<75){
            System.out.println("gold medalist");
        } else{
            System.out.println("non gold medalist");
        }

    }
}



