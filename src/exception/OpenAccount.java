package exception;

public class OpenAccount {

    public void account(double amount)throws LessAmountException {

        if(amount>=5000){
            System.out.println("Your account is open");
        }else {
            throw new LessAmountException("Amount should be greater or equal to 5000 to open bank accout");
        }
    }

    public static void main(String[] args) {
        OpenAccount obj=new OpenAccount();
        try {
            obj.account(4999.8);
        } catch (LessAmountException e) {
            System.out.println("Exception occured : "+e);
        }
    }
}
