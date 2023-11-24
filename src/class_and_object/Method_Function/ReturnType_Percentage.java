package class_and_object.Method_Function;

public class ReturnType_Percentage {

    public double percentage(int a, int b) {

        double c = (double) a * b / 100;
        return c;
    }


    public static void main(String[] args) {
        ReturnType_Percentage obj=new ReturnType_Percentage();
        double result=obj.percentage(24,54);
        System.out.println("Percentage is: "+result);
    }
}
