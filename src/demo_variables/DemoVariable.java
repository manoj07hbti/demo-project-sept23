package demo_variables;

public class DemoVariable {

    public static void main(String[] args) {
        //COMMENT OR INFO
        // SYNTAX : Datatype varName;

        String bookName; // we have declared a variable of String datatype with name bookName

        bookName="Algebra"; // SYNTAX  varName=value;   we have assigned Algebra value to bookName Variable

        //SYNTAX : System.out.println("Message : " +varName);

        System.out.println("Printing variable data: "+bookName);

        int pages; // we have declared a variable of int datatype with name pages

        pages=3241232; // we have assigned 324 value to pages variable
        System.out.println("Printing pages: "+pages);

        double price;// we have declared a variable of double datatype with name price

        price=354.56; // we have assigned 354.56 value to variable price

        System.out.println("Printing book price: "+price);


        String cityName;
        cityName="Pune";
        System.out.println("Printing city name: "+cityName);

        int population;
        population=3254555;
        System.out.println("Printing population: "+population);
        double averageIncome;
        averageIncome=25000.56;
        System.out.println("Printing income per person: "+averageIncome);

        double distance=10;
        System.out.println("printing distance: "+distance);

        String password;
        password="123@IamProgrammer";
        System.out.println("Printing password: "+password);

    }
}
