package methods;

public class DemoMethods {

    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void makeSquare(){
        int number=23;
        System.out.println("Square of given number is: "+number*number);

    }

    public void vote(){
        int age=17;
        String city="Agra";

        if(age>=18 && city=="Agra"){
            System.out.println("Eligible for voting in Agra...");
        }else {
            System.out.println("Not Eligible for Voting in Agra...");
        }


    }

    public void checkEvenOdd(){

        int number=23;

        if(number%2==0){
            System.out.println("Number is even number ..."+number);
        }else {
            System.out.println("Number is ODD number ..."+number);
        }

    }

    public static void main(String[] args) {

        DemoMethods obj= new DemoMethods(); // STEP 1
        obj.makeSquare(); // STEP 2 - calling makeSquare method

        obj.vote();// calling vote method

        obj.checkEvenOdd(); // calling even odd method

    }



}
