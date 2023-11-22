package class_and_object.Method_Function;

public class InputParam_Factorial {

    public void factorial(int number){
       int fact=1;

        for(int i=1;i<=number;i++){
            fact=fact*i;

        }System.out.println("Factorial is: "+fact);


    }

    public static void main(String[] args) {
        InputParam_Factorial obj= new InputParam_Factorial();
        obj.factorial(5);
        obj.factorial(12);
    }
}
