package loop_working;

public class DemoWhileLoop {
    public static void main(String[] args) {
        int n=5;
        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.println("not prime");

            }
        }
        System.out.println("prime number");
    }
}
