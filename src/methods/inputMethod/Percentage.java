package methods.inputMethod;

public class Percentage {
    public void percentage(int number, int percent) {
        double percentage = (double) number * percent / 100;
        System.out.println("The percentage of a given number is: " + percentage);
    }
    public static void main(String[] args) {
        Percentage obj = new Percentage();
        obj.percentage(25, 5);
    }
}
