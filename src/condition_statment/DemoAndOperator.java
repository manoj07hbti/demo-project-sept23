package condition_statment;

public class DemoAndOperator {
    public static void main(String[] args) {
        // finding odd or even,n= numbers
        int n=3;
        if(n%2>0){
            System.out.println("printing= odd number");
        } else{
            System.out.println("printing= even");
        } n=10;
        if(n%2>0){
            System.out.println("printing= odd number");
        } else{
            System.out.println("printing=even number");
        }  n=5;
        if(n/3>0){
            System.out.println("yes, divisible by 3");
        } else{
            System.out.println("not divisible");
        } n=-13;
        if(n/3>0){
            System.out.println("divisible by 3");
        } else{
            System.out.println("not divisible");
            // using four ways of AND operator
            // first if True or True
        } int m=65;
        String s="science";
        if(m>=60 && s=="science"){
            System.out.println("yes, student have science stream");
        } else{
            System.out.println("student does not have science stream");
            // second scenario True or false

        } m=78;
        s="Arts";
        if(m>=60 && s=="science"){
            System.out.println("student have science stream");
        } else{
            System.out.println("student does not have science stream");
            // third scenario false or true
        } m=59;
        s="science";
        if(m>=60 && s=="science"){
            System.out.println("student  have science stream");

        } else{
            System.out.println("student does not have science stream ");
            // false or false
        } m=35;
        s="commerce";
        if(m>=60 && s=="science"){
            System.out.println("student have science stream");
        } else {
            System.out.println("student does not have science stream");
        }








    }
}
