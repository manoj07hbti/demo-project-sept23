package methods.returntype;

public class EvenOdd {
    public boolean evenOdd(int number){
        for(int i=1;i<=100;i++){
            }
        if(number%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        EvenOdd obj=new EvenOdd();
        boolean result=obj.evenOdd(3);
        if(result){
            System.out.println("its even");
        }else {
            System.out.println("its odd");
        }
    }
}
