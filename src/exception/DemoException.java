package exception;

public class DemoException {

    public void  divide(int a, int b){

        System.out.println("Before Division ");
        int result=0;
        try {
             result = a / b;
        }
        catch (Exception e) {
            System.out.println("Exception occurred :" + e);
        }


        System.out.println("Division is: "+result);
    }

    public void printArray(){
        int arr[]={3,4,2,5,67,45};
        System.out.println("Before printing any element...");
        try {
            System.out.println("Printing element: " + arr[7]);
        }
        catch (Exception e){
            System.out.println("Exception occurred : "+e);
        }
        System.out.println("After printing any element...");
    }

    public static void main(String[] args) {

        DemoException obj= new DemoException();
        obj.divide(4,0);
         obj.printArray();

    }
}
