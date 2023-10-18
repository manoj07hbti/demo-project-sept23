package revision2;

public class ConditionalStatementIfAndElse {

    public static void main(String[] args) {

    // if (expression){
        //   //CODE
        //}else{
        //  //CODE
        //  }

        // if(marks >= 60)  first division 	else   not first division;

        int marks = 59;

        if(marks >= 60) {

            System.out.println(" First devision ");

        }else{

            System.out.println(" Not first devision ");

        //  if(marks< 33) : not cleared exam  else: cleared exam;

        marks= 34;

        if(marks<33) {

            System.out.println(" cleared exam  ");

        }else{

            System.out.println(" not cleared exam");

        // price 5000 > costly   else < average price;

        double price = 3500.45;

        if(price>5000) {

            System.out.println(" Costly ");

        }else {

            System.out.println(" Average price ");

            // country : INDIA ----> you are indian ,else: not Indian;

            String country = "Indian";

            if (country == "Indian") {

            System.out.println(" You are indian ");

        }else

                System.out.println(" You are not Indian ");


        }
        }
        }

    }
}
