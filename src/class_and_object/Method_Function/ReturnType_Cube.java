package class_and_object.Method_Function;

public class ReturnType_Cube {

    public int cube(int number){
       int result=number*number*number;
       return result;
    }

    public static void main(String[] args) {
        ReturnType_Cube obj= new ReturnType_Cube();
        int output=obj.cube(3);
        System.out.println("Cube is: "+output);
    }


}
