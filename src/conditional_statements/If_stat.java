package conditional_statements;

public class If_stat {
    public static void main(String[] args) {
        int marks=85;
        if(marks>=60)
        {
            System.out.println("First Division");
        }

        if(marks<33)
        {
            System.out.println("Not cleared exam");
        }


        int price=6000;
        if(price>5000)
        {
            System.out.println("Costly Product");
        }

        if(price<5000)
        {
            System.out.println("Average price product");
        }


        String country="India";
        if(country=="India")
        {
            System.out.println("You are Indian");
        }


        if(country!="India")
        {
            System.out.println("You are not Indian");
        }



        }
    }



