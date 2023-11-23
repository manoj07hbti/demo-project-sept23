package input_methods;

import methods.Percentage;

public class CalculatePercentage {

       // Calculate Percentage;

    public void Percentage(int number, int percentage){

        double result=(double)number*percentage/100;

        System.out.println("Calculate percentage" + result);
    }

    public static void main(String[] args) {

        CalculatePercentage obj= new CalculatePercentage();

        obj.Percentage(500,5);
    }
}
