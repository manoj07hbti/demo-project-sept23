package conditional_statments;

public class DemoIf {

    public static void main(String[] args) {
       /*
        if(expression/condition){
            //CODE
        }*/

        int age=20;

        if(age>18){

            System.out.println("Candidate is eligible for D.L.");
        }

        double price=6324.45;

        if(price>5000){

            System.out.println("product is costly...");
        }

        String city="Pune";

        if(city=="Pune"){
            System.out.println("Candidate belongs to Pune...");
        }

    }
}
