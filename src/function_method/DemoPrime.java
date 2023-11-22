package function_method;

public class DemoPrime {
    public void prime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.println(" Not Prime number: "+n);
                return;
            }
        }
        System.out.println("Prime number: "+n);


    }

    public static void main(String[] args) {
        DemoPrime obj=new DemoPrime();
        obj.prime(8);
        obj.prime(5);
        obj.prime(15);
    }
}
