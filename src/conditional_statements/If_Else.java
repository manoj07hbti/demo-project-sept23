package conditional_statements;

public class If_Else {
    public static void main(String[] args) {
        int marks=86;
        if(marks>=60)
        {
            System.out.println("First division");
        }else
        {
            System.out.println("Not first division");
        }


        if(marks<33)
        {
            System.out.println("Not clered exam");
        }else
        {
            System.out.println("Cleared exam");
        }


        int price=6000;
        if(price>5000)
        {
            System.out.println("Costly product");
        }else
        {
            System.out.println("Average price");
        }



        String country="India";
        if(country=="India")
        {
            System.out.println("You are Indian");
        }else
        {
            System.out.println("You are not Indian");
        }





    }
}
