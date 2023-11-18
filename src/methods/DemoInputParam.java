package methods;

import demo.Demo;

public class DemoInputParam {
//SYNTAX :access_specifier return_type  method_name (Datatype varName..) {
//                                                                    CODE..   }
    public void makeSquare(int number){
        System.out.println("Square of given number is: "+number*number);

    }

    public void vote(int age, String city){


        if(age>=18 && city.equals("Agra")){
            System.out.println("Eligible for voting in Agra...");
        }else {
            System.out.println("Not Eligible for Voting in Agra...");
        }


    }

    public void checkEvenOdd(int number){

        if(number%2==0){
            System.out.println("Number is even number ..."+number);
        }else {
            System.out.println("Number is ODD number ..."+number);
        }

    }

    public static void main(String[] args) {

        DemoInputParam obj= new DemoInputParam();
        obj.makeSquare(3);
        obj.makeSquare(11);
        obj.makeSquare(33);

        obj.vote(11,"Agra");
        obj.vote(19,"Agra");
        obj.vote(21,"Pune");

        obj.checkEvenOdd(5);
        obj.checkEvenOdd(4);
    }

}
