package class_and_object.Method_Function;

public class Percentage_Method {

    // Percentage method

    public void percentage(){
        int a=523;
        int b=10;
        double c=(double)a*b/100;
        System.out.println("Percentage is : "+c);

    }

    public static void main(String[] args) {
        Percentage_Method obj=new Percentage_Method();
        obj.percentage();
    }
}
