package function_method;

public class Even_Odd_Prime {
    public void even(){
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.println("print even number"+"="+i);
            } else{
                System.out.println("odd number"+"="+i);
            }


            }
        } public void prime(){
        int n=5;
        for(int i=2; i<=n; i++){
            if(n%i==0){
                System.out.println("prime number:");

            } else{
                System.out.println("not prime");
            }
        }

    }


    public static void main(String[] args) {
        Even_Odd_Prime obj1=new Even_Odd_Prime();
        obj1.even();
        obj1.prime();
    }
}
