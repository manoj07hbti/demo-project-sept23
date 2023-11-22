package class_and_object.Method_Function;

public class InputParam_Cube {

    public void cube(int number){
        System.out.println("Cube of a no. is: "+number*number*number);

    }

    public static void main(String[] args) {
        InputParam_Cube obj=new InputParam_Cube();
        obj.cube(3);
    }
}
