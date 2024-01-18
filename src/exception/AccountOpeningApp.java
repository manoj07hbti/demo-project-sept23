package exception;

public class AccountOpeningApp {

    public void AccountOpen(double amount) throws LessAmountException{

        if(amount>=5000){
            System.out.println(" Your Account Has Been open...");
        }else{
            //we need to throw exception;
            throw new LessAmountException(" Amount should be greater or equal to 5000 to Open bank Account...");
        }
    }

    public static void main(String[] args) {

        AccountOpeningApp obj= new AccountOpeningApp();

        try{
            obj.AccountOpen(4000);
        }catch (LessAmountException e){
            System.out.println(" Exception occurred: "+e);
        }
    }
}
