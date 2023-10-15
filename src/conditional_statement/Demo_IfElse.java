package conditional_statement;

public class Demo_IfElse {
    public static void main(String[] args) {

        int marks = 51;
        if (marks >= 60) {
            System.out.println("student get first division");

        } else {
            System.out.println("student not get first division");
        }
        if (marks < 33) {
            System.out.println("student not cleared exam");
        } else {
            System.out.println("student cleared exam");
        }
        int price = 5001;
        if (price < 5000) {
            System.out.println("price is affordable");
        }else{
            System.out.println("price is not affordable");
        }
        String country="israel";
        if(country=="india"){
            System.out.println("you are indian");
        }else{
            System.out.println("you are not indian");
        }

    }
    }

