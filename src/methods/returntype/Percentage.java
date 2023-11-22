package methods.returntype;

public class Percentage {
    public double percentage(int number,int  percent) {
        double percentage = (double)number * percent / 100;
        return  percentage;
    }
    public static void main(String[] args) {
        Percentage obj = new Percentage();
        System.out.println("The percentage of a given number is: " + obj.percentage(25,5));

    }
}
