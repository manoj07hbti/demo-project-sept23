package methods;

public class Percentage {
    //percentage of a number

    public void percentage() {
        int number = 200;
        int percent = 5;
        int percentage = number * percent / 100;
        System.out.println("The percentage of a given number is: " + percentage);
    }

    public static void main(String[] args) {
        Percentage obj = new Percentage();
        obj.percentage();
    }
}
