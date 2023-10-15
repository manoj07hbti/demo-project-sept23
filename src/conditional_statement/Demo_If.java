package conditional_statement;

public class Demo_If {
    public static void main(String[] args) {

        // if(expression/condition){
        //        //CODE
        //              }

        int age = 19;
        if (age > 18) {
            System.out.println("candidate is eligible for D.L");
        }

        int marks = 63;
        if (marks >= 60) {
            System.out.println("student get first division");

        }
        if (marks < 33) {
            System.out.println("student not cleared exam");
        }
        int price = 4999;
        if (price < 5000) {
            System.out.println("price is affordable");
        }
        String country="india";
        if(country=="india"){
            System.out.println("you are indian");
        }

    }
}
