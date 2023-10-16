package revision2;

public class ConditionalStatmentsIf {

    public static void main(String[] args) {

        // if(expression/condition){
        //  //CODE
        //}

        //marks greater or equal 60 :  first division;

        int marks = 61;

        if (marks >= 60) {

            System.out.println(" Candidate first division marks is  : ");

            //marks less than 33  : not cleared exam;

            marks = 32;

            if (marks < 33) {

                System.out.println(" Candidate not cleared exam is : ");

                // price greater than 5000:  costly product;

                int price = 5001;

                if (price > 5000) {

                    System.out.println(" Costly product is : ");

                    //  price less than 5000 : average price product;

                    price = 4999;

                    if (price < 5000) {

                        System.out.println(" Average price product is : ");

                        //  country : INDIA ----> You are indian;

                        String country = "Indian";

                        if (country.equals("Indian")) {

                            System.out.println(" You are indian ");

                            //  country : INDIA ----> you are not indian

                            country = "Israel";

                            if (country.equals("Indian")) {

                                System.out.println(" You are not indian ");
                            }

                        }
                    }


                }

            }
        }


    }
}
