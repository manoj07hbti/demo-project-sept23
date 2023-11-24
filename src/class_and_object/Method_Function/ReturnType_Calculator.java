package class_and_object.Method_Function;

public class ReturnType_Calculator {

    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public int substraction (int a, int b){
        int result=a-b;
        return result;
    }


    public static void main(String[] args) {
        ReturnType_Calculator obj = new ReturnType_Calculator();
        int output = obj.addition(23, 56);
        System.out.println("Addition is: " + output);

        ReturnType_Calculator obj2=new ReturnType_Calculator();
        int outputs=obj2.substraction(4,2);
        System.out.println("Substraction is: "+outputs);
    }

}






