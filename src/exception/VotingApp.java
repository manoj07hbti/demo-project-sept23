package exception;

public class VotingApp {

    public void vote(int age) throws AgeNotEligibleException {

        if(age>=18){
            System.out.println("Welcome to voting system...");
        }else {
            //we need to throw exception
            throw  new AgeNotEligibleException("Candidate age must be greater than or equal to 18");
        }
    }

    public static void main(String[] args) {
        VotingApp obj= new VotingApp();

        try {
            obj.vote(17);
        } catch (AgeNotEligibleException e) {
            System.out.println("Exception occurred: "+e);
        }


    }


}
