package conditional_statments;

public class VotingApp {

    public static void main(String[] args) {
        //age>=18 , city=="Agra"
        int age=19;
        String city="Agra";

        if(age>=18){

            if(city=="Agra"){
                System.out.println("Person is eligible for voting in Agra...");
            }else {
                System.out.println("Candidate does not belongs to Agra...");
            }
        }else {
            System.out.println("Candidate Age is less than 18 years...");
        }


    }
}
