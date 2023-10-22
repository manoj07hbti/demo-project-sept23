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
        int age=2;
        if(age>3){
            System.out.println("your child is eligible for nursary class");
        }else{
            System.out.println("your child is not eligible for nursary class admission");

        }String capital="Agra";
        if(capital=="Delhi"){
            System.out.println("capital of india");
        }else{
            System.out.println("this is not capital of india");
        }
        double average=50;
        if(average!=50){
            System.out.println("this average is not equal to sehwag average");
        }else{
            System.out.println("this average is equal to sehwag average");
        }

    }
    }

