package exception;

public class DemoException {

    public void  divide(int a, int b){

        System.out.println("Before Division ");
        int result=0;

        //TODO Q1: CAN WE HAVE TRY BLOCK WITHOUT CATCH BLOCK ?
        //TODO ANS: NO, EVERY TRY BLOCK SHOULD HAVE AT LEAST ONE CATCH OR FINALLY BLOCK
        //TODO Q2: CAN WE HAVE MULTIPLE CATCH BLOCK IN SINGLE TRY BLOCK ?
        //TODO YES , WE NEED TO MANTAIN HIRERACHY OF EXCEPTION(CHILD CLASS EXCEPTION WILL BE COUGHT FIRST AND THEN PARENT)
        try {
             result = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred :" + e);
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException occurred :" + e);
        }

        finally{
            System.out.println("This is finally BLOCK ");

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
        //obj.printArray();

    }
}
