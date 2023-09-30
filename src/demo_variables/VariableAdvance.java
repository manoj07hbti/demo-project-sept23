package demo_variables;

public class VariableAdvance {

    public static void main(String[] args) {

        String name="Rahul"; // declaration and Assignment
        int age=23;
        System.out.println("Printing Name: "+name + " is Learning Java...Age: "+age);

        double percentage=47.3;
        System.out.println("Printing percentage: "+percentage +" %");

        String percent= "47.3 %";
        System.out.println("Printing percent: "+percent);

        name="Mukesh"; // reuse variable and assigned a new value
        age=25;
        System.out.println("Printing Name at line 19 : "+name + " is Learning Java...Age: "+age);

        String cityName ="Mumbai";
        int population=243214321;
        double perPersonIncome=435232.5;

        System.out.println("Printing City Name: "+cityName +" Population: "+population +" Income: "+perPersonIncome);

    }
}
