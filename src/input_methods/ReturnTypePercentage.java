package input_methods;

public class ReturnTypePercentage {

       // ReturnTypePercentage;

    public int Percentage(int number, int percentage){

        double result=(double)number*percentage/100;

        return (int) result;
    }

    public static void main(String[] args) {

        ReturnTypePercentage obj= new ReturnTypePercentage();

        int output= obj.Percentage(500,5);

        System.out.println("Calculate percentage" + output);
    }
}
