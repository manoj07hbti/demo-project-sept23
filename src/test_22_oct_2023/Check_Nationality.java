package test_22_oct_2023;

public class Check_Nationality {
    public static void main(String[] args) {
        String nationality="Indian";
        String state="Maharashtra";

        if(nationality=="Indian"){
            if(state=="Maharashtra"){

                System.out.println("person nationality is Indian");
            }else{
                System.out.println("Person is from other state");
            }

        }else{
            System.out.println("person nationality is non-indian");
        }
    }
}
