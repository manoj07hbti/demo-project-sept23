package test_22_oct_23;

public class Ques4 {
    public static void main(String[] args) {
        /*write a code to check person nationality , if nationality is India
        then check state should be Maharashtra then print both
         Nationality and state and if person is from different nation it
         should print that as well in else part.
         */
        String nationality="India";
        String state="Maharashtra";
        if(nationality=="India"){
            if(state=="Maharashtra"){
                System.out.println("Your nationality is "+nationality + " and " + " your state is "+state);
            }else{
                System.out.println("Your nationality is "+nationality + "state is not Maharashtra");
            }
        }else{
            System.out.println("Your belong to other nation");

        }

    }
}
