package demo_variables;

public class RevisionAdvanceVariables {

    public static void main(String[] args) {

        //Datatype varName = value ;

        String cityName = "Agra"; // we have declared a String variable with Agra value


        System.out.println("Printing cityName : " + cityName);

        int marks = 74;
        System.out.println("Marks is : " + marks);

        double price = 12321.234;
        System.out.println("Price is : " + price);

        //variable_name=new value;    reuse of variable
        cityName = "Pune";
        System.out.println("city name after change: " + cityName);
        marks = 34;
        System.out.println("Marks after change: " + marks);
        price = 324324.2343;
        System.out.println("Price after change is : " + price);


    }
}
