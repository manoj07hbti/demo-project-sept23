package class_and_object.Method_Function;

public class InputParam_Percentage {

    public void percentage(int a,int b){

        double c=(double)a*b/100;
        System.out.println("Percentage is : "+c);

    }

    public static void main(String[] args) {
        InputParam_Percentage obj=new InputParam_Percentage();
        obj.percentage(10,40);
        obj.percentage(89,76);
    }
}
